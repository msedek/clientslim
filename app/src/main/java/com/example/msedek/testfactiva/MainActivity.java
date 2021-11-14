package com.example.msedek.testfactiva;

import android.annotation.SuppressLint;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.msedek.testfactiva.Fragments.BajaFragment;
import com.example.msedek.testfactiva.Fragments.BoletaFragment;
import com.example.msedek.testfactiva.Fragments.FacturaFragment;
import com.example.msedek.testfactiva.Fragments.nCreditoFragment;
import com.example.msedek.testfactiva.Interfaz.IsendFactiva;
import com.example.msedek.testfactiva.Models.Cliente;
import com.example.msedek.testfactiva.Models.ScrollableViewPager;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    TextView txtemisor;

    TextView txt_rac;
    TextView txt_dir;
    EditText txt_ruc;
    Button   btn_pruc;

    TabLayout tabs;

    ScrollableViewPager pager;

    ArrayList<Fragment>list;






    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //   prefs  = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


        txtemisor  = findViewById(R.id.txemisor2);

        txt_rac   = findViewById(R.id.txt_rasoc);
        txt_dir   = findViewById(R.id.txt_dir);
        txt_ruc   = findViewById(R.id.txt_ruc);
        btn_pruc  = findViewById(R.id.btn_pruc);

        list = new ArrayList<>();
        tabs  = findViewById(R.id.tabs);
        pager = findViewById(R.id.viewPager);

        txtemisor.setText("EIDO PERU S.A.C.");

        txt_rac.setText("Razon Social");
        txt_dir.setText("Direccion Cliente");


        for (int i = 0; i <5; i++)
        {
            switch (i)
            {
                case 0:

                    list.add(BoletaFragment.newInstance());

                    break;

                case 1:


                    list.add(FacturaFragment.newInstance(txt_rac.getText().toString(), txt_dir.getText().toString()));

                    break;

                case 2:

                    list.add(BajaFragment.newInstance());

                    break;

                case 3:


                    list.add(nCreditoFragment.newInstance());

                    break;
            }

        }


        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager())
        {

            @Override
            public Fragment getItem(int i) {

                return list.get(i);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });





        pager.setOffscreenPageLimit(5);
        pager.setCanScroll(false);

        tabs.setTabMode(TabLayout.MODE_FIXED);
        tabs.setupWithViewPager(pager);
        tabs.setBackgroundColor(Color.LTGRAY);
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);


        for (int i = 0; i < list.size(); i++)
        {
            switch (i)
            {
                case 0 :

                    tabs.getTabAt(i).setText("BOLETA");

                    break;

                case 1 :

                    tabs.getTabAt(i).setText("FACTURA");

                    break;


                case 2 :

                    tabs.getTabAt(i).setText("BAJA");

                    break;


                case 3 :

                    tabs.getTabAt(i).setText("NDC");

                    break;


            }

        }


        txt_ruc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (start == 10)
                {
                    DismissKeyboard();
                }
                else
                {
                    Log.d("CONTEO: ", start + "");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        btn_pruc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(getString(R.string.iptab))
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                IsendFactiva request = retrofit.create(IsendFactiva.class);

                String ruc = txt_ruc.getText().toString();

                Call<ArrayList<Cliente>> call = request.getJSONClienteruc(ruc);

                call.enqueue(new Callback<ArrayList<Cliente>>()
                {
                    @Override
                    public void onResponse(@NonNull Call<ArrayList<Cliente>> call, @NonNull Response<ArrayList<Cliente>> response)
                    {

                        if(response.code() == 200)
                        {
                            ArrayList<Cliente> clientes = response.body();
                            txt_rac.setText(clientes.get(0).getnRazonSocial());
                            txt_dir.setText(clientes.get(0).getNombreVia() + " " + clientes.get(0).getNumero());

/*                            Bundle bundle = new Bundle();
                            bundle.putString("razonSoc", clientes.get(0).getnRazonSocial());
                            bundle.putString("dirCliente", txt_dir.getText().toString());
                            //set Fragmentclass Arguments
                            FacturaFragment fragobj = new FacturaFragment();
                            fragobj.setArguments(bundle);

                           list.set(1,fragobj);

                           tabs.getTabAt(1);*/

                            //getSupportFragmentManager().beginTransaction().replace(R.id.lyo_fragmen,fragobj).commit();

                        }
                        else
                        {
                            showmessage("Error inesperado en el server",500);
                        }

                    }
                    @Override
                    public void onFailure(@NonNull Call<ArrayList<Cliente>> call, @NonNull Throwable t)
                    {

                        t.printStackTrace();

                    }
                });
            }
        });


    }

    private void showmessage(String mensaje, int tiempo)
    {
        final Toast toast = Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, tiempo);

    }





    private void DismissKeyboard() {
        View view = txt_ruc;
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            //imm.HideSoftInputFromWindow(view.WindowToken, 0);
            assert imm != null;
            imm.hideSoftInputFromWindow(view.getWindowToken(),0);
        }
    }
}






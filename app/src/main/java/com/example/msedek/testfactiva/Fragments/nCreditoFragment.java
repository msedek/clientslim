package com.example.msedek.testfactiva.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.msedek.testfactiva.R;

public class nCreditoFragment extends Fragment {


    public static nCreditoFragment newInstance()
    {
        nCreditoFragment fragment = new nCreditoFragment();

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View v = inflater.inflate(R.layout.fragment_n_credito, container, false);



/*        btndc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO
            }
        });
       */
       return v;

    }


}

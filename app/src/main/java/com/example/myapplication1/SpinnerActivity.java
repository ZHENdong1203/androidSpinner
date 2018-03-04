package com.example.myapplication1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity{

    private TextView textView;
    private TextView textView1;
    private Spinner spinner;
    private Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);



        spinnerInit();
    }
    private static final String[] countries={"China","Russia","Germany","Ukraine","Belarus","USA"};

    private void spinnerInit(){
        spinner=(Spinner)findViewById(R.id.spinner);
        ArrayList<String> allCountries=new ArrayList<String>();
        for(int i=0;i<countries.length;i++){
            allCountries.add(countries[i]);
        }
        ArrayAdapter<String> aspnCountries=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,allCountries);
        aspnCountries.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(aspnCountries);

        spinner1=(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.countries,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

    }
}

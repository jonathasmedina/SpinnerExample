package com.example.jonathas.spinnerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = findViewById(R.id.spinner);

        ArrayList<String> dadosSpinner = new ArrayList<>();
        dadosSpinner.add("Opção 1");
        dadosSpinner.add("Opção 2");
        dadosSpinner.add("Opção 3");

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, dadosSpinner);

        spinner1.setAdapter(spinnerArrayAdapter);
        spinner1.setOnItemSelectedListener(ouvinteSpinner);

        //inicial
        //spinner.setSelection(0,false)

        //para ver qual selecionado, na ação de um botão
        //String esse = spinner1.getSelectedItem().toString();
        //long esseN = spinner1.getSelectedItemPosition();
    }

    //ouvinte do spinner
    AdapterView.OnItemSelectedListener ouvinteSpinner = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String itemSelecionado = spinner1.getSelectedItem().toString();
            Toast.makeText(getBaseContext(), "Item escolhido: " + itemSelecionado, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };

}

package com.example.mipt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    private Spinner spCounterOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.spCounterOption = findViewById(R.id.spCounterOption);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource( context: this, R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spCounterOption.setAdapter(adapter);

        //Toast.makeText( context: this, text: "onCreate", Toast.LENGTH_SHORT).show();
        //Log.e( tag: "Routine", msg: "onCreate => ");
    }
    public void onBtnOpenUrlClick(View view) {
        //Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        //startActivity(i);
    }
}
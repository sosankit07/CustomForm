package com.example.asus.customform;

import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton question_add;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner form_options = (Spinner) findViewById(R.id.form_options);
        ArrayAdapter<CharSequence> myAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.options, android.R.layout.simple_spinner_item);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        form_options.setAdapter(myAdapter);
        question_add= (FloatingActionButton) findViewById(R.id.addquestion);
        question_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.add(R.id.addfragment,new AddFragment());
                f.commit();
            }
        });
    }
}

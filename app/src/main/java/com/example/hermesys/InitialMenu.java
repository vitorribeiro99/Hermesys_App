package com.example.hermesys;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class InitialMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_menu);


    }

    public void login(View view) {
        Intent intent = new Intent(InitialMenu.this, MainActivity.class);
        startActivity(intent);
    }

    public void regist(View view) {
        Intent intent = new Intent(InitialMenu.this, Regist.class);
        startActivity(intent);
    }
}
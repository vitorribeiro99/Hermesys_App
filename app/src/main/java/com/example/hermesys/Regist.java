package com.example.hermesys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Regist extends AppCompatActivity {

    Button registbt;
    EditText Name, Password, PIN, Phonenr;
    TextView tv;

    String sname, spw, spin, sphone, totalreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        registbt = findViewById(R.id.btnRegist);
        Name = findViewById(R.id.etregistName);
        Password = findViewById(R.id.etregistPassword);
        PIN = findViewById(R.id.etregistPIN);
        Phonenr = findViewById(R.id.etregistphone);


        registbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sname = Name.getText().toString();
                spw = Password.getText().toString();
                spin = PIN.getText().toString();
                sphone = Phonenr.getText().toString();

                totalreg = "#" + sname + "$" + spw + "$" +  spin + "$" + sphone + ">\n";

                Intent intent = new Intent(Regist.this, MainActivity.class);
                startActivity(intent);
                send(totalreg);
            }

        });


    }

    private void send(String login_data){

        //String login_data = "#" + username.getText().toString() + "$" + password.getText().toString() + "\n";
        MessageSender messageSender = new MessageSender();
        messageSender.execute(login_data);
    }
}
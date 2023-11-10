package com.example.hermesys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        
        tv = findViewById(R.id.textView);

//        String check_data;
//        do{
//            GlobalClass global = GlobalClass.getInstance();
//            check_data = global.getReceivedBuffer();
//        }while(check_data == null || check_data.isEmpty());
//
//
//        //If user was added
//        if(check_data.contains("end")) {
//            toastMsg("User successfully added");
//        }
//            /*
//            //If fingerprint process is not finished yet
//            else if(check_data.contains("Fingerprint")) {
//                toastMsg("Fingerprint configuration needed");
//            }
//            */
//        else {
//            toastMsg("Unable to add user");
//        }
//        GlobalClass global = GlobalClass.getInstance();
//        global.setReceivedBuffer("");
    }

    private void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

}

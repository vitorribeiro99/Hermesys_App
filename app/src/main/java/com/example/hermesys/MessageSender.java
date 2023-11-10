package com.example.hermesys;

import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MessageSender extends AsyncTask<String,Void,Void> {

    Socket s;
    DataOutputStream dos;
    PrintWriter pw;
    DataInputStream in;
    String read;


    @Override
    protected Void doInBackground(String... voids) {

        String message = voids[0];


        try {

            s = new Socket("192.168.1.122",5000);
            pw = new PrintWriter(s.getOutputStream());
            pw.write(message);
            pw.flush();


            s.close();



        }catch (IOException e){
            e.printStackTrace();
        }


        return null;
    }

}


package com.example.hermesys;

import android.app.Application;
import java.util.ArrayList;

public class GlobalClass extends Application {

    private static GlobalClass instance;

    //TCP IP
    private String IP = "192.168.1.114";
    private int Port = 5000;
    private String receivedBuffer;
    ArrayList<String> receivedContent=new ArrayList<String>();
    ArrayList<String> sendContent=new ArrayList<String>();
    int readyData=0;

    //USER DATA
    private String username;

    //To stop calling from other classes
    private GlobalClass(){};

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public int getPort() {
        return Port;
    }

    public void setPort(int port) {
        Port = port;
    }

    public String getReceivedBuffer() {
        return receivedBuffer;
    }

    public void setReceivedBuffer(String receivedBuffer) {
        this.receivedBuffer = receivedBuffer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void add_content(String content){this.receivedContent.add(content);}

    public void add_content_send(String content){this.sendContent.add(content);}

    public void clear_list(){this.receivedContent.clear();}

    public static synchronized GlobalClass getInstance(){
        if(instance==null){
            instance=new GlobalClass();
        }
        return instance;
    }


}

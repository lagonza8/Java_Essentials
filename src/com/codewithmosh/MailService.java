package com.codewithmosh;

public class MailService {


    public void sendEmail() {
        //we can change any of the three method calls below without affecting the main method in Main
        connect(1);
        authenticate();
        disconnect();
    }

    //The following three methods are details that can be hidden to the user

    private void connect(int timeOut) {
        System.out.println("Connect");
    }

    private void disconnect() {
        System.out.println("Disconnect");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }
}


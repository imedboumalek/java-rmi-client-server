package client;

import java.rmi.Naming;

import models.Repondeur;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("Client is booting....");
            System.setProperty("java.rmi.server.hostname", "localhost");
            // Repondeur repondeur = (Repondeur)
            // Naming.lookup("//localhost:1099/repondeur");
            // System.out.println(repondeur.repondre("World"));
            UserInterface ui = new UserInterface();
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
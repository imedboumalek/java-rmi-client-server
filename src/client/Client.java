package client;

import java.rmi.registry.*;

import models.Repondeur;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("Client is booting....");
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9000);
            // lookup the laptop object and assign in laptop variable
            Repondeur rp = (Repondeur) registry.lookup("repondeur");
            new UserInterface(rp);

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
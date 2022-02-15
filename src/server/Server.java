package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import models.Repondeur;
import models.RepondeurImpl;

public class Server {
    public static void main(String[] args) {
        try {

            System.out.println("Server is booting....");
            System.setProperty("java.rmi.server.hostname", "localhost");

            Repondeur repondeur = (Repondeur) UnicastRemoteObject.exportObject(new RepondeurImpl(), 0);
            int port = Integer.parseInt(System.getProperty("PORT"));

            Registry registry = LocateRegistry.getRegistry("localhost", port);

            registry.bind("repondeur", repondeur);
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

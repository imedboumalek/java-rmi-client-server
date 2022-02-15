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

            int port;
            try {
                port = Integer.parseInt(System.getProperty("PORT"));

            } catch (Exception e) {
                port = 9000;
            }

            Registry registry = LocateRegistry.createRegistry(port);
            Repondeur repondeur = (Repondeur) UnicastRemoteObject.exportObject(new RepondeurImpl(), 0);

            registry.bind("repondeur", repondeur);
            System.out.println("Server is ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
            System.exit(1);
        }
    }
}

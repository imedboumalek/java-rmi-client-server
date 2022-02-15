package models;

import java.rmi.*;

public interface Repondeur extends Remote {
    public String repondre(String name) throws RemoteException;
}
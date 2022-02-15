package server.models;
import java.rmi.*;

public interface ServeurSession extends Remote {
    public Repondeur ouvreSession() throws RemoteException;
}
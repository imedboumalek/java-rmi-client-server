package models;

import java.rmi.RemoteException;

public class RepondeurImpl implements Repondeur {

    @Override
    public String repondre(String name) throws RemoteException {
        return "Hello " + name;
    }

}

package models;

import java.rmi.RemoteException;

public class RepondeurImpl implements Repondeur {

    @Override
    public String repondre(String name) throws RemoteException {
        System.out.println("RepondeurImpl.repondre() => " + name);
        return "Hello " + name;
    }

}

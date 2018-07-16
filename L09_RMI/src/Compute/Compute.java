package Compute;

import java.rmi.*;

public interface Compute extends Remote
    {
        <T> T executeTask(Task<T> t) throws RemoteException;
    }

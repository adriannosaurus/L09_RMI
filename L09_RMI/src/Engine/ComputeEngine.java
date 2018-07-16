package Engine;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import Compute.*;

public class ComputeEngine implements Compute
{

    public ComputeEngine()
    {
        super();
    }
    
    public static void main(String[] args)
    {
        if (System.getSecurityManager() == null)
        {
            System.setSecurityManager(new SecurityManager());
        }
        try
        {
            String name = "Compute";
            Compute engine = new ComputeEngine();
            Compute stub = (Compute) UnicastRemoteObject.exportObject(engine, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind(name, stub);
            System.out.println("ComputeEngine bound");
        }
        catch (Exception e)
        {
            System.err.println("ComputeEngine exception: ");
            e.printStackTrace();
        }
    }
    
    public <T> T executeTask(Task<T> t)
    {
        return t.execute();
    }
}
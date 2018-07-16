package Client;

import Compute.Task;
import java.io.Serializable;

public class Subtract implements Task<Double>, Serializable
{

    private double a;
    private double b;
    private static double difference;

    public Subtract(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public Double execute()
    {
        return subtract(a, b);
    }

    public static Double subtract(double a, double b)
    {
        difference = a - b;
        return difference;
    }
}
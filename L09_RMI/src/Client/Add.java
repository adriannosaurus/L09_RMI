package Client;

import Compute.Task;
import java.io.Serializable;

public class Add implements Task<Double>, Serializable
{

    private double a;
    private double b;
    private static double sum;

    public Add(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public Double execute()
    {
        return add(a, b);
    }

    public static Double add(double a, double b)
    {
        sum = a + b;
        return sum;
    }
}
package Client;

import Compute.Task;
import java.io.Serializable;

public class Multiply implements Task<Double>, Serializable
{

    private double a;
    private double b;
    private static double product;

    public Multiply(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public Double execute()
    {
        return multiply(a, b);
    }

    public static Double multiply(double a, double b)
    {
        product = a * b;
        return product;
    }
}
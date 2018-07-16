package Client;

import Compute.Task;
import java.io.Serializable;

public class Divide implements Task<Double>, Serializable
{

    private double a;
    private double b;
    private static double quotient;

    public Divide(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public Double execute()
    {
        return divide(a, b);
    }

    public static Double divide(double a, double b)
    {
        quotient = a / b;
        return quotient;
    }
}
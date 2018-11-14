package indev.test.calc.domain;

import indev.test.job.calc.ThreadCalc;

import java.util.concurrent.Callable;

public class Calculator implements Callable<Double> {

    private Operations operation;
    private double a;
    private double b;

    public Calculator(Operations operation, double a, double b) {
        this.operation = operation;
        this.a = a;
        this.b = b;
    }

    @Override
    public Double call() throws Exception {
        switch (operation) {
            case ADD : return add(a, b);
            case SUBTRACT: return minus(a, b);
            case MULTIPLY: return multiply(a, b);
            case DIVIDE: return divide(a, b);
            default: throw new UnsupportedOperationException("Operation is not supported");
        }
    }

    private double add(double a, double b) throws Exception {
        return ThreadCalc.Instance().Add(a, b);
    }

    private double minus(double a, double b) throws Exception {
        return ThreadCalc.Instance().Add(a, -b);

    }

    private double multiply(double a, double b) throws Exception {
        return ThreadCalc.Instance().Multiply(a, b);

    }

    private double divide(double a, double b) throws Exception {
        if (b == 0) {
            throw new IllegalArgumentException("Do not divide by zero");
        }
        return ThreadCalc.Instance().Divide(a, b);
    }
}

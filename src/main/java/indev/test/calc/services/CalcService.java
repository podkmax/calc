package indev.test.calc.services;

import indev.test.calc.domain.Calculator;
import indev.test.calc.domain.Operations;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Service
public class CalcService {

    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    public double calculate(Operations operation, double a, double b) throws InterruptedException, ExecutionException {
        Future<Double> futureResult = executorService.submit(new Calculator(operation, a, b));

        return futureResult.get();

    }


}

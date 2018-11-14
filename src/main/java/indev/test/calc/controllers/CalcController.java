package indev.test.calc.controllers;

import indev.test.calc.domain.Operands;
import indev.test.calc.domain.Operations;
import indev.test.calc.services.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/calc")
public class CalcController {

    @Autowired
    private CalcService calcService;

    @PostMapping("/add")
    public ResponseEntity<Double> add(@Valid @RequestBody Operands operands) {

        try {
            return ResponseEntity.ok(calcService.calculate(Operations.ADD, operands.getFirst(), operands.getSecond()));
        } catch (InterruptedException e) {
            e.printStackTrace();
            return new ResponseEntity<>(Double.NaN, HttpStatus.SERVICE_UNAVAILABLE);
        } catch (ExecutionException e) {
            e.printStackTrace();
            return new ResponseEntity<>(Double.NaN, HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

    @PostMapping("/minus")
    public ResponseEntity<Double> minus(@Valid @RequestBody Operands operands) {
        try {
            return ResponseEntity.ok(calcService.calculate(Operations.SUBTRACT, operands.getFirst(), operands.getSecond()));
        } catch (InterruptedException e) {
            e.printStackTrace();
            return new ResponseEntity<>(Double.NaN, HttpStatus.SERVICE_UNAVAILABLE);
        } catch (ExecutionException e) {
            e.printStackTrace();
            return new ResponseEntity<>(Double.NaN, HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

    @PostMapping("/multiply")
    public ResponseEntity<Double> multiply(@Valid @RequestBody Operands operands) {
        try {
            return ResponseEntity.ok(calcService.calculate(Operations.MULTIPLY, operands.getFirst(), operands.getSecond()));
        } catch (InterruptedException e) {
            e.printStackTrace();
            return new ResponseEntity<>(Double.NaN, HttpStatus.SERVICE_UNAVAILABLE);
        } catch (ExecutionException e) {
            e.printStackTrace();
            return new ResponseEntity<>(Double.NaN, HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

    @PostMapping("/divide")
    public ResponseEntity<Double> divide(@Valid @RequestBody Operands operands) {
        try {
            return ResponseEntity.ok(calcService.calculate(Operations.DIVIDE, operands.getFirst(), operands.getSecond()));
        } catch (InterruptedException e) {
            e.printStackTrace();
            return new ResponseEntity<>(Double.NaN, HttpStatus.SERVICE_UNAVAILABLE);
        } catch (ExecutionException e) {
            e.printStackTrace();
            return new ResponseEntity<>(Double.NaN, HttpStatus.SERVICE_UNAVAILABLE);
        }
    }
}

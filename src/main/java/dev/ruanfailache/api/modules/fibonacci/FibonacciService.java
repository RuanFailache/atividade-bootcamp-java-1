package dev.ruanfailache.api.modules.fibonacci;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class FibonacciService {
    public List<BigInteger> getSequence(Long number) {
        var sequence = this.validateEntry(number);
        while (sequence.size() < number) this.calculate(sequence);
        return sequence;
    }

    private ArrayList<BigInteger> validateEntry(Long number) {
        var sequence = new ArrayList<BigInteger>();
        if (number > 0) sequence.add(BigInteger.ZERO);
        if (number > 1) sequence.add(BigInteger.ONE);
        return sequence;
    }

    private void calculate(ArrayList<BigInteger> sequence) {
        var lastIndex = sequence.size() - 1;
        var currentNumber = sequence.get(lastIndex);
        var previousNumber = sequence.get(lastIndex - 1);
        sequence.add(currentNumber.add(previousNumber));
    }
}

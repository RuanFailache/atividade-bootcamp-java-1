package dev.ruanfailache.api.modules.fibonacci;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class FibonacciService {
    public BigInteger calculate(Long number) {
        return this.sum(number, BigInteger.valueOf(0), BigInteger.valueOf(1));
    }

    private BigInteger sum(Long number, BigInteger previous, BigInteger current) {
        if (number > 0) return this.sum(number - 1, current, current.add(previous));
        return current;
    }
}

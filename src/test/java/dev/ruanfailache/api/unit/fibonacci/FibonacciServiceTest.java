package dev.ruanfailache.api.unit.fibonacci;

import dev.ruanfailache.api.modules.fibonacci.FibonacciService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class FibonacciServiceTest {
    private final FibonacciService sut = new FibonacciService();

    @Test
    void testCalculate_When_NumberEqual1() {
        var result = sut.getSequence(1L);
        assertEquals(1, result.size());
        assertEquals(BigInteger.ZERO, result.get(0));
    }

    @Test
    void testCalculate_When_NumberEqual3() {
        var result = sut.getSequence(5L);
        assertEquals(5, result.size());
        assertEquals(BigInteger.ZERO, result.get(0));
        assertEquals(BigInteger.valueOf(3), result.get(result.size() - 1));
    }

    @Test
    void testCalculate_When_NumberEqual10() {
        var result = sut.getSequence(10L);
        assertEquals(10, result.size());
        assertEquals(BigInteger.ZERO, result.get(0));
        assertEquals(BigInteger.valueOf(34), result.get(result.size() - 1));
    }
}

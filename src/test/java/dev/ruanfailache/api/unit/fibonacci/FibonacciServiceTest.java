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
        var result = sut.calculate(1L);
        assertEquals(BigInteger.ONE, result);
    }

    @Test
    void testCalculate_When_NumberEqual2() {
        var result = sut.calculate(2L);
        assertEquals(BigInteger.TWO, result);
    }

    @Test
    void testCalculate_When_NumberEqual3() {
        var result = sut.calculate(3L);
        assertEquals(BigInteger.valueOf(3), result);
    }

    @Test
    void testCalculate_When_NumberEqual5() {
        var result = sut.calculate(5L);
        assertEquals(BigInteger.valueOf(8), result);
    }

    @Test
    void testCalculate_When_NumberEqual10() {
        var result = sut.calculate(10L);
        assertEquals(BigInteger.valueOf(89), result);
    }
}

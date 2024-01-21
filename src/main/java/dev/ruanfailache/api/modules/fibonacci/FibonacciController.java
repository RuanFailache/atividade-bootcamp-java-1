package dev.ruanfailache.api.modules.fibonacci;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fibonacci")
public class FibonacciController {
    private final FibonacciService fibonacciService;

    public FibonacciController(FibonacciService fibonacciService) {
        this.fibonacciService = fibonacciService;
    }

    @GetMapping("{number}")
    public ResponseEntity<FibonacciDto> calculate(@PathVariable Long number) {
        var value = this.fibonacciService.getSequence(number);
        var dto = new FibonacciDto(value);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }
}

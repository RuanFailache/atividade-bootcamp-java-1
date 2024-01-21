package dev.ruanfailache.api.modules.multiplier;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("multiplier")
public class MultiplierController {
    private final MultiplierService multiplierService;

    public MultiplierController(MultiplierService multiplierService) {
        this.multiplierService = multiplierService;
    }

    @GetMapping("{number}")
    public ResponseEntity<MultiplierDto> calculate(@PathVariable Long number) {
        var value = this.multiplierService.getMap(number);
        var dto = new MultiplierDto(value);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }
}

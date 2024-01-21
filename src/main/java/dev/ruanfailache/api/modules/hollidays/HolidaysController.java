package dev.ruanfailache.api.modules.hollidays;

import dev.ruanfailache.api.modules.hollidays.dto.HolidaysDto;
import dev.ruanfailache.api.modules.hollidays.dto.IsHolidayDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("holidays")
public class HolidaysController {
    private final HolidaysService holidaysService;

    public HolidaysController(HolidaysService holidaysService) {
        this.holidaysService = holidaysService;
    }

    @GetMapping
    public ResponseEntity<HolidaysDto> findAll() {
        var holidays = holidaysService.getAll();
        var dto = new HolidaysDto(holidays);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    @GetMapping("{date}")
    public ResponseEntity<IsHolidayDto> checkIsHoliday(@PathVariable String date) {
        var isHoliday = holidaysService.checkIsHoliday(date);
        var dto = new IsHolidayDto(isHoliday);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }
}

package dev.ruanfailache.api.modules.hollidays;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HolidaysService {
    private final HolidayRepository holidayRepository;

    public HolidaysService(HolidayRepository holidayRepository) {
        this.holidayRepository = holidayRepository;
    }

    public Boolean checkIsHoliday(String date) {
        return holidayRepository.findByDate(date).isPresent();
    }

    public List<Holiday> getAll() {
        return holidayRepository.findAll();
    }
}

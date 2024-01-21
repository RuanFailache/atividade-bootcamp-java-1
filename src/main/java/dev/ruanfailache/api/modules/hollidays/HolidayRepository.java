package dev.ruanfailache.api.modules.hollidays;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class HolidayRepository {
    public List<Holiday> findAll() {
        return List.of(
                new Holiday("01-01-2024", "Confraternização Mundial"),
                new Holiday("12-02-2024", "Carnaval"),
                new Holiday("13-02-2024", "Carnaval"),
                new Holiday("29-03-2024", "Sexta-feira Santa"),
                new Holiday("21-04-2024", "Tiradentes"),
                new Holiday("01-05-2024", "Dia do Trabalho"),
                new Holiday("30-05-2024", "Corpus Christi"),
                new Holiday("07-09-2024", "Independência do Brasil"),
                new Holiday("12-10-2024", "Nossa Senhora Aparecida"),
                new Holiday("02-11-2024", "Finados"),
                new Holiday("15-11-2024", "Proclamação da República"),
                new Holiday("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"),
                new Holiday("25-12-2024", "Natal")
        );
    }

    public Optional<Holiday> findByDate(String date) {
        Holiday foundHoliday = null;

        for (var holiday : this.findAll()) {
            if (holiday.date().equals(date)) {
                foundHoliday = holiday;
            }
        }

        return Optional.ofNullable(foundHoliday);
    }
}

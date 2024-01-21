package dev.ruanfailache.api.modules.multiplier;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class MultiplierService {
    public Map<String, Number> getMap(Long number) {
        var map = new LinkedHashMap<String, Number>(11);

        for (int i = 0; i <= 10; i++) {
            map.put(number + " x " + i, number * i);
        }

        return map;
    }
}

package org.example.groov;

import org.example.groov.domain.Humidity;
import org.example.groov.domain.Temperature;
import org.example.groov.repos.HumidityRepo;
import org.example.groov.repos.TemperatureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Map;

@Controller
public class GreetingController {
   @Autowired
   private TemperatureRepo temperatureRepo;

    @Autowired
    private HumidityRepo humidityRepo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String,Object> model) {
        model.put("name", name);
        return "greeting";
    }
    @GetMapping("/giveAll")
    public String giveAll(Map<String, Object> model){
        Iterable<Humidity> humidities = humidityRepo.findAll();
        model.put("humidities",humidities);
        Iterable<Temperature> temperatures = temperatureRepo.findAll();
        model.put("temperatures",temperatures);
        return "giveAll";
    }
    @GetMapping("/main")
    public String main(Map<String, Object> model){
        Iterable<Humidity> humidities = humidityRepo.findAll();
        model.put("humidities",humidities);
        Iterable<Temperature> temperatures = temperatureRepo.findAll();
        model.put("temperatures",temperatures);
        return "main";
    }
    @GetMapping("/addTemp")
    public String addTemp(@RequestParam String temp, Map<String, Object> model){
        Temperature temperature = new Temperature(temp,new Date());
        temperatureRepo.save(temperature);
        Iterable<Temperature> temperatures = temperatureRepo.findAll();
        model.put("temperatures",temperatures);
        return "main";
    }
    @GetMapping("/addHumi")
    public String addHumi(@RequestParam String humi, Map<String, Object> model){
        Humidity humidity = new Humidity(humi, new Date());
         humidityRepo.save(humidity);
         Iterable<Humidity> humidities = humidityRepo.findAll();
         model.put("humidities",humidities);
        return "main";
    }

}

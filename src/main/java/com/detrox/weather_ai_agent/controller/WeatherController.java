package com.detrox.weather_ai_agent.controller;

import com.detrox.weather_ai_agent.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/chat")
    public ResponseEntity<String> GetWeather(@RequestParam String query){
        return ResponseEntity.ok(weatherService.chat(query));
    }

}

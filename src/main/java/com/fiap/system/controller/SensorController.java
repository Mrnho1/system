package com.fiap.system.controller;

import com.fiap.system.model.Sensor;
import com.fiap.system.service.AlertService;
import com.fiap.system.service.SensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/sensors")
@RequiredArgsConstructor
public class SensorController {
    private final SensorService sensorService;
    private final AlertService alertService;

    @PostMapping
    public Sensor register(@RequestBody Sensor sensor) {
        Sensor saved = sensorService.register(sensor);
        alertService.generateAlert(sensor.getWaterLevel());
        return saved;
    }

    @GetMapping
    public List<Sensor> getAll() {
        return sensorService.getAll();
    }
}
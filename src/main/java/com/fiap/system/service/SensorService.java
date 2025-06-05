package com.fiap.system.service;

import com.fiap.system.model.Sensor;
import com.fiap.system.repository.SensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SensorService {
    private final SensorRepository repository;

    public Sensor register(Sensor sensor) {
        return repository.save(sensor);
    }

    public List<Sensor> getAll() {
        return repository.findAll();
    }
}

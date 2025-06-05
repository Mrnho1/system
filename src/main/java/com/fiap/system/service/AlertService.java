package com.fiap.system.service;

import com.fiap.system.model.Alert;
import com.fiap.system.repository.AlertRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlertService {
    private final AlertRepository repository;

    public Alert generateAlert(double waterLevel) {
        String risk;
        if (waterLevel > 80) risk = "HIGH";
        else if (waterLevel > 50) risk = "MODERATE";
        else risk = "NORMAL";

        Alert alert = Alert.builder()
                .riskLevel(risk)
                .message("Current level: " + waterLevel + "%")
                .build();

        return repository.save(alert);
    }

    public List<Alert> getAll() {
        return repository.findAll();
    }
}
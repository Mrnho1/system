package com.fiap.system.controller;

import com.fiap.system.model.Alert;
import com.fiap.system.service.AlertService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/alerts")
@RequiredArgsConstructor
public class AlertController {
    private final AlertService alertService;

    @GetMapping
    public List<Alert> getAll() {
        return alertService.getAll();
    }
}
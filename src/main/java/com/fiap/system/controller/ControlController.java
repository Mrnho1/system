package com.fiap.system.controller;

import com.fiap.system.model.ControlAction;
import com.fiap.system.service.ControlService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/control")
@RequiredArgsConstructor
public class ControlController {
    private final ControlService service;

    @PostMapping("/activate-barrier")
    public ControlAction activate() {
        return service.activateBarrier();
    }

    @GetMapping("/history")
    public List<ControlAction> getHistory() {
        return service.getHistory();
    }
}
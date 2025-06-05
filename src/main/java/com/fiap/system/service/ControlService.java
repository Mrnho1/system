package com.fiap.system.service;

import com.fiap.system.model.ControlAction;
import com.fiap.system.repository.ControlActionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ControlService {
    private final ControlActionRepository repository;

    public ControlAction activateBarrier() {
        ControlAction action = ControlAction.builder()
                .action("Activate Barrier")
                .description("Barrier automatically activated.")
                .build();
        return repository.save(action);
    }

    public List<ControlAction> getHistory() {
        return repository.findAll();
    }
}
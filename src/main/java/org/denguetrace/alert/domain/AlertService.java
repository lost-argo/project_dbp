package org.denguetrace.alert.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.denguetrace.alert.infrastructure.AlertRepository;
import org.denguetrace.alert.infrastructure.AlertRepository;

@Service
public class AlertService {
    @Autowired
    private final AlertRepository alertRepository;

    public AlertService(AlertRepository alertRepository) {
        this.alertRepository = alertRepository;
    }

    public List<Alert> getAllBooks() {
        return alertRepository.findAll();
    }

    public Alert findAlertById(Long id){
        return alertRepository.findById(id).orElseThrow(() -> new RuntimeException("Alert with id " + id + " not found"));
    }

    public void addBook(Alert newAlert){
        alertRepository.save(newAlert);
    }
}
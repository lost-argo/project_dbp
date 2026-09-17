package org.denguetrace.alert.application;

import org.denguetrace.alert.domain.Alert;
import org.denguetrace.alert.domain.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alert")
public class AlertController {
    @Autowired
    private final AlertService alertService;

    public AlertController(AlertService alertService) {
        this.alertService = alertService;
    }

    @GetMapping
    public ResponseEntity<List<Alert>> getAllAlerts() {
        return ResponseEntity.ok(alertService.getAllAlerts());
    }

    @PostMapping
    public ResponseEntity<Void> createAlert(@RequestBody Alert newAlert) {
        alertService.createAlert(newAlert);
        return ResponseEntity.status(HttpStatus.valueOf(201)).build();
    }
}
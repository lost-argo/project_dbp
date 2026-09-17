package org.denguetrace.selfreport.application;

import org.denguetrace.selfreport.domain.SelfReport;
import org.denguetrace.selfreport.domain.SelfReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/selfreport")
public class SelfReportController {
    @Autowired
    private final SelfReportService selfReportService;

    public SelfReportController(SelfReportService selfReportService) {
        this.selfReportService = selfReportService;
    }

    @GetMapping
    public ResponseEntity<List<SelfReport>> getAllSelfReports() {
        return ResponseEntity.ok(selfReportService.getAllSelfReports());
    }

    @PostMapping
    public ResponseEntity<Void> addSelfReport(@RequestBody SelfReport newSelfReport) {
        selfReportService.addSelfReport(newSelfReport);
        return ResponseEntity.status(HttpStatus.valueOf(201)).build();
    }
}
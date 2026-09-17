package org.denguetrace.selfreport.domain;

import org.denguetrace.selfreport.infrastructure.SelfReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelfReportService {
    @Autowired
    private final SelfReportRepository selfReportRepository;

    public SelfReportService(SelfReportRepository selfReportRepository) {
        this.selfReportRepository = selfReportRepository;
    }

    public List<SelfReport> getAllSelfReports() {
        return selfReportRepository.findAll();
    }

    public SelfReport findSelfReportById(Long id){
        return selfReportRepository.findById(id).orElseThrow(() -> new RuntimeException("SelfReport with id " + id + " not found"));
    }

    public void addSelfReport(SelfReport newSelfReport){
        selfReportRepository.save(newSelfReport);
    }
}
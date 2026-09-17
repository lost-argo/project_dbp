package org.denguetrace.district.application;

import org.denguetrace.district.domain.District;
import org.denguetrace.district.domain.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/district")
public class DistrictController {
    @Autowired
    private final DistrictService districtService;

    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }

    @GetMapping
    public ResponseEntity<List<District>> getAllDistricts() {
        return ResponseEntity.ok(districtService.getAllDistricts());
    }

    @PostMapping
    public ResponseEntity<Void> addDistrict(@RequestBody District newDistrict) {
        districtService.addDistrict(newDistrict);
        return ResponseEntity.status(HttpStatus.valueOf(201)).build();
    }
}

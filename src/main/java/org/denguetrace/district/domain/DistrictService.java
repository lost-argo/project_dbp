package org.denguetrace.district.domain;

import org.denguetrace.district.infrastructure.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    private final DistrictRepository districtRepository;

    public DistrictService(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    public List<District> getAllDistricts() {
        return districtRepository.findAll();
    }

    public District findDistrictById(Long id){
        return districtRepository.findById(id).orElseThrow(() -> new RuntimeException("District with id " + id + " not found"));
    }

    public void addDistrict(District newDistrict) {
        districtRepository.save(newDistrict);
    }
}
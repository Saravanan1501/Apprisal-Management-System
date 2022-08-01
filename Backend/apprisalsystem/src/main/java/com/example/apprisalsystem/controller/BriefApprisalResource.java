package com.example.apprisalsystem.controller;


import com.example.apprisalsystem.model.BriefApprisal;
import com.example.apprisalsystem.service.BriefApprisalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/briefApprisal")
public class BriefApprisalResource {

    private final BriefApprisalService briefApprisalService;

    public BriefApprisalResource(BriefApprisalService apprisalService, BriefApprisalService briefApprisalService) {
        this.briefApprisalService = briefApprisalService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<BriefApprisal>> getAllApprisal() {
        List<BriefApprisal> apprisals =  briefApprisalService.findAllBriefApprisal();
        return new ResponseEntity<>(apprisals, HttpStatus.OK);
    }

    @GetMapping("/byEmpId/{empId}")
    public ResponseEntity<BriefApprisal> getApprisalByEmpId(@PathVariable("empId") int empId) {
        BriefApprisal apprisals =  briefApprisalService.findByEmpId(empId);
        return new ResponseEntity<>(apprisals, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<BriefApprisal> addApprisal(@RequestBody BriefApprisal apprisal) {
        BriefApprisal new_apprisal =briefApprisalService.addApprisal(apprisal);
        return new ResponseEntity<>(new_apprisal, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteApprisal(@PathVariable("id") int id) {
        briefApprisalService.deleteApprisal(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<BriefApprisal> updateApprisal(@RequestBody BriefApprisal apprisal) {
        BriefApprisal new_apprisal = briefApprisalService.updateApprisal(apprisal);
        return new ResponseEntity<>(new_apprisal, HttpStatus.OK);
    }
}

package com.example.apprisalsystem.controller;

import com.example.apprisalsystem.model.Apprisal;
import com.example.apprisalsystem.service.ApprisalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apprisal")
public class ApprisalResource {

    private final ApprisalService apprisalService;

    public ApprisalResource(ApprisalService apprisalService) {
        this.apprisalService = apprisalService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Apprisal>> getAllApprisal() {
        List<Apprisal> apprisals =  apprisalService.findAllApprisal();
        return new ResponseEntity<>(apprisals, HttpStatus.OK);
    }

    @GetMapping("/byEmpId/{empId}")
    public ResponseEntity<List<Apprisal>> getApprisalByEmpId(@PathVariable("empId") int empId) {
        List<Apprisal> apprisals =  apprisalService.findByEmpId(empId);
        return new ResponseEntity<>(apprisals, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Apprisal> addApprisal(@RequestBody Apprisal apprisal) {
        Apprisal new_apprisal =apprisalService.addApprisal(apprisal);
        return new ResponseEntity<>(new_apprisal, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteApprisal(@PathVariable("id") int id) {
        apprisalService.deleteApprisal(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Apprisal> updateApprisal(@RequestBody Apprisal apprisal) {
        Apprisal new_apprisal = apprisalService.updateApprisal(apprisal);
        return new ResponseEntity<>(new_apprisal, HttpStatus.OK);
    }
}

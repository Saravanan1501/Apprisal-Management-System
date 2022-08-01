package com.example.apprisalsystem.service;

import com.example.apprisalsystem.model.Apprisal;
import com.example.apprisalsystem.repo.ApprisalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprisalService {
    private final ApprisalRepo apprisalRepo;

    @Autowired
    public ApprisalService(ApprisalRepo apprisalRepo) {
        this.apprisalRepo = apprisalRepo;
    }

    public Apprisal addApprisal(Apprisal apprisal){
        return apprisalRepo.save(apprisal);
    }

    public List<Apprisal> findAllApprisal() {
        return apprisalRepo.findAll();
    }

    public void deleteApprisal(int id){
        apprisalRepo.deleteApprisalById( id);
    }

    public List<Apprisal> findByEmpId(int empId){
        return apprisalRepo.findByEmpId(empId);
    }

    public Apprisal updateApprisal(Apprisal apprisal){
        return apprisalRepo.save(apprisal);
    }



}

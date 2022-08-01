package com.example.apprisalsystem.service;


import com.example.apprisalsystem.model.Apprisal;
import com.example.apprisalsystem.model.BriefApprisal;
import com.example.apprisalsystem.repo.BriefApprisalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BriefApprisalService {

    private final BriefApprisalRepo briefApprisalRepo;

    @Autowired
    public BriefApprisalService(BriefApprisalRepo briefApprisalRepo) {
        this.briefApprisalRepo = briefApprisalRepo;
    }

    public BriefApprisal addApprisal(BriefApprisal apprisal){
        return briefApprisalRepo.save(apprisal);
    }

    public List<BriefApprisal> findAllBriefApprisal() {return briefApprisalRepo.findAll();}

    public void deleteApprisal(int id){
        briefApprisalRepo.deleteBriefApprisalById(id);
    }

    public BriefApprisal findByEmpId(int empId){
        return briefApprisalRepo.findByEmpId(empId);
    }

    public BriefApprisal updateApprisal(BriefApprisal apprisal){
        return briefApprisalRepo.save(apprisal);
    }

}

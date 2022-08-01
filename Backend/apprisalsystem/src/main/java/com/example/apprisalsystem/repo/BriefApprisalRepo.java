package com.example.apprisalsystem.repo;

import com.example.apprisalsystem.model.BriefApprisal;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface BriefApprisalRepo extends JpaRepository<BriefApprisal, Long> {

    @Transactional
    void deleteBriefApprisalById(int id);

    BriefApprisal findByEmpId(int empId);

}

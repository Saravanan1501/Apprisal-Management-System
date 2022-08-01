package com.example.apprisalsystem.repo;

import com.example.apprisalsystem.model.Apprisal;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface ApprisalRepo extends JpaRepository<Apprisal, Long> {
    @Transactional
    void deleteApprisalById(int id);

    Optional<Apprisal> findEmployeeById(int id);
    List<Apprisal> findByEmpId(int empId);
}

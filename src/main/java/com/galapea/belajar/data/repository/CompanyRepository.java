package com.galapea.belajar.data.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.galapea.belajar.data.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, UUID> {

}

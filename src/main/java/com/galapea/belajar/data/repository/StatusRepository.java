package com.galapea.belajar.data.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.galapea.belajar.data.entity.Status;

public interface StatusRepository extends JpaRepository<Status, UUID> {

}

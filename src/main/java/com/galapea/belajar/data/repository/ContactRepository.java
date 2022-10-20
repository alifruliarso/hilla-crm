package com.galapea.belajar.data.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.galapea.belajar.data.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, UUID> {

}

package com.tahsin.project.repository;

import com.tahsin.project.model.entity.Customer;
import com.tahsin.project.model.entity.Moderator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeratorRepository extends JpaRepository<Moderator, Long> {
    Moderator findByEmailIgnoreCase(String emailId);

    Boolean existsByEmail(String email);
}

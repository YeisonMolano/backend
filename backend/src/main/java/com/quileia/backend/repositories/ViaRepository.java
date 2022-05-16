package com.quileia.backend.repositories;

import com.quileia.backend.models.Via;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViaRepository extends JpaRepository<Via, Long> {
}
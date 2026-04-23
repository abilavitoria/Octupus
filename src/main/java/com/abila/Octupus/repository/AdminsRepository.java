package com.abila.Octupus.repository;

import com.abila.Octupus.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminsRepository extends JpaRepository<Admin, Integer> {
}

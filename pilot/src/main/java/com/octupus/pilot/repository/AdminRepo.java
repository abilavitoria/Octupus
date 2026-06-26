package com.octupus.pilot.repository;

import com.octupus.pilot.core.admin.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
}

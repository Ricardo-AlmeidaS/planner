package com.rocketseat.planner.activity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ActivityRepository extends JpaRepository<Activitiy, UUID> {

    List<Activitiy> findByTripId(UUID tripId);
}

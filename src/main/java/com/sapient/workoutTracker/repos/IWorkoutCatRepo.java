package com.sapient.workoutTracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.workoutTracker.models.WorkoutCategory;

public interface IWorkoutCatRepo extends JpaRepository<WorkoutCategory, Integer> {

}

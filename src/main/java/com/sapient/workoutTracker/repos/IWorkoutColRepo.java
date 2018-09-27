package com.sapient.workoutTracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.workoutTracker.models.WorkoutCollection;

public interface IWorkoutColRepo extends JpaRepository<WorkoutCollection, Integer>{


}

package com.sapient.workoutTracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.workoutTracker.models.WorkoutActive;


public interface IWorkoutActiveRepo extends JpaRepository<WorkoutActive, Integer> {

}

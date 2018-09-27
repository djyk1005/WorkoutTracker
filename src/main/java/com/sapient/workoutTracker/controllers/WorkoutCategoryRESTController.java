package com.sapient.workoutTracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.workoutTracker.models.WorkoutCategory;
import com.sapient.workoutTracker.repos.IWorkoutCatRepo;

@RestController
@RequestMapping("/workout")
@CrossOrigin("*")
public class WorkoutCategoryRESTController {
	
	@Autowired
	IWorkoutCatRepo workoutCatRepo;
	
	@RequestMapping(path="/categories", method=RequestMethod.GET)
	public List<WorkoutCategory> findAll(){
		List<WorkoutCategory> categories = workoutCatRepo.findAll();
		return categories;
	}
	
	@RequestMapping(path="/categories/{id}", method=RequestMethod.GET)
	public WorkoutCategory findById(@PathVariable("id") int id){
		WorkoutCategory category = workoutCatRepo.getOne(id);
		return category;
	}
	

	@RequestMapping(path="/categories", method=RequestMethod.POST)
	public void addWorkout(@RequestBody WorkoutCategory workoutcat){
		workoutCatRepo.save(workoutcat);
	}


}

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
import com.sapient.workoutTracker.models.WorkoutCollection;
import com.sapient.workoutTracker.repos.IWorkoutActiveRepo;
import com.sapient.workoutTracker.repos.IWorkoutCatRepo;
import com.sapient.workoutTracker.repos.IWorkoutColRepo;

@RestController
@RequestMapping("/workout")
@CrossOrigin("*")
public class WorkoutCollectionRESTController {

	@Autowired
	IWorkoutColRepo workoutColRepo;
	
	@Autowired
	IWorkoutCatRepo workoutCatRepo;
	
	@Autowired
	IWorkoutActiveRepo workoutActiveRepo;
	

	@RequestMapping(path="/collections", method=RequestMethod.GET)
	public List<WorkoutCollection> findAll(){
		List<WorkoutCollection> workouts = workoutColRepo.findAll();
		return workouts;
	}
	
	@RequestMapping(path="/collections/{id}", method=RequestMethod.GET)
	public WorkoutCollection findById(@PathVariable("id") int id){
		WorkoutCollection workout = workoutColRepo.getOne(id);
		return workout;
	}
	
	@RequestMapping(path="/collections", method=RequestMethod.POST)
	public void addWorkout(@RequestBody WorkoutCollection workoutcol){
		WorkoutCategory wc = workoutcol.getwCat();
		WorkoutCategory workCat;
		if(wc.getCatName() == null) {
			workCat = workoutCatRepo.getOne(wc.getCatId());
			
		}else {
			workCat = new WorkoutCategory(wc.getCatName());
		}
		workoutcol.setwCat(workCat);
		workoutColRepo.save(workoutcol);
	}
	
	@RequestMapping(path="/collections/{id}", method=RequestMethod.DELETE)
	public void addWorkout(@PathVariable("id") int id){
		workoutColRepo.deleteById(id);
	}


	

}

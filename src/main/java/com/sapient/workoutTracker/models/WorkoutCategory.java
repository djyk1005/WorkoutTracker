package com.sapient.workoutTracker.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Workout_Category")
//@NamedQuery()
@XmlRootElement
public class WorkoutCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="category_id")
	int catId;
	
	@Column(name="category_name")
	String catName;
	
	public WorkoutCategory() {
		super();
	}
	
	public WorkoutCategory(String catName) {
		super();
		this.catName = catName;
	}
	

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}
	

	@Override
	public String toString() {
		return "WorkoutCategory [catId=" + catId + ", catName=" + catName + "]";
	}

}

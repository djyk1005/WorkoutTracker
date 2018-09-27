package com.sapient.workoutTracker.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="Workout_Collection")
//@NamedQuery()
@XmlRootElement
public class WorkoutCollection {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="workout_id")
	int workoutId;

	@Column(name="workout_title")
	String title;

	@Column(name="workout_note")
	String note;

	@Column(name="calories_burn_per_min")
	float calBurnPerMin;

	@ManyToOne(cascade=CascadeType.ALL)
	WorkoutCategory workoutCat;


	public WorkoutCollection(String title, String note, float calBurnPerMin) {
		super();
		this.title = title;
		this.note = note;
		this.calBurnPerMin = calBurnPerMin;
	}

	public WorkoutCollection() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public float getCalBurnPerMin() {
		return calBurnPerMin;
	}

	public void setCalBurnPerMin(float calBurnPerMin) {
		this.calBurnPerMin = calBurnPerMin;
	}



	public WorkoutCategory getwCat() {
		return workoutCat;
	}

	public void setwCat(WorkoutCategory wCat) {
		this.workoutCat = wCat;
	}

	public int getWorkoutId() {
		return workoutId;
	}

	public void setWorkoutId(int workoutId) {
		this.workoutId = workoutId;
	}

	@Override
	public String toString() {
		return "WorkoutCollection [title=" + title + ", note=" + note + ", calBurnPerMin=" + calBurnPerMin + ", wCat="
				+ workoutCat + ", workoutId=" + workoutId + "]";
	}


}

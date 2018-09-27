package com.sapient.workoutTracker.models;

import java.sql.Date;
import java.sql.Time;

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
@Table(name="Workout_Active")
//@NamedQuery()
@XmlRootElement
public class WorkoutActive {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	WorkoutCollection workoutCol;
	
	@Column(name="start_time")
	Time startTime;
	
	@Column(name="end_time")
	Time endTime;
	
	@Column(name="start_date")
	Date startDate;
	
	@Column(name="end_date")
	Date endDate;
	
	@Column(name="comment")
	String comment;
	
	@Column(name="status")
	boolean active;
	
	public WorkoutActive() {
		
	}

	public WorkoutActive(WorkoutCollection workoutCol, Time startTime, Time endTime, Date startDate, Date endDate,
			String comment, boolean active) {
		super();
		this.workoutCol = workoutCol;
		this.startTime = startTime;
		this.endTime = endTime;
		this.startDate = startDate;
		this.endDate = endDate;
		this.comment = comment;
		this.active = active;
	}

	public WorkoutCollection getWorkoutCol() {
		return workoutCol;
	}

	public void setWorkoutCol(WorkoutCollection workoutCol) {
		this.workoutCol = workoutCol;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "WorkoutActive [workoutCol=" + workoutCol + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", comment=" + comment + ", active=" + active
				+ "]";
	}
	
	
}

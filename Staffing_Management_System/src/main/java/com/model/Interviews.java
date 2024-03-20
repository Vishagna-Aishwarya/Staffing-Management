package com.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.model.Interviews;

@Entity
public class Interviews {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int interviewID;
    
    private int candidateID;
    private int jobID;
    private Date interviewDate;
    private String interviewer;
    private String interviewLocation;
    private String feedback;
    private String status;
    
    @ManyToOne
    @JoinColumn(name = "candidate_id") // Adjust column name as per your schema
    private Candidates candidates;
    
    @ManyToOne
    @JoinColumn(name = "jobID", referencedColumnName = "JobID")
    private Jobs jobs;

    public Interviews() {
        // Default constructor
    }

    public Interviews(int candidateID, int jobID, Date interviewDate, String interviewer,
            String interviewLocation, String feedback, String status, Candidates candidates, Jobs jobs) {
        this.candidateID = candidateID;
        this.jobID = jobID;
        this.interviewDate = interviewDate;
        this.interviewer = interviewer;
        this.interviewLocation = interviewLocation;
        this.feedback = feedback;
        this.status = status;
        this.candidates = candidates;
        this.jobs = jobs;
    }

	public int getInterviewID() {
		return interviewID;
	}

	public void setInterviewID(int interviewID) {
		this.interviewID = interviewID;
	}

	public int getCandidateID() {
		return candidateID;
	}

	public void setCandidateID(int candidateID) {
		this.candidateID = candidateID;
	}

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getInterviewer() {
		return interviewer;
	}

	public void setInterviewer(String interviewer) {
		this.interviewer = interviewer;
	}

	public String getInterviewLocation() {
		return interviewLocation;
	}

	public void setInterviewLocation(String interviewLocation) {
		this.interviewLocation = interviewLocation;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Candidates getCandidates() {
		return candidates;
	}

	public void setCandidates(Candidates candidates) {
		this.candidates = candidates;
	}

	public Jobs getJobs() {
		return jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}
    
    
}

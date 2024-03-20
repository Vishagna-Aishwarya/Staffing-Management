package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.model.Submissions;

@Entity
@Table(name = "Submissions")
public class Submissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SubmissionID")
    private int submissionId;
    private int CandidateID;
    private int JobID;
    private Date SubmissionDate;
    private String Status;
    

    
    
    
    public int getSubmissionId() {
		return submissionId;
	}

	public void setSubmissionId(int submissionId) {
		this.submissionId = submissionId;
	}

	public int getCandidateID() {
		return CandidateID;
	}

	public void setCandidateID(int candidateID) {
		CandidateID = candidateID;
	}

	public int getJobID() {
		return JobID;
	}

	public void setJobID(int jobID) {
		JobID = jobID;
	}

	public Date getSubmissionDate() {
		return SubmissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		SubmissionDate = submissionDate;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Candidates getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidates candidate) {
		this.candidate = candidate;
	}

	public Jobs getJob() {
		return job;
	}

	public void setJob(Jobs job) {
		this.job = job;
	}

	@ManyToOne
    @JoinColumn(name = "CandidateID")
    private Candidates candidate;

    @ManyToOne
    @JoinColumn(name = "JobID")
    private Jobs job;

	public Submissions(int submissionId, int candidateID, int jobID, Date submissionDate, String status,
			Candidates candidate, Jobs job) {
		super();
		this.submissionId = submissionId;
		CandidateID = candidateID;
		JobID = jobID;
		SubmissionDate = submissionDate;
		Status = status;
		this.candidate = candidate;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Submissions [submissionId=" + submissionId + ", CandidateID=" + CandidateID + ", JobID=" + JobID
				+ ", SubmissionDate=" + SubmissionDate + ", Status=" + Status + ", candidate=" + candidate + ", job="
				+ job + "]";
	}

	
	
	
}   


package com.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.model.Jobs;
import com.model.Contracts.Placements;

// Import statements

@Entity
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobID;
    
    private String title;
    private String description;
    private String skillsRequired;
    private int experienceRequired;
    private String salaryRange;
    private String location;
    private String status;
    
    public Jobs() {
    }
    
    @OneToMany(mappedBy = "jobs")
    private Set<Submissions> submissions=new HashSet<Submissions>();
    
    @OneToMany(mappedBy = "jobs")
    private Set<Interviews> interviews=new HashSet<Interviews>();
    
    @OneToMany(mappedBy = "jobs")
    private Set<Placements> placements=new HashSet<Placements>();

	/**
	 * @return the jobID
	 */
	public int getJobID() {
		return jobID;
	}

	/**
	 * @param jobID the jobID to set
	 */
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the skillsRequired
	 */
	public String getSkillsRequired() {
		return skillsRequired;
	}

	/**
	 * @param skillsRequired the skillsRequired to set
	 */
	public void setSkillsRequired(String skillsRequired) {
		this.skillsRequired = skillsRequired;
	}

	/**
	 * @return the experienceRequired
	 */
	public int getExperienceRequired() {
		return experienceRequired;
	}

	/**
	 * @param experienceRequired the experienceRequired to set
	 */
	public void setExperienceRequired(int experienceRequired) {
		this.experienceRequired = experienceRequired;
	}

	/**
	 * @return the salaryRange
	 */
	public String getSalaryRange() {
		return salaryRange;
	}

	/**
	 * @param salaryRange the salaryRange to set
	 */
	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the submissions
	 */
	public Set<Submissions> getSubmissions() {
		return submissions;
	}

	/**
	 * @param submissions the submissions to set
	 */
	public void setSubmissions(Set<Submissions> submissions) {
		this.submissions = submissions;
	}

	/**
	 * @return the interviews
	 */
	public Set<Interviews> getInterviews() {
		return interviews;
	}

	/**
	 * @param interviews the interviews to set
	 */
	public void setInterviews(Set<Interviews> interviews) {
		this.interviews = interviews;
	}

	/**
	 * @return the placements
	 */
	public Set<Placements> getPlacements() {
		return placements;
	}

	/**
	 * @param placements the placements to set
	 */
	public void setPlacements(Set<Placements> placements) {
		this.placements = placements;
	}

	/**
	 * @param jobID
	 * @param title
	 * @param description
	 * @param skillsRequired
	 * @param experienceRequired
	 * @param salaryRange
	 * @param location
	 * @param status
	 * @param submissions
	 * @param interviews
	 * @param placements
	 */
	public Jobs(int jobID, String title, String description, String skillsRequired, int experienceRequired,
			String salaryRange, String location, String status, Set<Submissions> submissions,
			Set<Interviews> interviews, Set<Placements> placements) {
		super();
		this.jobID = jobID;
		this.title = title;
		this.description = description;
		this.skillsRequired = skillsRequired;
		this.experienceRequired = experienceRequired;
		this.salaryRange = salaryRange;
		this.location = location;
		this.status = status;
		this.submissions = submissions;
		this.interviews = interviews;
		this.placements = placements;
	}

	@Override
	public String toString() {
		return "Jobs [jobID=" + jobID + ", title=" + title + ", description=" + description + ", skillsRequired="
				+ skillsRequired + ", experienceRequired=" + experienceRequired + ", salaryRange=" + salaryRange
				+ ", location=" + location + ", status=" + status + ", submissions=" + submissions + ", interviews="
				+ interviews + ", placements=" + placements + "]";
	}

    
	
	
}

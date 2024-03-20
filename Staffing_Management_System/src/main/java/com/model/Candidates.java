package com.model;
import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

import com.model.Candidates;
@Entity
@Table(name = "Candidates")
public class Candidates {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int candidateID;

    @Column(name = "Name")
    private String name;

    @Column(name = "Email")
    private String email;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Skills")
    private String skills;

    @Column(name = "Experience")
    private int experience;

    @Column(name = "Resume")
    private String resume;
    
    public Candidates() {
        // Default constructor
    }

    @OneToMany(mappedBy = "candidates")
    private Set<Submissions> submissions=new HashSet<Submissions>();

    @OneToMany(mappedBy = "candidates") // Adjust mappedBy accordingly
    private Set<Interviews> interviews=new HashSet<Interviews>();

    @SuppressWarnings("rawtypes")
	@OneToMany(mappedBy = "candidates")
    private Set<Placements> placements=new HashSet<Placements>();

	public int getCandidateID() {
		return candidateID;
	}

	public void setCandidateID(int candidateID) {
		this.candidateID = candidateID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public Set<Submissions> getSubmissions() {
		return submissions;
	}

	public void setSubmissions(Set<Submissions> submissions) {
		this.submissions = submissions;
	}

	public Set<Interviews> getInterviews() {
		return interviews;
	}

	public void setInterviews(Set<Interviews> interviews) {
		this.interviews = interviews;
	}

	@SuppressWarnings("rawtypes")
	public Set<Placements> getPlacements() {
		return placements;
	}

	@SuppressWarnings("rawtypes")
	public void setPlacements(Set<Placements> placements) {
		this.placements = placements;
	}

	/**
	 * @param candidateID
	 * @param name
	 * @param email
	 * @param phone
	 * @param skills
	 * @param experience
	 * @param resume
	 * @param submissions
	 * @param interviews
	 * @param placements
	 */
	@SuppressWarnings("rawtypes")
	public Candidates(int candidateID, String name, String email, String phone, String skills, int experience,
			String resume, Set<Submissions> submissions, Set<Interviews> interviews, Set<Placements> placements) {
		super();
		this.candidateID = candidateID;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.skills = skills;
		this.experience = experience;
		this.resume = resume;
		this.submissions = submissions;
		this.interviews = interviews;
		this.placements = placements;
	}

	@Override
	public String toString() {
		return "Candidates [candidateID=" + candidateID + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", skills=" + skills + ", experience=" + experience + ", resume=" + resume + ", submissions="
				+ submissions + ", interviews=" + interviews + ", placements=" + placements + "]";
	}

}
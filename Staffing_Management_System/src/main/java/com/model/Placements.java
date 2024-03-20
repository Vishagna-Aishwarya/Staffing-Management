package com.model;

import java.math.BigDecimal;
import java.util.Date;
import com.model.Placements;
import javax.persistence.*;

@SuppressWarnings("hiding")
@Entity
@Table(name = "Placements")
public class Placements<Candidates> {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int placementID;
   
    @ManyToOne(targetEntity = Placements.class) // Specify the target entity
    @JoinColumn(name = "candidate_id") // Adjust the column name as per your database schema
    private Candidates candidates;

    @ManyToOne
    @JoinColumn(name = "JobID")
    private Jobs job;

    @ManyToOne
    @JoinColumn(name = "ClientID")
    private Clients client;

    @ManyToOne
    @JoinColumn(name = "ContractID")
    private Contracts contract;

    @Column(name = "PlacementDate")
    private Date placementDate;

    @Column(name = "SalaryOffered")
    private BigDecimal salaryOffered;

    @Column(name = "Status")
    private String status;

    public Placements() {
    }

	public int getPlacementId() {
		return placementID;
	}

	public void setPlacementId(int placementId) {
		this.placementID = placementId;
	}

	public Candidates getCandidates() {
		return candidates;
	}

	public void setCandidates(Candidates candidates) {
		this.candidates = candidates;
	}

	public Jobs getJob() {
		return job;
	}

	public void setJob(Jobs job) {
		this.job = job;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public Contracts getContract() {
		return contract;
	}

	public void setContract(Contracts contract) {
		this.contract = contract;
	}

	public Date getPlacementDate() {
		return placementDate;
	}

	public void setPlacementDate(Date placementDate) {
		this.placementDate = placementDate;
	}

	public BigDecimal getSalaryOffered() {
		return salaryOffered;
	}

	public void setSalaryOffered(BigDecimal salaryOffered) {
		this.salaryOffered = salaryOffered;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param placementId
	 * @param candidates
	 * @param job
	 * @param client
	 * @param contract
	 * @param placementDate
	 * @param salaryOffered
	 * @param status
	 */
	public Placements(int placementId, Candidates candidates, Jobs job, Clients client, Contracts contract,
			Date placementDate, BigDecimal salaryOffered, String status) {
		super();
		this.placementID = placementId;
		this.candidates = candidates;
		this.job = job;
		this.client = client;
		this.contract = contract;
		this.placementDate = placementDate;
		this.salaryOffered = salaryOffered;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Placements [placementID=" + placementID + ", candidates=" + candidates + ", job=" + job + ", client="
				+ client + ", contract=" + contract + ", placementDate=" + placementDate + ", salaryOffered="
				+ salaryOffered + ", status=" + status + "]";
	}

    

    
}

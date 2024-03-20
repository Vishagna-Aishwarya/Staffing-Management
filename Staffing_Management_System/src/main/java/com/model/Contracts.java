package com.model;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Contracts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractID;

    @ManyToOne
    @JoinColumn(name = "client_id") // Adjust name and referencedColumnName as per your schema
    private Clients clients;

    @OneToMany(mappedBy = "contracts")
    private Set<Placements> placements=new HashSet<Placements>();
    
    public class Placements {
        // Class definition without generics
    }

    
    @OneToMany(mappedBy = "contracts")
    private Set<Payments> payments=new HashSet<Payments>();


	/**
	 * @return the contractID
	 */
	public int getContractID() {
		return contractID;
	}


	/**
	 * @param contractID the contractID to set
	 */
	public void setContractID(int contractID) {
		this.contractID = contractID;
	}


	/**
	 * @return the clients
	 */
	public Clients getClients() {
		return clients;
	}


	/**
	 * @param clients the clients to set
	 */
	public void setClients(Clients clients) {
		this.clients = clients;
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
	 * @return the payments
	 */
	public Set<Payments> getPayments() {
		return payments;
	}


	/**
	 * @param payments the payments to set
	 */
	public void setPayments(Set<Payments> payments) {
		this.payments = payments;
	}


	/**
	 * @param contractID
	 * @param clients
	 * @param placements
	 * @param payments
	 */
	public Contracts(int contractID, Clients clients, Set<Placements> placements, Set<Payments> payments) {
		super();
		this.contractID = contractID;
		this.clients = clients;
		this.placements = placements;
		this.payments = payments;
	}


	@Override
	public String toString() {
		return "Contracts [contractID=" + contractID + ", clients=" + clients + ", placements=" + placements
				+ ", payments=" + payments + "]";
	}

	
    
}
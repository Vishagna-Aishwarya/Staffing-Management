package com.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.model.Clients;

@Entity
public class Clients {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clientID;
	
    private String companyName;
    private String contactPerson;
    private String email;
    private String phone;
    private String address;
    
    @SuppressWarnings("rawtypes")
	@OneToMany(mappedBy = "clients")
    private Set<Placements> placements=new HashSet<Placements>();
    
    @OneToMany(mappedBy = "clients")
    private Set<Contracts> contracts=new HashSet<Contracts>();

	/**
	 * @return the clientID
	 */
	public int getClientID() {
		return clientID;
	}

	/**
	 * @param clientID the clientID to set
	 */
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the contactPerson
	 */
	public String getContactPerson() {
		return contactPerson;
	}

	/**
	 * @param contactPerson the contactPerson to set
	 */
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the placements
	 */
	@SuppressWarnings("rawtypes")
	public Set<Placements> getPlacements() {
		return placements;
	}

	/**
	 * @param placements the placements to set
	 */
	@SuppressWarnings("rawtypes")
	public void setPlacements(Set<Placements> placements) {
		this.placements = placements;
	}

	/**
	 * @return the contracts
	 */
	public Set<Contracts> getContracts() {
		return contracts;
	}

	/**
	 * @param contracts the contracts to set
	 */
	public void setContracts(Set<Contracts> contracts) {
		this.contracts = contracts;
	}

	/**
	 * @param clientID
	 * @param companyName
	 * @param contactPerson
	 * @param email
	 * @param phone
	 * @param address
	 * @param placements
	 * @param contracts
	 */
	@SuppressWarnings("rawtypes")
	public Clients(int clientID, String companyName, String contactPerson, String email, String phone, String address,
			Set<Placements> placements, Set<Contracts> contracts) {
		super();
		this.clientID = clientID;
		this.companyName = companyName;
		this.contactPerson = contactPerson;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.placements = placements;
		this.contracts = contracts;
	}

	@Override
	public String toString() {
		return "Clients [clientID=" + clientID + ", companyName=" + companyName + ", contactPerson=" + contactPerson
				+ ", email=" + email + ", phone=" + phone + ", address=" + address + ", placements=" + placements
				+ ", contracts=" + contracts + "]";
	}

    

}

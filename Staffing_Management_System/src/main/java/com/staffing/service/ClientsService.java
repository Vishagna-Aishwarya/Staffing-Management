package com.staffing.service;
import com.model.Clients;

public interface ClientsService {
	
	int insertCandidates(Clients clnt);
	void updateCandidates();
	void deleteCandidates();
	void displayCandidate();
	void getCandidate();
	void displayClients(Clients clnt);

}
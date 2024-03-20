package com.staffing.service;
import com.model.Contracts;

public interface ContractsService {
	
	int insertCandidates(Contracts cnts);
	void updateCandidates();
	void deleteCandidates();
	void displayCandidate();
	void getCandidate();

}
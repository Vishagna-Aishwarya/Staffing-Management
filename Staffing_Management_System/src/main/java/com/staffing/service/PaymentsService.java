package com.staffing.service;
import com.model.Payments;

public interface PaymentsService {
	
	int insertCandidates(Payments p);
	void updateCandidates();
	void deleteCandidates();
	void displayCandidate();
	void getCandidate();

}
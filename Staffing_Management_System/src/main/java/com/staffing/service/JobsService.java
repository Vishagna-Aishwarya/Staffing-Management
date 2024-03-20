package com.staffing.service;
import com.model.Jobs;

public interface JobsService {
	
	int insertCandidates(Jobs jbs);
	void updateCandidates();
	void deleteCandidates();
	void displayCandidate();
	void getCandidate();

}
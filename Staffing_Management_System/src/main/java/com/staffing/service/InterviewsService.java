package com.staffing.service;
import com.model.Interviews;

public interface InterviewsService {
	
	int insertCandidates(Interviews Intw);
	void updateCandidates();
	void deleteCandidates();
	void displayCandidate();
	void getCandidate();

}
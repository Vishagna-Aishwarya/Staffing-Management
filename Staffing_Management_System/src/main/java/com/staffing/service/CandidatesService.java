package com.staffing.service;
import com.model.Candidates;

public interface CandidatesService {
	
	int insertCandidates(Candidates cndt);
	void updateCandidates(Candidates cndt);
	void deleteCandidates(Candidates cndt);
	void displayCandidate(Candidates cndt);
	void getCandidate();

}

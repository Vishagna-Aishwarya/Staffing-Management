package com.staffing.service;
import com.model.Submissions;

public interface SubmissionsService {
	
	int insertCandidates(Submissions subs);
	void updateCandidates();
	void deleteCandidates();
	void displayCandidate();
	void getCandidate();

}
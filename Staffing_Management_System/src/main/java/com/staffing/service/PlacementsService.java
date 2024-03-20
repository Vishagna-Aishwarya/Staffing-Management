package com.staffing.service;
import com.model.Placements;

public interface PlacementsService {
	
	@SuppressWarnings("rawtypes")
	int insertCandidates(Placements pl);
	void updateCandidates();
	void deleteCandidates();
	void displayCandidate();
	void getCandidate();

}
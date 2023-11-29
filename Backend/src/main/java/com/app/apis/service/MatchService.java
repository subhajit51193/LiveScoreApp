package com.app.apis.service;

import java.util.List;

import com.app.apis.entity.Match;

public interface MatchService {

	List<Match> getAllMatches();
	
	void updateMatch(Match match);
	
	List<Match> getLiveMatches();
	
	List<List<String>> getCWC2023PointsTable();
}

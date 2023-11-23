package com.app.apis.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.apis.entity.Match;
import com.app.apis.service.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {

	@Autowired
	private MatchService matchService;
	
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getAllLiveMatches(){
	
		List<Match> matches = matchService.getLiveMatches();
		return new ResponseEntity<List<Match>>(matches,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Match>> getAllMatches(){
		
		List<Match> matches = matchService.getAllMatches();
		return new ResponseEntity<List<Match>>(matches,HttpStatus.OK);
	}
	
	@GetMapping("/pointsTable")
	public ResponseEntity<List<List<String>>> getPointsTable(){
		
		List<List<String>> table = matchService.getCWC2023PointsTable();
		return new ResponseEntity<List<List<String>>>(table,HttpStatus.OK);
	}
}

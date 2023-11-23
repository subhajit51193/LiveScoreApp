package com.app.apis.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.apis.entity.Match;

public interface MatchRepository extends JpaRepository<Match, Integer>{

	Optional<Match> findByTeamHeading(String teamHeading);
}

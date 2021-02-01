package com.cts.cj.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.Country;

public interface CountryRepository extends Neo4jRepository<Country, Serializable>{
	
	@Query("MATCH(u:Country) return u")
	public List<Country> getCountryList();
	
	@Query("MATCH(u:Country) where ID(u)={0} return u")
	public Country getCountryById(Long Id);
	
	
}

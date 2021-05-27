package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.hcl.beans.Project;


	
	@Repository
	public interface ProjectDAO extends JpaRepository<Project,Integer >{
		
		
		
	}


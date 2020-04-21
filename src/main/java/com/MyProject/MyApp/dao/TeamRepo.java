package com.MyProject.MyApp.dao;

import com.MyProject.MyApp.Model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepo extends JpaRepository<Team,Integer> {
}

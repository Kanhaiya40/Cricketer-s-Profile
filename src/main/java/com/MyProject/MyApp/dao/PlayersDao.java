package com.MyProject.MyApp.dao;

import com.MyProject.MyApp.Model.Players;
import com.MyProject.MyApp.Model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayersDao extends JpaRepository<Players,Integer> {


}

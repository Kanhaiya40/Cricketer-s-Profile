package com.MyProject.MyApp.dao;

import com.MyProject.MyApp.Model.Performance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerformanceRepo extends JpaRepository<Performance,Integer> {

}

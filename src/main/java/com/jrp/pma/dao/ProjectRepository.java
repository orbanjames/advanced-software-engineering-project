package com.jrp.pma.dao;

import com.jrp.pma.entities.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long> {
    //mechanism to access data in the database

    public List<Project> findAll();

}

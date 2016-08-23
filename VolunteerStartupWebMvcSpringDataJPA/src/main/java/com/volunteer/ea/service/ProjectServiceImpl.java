package com.volunteer.ea.service;

import com.volunteer.ea.domain.Project;
import com.volunteer.ea.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dilip on 8/22/2016.
 */
public class ProjectServiceImpl implements IProjectService{
    @Autowired
    ProjectRepository repository;

    @Override
    public void createNewProject(Project project){
        repository.save(project);
    }
    @Override
    public List<Project> findAllProjects(){
        return repository.findAll();
    }
}

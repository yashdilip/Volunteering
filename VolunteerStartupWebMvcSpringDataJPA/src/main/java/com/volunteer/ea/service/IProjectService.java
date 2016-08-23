package com.volunteer.ea.service;

import com.volunteer.ea.domain.Project;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dilip on 8/22/2016.
 */
@Service
public interface IProjectService {
    void createNewProject(Project project);
    public List<Project> findAllProjects();
}

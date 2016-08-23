package cs544.mum.edu.service;

import cs544.mum.edu.domain.Project;
import cs544.mum.edu.repository.ProjectRepository;
import cs544.mum.edu.repository.ProjectRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dilip on 8/22/2016.
 */
@Component
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

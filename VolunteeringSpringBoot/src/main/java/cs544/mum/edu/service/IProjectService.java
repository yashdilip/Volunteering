package cs544.mum.edu.service;

import cs544.mum.edu.domain.Project;
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

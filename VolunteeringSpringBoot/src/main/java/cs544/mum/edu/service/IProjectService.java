package cs544.mum.edu.service;

import java.util.List;

import cs544.mum.edu.domain.Project;

/**
 * Created by Dilip on 8/22/2016.
 */

public interface IProjectService {
    void createProject(Project project);
	void updateProjectAssignedToUser(Project project);
	List<Project> findAllProjects();
	List<Project> getAllProjects();
	List<Project> getAllProjectsByStatus(String status);
	List<Project> searchProjectByResource(String resource);
	List<Project> searchProjectByKeyword(String keyword);
	List<Project> searchProjectByLocation(String location);
	List<Project> getAllProjectsHavingVolunteer();
	Project getProjectById(int projectId);
	void deleteProject(int projectId);
}

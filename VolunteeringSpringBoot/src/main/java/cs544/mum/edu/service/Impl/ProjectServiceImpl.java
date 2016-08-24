package cs544.mum.edu.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs544.mum.edu.domain.Project;
import cs544.mum.edu.repository.ProjectRepository;
import cs544.mum.edu.service.IProjectService;

import java.util.List;

/**
 * Created by Dilip on 8/22/2016.
 */
@Service
public class ProjectServiceImpl implements IProjectService{
    @Autowired
    ProjectRepository projectRepository;

    @Override
    public List<Project> findAllProjects(){
        return projectRepository.findAll();
    }
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IProjectService#createProject(cs544.mum.edu.domain.Project)
	 */
	@Override
	public void createProject(Project project) {
		// TODO Auto-generated method stub
		projectRepository.save(project);
	}
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IProjectService#updateProjectAssignedToUser(cs544.mum.edu.domain.Project)
	 */
	@Override
	public void updateProjectAssignedToUser(Project project) {
		// TODO Auto-generated method stub
		projectRepository.save(project);
	}
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IProjectService#getAllProjects()
	 */
	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IProjectService#getAllCompletedProjects()
	 */
	@Override
	public List<Project> getAllProjectsByStatus(String status) {
		// TODO Auto-generated method stub
		return projectRepository.findAllByStatus(status);
	}

	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IProjectService#searchProjectByResource(java.lang.String)
	 */
	@Override
	public List<Project> searchProjectByResource(String resource) {
		// TODO Auto-generated method stub
		return projectRepository.findAllByResources(resource);
	}
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IProjectService#searchProjectByKeyword(java.lang.String)
	 */
	@Override
	public List<Project> searchProjectByKeyword(String keyword) {
		// TODO Auto-generated method stub
		return projectRepository.findAllProjectsByKeyword(keyword);
	}
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IProjectService#searchProjectByLocation(java.lang.String)
	 */
	@Override
	public List<Project> searchProjectByLocation(String location) {
		// TODO Auto-generated method stub
		return projectRepository.findAllByLocation(location);
	}
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IProjectService#getAllProjectsHavingVolunteer()
	 */
	@Override
	public List<Project> getAllProjectsHavingVolunteer() {
		// TODO Auto-generated method stub
		return projectRepository.findAllWithVolunteerOrderByTaskTime();
	}
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IProjectService#getProjectById(java.lang.String)
	 */
	@Override
	public Project getProjectById(int projectId) {
		// TODO Auto-generated method stub
		return projectRepository.findOne(Integer.valueOf(projectId));
	}
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IProjectService#deleteProject(int)
	 */
	@Override
	public void deleteProject(int projectId) {
		projectRepository.delete(Integer.valueOf(projectId));
		
	}
}

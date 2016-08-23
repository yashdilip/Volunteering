package cs544.mum.edu.service;

import java.util.List;

import cs544.mum.edu.domain.Address;
import cs544.mum.edu.domain.Beneficiary;
import cs544.mum.edu.domain.Project;
import cs544.mum.edu.domain.Task;
import cs544.mum.edu.domain.User;

public interface IService {
	/*void createUser(User user);
	void saveUserAddress(Address address);
	void createNewProject(Project project);
	void saveProjectTask(Task task);
	void createBeneficiary(Beneficiary beneficiary);
	Project getProjectByName(String name);
	void updateProject(Project project);
	List<Task> getTasksByResource(String str);
	void updateTask(Task t);
	List<User> getAllUsers();
	List<Project> getAllProjects();
	List<Task> getAllTasksByProjectId(int projectId);
	List<Project> getAllCompletedProjects();
	List<Project> getAllIncompletedProjects();
	List<Project> getProjectsByResource(String resources);
	List<Project> getProjectsByKeyword(String keyword);
	List<Project> getProjectsByLocation(String location);
	List<Project> getAllProjectsAndTaskHavingVolunteer();
	List<Beneficiary> getAllBeneficiariesOfProjectById(int projectId);*/
	void saveAddress(Address address);
	void saveUser(User user);
	void saveProjectTask(Task task);
	void saveBeneficiary(Beneficiary beneficiary);
	void saveProject(Project project);
}

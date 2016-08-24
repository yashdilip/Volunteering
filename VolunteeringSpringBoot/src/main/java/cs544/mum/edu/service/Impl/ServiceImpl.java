package cs544.mum.edu.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cs544.mum.edu.domain.Address;
import cs544.mum.edu.domain.Beneficiary;
import cs544.mum.edu.domain.Project;
import cs544.mum.edu.domain.Task;
import cs544.mum.edu.domain.User;
import cs544.mum.edu.repository.AddressRepository;
import cs544.mum.edu.repository.BeneficiaryRepository;
import cs544.mum.edu.repository.ProjectRepository;
import cs544.mum.edu.repository.TaskRepository;
import cs544.mum.edu.repository.UserRepository;
import cs544.mum.edu.service.IService;

@Component
public class ServiceImpl implements IService {
	
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	BeneficiaryRepository beneficiaryRepository;
	@Autowired
	ProjectRepository projectRepository;
	@Autowired
	TaskRepository taskRepository;
	@Autowired
	UserRepository userRepository;
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IService#saveAddress(cs544.mum.edu.domain.Address)
	 */
	@Override
	public void saveAddress(Address address) {
		// TODO Auto-generated method stub
		addressRepository.save(address);
		
	}
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IService#saveUser(cs544.mum.edu.domain.User)
	 */
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		
	}
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IService#saveProjectTask(cs544.mum.edu.domain.Task)
	 */
	@Override
	public void saveProjectTask(Task task) {
		// TODO Auto-generated method stub
		taskRepository.save(task);
		
	}
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IService#saveBeneficiary(cs544.mum.edu.domain.Beneficiary)
	 */
	@Override
	public void saveBeneficiary(Beneficiary beneficiary) {
		// TODO Auto-generated method stub
		beneficiaryRepository.save(beneficiary);
		
	}
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IService#saveProject(cs544.mum.edu.domain.Project)
	 */
	@Override
	public void saveProject(Project project) {
		// TODO Auto-generated method stub
		projectRepository.save(project);
		
	}
	
	
	/*IUserDAO userDAO = new UserDAO();
	IProjectDAO projectDAO = new ProjectDAO();	
	ITaskDAO taskDAO = new TaskDAO();
	IBeneficiaryDAO beneficiaryDAO = new BeneficiaryDAO();

	public void createUser(User user) {
		userDAO.create(user);
	}

	public void createNewProject(Project project) {
		projectDAO.createProject(project);
	}

	public void saveUserAddress(Address address) {
		userDAO.saveNewAddress(address);
	}

	public void saveProjectTask(Task task) {
		taskDAO.createTask(task);
	}

	public void createBeneficiary(Beneficiary beneficiary) {
		beneficiaryDAO.createBeneficiary(beneficiary);
	}

	public Project getProjectByName(String name) {
		return projectDAO.getProjectById(name);
	}

	public void updateProject(Project project) {
		projectDAO.updateProjectAssignedToUser(project);
		
	}

	public List<Task> getTasksByResource(String str) {
		return taskDAO.getTaskBySkill(str);
	}

	public void updateTask(Task t) {
		taskDAO.updateTask(t);
	}

	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}

	public List<Project> getAllProjects() {
		return projectDAO.getAllProjects();
	}

	public List<Task> getAllTasksByProjectId(int projectId) {
		return taskDAO.getAllTaskByProjectId(projectId);
	}

	public List<Project> getAllCompletedProjects() {
		return projectDAO.getAllCompletedProjects();
	}

	public List<Project> getAllIncompletedProjects() {
		return projectDAO.getAllIncompletedProjects();
	}

	public List<Project> getProjectsByResource(String resources) {
		return projectDAO.searchProjectByResource(resources);
	}

	public List<Project> getProjectsByKeyword(String keyword) {
		return projectDAO.searchProjectByKeyword(keyword);
	}

	public List<Project> getProjectsByLocation(String location) {
		return projectDAO.searchProjectByLocation(location);
	}

	public List<Project> getAllProjectsAndTaskHavingVolunteer() {
		return projectDAO.getAllProjectsHavingVolunteer();
	}

	public List<Beneficiary> getAllBeneficiariesOfProjectById(int projectId) {
		return beneficiaryDAO.getAllBeneficiariesByProjectId(projectId);
	}	*/
}

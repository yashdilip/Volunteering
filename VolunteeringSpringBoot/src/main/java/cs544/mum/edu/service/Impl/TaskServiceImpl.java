/**
 * 
 */
package cs544.mum.edu.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs544.mum.edu.domain.Task;
import cs544.mum.edu.repository.TaskRepository;
import cs544.mum.edu.service.ITaskService;

/**
 * @author Dilip
 *
 */
@Service
public class TaskServiceImpl implements ITaskService{

	@Autowired
	TaskRepository taskRepository;
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.ITaskService#createTask(cs544.mum.edu.domain.Task)
	 */
	@Override
	public void createTask(Task task) {
		// TODO Auto-generated method stub
		taskRepository.save(task);
	}

	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.ITaskService#getAllTaskByProjectId(int)
	 */
	@Override
	public List<Task> getAllTaskByProjectId(String projectId) {
		// TODO Auto-generated method stub
		return taskRepository.findAllByProject(projectId);
	}

	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.ITaskService#updateTask(cs544.mum.edu.domain.Task)
	 */
	@Override
	public void updateTask(Task task) {
		// TODO Auto-generated method stub
		taskRepository.save(task);
	}

	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.ITaskService#getAllTaskOfferedByVolunteer()
	 */
	@Override
	public List<Task> getAllTaskOfferedByVolunteer() {
		// TODO Auto-generated method stub
		return taskRepository.findAllTaskHavingVolunteer();
	}

	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.ITaskService#getTaskBySkill(java.lang.String)
	 */
	@Override
	public List<Task> getTaskBySkill(String skill) {
		// TODO Auto-generated method stub
		return taskRepository.findAllTaskBySkill(skill);
	}

}

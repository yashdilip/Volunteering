/**
 * 
 */
package cs544.mum.edu.service;

import java.util.List;

import cs544.mum.edu.domain.Task;

/**
 * @author Dilip
 *
 */
public interface ITaskService {
	void createTask(Task task);
	List<Task> getAllTaskByProjectId(String projectId);
	void updateTask(Task task);
	List<Task> getAllTaskOfferedByVolunteer();
	List<Task> getTaskBySkill(String skill);
}

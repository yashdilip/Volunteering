/**
 * 
 */
package cs544.mum.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cs544.mum.edu.domain.Task;

import java.util.List;

/**
 * @author Dilip
 *
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, String> {
	@Query("from Task t where t.project.id = :projectId")
    List<Task> findAllByProject(@Param("projectId") String projectId);
	
	@Query("from Task t where t.resourceRequired = :resourceRequired")
    List<Task> findAllTaskBySkill(@Param("resourceRequired") String resourceRequired);
	
	@Query("from Task t where count(t.user) >=1")
    List<Task> findAllTaskHavingVolunteer();
}

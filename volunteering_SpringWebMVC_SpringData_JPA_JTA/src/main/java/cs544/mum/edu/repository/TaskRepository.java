/**
 * 
 */
package cs544.mum.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cs544.mum.edu.domain.Task;

/**
 * @author Dilip
 *
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
	@Query("from Task t where t.project.id = :projectId")
    List<Task> findAllByProject(@Param("projectId") Long projectId);
}

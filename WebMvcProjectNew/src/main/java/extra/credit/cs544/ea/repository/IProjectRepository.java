package extra.credit.cs544.ea.repository;

import extra.credit.cs544.ea.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
/*
import org.springframework.data.repository.query.Param;
*/
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Dilip on 8/23/2016.
 */
@Repository
public interface IProjectRepository extends JpaRepository<Project,Long> {
 /*   @Query("from Project p where p.projectStatus=:status")
    List<Project> findAllByStatus(@Param("status") String status);

    @Query("from Project p JOIN p.tasks t where t.resourceRequired = :resource")
    List<Project> findAllByResources(@Param("resource") String resource);

    @Query("from Project p where p.location like CONCAT('%',:location,'%') ")
    List<Project> findAllByLocation(@Param("location") String location);

    @Query("from Project p where p.description like CONCAT('%',:description,'%') ")
    List<Project> findAllByDescriptionLike(@Param("description") String description);

    @Query("from Project p JOIN p.tasks t where t.user <> NULL order by t.timeframeToCompleteInDays")
    List<Project> findAllWithVolunteerOrderByTaskTime();*/
}

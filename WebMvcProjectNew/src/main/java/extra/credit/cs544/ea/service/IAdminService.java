package extra.credit.cs544.ea.service;

import extra.credit.cs544.ea.domain.Address;
import extra.credit.cs544.ea.domain.Project;
import extra.credit.cs544.ea.domain.Task;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dilip on 8/23/2016.
 */

public interface IAdminService {
    public abstract void save(Project project);
    public abstract void update(Project project);
    public abstract void delete(Project project);
    public abstract List<Project> findAll();
    public abstract List<Task> findAllTaskByProject(Project project);
    public abstract List<Project> findAllByStatus(String status);
    public abstract List<Project> findAllByResources(String resources);
    public abstract List<Project> findAllByLocation(Address address);
    public abstract List<Project> findAllByDescriptionLike(String description);
    public abstract List<Project> findAllWithVolunteersOrderByTaskTime();
}

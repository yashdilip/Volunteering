package extra.credit.cs544.ea.service.Impl;

import extra.credit.cs544.ea.domain.Address;
import extra.credit.cs544.ea.domain.Project;
import extra.credit.cs544.ea.domain.Task;
import extra.credit.cs544.ea.repository.IProjectRepository;
import extra.credit.cs544.ea.repository.Impl.ProjectRepositoryImpl;
import extra.credit.cs544.ea.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Dilip on 8/23/2016.
 */
@Service
@Transactional
public class AdminServiceImpl implements IAdminService{
   @Autowired
    private IProjectRepository projectRepository;

    public void save(Project project) {
        projectRepository.save(project);
    }

    public void update(Project project) {

    }

    public void delete(Project project) {

    }

    public List<Project> findAll() {
        return null;
    }

    public List<Task> findAllTaskByProject(Project project) {
        return null;
    }

    public List<Project> findAllByStatus(String status) {
        return null;
    }

    public List<Project> findAllByResources(String resources) {
        return null;
    }

    public List<Project> findAllByLocation(Address address) {
        return null;
    }

    public List<Project> findAllByDescriptionLike(String description) {
        return null;
    }

    public List<Project> findAllWithVolunteersOrderByTaskTime() {
        return null;
    }
}

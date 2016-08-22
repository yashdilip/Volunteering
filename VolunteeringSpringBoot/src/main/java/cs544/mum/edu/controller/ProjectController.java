package cs544.mum.edu.controller;

import cs544.mum.edu.domain.Project;
import cs544.mum.edu.service.IProjectService;
import cs544.mum.edu.service.ProjectServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Dilip on 8/22/2016.
 */
@Controller
@RequestMapping("/admin")
public class ProjectController {
    IProjectService projectService = new ProjectServiceImpl();
    @RequestMapping("/dashboard")
    public String dashboard(){
        return "/users/admin/admin_dash";
    }

    @RequestMapping(value = "addproject", method = RequestMethod.GET)
    public String addProject(Model model){
        Project project = new Project();
        model.addAttribute("project", project);
        return "addproject";
    }
    @RequestMapping(value = "addproject", method = RequestMethod.POST)
    public String addProjectFormProcess(Project project){
        projectService.createNewProject(project);
        return "redirect:/projects";
    }
    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public String getAllProjects(Model model){
        List<Project> projectList = projectService.findAllProjects();
        model.addAttribute("projectList", projectList);
        return "projects";
    }
}

package com.volunteer.ea.controller;

import com.volunteer.ea.domain.Project;
import com.volunteer.ea.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping("/dashboard")
    public String dashboard(){
        return "/users/admin/admin_dash";
    }

    /*@RequestMapping(value = "addproject", method = RequestMethod.GET)
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
    }*/
}

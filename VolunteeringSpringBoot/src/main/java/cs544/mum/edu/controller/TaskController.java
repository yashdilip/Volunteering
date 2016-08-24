package cs544.mum.edu.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cs544.mum.edu.domain.Beneficiary;
import cs544.mum.edu.domain.Project;
import cs544.mum.edu.domain.Task;
import cs544.mum.edu.domain.User;
import cs544.mum.edu.service.Impl.AddressServiceImpl;
import cs544.mum.edu.service.Impl.BeneficiaryServiceImpl;
import cs544.mum.edu.service.Impl.ProjectServiceImpl;
import cs544.mum.edu.service.Impl.TaskServiceImpl;
import cs544.mum.edu.service.Impl.UserServiceImpl;

/**
 * Created by Dilip on 8/22/2016.
 */
@Controller
@RequestMapping("/volunteer")
public class TaskController {
	@Autowired
	ProjectServiceImpl projectService;
	
	@Autowired
	AddressServiceImpl addressService;
	
	@Autowired
	TaskServiceImpl taskService;
	
	@Autowired
	UserServiceImpl userService;
	
	@Autowired
	BeneficiaryServiceImpl beneficiaryService;
	
    @RequestMapping("/dashboard")
    public String dashboard(){
        return "/users/volunteer/user_dash";
    }
    
    @RequestMapping(value = "/projectlist", method = RequestMethod.GET)
    public String getAllProjects(Model model){    	
        List<Project> projectList = projectService.findAllProjects();
        model.addAttribute("projects", projectList);
        return "/users/volunteer/projectlist";
    }
    @RequestMapping(value="/project/{projectId}", method=RequestMethod.GET)
    public String showProject(@PathVariable("projectId") int projectId, Model model){
    	model.addAttribute("project",projectService.getProjectById(projectId));
    	return "/users/volunteer/projectdetail";
    }
    @RequestMapping(value="/project/edit/{projectId}", method=RequestMethod.GET)
    public String editProject(@PathVariable("projectId") int projectId, Model model){
    	model.addAttribute("project",projectService.getProjectById(projectId));
    	return "/users/volunteer/projectedit";
    }
    @RequestMapping(value = "addproject", method = RequestMethod.POST)
    public String addProjectFormProcess(Project project){
    	for(User u:project.getUsers()){
    		addressService.saveAddress(u.getAddress());
    		userService.create(u);
    	}
    	for(Task t:project.getTasks()){
    		taskService.createTask(t);
    	}
    	for(Beneficiary b:project.getBeneficiaries()){
    		beneficiaryService.createBeneficiary(b);
    	}    	
        projectService.createProject(project);
        return "redirect:/volunteeer/dashboard";
    }
	@RequestMapping(value = "/searchProject", method = RequestMethod.POST)
	public ModelAndView searchProject(@RequestParam("searchText") String searchText, RedirectAttributes redirectAttributes) {
		List<Project> projects = projectService.searchProjectByKeyword(searchText);
		String viewPath = "/users/volunteer/projectlist";
		ModelAndView modelAndView = new ModelAndView(viewPath);
		modelAndView.addObject("projects", projects);
		return modelAndView;
	}
}

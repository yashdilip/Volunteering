package extra.credit.cs544.ea.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Dilip
 *
 */

@Entity
public class Project {
	@Id
	@GeneratedValue
	private int projectId;
	private String projectname;
	private String description;
	private String location;
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@OneToMany
	@JoinTable(name="PROJECT_TASK", joinColumns = @JoinColumn(name="projectId"),
	inverseJoinColumns = @JoinColumn(name="taskId"))
	private List<Task> tasks = new ArrayList<Task>();
	
	@ManyToMany
	@JoinTable(name="USER_PROJECT", joinColumns=@JoinColumn(name="projectId"), 
	inverseJoinColumns=@JoinColumn(name="userId"))
	private List<User> users = new ArrayList<User>();
	
	private String projectStatus;
	
	@ManyToMany
	@JoinTable(name="PROJECT_BENEFICIARY", joinColumns = @JoinColumn(name="projectId"),
	inverseJoinColumns = @JoinColumn(name="beneficiaryId"))
	private List<Beneficiary> beneficiaries = new ArrayList<Beneficiary>();

	public Project() {
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public List<Beneficiary> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(List<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectname=" + projectname + ", description=" + description
				+ ", location=" + location + ", startDate=" + startDate + ", endDate=" + endDate + ", projectStatus="
				+ projectStatus + "]";
	}
	
}

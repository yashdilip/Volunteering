package com.volunteer.ea.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilip
 *
 */

@Entity
public class User {
	@Id
	@GeneratedValue
	private int userId;
	private String name;
	private String email;
	private String password;
	@OneToOne
	@JoinColumn(name="addressId")
	private Address address;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@ManyToMany(mappedBy="users")
	
	private List<Project> projects = new ArrayList<Project>();
	
	@OneToMany(mappedBy="user")
	private List<Task> taskOffered = new ArrayList<Task>();
	
	
	public User(){
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int id) {
		this.userId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public List<Task> getTaskOffered() {
		return taskOffered;
	}
	public void setTaskOffered(List<Task> taskOffered) {
		this.taskOffered = taskOffered;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", role=" + role + "]";
	}
	
}

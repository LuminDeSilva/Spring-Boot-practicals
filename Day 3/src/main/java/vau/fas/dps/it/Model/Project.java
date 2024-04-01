package vau.fas.dps.it.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
@Entity
public class Project {
	@Id
	private int id;
	private String name;
	private String description;
	@ManyToMany
	@JoinTable(name = "assignments",
	joinColumns = @JoinColumn(name="employee_id"),
	inverseJoinColumns =@JoinColumn(name="project_id") )
	private List<Employee>employees;

}

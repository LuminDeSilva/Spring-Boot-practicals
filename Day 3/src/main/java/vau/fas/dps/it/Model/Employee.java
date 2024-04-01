package vau.fas.dps.it.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String position;
	private int salary;
	@ManyToOne
	private Department department;
	@ManyToOne
	@JoinColumn(name = "supervisor")
	private Employee supervisor;
	@ManyToMany(mappedBy = "employees")
	private List<Project>projects;

}

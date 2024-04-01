package vau.fas.dps.it.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Department {
	@Id
	private int id;
	private String name;
	@OneToMany(mappedBy = "department")
	private List<Employee>employees;
}

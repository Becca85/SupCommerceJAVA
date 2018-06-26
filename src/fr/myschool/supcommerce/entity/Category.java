package fr.myschool.supcommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoy")
public class Category {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long Id;
	private String Name;
	
	public long getId() {
		return Id;
	}
	
	public void setId(long id) {
		Id = id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public Category(long id, String name) {
		Id = id;
		Name = name;
	}
	
	
}
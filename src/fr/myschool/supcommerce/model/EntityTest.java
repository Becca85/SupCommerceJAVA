package fr.myschool.supcommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EntityTest {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String myTestProperty;

	public String getMyTestProperty() {
		return myTestProperty;
	}

	public void setMyTestProperty(String myTestProperty) {
		this.myTestProperty = myTestProperty;
	}

	public EntityTest(String myTestProperty) {
		this.myTestProperty = myTestProperty;
	}
	
	
}

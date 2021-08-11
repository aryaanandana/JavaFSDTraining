package com.ust.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Emp100")


	public class Employee {  
	@Id
	@Column(name="id")
	
	
	
	private int id;  
	private String firstName,lastName;  
	  
	public int getId() {  
	    return id;  
	}  
	public void setId(int id) {  
    this.id = id;  
	}  
public String getFirstName() {  
	    return firstName;  
	}  
	public void setFirstName(String firstName) {  
	    this.firstName = firstName;  
	}  
	public String getLastName() {  
    return lastName;  
	}  
public void setLastName(String lastName) {  
	    this.lastName = lastName;  
	}  
	}  

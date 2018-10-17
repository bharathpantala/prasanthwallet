package com.jlcindia.hibernate;

import javax.persistence.*;


@Entity(name="Customers")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String name;
	
	@Embedded
	@AttributeOverrides(value= {
		@AttributeOverride(name="street",column=@Column(name="mystreet")),
		@AttributeOverride(name="city",column=@Column(name="mycity"))})
	
	private Address address;
	
	public Customer() {}

	public Customer(String name, Address address) {
		
		this.name = name;
		this.address = address;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}

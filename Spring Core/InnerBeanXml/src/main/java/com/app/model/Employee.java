package com.app.model;

/**
 *  Inner Bean --- Defining child bean inside parent bean is called Inner bean .
 *  				<bean  classs="parent obj" ..............>
 *  					<property name = "..."  >
 *  						<bean class ="child class Obj" ..>...</bean>
 *  					</property>
 *  				</bean>
 *  
 *   			--We can also ref tag but using inner bean is faster than ref tag.
 *   
 * 			For child class in java config we can define child bean then set value of child obj in parent bean 
 * 			 In case of annotation use @Autowired
 * 
 * 
 * **/




public class Employee {

	private Integer empId;
	
	private String empName;
	
	private Address addr;
	
	public Employee() {
		super();
	}	

	public Employee(Integer empId, String empName, Address addr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.addr = addr;
	}

	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", addr=" + addr + "]";
	}

	
	
	
	
}

	
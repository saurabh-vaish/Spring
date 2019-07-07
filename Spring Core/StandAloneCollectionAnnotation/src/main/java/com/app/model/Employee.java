package com.app.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component()
//@PropertySource("app.properties")
public class Employee {

	@Value("10")
	private Integer empId;
	
	@Value("srv ")
	private String empName;
	
	@Value("#{prj}")			// for data from app config  value come at run time
	private List<String> empPrj;
	
	@Value("#{phn}")
	private Set<Long> empPhn;
	
	@Value("#{addr}")
	private Map<Integer,String> empAddr;
	
	public Employee() {
		super();
	}
	
	public Employee(Integer empId, String empName, List<String> empPrj, Set<Long> empPhn,
			Map<Integer, String> empAddr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPrj = empPrj;
		this.empPhn = empPhn;
		this.empAddr = empAddr;
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

	public List<String> getEmpPrj() {
		return empPrj;
	}

	public void setEmpPrj(List<String> empPrj) {
		this.empPrj = empPrj;
	}

	public Set<Long> getEmpPhn() {
		return empPhn;
	}

	public void setEmpPhn(Set<Long> empPhn) {
		this.empPhn = empPhn;
	}

	public Map<Integer, String> getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(Map<Integer, String> empAddr) {
		this.empAddr = empAddr;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPrj=" + empPrj + ", empPhn=" + empPhn
				+ ", empAddr=" + empAddr + "]";
	}
	
		
	
}

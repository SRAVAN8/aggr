package com.sravan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name="empTab")
public class Employee {//min=5
	
	@Id
	@Column(name="emp_no")
	@GeneratedValue
	//@Size(min=1,max = 20)
	private Integer empNo;
	@Column(name="emp_name")
	@Size(min=5,max=200,message="name should be between 10 to 200 characters ")
	private String empName;
	@Column(name="emp_sal")
	
	private Double empsal;
	@Column(name="address")
	private String addr;
	//@Pattern(regexp="(^$|[0-9]{12})")	
	//@Column(precision = 12,name="aadhar_no")
	private String aadharNo;
	public Employee() {
		super();
	}
	public Employee(Integer empNo, String empName, Double empsal, String addr, String aadharNo) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empsal = empsal;
		this.addr = addr;
		this.aadharNo = aadharNo;
	}
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(Double empsal) {
		this.empsal = empsal;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empsal=" + empsal + ", addr=" + addr
				+ ", aadharNo=" + aadharNo + "]";
	}
	
	

}

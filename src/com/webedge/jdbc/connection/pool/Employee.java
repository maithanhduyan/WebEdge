/**
 * WebEdge 2018
 */
package com.webedge.jdbc.connection.pool;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Mai Thành Duy An
 */
public class Employee implements Serializable {

	private static final long serialVersionUID = 1771330234854528902L;

	public Employee() {
	}

	public Employee(Integer empNo, String empName, String job, Integer mgr, Date hireDate, Integer sal, Integer comm,
			Integer deptNo) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getMgr() {
		return mgr;
	}

	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Integer getSal() {
		return sal;
	}

	public void setSal(Integer sal) {
		this.sal = sal;
	}

	public Integer getComm() {
		return comm;
	}

	public void setComm(Integer comm) {
		this.comm = comm;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "EmployeeImpl [empNo=" + empNo + ", empName=" + empName + ", job=" + job + ", mgr=" + mgr + ", hireDate="
				+ hireDate + ", sal=" + sal + ", comm=" + comm + ", deptNo=" + deptNo + ", getEmpNo()=" + getEmpNo()
				+ ", getEmpName()=" + getEmpName() + ", getJob()=" + getJob() + ", getMgr()=" + getMgr()
				+ ", getHireDate()=" + getHireDate() + ", getSal()=" + getSal() + ", getComm()=" + getComm()
				+ ", getDeptNo()=" + getDeptNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	private Integer empNo;
	private String empName;
	private String job;
	private Integer mgr;
	private Date hireDate;
	private Integer sal;
	private Integer comm;
	private Integer deptNo;
}

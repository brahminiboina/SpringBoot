package com.wicore.emp.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Employee {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	 	private Long emp_id;
		private String firstname;
		private String lastname;
		private String gender;
		private String phone_no;
		private String email;
		private String state;
		private String Address;
		private String empdes;
		public Long getEmp_id() {
			return emp_id;
		}
		public void setEmp_id(Long emp_id) {
			this.emp_id = emp_id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPhone_no() {
			return phone_no;
		}
		public void setPhone_no(String phone_no) {
			this.phone_no = phone_no;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getEmpdes() {
			return empdes;
		}
		public void setEmpdes(String empdes) {
			this.empdes = empdes;
		}
		 
}




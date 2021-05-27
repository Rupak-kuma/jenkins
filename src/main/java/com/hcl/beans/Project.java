package com.hcl.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


	@Entity
	@Table(name="project")
	public class Project {
	   
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="project_id")
	   private int projectId;
		@Column(name="project_name")
		private String projectName;
		
		@OneToOne
		private Employee employee;

		public int getProjectId() {
			return projectId;
		}

		public void setProjectId(int projectId) {
			this.projectId = projectId;
		}

		public String getProjectName() {
			return projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public Employee getEmployee() {
			return employee;
		}

		public void setEmployee(Employee employee) {
			this.employee = employee;
		}

		@Override
		public String toString() {
			return "Project [projectId=" + projectId + ", projectName=" + projectName + ", employee=" + employee + "]";
		}
		

}

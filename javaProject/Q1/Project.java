package com.javaProject.Q1;

import java.io.Serializable;

public class Project implements Serializable {
	private String projectId;
	private String projectName;
	private int projectDuration;

	public Project(String projectId, String projectName, int projectDuration) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDuration = projectDuration;
	}

	public Project() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Project [projectCode=" + projectId + ", projectName=" + projectName + ", projectStrength="
				+ projectDuration + "]";
	}
}
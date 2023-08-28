package com.javaProject.Q2;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Project implements Serializable {
	private String projectId;
	private String projectName;
	private int projectDuration;

	public Project(String projectId, String projectName, int projectDuration) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDuration = projectDuration;
	}

	@Override
	public String toString() {
		return "Project [projectCode=" + projectId + ", projectName=" + projectName + ", projectStrength="
				+ projectDuration + "]";
	}
}

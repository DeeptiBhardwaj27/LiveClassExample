package com.example.LiveClassCaseStudy1;

import java.util.Date;

public class LiveClassDTO {
	private Integer id;
	private Date dateAndTime;
	private Integer coursePackageId;
	private String liveUrl;
	private String password;
	private String topic;
	private String dependents;
	private Boolean isPublic;
	
	
	public LiveClassDTO(Integer id, Date dateAndTime, Integer coursePackageId, String liveUrl, String password,
			String topic, String dependents, Boolean isPublic) {
		super();
		this.id = id;
		this.dateAndTime = dateAndTime;
		this.coursePackageId = coursePackageId;
		this.liveUrl = liveUrl;
		this.password = password;
		this.topic = topic;
		this.dependents = dependents;
		this.isPublic = isPublic;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public Integer getCoursePackageId() {
		return coursePackageId;
	}
	public void setCoursePackageId(Integer coursePackageId) {
		this.coursePackageId = coursePackageId;
	}
	public String getLiveUrl() {
		return liveUrl;
	}
	public void setLiveUrl(String liveUrl) {
		this.liveUrl = liveUrl;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDependents() {
		return dependents;
	}
	public void setDependents(String dependents) {
		this.dependents = dependents;
	}
	public Boolean getIsPublic() {
		return isPublic;
	}
	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

}

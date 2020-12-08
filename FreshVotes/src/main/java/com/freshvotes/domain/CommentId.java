package com.freshvotes.domain;

import javax.persistence.Entity;

@Entity
public class CommentId {
	
	private User user;
	private Feature feature;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Feature getFeature() {
		return feature;
	}
	public void setFeature(Feature feature) {
		this.feature = feature;
	}

}

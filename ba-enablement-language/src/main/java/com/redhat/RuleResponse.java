package com.redhat;

import java.util.Collection;

public class RuleResponse {

	@KieQuery(binding = "$business", queryName = "Get Business")
	private Business business;
	
	private String responseCode; // e.g. success, failure, filtered, validation error...
	
	private Collection<Reason> reasons; // messages about why the response Code came bacl

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

}

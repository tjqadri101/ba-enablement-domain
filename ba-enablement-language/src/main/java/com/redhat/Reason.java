package com.redhat;

public class Reason {

	private String reasonMessage; // tell me what happened? was it null?
	
	public Reason(){
	}
	
	public String getReasonMessage() {
		return reasonMessage;
	}

	public void setReasonMessage(String reasonMessage) {
		this.reasonMessage = reasonMessage;
	}

	@Override
	public boolean equals(Object obj){
		Reason other = (Reason) obj;
		if(this.getReasonMessage().equals(other.getReasonMessage())){
			return true;
		}
		
		else if (this.getReasonMessage() == null && other.getReasonMessage() == null){
			return true;
		}
		
		//System.out.println(reasonMessage);
		//System.out.println("here");
		//System.out.println("Other: " + other.getReasonMessage());
		return false;
	}
}
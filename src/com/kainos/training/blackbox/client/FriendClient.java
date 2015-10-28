package com.kainos.training.blackbox.client;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.kainos.training.blackboxinterface.model.person.Person;

public class FriendClient {
	
	private WebTarget target;
	
	public FriendClient() {
		target = ClientBuilder.newClient().target("http://localhost:8910").path("/person");
	}
	
	public Response addFriend(Person p){
		Response response = 
				target.request().post(Entity.entity(p, MediaType.APPLICATION_JSON));
		
		return response;
	}
	
}

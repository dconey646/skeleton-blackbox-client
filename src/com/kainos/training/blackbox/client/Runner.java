package com.kainos.training.blackbox.client;

import com.kainos.training.blackbox_interface.model.Person;

public class Runner {

	public static void main(String[] args) {
		FriendClient c = new FriendClient();
		
		Person p = new Person();
		p.setName("Our John Boy");
		
		c.addFriend(p);
	}

}

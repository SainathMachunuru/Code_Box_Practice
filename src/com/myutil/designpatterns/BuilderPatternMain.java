package com.myutil.designpatterns;

import com.myutil.designpatterns.builder.User;

public class BuilderPatternMain {

	public static void main(String[] args) {
		User user = new User.UserBuilder("sainath", "machunur").mobile("1234556").age(25).city("hyd").build();
		System.out.println(user);

	}

}

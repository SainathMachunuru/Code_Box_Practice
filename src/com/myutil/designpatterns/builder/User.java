package com.myutil.designpatterns.builder;



/**
 * Builder pattern aims to “Separate the construction of a complex object from
 * its representation so that the same construction process can create different
 * representations let say firstName,lastName are mandatory and remaining are
 * optional
 */
public class User {
	private String firstName;
	private String lastName;
	private String city;
	private String mobile;
	private int age;

	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.city = builder.city;
		this.mobile = builder.mobile;
		this.age = builder.age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCity() {
		return city;
	}

	public String getMobile() {
		return mobile;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", mobile=" + mobile
				+ ", age=" + age + "]";
	}

	public static class UserBuilder {
		private String firstName;
		private String lastName;
		private String city;
		private String mobile;
		private int age;

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;

		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder mobile(String mobile) {
			this.mobile = mobile;
			return this;
		}

		public UserBuilder city(String city) {
			this.city = city;
			return this;
		}

		public User build() {
			User user = new User(this);
			return user;
		}

	}

}

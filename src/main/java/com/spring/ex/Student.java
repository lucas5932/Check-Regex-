package com.spring.ex;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	@NotEmpty(message="이름 입력 누락")
	private String name;
	@Length(min = 3, max = 5, message = "3글자 이상 5글자 이하")
	private String id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}

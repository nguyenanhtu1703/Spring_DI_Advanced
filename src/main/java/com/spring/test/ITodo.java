package com.spring.test;

import java.sql.Date;

public interface ITodo {
	long getId();
	String getSumary();
	void setSumary(String sumary);
	void setDescription(String description);
	String getDescription();
	boolean isDone();
	void setDone(boolean isDone);
	Date getDueDate();
	void setDueDate(Date dueDate);
	ITodo copy();
}


package com.spring.test;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Todo implements ITodo {
	public final long id;
	private String summary;
	private String description;
	private boolean done;
	private Date dueDate;
	public Todo() {
		this(-1);
	}
	public Todo(long i) {
		this(i, "");
	}
	
	@Autowired
	public Todo(long i, @Qualifier("summary1")String sumary) {
		this.id = i;
		this.summary = sumary;
	}
	
	public long getId() {
		return id;
	}
	
	public String getSumary() {
		return summary;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setSumary(String sumary) {
		this.summary = summary;
	}

	@Autowired
	@Qualifier("description2")
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isDone() {
		return done;
	}
	
	@Autowired
	public void setDone(boolean isDone) {
		this.done = isDone;
	}

	public Date getDueDate() {
		return dueDate;
	}

	@Autowired
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	public int hasCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ ( id >> 31 ));
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo  other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	public String toString() {
		return "Todo [id"  + id + ", summary=" + summary + ", description=" + description + "]";
	}
	
	public Todo copy() {
		Todo todo = new Todo(id, summary);
		todo.setDone(isDone());
		todo.setDueDate(getDueDate());
		todo.setDescription(getDescription());
		
		return todo;
	}

}

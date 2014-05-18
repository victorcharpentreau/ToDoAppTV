package fr.epsi.todoapptv.pojos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Todo {
	private boolean done;
	private String todoStr;
	private String createdDate, realizedDate;
	
	public Todo(String todoStr){
		this.todoStr = todoStr;
		this.done = false;
		this.setCreatedDate();
		this.realizedDate = null;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public String getTodoStr() {
		return todoStr;
	}

	public void setTodoStr(String todoStr) {
		this.todoStr = todoStr;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date today = Calendar.getInstance().getTime();
		this.createdDate = df.format(today);
	}

	public String getRealizedDate() {
		return realizedDate;
	}

	public void setRealizedDate(String realizedDate) {
		this.realizedDate = realizedDate;
	}
	
}

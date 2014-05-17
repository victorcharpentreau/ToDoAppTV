package fr.epsi.todoapptv.pojos;

public class Todo {
	private boolean done;
	private String todoStr;
	private String createdDate, realizedDate;
	
	public Todo(String todoStr){
		this.todoStr = todoStr;
		this.done = false;
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

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getRealizedDate() {
		return realizedDate;
	}

	public void setRealizedDate(String realizedDate) {
		this.realizedDate = realizedDate;
	}
	
}

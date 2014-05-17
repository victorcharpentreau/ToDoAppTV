package fr.epsi.todoapptv.pojos;

public class Todo {
	private boolean done;
	private String todoStr;
	
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
	
}

package fr.epsi.todoapptv.pojos;

import java.util.ArrayList;

public class TodoList extends ArrayList<Todo>{
	private static final long serialVersionUID = 1L;
	private String name;
	
	public TodoList(){
		this.name = "TodoList";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addTodo(Todo todo){
		this.add(todo);
	}
	
	public void removeTodo(Todo todo){
		this.remove(todo);
	}
}

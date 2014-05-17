package fr.epsi.todoapptv.pojos;

import java.util.ArrayList;

public class TagList extends ArrayList<Tag>{
	private static final long serialVersionUID = 1L;
	
	public TagList(){
		
	}
	
	public void addTag(Tag tag){
		this.add(tag);
	}
	
	public void removeTag(Tag tag){
		this.remove(tag);
	}
}

package fr.epsi.todoapptv.adapters;

import java.util.List;

import fr.epsi.todoapptv.pojos.Todo;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class TodoListAdapter extends BaseAdapter{
	private List<Todo> data;
	
	public TodoListAdapter(List<Todo> todoList){
		this.data = todoList;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		return null;
	}

}

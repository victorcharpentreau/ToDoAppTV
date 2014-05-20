package fr.epsi.todoapptv.adapters;

import java.util.ArrayList;

import fr.epsi.todoapptv.R;
import fr.epsi.todoapptv.pojos.Todo;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TodoListAdapter extends BaseAdapter{
	private ArrayList<Todo> data;
	private Context context;
	
	public TodoListAdapter(ArrayList<Todo> todoList, Context context){
		this.data = todoList;
		this.context = context;
	}
	
	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public Object getItem(int pos) {
		return data.get(pos);
	}

	@Override
	public long getItemId(int pos) {
		return pos;
	}

	@Override
	public View getView(int position, View item, ViewGroup parent) {
        LayoutInflater layoutInf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        item = layoutInf.inflate(R.layout.todo_item, parent, false);
        TextView titleView = (TextView) item.findViewById(R.id.todoTitle);
        Todo todo = data.get(position);
        titleView.setText(todo.getTodoStr());
        return item;
	}

}

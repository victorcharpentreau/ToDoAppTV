package fr.epsi.todoapptv;

import fr.epsi.todoapptv.adapters.TodoListAdapter;
import fr.epsi.todoapptv.pojos.Todo;
import fr.epsi.todoapptv.pojos.TodoList;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        	
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        	// On définit la view du fragment (fragment_main)
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            // Instanciation des variables liées aux ressources du fragment (edit, button ...)
            final EditText editTodo = (EditText) rootView.findViewById(R.id.editTodo);
            ImageButton buttonTodo = (ImageButton) rootView.findViewById(R.id.buttonTodo);
            final ListView listViewTodo = (ListView) rootView.findViewById(R.id.listViewTodo);
            
            // Implémentation de la variable TodoList
            final TodoList todoList = new TodoList();
            
            // Ajout du Listener sur le bouton d'ajout du Todo
            buttonTodo.setOnClickListener(new ImageButton.OnClickListener() {
                @Override
                public void onClick(View v) {
                	// Traitement réalisé lors du click sur le bouton
                    String todoStr = editTodo.getText().toString();
                    
                    // Test de la valeur du input
                    if(!todoStr.equals("")){
                    	System.out.println("Debug : "+todoStr);
                    	Todo todo = new Todo(todoStr);
                    	todoList.add(todo);
                    	// Utilisation de l'adapter pour la TodoList
                    	TodoListAdapter adapter = new TodoListAdapter(todoList, getActivity());
                    	listViewTodo.setAdapter(adapter);
                    	editTodo.setText("");
                    }else{
                    	Log.d("info", "editTodo empty");
                    	Toast.makeText(getActivity(), "Veuillez indiquer le nom de votre Todo dans le champ prévu à cet effet", Toast.LENGTH_LONG).show();
                    }
                }
            });
            return rootView;
        }
    }

}

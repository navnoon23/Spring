package interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bean.Task;

public class TaskServiceImpl implements TaskService {
	
	private HashMap<String, Task> tasks = new HashMap<String, Task>();
	private int maxId = 1;

	@Override
	public void addTask(String description) {
		Task t = new Task(maxId++, description);
		tasks.put(description, t);
	}

	@Override
	public Task getTask(String description) {
		return tasks.get(description);
	}

	@Override
	public void deleteTask(int id) {
		for( Task t : tasks.values() ) {
			if( t.getId() == id ) {
				tasks.remove(t.getDescription());
				break;
			}
		}
	}

	@Override
	public List<Task> getTasks() {
		return new ArrayList<Task>( tasks.values() );
	}

}

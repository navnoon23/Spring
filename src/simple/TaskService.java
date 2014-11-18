package simple;

import java.util.List;
import java.util.ArrayList;

import bean.Task;

/**
 * Service class for the task bean
 * @author naveen
 *
 */

public class TaskService {
	
	private List<Task> list = new ArrayList<Task>();
	
	private int maxId = 1;

	/**
	 * Add a new task with the given description
	 * @param description
	 */
	public void addTask(String description) {
		list.add(new Task(maxId++, description));
	}
	
	/**
	 * Returns the list of all the tasks
	 * @return list of Task objects
	 */
	public List<Task> getTasks() {
		return list;
	}
	
	/**
	 * Delete the task associated with the given id
	 * @param id
	 */
	public void deleteTask(int id) {
		list.remove(getTask(id));
	}
	
	/**
	 * Returns the task associated with the given id
	 * @param id
	 * @return Task
	 */
	public Task getTask(int id) {
		Task val = null;
		for( Task t : list ) {
			if( id == t.getId() ) {
				val = t;
			}
		}
		return val;
	}

	/**
	 * Returns the task associated with the given description
	 * @param desc
	 * @return
	 */
	public Task getTask(String desc) {
		Task val = null;
		for( Task t : list ) {
			if( t.getDescription().equals(desc) ) {
				val = t;
			}
		}
		return val;
	}

}

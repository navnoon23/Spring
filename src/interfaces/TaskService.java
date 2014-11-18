package interfaces;

import java.util.List;

import bean.Task;

public interface TaskService {
	/**
	 * Adds a task with the given description
	 * @param description
	 */
	void addTask(String description);
	/**
	 * Returns the task associated with the given description
	 * @param description
	 * @return the Task
	 */
	Task getTask(String description);
	/**
	 * Deletes the task associated with the given id
	 * @param id
	 */
	void deleteTask(int id);
	/**
	 * Returns the list of tasks
	 * @return list of tasks
	 */
	List<Task> getTasks();

}

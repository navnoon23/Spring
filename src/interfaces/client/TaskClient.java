package interfaces.client;

import interfaces.TaskFactory;
import interfaces.TaskService;

import java.util.List;
import java.util.Date;

import bean.Task;
/**
 * Client for the Task Service
 * @author naveen
 *
 */
public class TaskClient {
	
	public static void main(String[] args) {
		TaskService service = TaskFactory.getTaskService();
		// create tasks
		service.addTask("Finish code");
		service.addTask("Finish presentation");
		service.addTask("Show demo");
		service.addTask("Go home");
		
		//print out all tasks
		log("All tasks");
		logTasks(service.getTasks());
		
		// remove "Go home" task
		Task t = service.getTask("Go home");
		service.deleteTask(t.getId());
		log("Remaining tasks");
		logTasks(service.getTasks());
		
	}
	
	public static void logTasks(List<Task> list) {
		for(Task t : list ) {
			log(t.toString());
		}
	}

	public static void log(String msg) {
		System.out.println(new Date()+" "+msg);
	}
	
}

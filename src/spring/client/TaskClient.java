package spring.client;

import java.util.Date;
import java.util.List;

import interfaces.TaskService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Task;

public class TaskClient {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		TaskService service = (TaskService) context.getBean("taskService");

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

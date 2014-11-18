package interfaces;

public final class TaskFactory {

	public static TaskService getTaskService() {
		return new TaskServiceImpl();
	}
}

package boards.taskBoard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

import model.exceptions.NameAlreadyInUseException;
import model.exceptions.NoSuchTaskException;
import filtering.Filter;

public class ConcreteTaskManager implements TaskManager {

	private HashMap<String, Task> tasks = new HashMap<String, Task>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see boards.TaskManager#addTask(java.lang.String, java.lang.String)
	 */
	@Override
	public void addTask(String taskName, String description)
			throws NameAlreadyInUseException {
		validateName(taskName);
		Task task = new Task(taskName, description);
		tasks.put(task.toString(), task);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see boards.TaskManager#addTask(java.lang.String)
	 */
	@Override
	public void addTask(String taskName) throws NameAlreadyInUseException {
		this.addTask(taskName, "");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see boards.TaskManager#deleteTask(java.lang.String)
	 */
	@Override
	public void deleteTask(String taskName) throws NoSuchTaskException {
		validateExistance(taskName);
		tasks.remove(taskName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see boards.TaskManager#getTask(java.lang.String)
	 */
	@Override
	public Task getTask(String taskName) throws NoSuchTaskException {
		validateExistance(taskName);
		return tasks.get(taskName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see boards.TaskManager#getTasksNumber()
	 */
	@Override
	public int getTasksNumber() {
		return tasks.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see boards.TaskManager#moveTaskToState(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void moveTaskToState(String taskName, String targetState) throws NoSuchTaskException{
		this.getTask(taskName).moveTaskToState(targetState);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see boards.TaskManager#getTasks(filtering.Filter)
	 */
	@Override
	public ArrayList<Task> getTasks(Filter<Task> filter) {
		return filter.filter(this.getAllTasks());
	}

	public void addDevelopersToTask(String taskName, String... developers) throws NoSuchTaskException {
		for (String developer : developers) {
			this.getTask(taskName).addDeveloper(developer);
		}

	}

	private ArrayList<Task> getAllTasks() {
		ArrayList<Task> list = new ArrayList<Task>();
		list.addAll(this.tasks.values());
		return list;
	}

	private boolean taskExists(String taskName) {
		return tasks.containsKey(taskName);
	}
	
	private void validateExistance(String taskName) throws NoSuchTaskException {
		if (!taskExists(taskName)) {
			throw new NoSuchTaskException(taskName);
		}
	}
	
	private void validateName(String taskName) throws NameAlreadyInUseException {
		if (taskExists(taskName)) {
			throw new NameAlreadyInUseException(taskName);
		}
	}


}

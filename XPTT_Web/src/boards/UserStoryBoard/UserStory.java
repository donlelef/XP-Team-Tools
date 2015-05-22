package boards.UserStoryBoard;

import model.exceptions.InvalidPriorityException;
import model.exceptions.NameAlreadyInUseException;
import boards.taskBoard.Task;
import boards.taskBoard.TaskManager;

/**
 * The UserStory class represents a simple development user story
 * 
 * @author simone, lele, incre, usk
 *
 */
public class UserStory implements Comparable<UserStory> {

	public final static int MINPRIORITY = 0;
	public final static int MAXPRIORITY = 10;

	private String title;
	private String description;
	private String state;
	private int priority;
	private TaskManager taskManager;

	/**
	 * Creates a new instance of this class
	 * 
	 * @param title
	 *            : a string to identify the story
	 * @param taskManager
	 *            : an implementation of TaskManager interface, so that we can
	 *            add, remove and edit task from this story
	 */
	public UserStory(String title, TaskManager taskManager) {
		this.state = "TODO";
		this.description = "";
		this.title = title;
		this.priority = MINPRIORITY;
		this.taskManager = taskManager;
	}

	/**
	 * Creates a new instance of this class
	 * 
	 * @param title
	 *            : a string to identify the story
	 * @param description
	 *            : a short string description to make story's details more
	 *            clear
	 * @param taskManager
	 *            : an implementation of TaskManager interface, so that we can
	 *            add, remove and edit task from this story
	 */
	public UserStory(String title, String description, TaskManager taskManager) {
		this.state = "TODO";
		this.description = description;
		this.title = title;
		this.priority = MINPRIORITY;
		this.taskManager = taskManager;
	}

	/**
	 * Returns a description for this story
	 * 
	 * @return: a short string description representing this story's details
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Returns the state of this story, which means a representation of the level
	 * of accomplishment of this story
	 * 
	 * @return: a string representing this story's state
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * Returns the priority of this story, represented as a string value
	 * 
	 * @return: a string representing this story's priority
	 */
	public int getPriority() {
		return this.priority;
	}

	/**
	 * Sets this story's description, in order to make story's details more
	 * clear
	 * 
	 * @param description
	 *            : a short string description to make story's details more
	 *            clear
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Sets this story's state, i.e. its level of accomplishment
	 * 
	 * @param state
	 *            : a string representation of the updated state of this story
	 */
	public void moveToState(String state) {
		this.state = state;
	}

	/**
	 * Sets this story's priority
	 * 
	 * @param priority
	 *            : a string representing the priority level
	 * @throws InvalidPriorityException
	 *             : if the new priority is out of range
	 */
	public void setPriority(int priority) throws InvalidPriorityException {
		if (!isValidUserStoryPriority(priority)) {
			throw new InvalidPriorityException(priority);
		}
		this.priority = priority;
	}

	@Override
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.title;
	}

	/**
	 * Returns the instance of {@link TaskManager} interface that is currently
	 * used to handle all the {@link Task} objects related to this story
	 * 
	 * @return: the {@link TaskManager} related to this story
	 * @see TaskManager
	 */
	public TaskManager getTasksManager() {
		return this.taskManager;
	}

	/**
	 * Returns the number of {@link Task} related to this story. It is perfectly
	 * equivalent to getting the {@link TaskManager} instance through
	 * {@link #getTasksManager()} and then call
	 * {@link TaskManager#getTasksNumber()}
	 * 
	 * @return: an integer representing the number of task related to this story
	 */
	public int getTasksNumber() {
		return this.taskManager.getTasksNumber();
	}

	/**
	 * Adds a task to this story
	 * 
	 * @param taskName
	 *            : the name of the task
	 * @param description
	 *            : a description for that task
	 * @throws NameAlreadyInUseException
	 *             : if taskName matches with an existing task
	 */
	public void addTask(String taskName, String description)
			throws NameAlreadyInUseException {
		this.taskManager.addTask(taskName, description);
	}

	@Override
	public int compareTo(UserStory otheruserstory) {
		return ((Integer) otheruserstory.getPriority()).compareTo(this
				.getPriority());
	}

	private boolean isValidUserStoryPriority(int priority) {
		if ((priority >= boards.UserStoryBoard.UserStory.MINPRIORITY)
				&& (priority <= boards.UserStoryBoard.UserStory.MAXPRIORITY)) {
			return true;
		}
		return false;
	}
}

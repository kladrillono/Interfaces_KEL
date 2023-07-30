
public class Task implements Priority, Comparable<Task> {

	public enum Status {NOT_STARTED, IN_PROCESS, COMPLETE;}


	private String name;
	private int priority;
	
	public Task.Status status;

	
	public Task() {
		
		this.name = "";
		this.priority = 0;
		
	}// end empty-argument constructor

	public Task(String name, int priority) {
		
		this.name = name;
		this.priority = priority;
		
	}// end preferred constructor

	public String getName() {
		
		return name;
		
	}// end getter for getName

	public void setName(String name) {
		
		this.name = name;
		
	}// end setter for setName
	
	public Status getStatus() {
		
		return status; 
		
	}// end getter for getStatus

	public void setStatus(Status status) {
		
		this.status = status;
			
	}// end setter for setStatus
	
	public int getPriority() {
		
		return priority;
		
	}//end getter for priority

	public void setPriority(int priority) {
		
		this.priority = priority;
		
	}//end setter for priority

	@Override
	public String toString() {
		
		return "Task [Name=" + name + ", Priority=" + priority + ", Status=" + getStatus() + "]";
		
	}//end toString

	@Override
	public int compareTo(Task o) {
		
		int result = 0;
		if (this.priority == o.getPriority()) {
			
			result = 0;
		}
		else if (this.priority > o.getPriority()) {
			
			result = 1;
		}
		else if (this.priority < o.getPriority()) {
			
			result = -1;
			
		}
		
		return result;
		
	}//end compareTo
	
}// end class

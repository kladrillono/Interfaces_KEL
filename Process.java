
public class Process implements Priority, Comparable<Process>{

	private String processID;
	private int priority;
	
	public Process() {
		
		this.processID = "";
		this.priority = 0;
		
	}// end empty-argument constructor
	
	public Process(String processID, int priority) {
		
		this.processID = processID;
		this.priority = priority;
		
	}// end preferred constructor

	public String getProcessID() {
		
		return processID;
		
	}// end getter for ProcessID

	public void setProcessID(String processID) {
		
		this.processID = processID;
		
	}// end setter for ProcessID

	public int getPriority() {
		
		return priority;
		
	}// end getter for Priority

	public void setPriority(int priority) {
		
		this.priority = priority;
		
	}// end setter for Priority

	@Override
	public String toString() {
		
		return "Process [Process ID=" + processID + ", Priority=" + priority + "]";
		
	} // end toString

	@Override
	public int compareTo(Process o) {
		
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
	}// end compareTo
	
	
	
}// end class

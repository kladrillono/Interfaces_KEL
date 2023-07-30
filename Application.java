public class Application {

	public static void main(String[] args) {
		
		Task chore = new Task("Walk the dog", 10); // test code for tasks
		Task chore2 = new Task("Wash dishes", 5);
		
		System.out.println(chore.getName());
		System.out.println(chore.getPriority());
		System.out.println(chore.compareTo(chore2)); // test code for compareTo for Task
		
		chore.setStatus(Task.Status.COMPLETE); // test code for set/get Status
		chore2.setStatus(Task.Status.IN_PROCESS);	
		
		System.out.println(chore.getStatus());
		System.out.println(chore2.getStatus());
		
		System.out.println(chore.toString()); // test code for toString
		System.out.println(chore2.toString());
		
		
		Process toDo = new Process("IEI293", 1); // test code for processes
		Process toDo2 = new Process("WER324", 1);
		
		toDo.setPriority(5); // test code for setPriority
		
		System.out.println(toDo.getPriority()); // test code for getPriority
		
		System.out.println(toDo.compareTo(toDo2));// test code for compareTo for Process
	
		System.out.println(toDo2.toString()); // test code for toString for Process
		
	}// end main

}// end class

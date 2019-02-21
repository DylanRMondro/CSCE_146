//Dylan Mondro
public class ProcessScheduler{
	private LinkedListQueue <Process> Processes;
	private Process currentProcess;
	
	public ProcessScheduler() {
	Processes = new LinkedListQueue <Process> ();
	currentProcess = null;
	}
	
	public Process getCurrentProcess() {
		return currentProcess;
	}
	
	public void addProcess(Process aData) {
		if(aData != null) {
			Processes.enqueue(aData);
		}
		else {
			System.out.println("Nothing found");
		}
	}
	
	public void runNextProcess() {
		Processes.dequeue();
	}
	
	public void cancelCurrentProcess() {
		Processes.peek();
		Processes.dequeue();
		}
	
	public void printProcessQueue() {
		Processes.Print();
	}
}

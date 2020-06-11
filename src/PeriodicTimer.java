import javax.ejb.Schedule;
import javax.ejb.Schedules;

public class PeriodicTimer {
	
	
	
	@Schedules({
		
		@Schedule (dayOfMonth = "10"),
		@Schedule (dayOfWeek = "Mon,Tue,Wed,Thu,Fri", hour = "6")
		
	})
	
	public static void executeTask() {
		
		System.out.println("Task performed");
	}

	public static void main(String[] args) {
		

		executeTask();		
		
	}

}

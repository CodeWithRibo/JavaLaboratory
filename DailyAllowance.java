package PerformanceTask;
import java.text.DecimalFormat;
//compute Allowance
interface computeDailyAllowance { //interface
	public void totalAllowance(double dailyAllowance, int days, int sundays, int totalAllowance); //abstract classes
}

class calculation implements computeDailyAllowance {
	
	@Override
	public void totalAllowance(double dailyAllowance, int days, int sundays, int totalAllowance) {

		int total = days - sundays; // 76 days
		double totalDailyAllowance = dailyAllowance * total; // 76 * 150 = 11400
		System.out.println("================================================================");
		System.out.println("COMPUTING DAILY ALLOWANCE UNTIL THE LAST DAY OF APRIL THIS YEAR");
		System.out.println("================================================================\n");
		System.out.println("The Daily Allowance is: " + "₱"+dailyAllowance);
		System.out.println("The number of days From February 1 to April 30 is: " + days + " days");
		System.out.println("The number of Sundays from February 1 to April 30 is: " + sundays + " sundays");
		System.out.println("The number of days from February 1 to April 30 excluding Sundays is: " + total + " days" );
		System.out.println("The total allowance for the last day of April this year is: " + "₱" + totalDailyAllowance + "\n");
	}		
}
//Track Allowance
interface trackAllowance {
	public void totalSemester(double dailyAllowance, double increaseAllowance, double days);
}

class track implements trackAllowance {
	     static double increaseTotalAllowance = 0; //GLOBAL VARIABLE
         static double initialTotalAllowance = 0; 
	@Override
	public void totalSemester(double dailyAllowance, double increaseAllowance, double days) {
		System.out.println("================================================================");
		System.out.println("TRACKING ALLOWANCE FOR THE NEXT SIX SEMESTER");
		System.out.println("================================================================\n");
        
		System.out.println("The Daily allowance is: " + "₱" +dailyAllowance); 
		
		String[] sem = {"2nd Year First Semester",
						"2nd Year Second Semester", 
						"3rd Year First Semester", 
						"3rd Year Second Semester",
						"4th Year First Semester", 
						"4th Year Second Semester"};
		
		System.out.println("\n'INCREASE ALLOWANCE EVERY TWO SEMESTER'\n");
		
            
                             DecimalFormat df = new DecimalFormat("#0.00"); 
		for (int i = 0; i < sem.length; i++) {
			if((i+1) % 2 == 0) {
				 double allowance = dailyAllowance + (dailyAllowance * increaseAllowance); // increase 3% of the daily allowance and included the two (2) per semester allowance
				 String formattedAllowance = df.format(allowance);
				 System.out.println(sem[i]+". "+"The increase allowance is	: " + "₱" + formattedAllowance);
				 dailyAllowance = allowance; // update the daily allowance
				                  // 2nd Year Second Semester
                                 double total = dailyAllowance * days;
                                 String formattedTotal = df.format(total);
                                 System.out.println("The Allowance with Increase for this Semester		: " + "₱"+formattedTotal +"\n");
                                 increaseTotalAllowance += total; // update the total allowance
                            
			} else {
								// 2nd Year First Semester 
                                 String defaultDailyAllowance = df.format(dailyAllowance);
                               System.out.println(sem[i]+". "+"The allowance is		: " + "₱" + defaultDailyAllowance);
                               // Initial Allowance for 2nd Year First Semester
                               double totalDaysAllowance = dailyAllowance * days;
                               String formattedDaysAllowance = df.format(totalDaysAllowance);
                                 System.out.println("The initial Allowance for this Semester			: "+ "₱"+formattedDaysAllowance);
                                 initialTotalAllowance += totalDaysAllowance;
                                
			}
		}
                double totalAllowanceForAllSem = increaseTotalAllowance + initialTotalAllowance;
                                                   String dfTotalAllowance = df.format(totalAllowanceForAllSem);
                System.out.println("THE TOTAL ALLOWANCE FOR ALL SEMESTER : " + "₱"+ (dfTotalAllowance));
		System.out.println("\n================================================================");
		System.out.println("                    END OF TRACKING ALLOWANCE");
		System.out.println("================================================================\n");
} 

}

public class DailyAllowance {

	public static void main(String[] args) {
		
         //compute daily allowance
		 calculation obj = new calculation();
		 obj.totalAllowance(150, 89, 13, 11400);
		 
		 //track allowance 
		 track obj1 = new track();
		 obj1.totalSemester(150,0.03,108);
	}

}
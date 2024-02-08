/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int firstSundays = 0;
	static int debugDaysCounter = 0; 
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (year<=1999) {
	 		//// Write the body of the while 		
	 		advance();
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		/*if (debugDaysCounter == 10) { 
	 			break;
	 		}*/
        }
		System.out.println("During the 20th century, "+ firstSundays + " Sundays fell on the first day of the month");
	 	//// Write the necessary ending code here
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		
			if(dayOfMonth == 1 && dayOfWeek == 1)
			firstSundays++;

			for(int i=dayOfMonth; i<=nDaysInMonth(month, year); i++){
				if(dayOfWeek == 1)
				System.out.println(dayOfMonth+"/"+month+"/"+year+ " Sunday");
				else
				System.out.println(dayOfMonth+"/"+month+"/"+year);
				if(dayOfWeek<7)
				dayOfWeek++;
				else
				dayOfWeek = 1;
				dayOfMonth++;
				debugDaysCounter++;
			}

			dayOfMonth = 1;
			if(month<12)
				month++;
			else{
				month = 1;
				year++;
			}

	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			return true;
		else
			return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		int days = 0;
		switch(month){
			case 1:
				days = 31;
				break;
			case 2:{
				if(isLeapYear(year))
				days = 29;
				else
				days = 28;
				break;
			}
			case 3:
				days = 31;
				break;
			case 4:
				days = 30;
				break;
			case 5:
				days = 31;
				break;
			case 6:
				days = 30;
				break;
			case 7:
				days = 31;
				break;
			case 8:
				days = 31;
				break;
			case 9:
				days = 30;
				break;
			case 10:
				days = 31;
				break;
			case 11:
				days = 30;
				break;
			case 12:
				days = 31;
				break;
			default:
				break;

		}
		return days;
	}
}
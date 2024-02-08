/** 
 * Prints the calendars of a chosen year.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int debugDaysCounter = 0; 
	
	/** 
	 * Prints the calendars of a chosen year.
     * Also notes which dates are sundays.
	 */
	public static void main(String args[]) {
		int chosenYear = Integer.parseInt(args[0]);
	 	while (year<=chosenYear) {	

	 		advance(chosenYear);
        }
	 	
	 }
	

	 private static void advance(int chosenYear) {

			for(int i=dayOfMonth; i<=nDaysInMonth(month, year); i++){
                if(year == chosenYear){
                    if(dayOfWeek == 1)
                    System.out.println(dayOfMonth+"/"+month+"/"+year+ " Sunday");
                    else
                    System.out.println(dayOfMonth+"/"+month+"/"+year);
            }
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
		 
	private static boolean isLeapYear(int year) {
	    if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			return true;
		else
			return false;
	}
	 
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
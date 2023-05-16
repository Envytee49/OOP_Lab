import java.util.Scanner;
public class DayInAMonth {
	static String[] fullMonths = { 
		    "January", 
		    "February", 
		    "March", 
		    "April", 
		    "May", 
		    "June", 
		    "July", 
		    "August", 
		    "September", 
		    "October", 
		    "November", 
		    "December"
		};
	static String[] shortMonths = { 
		    "Jan", 
		    "Feb", 
		    "Mar", 
		    "Apr", 
		    "May", 
		    "June", 
		    "July", 
		    "Aug", 
		    "Sep", 
		    "Oct", 
		    "Nov", 
		    "Dec"
		};
	static String[] numMonths = {
		    "1", 
		    "2", 
		    "3", 
		    "4", 
		    "5", 
		    "6", 
		    "7", 
		    "8", 
		    "9", 
		    "10", 
		    "11", 
		    "12"
		};
	static Scanner scan = new Scanner(System.in);
	// isFound is used in the checkMonth method
	static boolean isFound = false;
	public static void main(String[] args) {
		String month = getMonth();
		int year = getYear();
		displayDay(month, year);
	}
	static String getMonth() {
		String month;
		// check month
		do {
		System.out.println("Enter month ( January, Jan, and 1 ):");
		month = scan.next();
		if(!checkMonth(month)) {
			System.out.println("Invalid month");
		}else 
			break;
		}while(!checkMonth(month));
		return month;
	}
	static int getYear() {
		scan.nextLine();
		boolean isValidYear = false;
		int year = 0;
		while (!isValidYear) {
            System.out.print("Please enter a year: ");
            String input = scan.nextLine();
            try {
                year = Integer.parseInt(input);
                if (year > 0) {
                    isValidYear = true;
                } else {
                    System.out.println("Invalid input: Please enter a year greater than zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please enter a year.");
            }
        }
		return year;
	}
	// This method check if the month is in the string if not then isFound remain false
	static void monthTypeCheck(String[] monthTypes, String month) {
		for (String Month : monthTypes) {
            if (Month.equals(month)) {
                isFound = true;
                break;
            }
        }
	}
	static boolean checkMonth(String month) {
		// if input string > 3 then check fullMonths
		if(month.length() > 3) {
			monthTypeCheck(fullMonths, month);
	     // if input string == 3 then check shortMonths
		}else if(month.length() == 3) {
			monthTypeCheck(shortMonths, month);
	     // if input string < 3 then check numMonths
		}else {
			monthTypeCheck(numMonths, month);
		}
		return isFound;
	}
	// This method get the index of the element for checking days
	static int findIndex(String[] array, String element) {
	    for (int i = 0; i < array.length; i++) {
	        if (array[i].equals(element)) {
	            return i;
	        }
	    }
	    return -1; // element not found in array
	}
	// Get the index of the element then based on the index we can calculate the day
	// For example the index of January is 0 and March is 2, up till July which are all even -> 31 days
	// The same go for the rest.
	static void showResult(String month, int year, int index) {
		if((index % 2 == 0 && index <=6)|| (index % 2 != 0 && index > 6)) 
			System.out.println(month +", "+ year +" has 31 days");
		else 
			System.out.println(month +", "+ year +" has 30 days");
	}
	static void displayDay(String month, int year) {
		if(month.equals("Febuary") || month.equals("Feb") || month.equals("2")) {
			if(year % 4 == 0) System.out.println(month +", "+ year +" has 29 days");
			else System.out.println(month +", "+ year +" has 28 days");
		}
		else {
			int index;
			if(month.length() > 3) {
				showResult(month, year, findIndex(fullMonths,month));
			}else if(month.length() == 3) {
				showResult(month, year, findIndex(shortMonths,month));
			}else {
				showResult(month, year, findIndex(numMonths,month));
			}
		}
	}
}

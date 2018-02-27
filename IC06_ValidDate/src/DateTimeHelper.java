/*
    Nguyen, Nguyen
    CS A170
    02/26/2018

    IC06_ValidDate
*/
public class DateTimeHelper {
	/**
	 * Check if the date is valid or not. Return a {@code boolean}. "True" means the
	 * date is VALID. "False" means the date is INVALID.
	 */

	public boolean isValidDate(int month, int day, int year) {
		// Step 1: Check the day and the month first.
		// Domains: 
		// 0 < month < 12
		// 1 < day < 32
		// 0 < year < infinity
		// So we don't have to waste the CPU Usage for other calculations
		if (day < 1 || day > 31 || month < 1 || month > 12 || year < 0) {
			return false;
		}

		// Step 2: Check day & month
		switch (month) {
		case 2: // February
			// Not a leap year but February has more than 28 days => invalid
			if (!isLeapYear(year) && day > 28)
				return false;
			else if (day > 29) // More than 29 days => invalid
				return false;
			break;
		default: // Other months
			if (day > daysInMonth(month))
				return false;
		}

		// It's a valid date. Return true.
		return true;
	}

	/**
	 * Return the {@code boolean} value. 'True' means it is a leap year. 'False'
	 * means it is NOT a leap year.
	 */
	public boolean isLeapYear(int year) {
		return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
	}

	/**
	 * Return the number of days in the month as a {@code integer}.
	 */
	public int daysInMonth(int month) {
		// Variables
		int[] _daysInMonth = { 31, -1, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// Return the number of days in the month.
		return _daysInMonth[month - 1];
	}
}
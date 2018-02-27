# CS170_IC06_ValidDate

Chapter 3, PP 4
Java Project Name:  IC06_ValidDate

Write a Java console application that reads a string from the keyboard and tests whether it contains a valid date.  Display the date and a message that indicates whether it is valid.  If it is not valid, also display a message explaining why it is NOT valid.

The input date will have the format mm/dd/yyyy.  
A valid month value mm must be from 1 to 12 (January is 1).  You can use:

String monthPart = inputDate.substring(0, 2);
int month = Integer.parseInt(monthPart);
to get the month value.

A valid day value dd must be from 1 to a value that is appropriate for the given month.  September, April, June, and November each have 30 days.  Assume February has 28 days.  All other months have 31 days.  
The year can be any 4 digit year.

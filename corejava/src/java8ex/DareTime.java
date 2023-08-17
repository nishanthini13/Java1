package java8ex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class DareTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate today=LocalDate.now();
System.out.println(" current date :"+today);
LocalDate firstDay_2023=LocalDate.of(2023,Month.JANUARY, 1);
System.out.println(" specific date :"+firstDay_2023);

LocalTime today1=LocalTime.now();
System.out.println(" current time :"+today1);
LocalDateTime today2=LocalDateTime.now();
System.out.println(" current date time :"+today2);
//calculate age
Scanner sc = new Scanner(System.in);
System.out.println("Please enter your birth date (yyyy-mm-dd format only) ");
String st = sc.nextLine();

LocalDate Dob;
Dob = LocalDate.parse(st);    

System.out.println("Age is :"+calcAge(Dob));
}

static int calcAge(LocalDate Dob)
{
LocalDate currentDate = LocalDate.now();
int age = Period.between(Dob,currentDate).getYears();
return age;
	}	

}










//LocalDate firstDay_2023=LocalDate.of(2023,Month.JANUARY, 1);
//System.out.println(" specific date :"+firstDay_2023);

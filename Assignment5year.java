package classAssigment;

//Q5: Write a program to convert days into years, 
// weeks and days.{Hint:Input-373 daysOutput1Year,1Week,1day} (Variations)
public class Assignment5year 
{
    public static void main(String[] args)
	{
		int a=373;
		int year=a/365;
		int r=a%365;
		System.out.println(year+" Year");
		 
		int month=r/30;
		int r1=r%30;
		System.out.println(month+" Month");
		
		int week=r1/7;
		int r2=r1%7;
		System.out.println(week+" Week");
		
		int days=r1%7;
		 System.out.println(days+" Day");
		
		

	}

}

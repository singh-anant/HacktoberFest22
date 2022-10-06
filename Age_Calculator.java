// Program Written by minhaj-313
// Calculate Your age from date of birth in Java
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class Age_Calculator
{
    public static void main(String[] args) throws Exception 
    {
        System.out.print("Please enter date of birth in YYYY-MM-DD: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar dob = Calendar.getInstance();
        dob.setTime(sdf.parse(input));
        System.out.println("Age is:" + getAge(dob));
    }
 
    public static int getAge(Calendar dob) throws Exception 
    {
        Calendar today = Calendar.getInstance();
 
        int curYear = today.get(Calendar.YEAR);
        int dobYear = dob.get(Calendar.YEAR);
 
        int age = curYear - dobYear;

        int curMonth = today.get(Calendar.MONTH);
        int dobMonth = dob.get(Calendar.MONTH);
        if (dobMonth > curMonth) 
        { 
            age--;
        } else if (dobMonth == curMonth) 
        {
            int curDay = today.get(Calendar.DAY_OF_MONTH);
            int dobDay = dob.get(Calendar.DAY_OF_MONTH);
            if (dobDay > curDay) 
            { 
                age--;
            }
        }
 
        return age;
    }
}
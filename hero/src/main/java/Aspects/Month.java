package Aspects;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


public class Month
{
   private  String month;
    public String getMonth()
    {
        return month;
    }

    public void setMonth(String month)
    {
        this.month = month;
    }

    public void prints()
    {
        System.out.println("Month is: " + month);
    }


}

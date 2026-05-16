package Variables_and_DataTypes;

public class Calculate_Simple_Interest 
{
    public static void main(String args[])
    {
        int principal, time;
        double rate, simple_interest;
        principal=10000;
        time=2;
        rate=5.5;
        simple_interest = (principal*time*rate)/100;
        System.out.println("The simple insterest is "+simple_interest);
    }
    
}

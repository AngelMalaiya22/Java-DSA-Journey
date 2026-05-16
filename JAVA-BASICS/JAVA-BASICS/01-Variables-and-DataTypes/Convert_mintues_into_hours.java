package Variables_and_DataTypes;

public class Convert_mintues_into_hours 
{
    public static void main(String args[])
    {
        int min, hour, remaining_min;
        min=135;    
        hour=min/60;
        remaining_min=min%60;   
        System.out.println(min+" minutes is equal to "+hour+" hour and "+remaining_min+" minutes");
    }
    
}

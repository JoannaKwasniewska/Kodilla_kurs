public class LeapYear {

    public static String IsLeapYear (int leapYear)
    {

        if (leapYear % 400 == 0)
        {
            return  "Rok " +  leapYear + " jest przestępny" ;
        }
        if (leapYear % 100 == 0)
        {
            return  "Rok " +  leapYear + " nie jest przestępny";
        }
        if (leapYear % 4 == 0)
        {
            return  "Rok " +  leapYear + " jest przestępny" ;
        }
        return  "Rok " +  leapYear + " nie jest przestępny";
    }
    public static void TryLeapYear(){
        int leapYear = 2024;

        System.out.println(LeapYear.IsLeapYear(leapYear) );
        System.out.println(LeapYear.IsLeapYear(2000) );
        System.out.println(LeapYear.IsLeapYear(1996) );
        System.out.println(LeapYear.IsLeapYear(2100) );
        System.out.println(LeapYear.IsLeapYear(1988) );
        System.out.println(LeapYear.IsLeapYear(1997) );
    }
}
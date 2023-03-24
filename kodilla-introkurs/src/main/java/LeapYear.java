public class LeapYear {
    public static void main(String[] args) {
        int leapYear = 2024;

        System.out.println(IsLeapYear(leapYear) );
        System.out.println(IsLeapYear(2000) );
        System.out.println(IsLeapYear(1996) );
        System.out.println(IsLeapYear(2100) );
        System.out.println(IsLeapYear(1988) );
        System.out.println(IsLeapYear(1997) );

    }
    private static String IsLeapYear (int leapYear)
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
}
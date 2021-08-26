public class Test {

    public final static int[] daysOfMonths = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) {
        System.out.println(daysOnYourAge(1997,3,27,2021,1,27));
    }

    public static int daysOnYourAge(int yearBirth,int birthMonth,int dayBirth
        , int currentYear, int currentMonth, int currentDay){

        int years = currentYear - yearBirth;
        int days = 0;
        int months = birthMonth;

        while (months%12 != currentMonth - 1 && birthMonth != currentMonth){
            days += daysOfMonths[months % 11];
            months++;
        }
        if (currentMonth < birthMonth){
            years--;
            days += daysOfMonths[currentMonth - 1];
        }
        else if (currentMonth > birthMonth){
             days += (daysOfMonths[birthMonth - 1] - dayBirth) + currentDay;
        }
        else {
            days += (currentDay-dayBirth);
        }
        return (years * 365) + days;
    }
}
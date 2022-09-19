public class LeapYear {
    public static void main(String[] args) {
        int year = 2100;

        System.out.println(leapYear(year));
    }

    private static boolean leapYear(int year) {
        if(year % 4 != 0){
            return false;
        } else if(year % 100 != 0){
            return true;
        } else if(year % 400 != 0){
            return false;
        } else {
            return true;
        }
    }
}

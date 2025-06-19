package Methods;

public class SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        
        boolean isSpring = checkSpring(month, day);
        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");
    }

    public static boolean checkSpring(int month, int day) {
        if (month < 3 || month > 6) return false;
        if (month == 3 && day < 20) return false;
        if (month == 6 && day > 20) return false;
        return true;
    }
}

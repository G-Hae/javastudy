public class ArithmeticOperators {
    public static void main(String[] args){
        int mathScore = 80;
        int engScore = 70;

        double average = (mathScore + engScore)/2.0;
        System.out.println("average: " + average);

        int originPrice = 25000;
        double discountedPrice = originPrice*(1-0.2);
        System.out.println("discount: "+discountedPrice);

        boolean isLoggedIn = true;
        boolean isAdmin =false;

        boolean accessGranted = isLoggedIn && isAdmin;
        boolean canViewDashboard = isLoggedIn || isAdmin;
        System.out.println("accessGranted: "+accessGranted);
        System.out.println("canViewDashboard: "+canViewDashboard);
    }
}

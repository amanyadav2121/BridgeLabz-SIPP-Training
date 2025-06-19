package Methods;

public class Collinear {
    public static void main(String[] args) {
        // Sample points A(2,4), B(4,6), C(6,8)
        System.out.println("Collinear (slope): " + 
                          isCollinearSlope(2,4,4,6,6,8));
        System.out.println("Collinear (area): " + 
                          isCollinearArea(2,4,4,6,6,8));
    }

    public static boolean isCollinearSlope(int x1, int y1, 
                                         int x2, int y2, 
                                         int x3, int y3) {
        double slopeAB = (y2 - y1) / (double)(x2 - x1);
        double slopeAC = (y3 - y1) / (double)(x3 - x1);
        return slopeAB == slopeAC;
    }

    public static boolean isCollinearArea(int x1, int y1, 
                                        int x2, int y2, 
                                        int x3, int y3) {
        double area = 0.5 * (x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2));
        return area == 0;
    }
}
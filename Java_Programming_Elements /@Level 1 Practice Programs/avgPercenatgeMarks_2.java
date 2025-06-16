// Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
// I/P => NONE
// O/P => Sam’s average mark in PCM is ___ 

class avgPercenatgeMarks_2{
    public static void main(String[] args) {
        int maths = 94;
        int chem=96;
        int phy=95;
        double avg= (maths+chem+phy)/3.0;
        System.out.println("Sam’s average mark in PCM is "+avg);
    }
}
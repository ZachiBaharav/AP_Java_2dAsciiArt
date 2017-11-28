

public class Main {

    
    public static void main(String[] args) {
        
        printCirc(20,10);
        printCirc(25,7);
        printCirc(50,25);
        printCirc(60,12);
        
        // Stripes
        printStripes(30,8);
        printStripes(30,15);
        
        
    }
    
    public static void printCirc(int N, int rad) {
        
        //int[][] a = new int[N][N];
        double rcCenter = (N-1)/2.0;
        
        for (int rr=0; rr<N; ++rr) {
            for (int cc=0; cc<N; ++cc) {
                double dist2 = (rr-rcCenter)*(rr-rcCenter) + (cc-rcCenter)*(cc-rcCenter);
                if (dist2<rad*rad)
                    System.out.print("#");
                else
                    System.out.print(".");
            }
            System.out.println();
        }   
    }
    
    public static void printStripes(int N, int d) {
        //int[][] a = new int[N][N];
        
        for (int rr=0; rr<N; ++rr) {
            for (int cc=0; cc<N; ++cc) {
                if ((rr+cc)%d == 0)
                    System.out.print("#");
                else
                    System.out.print(".");
            }
            System.out.println();
        }   
        
    }
    
}

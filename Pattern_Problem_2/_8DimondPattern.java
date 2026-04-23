package Pattern_Problem_2;

public class _8DimondPattern {
    public static void main(String[] args) {
        int n = 5;

        // Upper Part
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print ("  ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower Part
        for (int i=n-1; i>=0; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print ("  ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

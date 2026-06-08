import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n[][] = new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                n[i][j] = (int)(Math.random()*100);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
}

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100);
        }
        for(int a = 0; a < arr.length; a++){
            for(int b = 0; b < arr.length; b++){
                if(arr[b] < arr[a]){
                    int temp = arr[b];
                    arr[b] = arr[a];
                    arr[a] = temp;
                }
            }
        }
        for(int a = 0; a < arr.length; a++){
            System.out.print(arr[a] + " ");
        }

    }
}

import java.util.Scanner;

public class Vertical {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n<0){ return;}
        for(int i=0; i<n; i++)
            System.out.println("*");
    }
}

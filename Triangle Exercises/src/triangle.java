import java.util.Scanner;

public class triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n<0){ return;}
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

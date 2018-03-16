import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 2) {
            return;
        }
        factor(n);
    }
    static boolean prime(int n)
    {  int i;
        boolean flag=true;
        for(i=2;i<=n/2;i++)
            if(n%i==0)
            {flag=false;
                return flag;
            }
        return flag;
    }
    static void factor(int n)
    {  int i;
        i=2;
        while  (i<=n)
        {  if ((n%i==0)&&prime(i))
        {   System.out.println(i);
            n=n/i;
            continue;
        }
            i++;
        }
    }
}

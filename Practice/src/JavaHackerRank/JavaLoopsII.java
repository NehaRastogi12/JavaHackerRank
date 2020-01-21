package JavaHackerRank;
import java.util.*;
import java.lang.Math;
/****
 *Printing Fibonacci series
 * @author Neha
 *
 */
public class JavaLoopsII {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum =0;
            for(int p=1;p<=n;p++){
                for(int e=0;e<p;e++){
                    sum=sum+(int)(Math.pow(2,e))*b;
                }
                System.out.print(sum+a+" ");
                sum=0;
            }
            System.out.print("\n");
        }
        in.close();
    }
}

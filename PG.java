import java.util.*;

public class LCM

 {

	public static void main(String[] args) 	{

		Scanner pg=new Scanner(System.in);

		int num1=pg.nextInt();

		int num2=pg.nextInt();

		LCM p = new LCM();

		int x=p.callcm(num1,num2);

		System.out.println("LCM of "+ num1+" & "+ num2+" = "+x);

			}

	public int callcm(int a, int b)

	{

	    int cm=0;

	    int i=Math.max(a,b);

	    while(true)

	{

	    if(i%a==0&&i%b==0)

	   { cm=i;

	    break;

	   }

	   else

	    i++;

	    }

	    return cm;

	       }

}

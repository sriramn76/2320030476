package Random;
import java.util.*;

class lol{
	private int ecl=10;
	int run(int a,int b,String s) {
		if(s=="no") {
		System.out.println(a-b);
		return 1;
		}else if(s=="yes"){
		System.out.println(a-b+ecl);
		return 2;
		
		}
		return 0;
		}
	int run(int a) {
		System.out.println(a*a);
		return a*a;
	}
}

public class engine {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		System.out.println(a+1);
		lol sa=new lol();
		sa.run(2);
	}
}
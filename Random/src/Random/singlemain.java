package Random;

class Singleton{
	private int a=10;
	
	static int geta(){
		return a;
	}
}

public class singlemain {
	Singleton x=new Singleton();
	int q=x.geta()
;	System.out.println(q);
}

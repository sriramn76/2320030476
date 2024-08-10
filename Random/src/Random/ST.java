package Random;

class singleton1{
	private static singleton1 var=null;
	private int a;
	singleton1(){
		a=10;
	}
	int geta() {
		return a;
	}
	public static singleton1 getinstance(){
		if(var==null) {
			var=new singleton1();
			}
		return var;
	}
}

public class ST {
public static void main(String []args) {
	singleton1 s=singleton1.getinstance();
	System.out.println(s.geta());
}
}
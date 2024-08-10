package Random;

interface verage {
	final int var=10;
	void display();
}

class hope implements verage{
	public void display(){
		System.out.println(var);
	}
	public static void main(String[] args) {
	hope s=new hope();
	s.display();
	}
}
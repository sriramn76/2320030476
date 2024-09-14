package INLAB;


interface shape{
	public void draw();
}

class circle implements shape{
	@Override
	public void draw() {
		System.out.println("I am a circle");
	}
}

class square implements shape{
	@Override
	public void draw() {
		System.out.println("I am a square");
	}
}

 abstract class shapefactory{
	public abstract shape factorys();
}


class circlefactory extends shapefactory{
	@Override
	public shape factorys() {
		return new circle();
	}
}

class squarefactory extends shapefactory{
	@Override
	public shape factorys() {
		return new square();
	}
}

public class factory {
	public static void main(String[] args) {
		shapefactory C=new circlefactory();
		shape s=C.factorys();
		s.draw();

		 C=new squarefactory();
		shape q=C.factorys();
		q.draw();
	}
}

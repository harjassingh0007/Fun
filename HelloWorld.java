class Greeter{
	public void sayHello(String name){
		System.out.println("say Hello "+name);
	}
}
public class HelloWorld {
	public static void main(String[] args){ // access modifier
		Greeter myGreeter = new Greeter();
		myGreeter.sayHello(args[0]);
	}
}

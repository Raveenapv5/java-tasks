package inheritanceeg;

public class Main {
	public static void main(String args[]) {
		Animal a = new Animal();
		dog d = new dog();
		Cat c = new Cat();
		a.sleep();
		c.sleep();
		d.sleep();
		c.drinkmilk();
		d.barking();
	}
}

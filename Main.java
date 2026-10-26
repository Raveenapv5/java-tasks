package inheritance;

public class Main {
	public static void main(String[] args) {
		Potato p = new Potato();
		Carrot c = new Carrot();
		Vegetable veg = new Vegetable();
		p.wash();
		p.chop();
		p.preparingfries();
		c.wash();
		c.chop();
		c.preparinghalwa();
		veg.wash();
		veg.chop();
	}
}

package processorder;

public class Product extends Order{


	
	public Product(int id, int Quantity) {
		super(id, Quantity);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Order batch = new Order (1,10);

		batch.Apple(20);
		batch.orange(25);
		batch.Mango(50);

		}
}
	
	




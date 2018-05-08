package processorder;

public class Order {
int id;
int Quantity;

public Order(int id, int Quantity) {
	super();

	this.id = id;
	this.Quantity = Quantity;
	
}
 
public void Apple(int OrdereApples) 
{
		if(id == 1 && OrdereApples >= this.Quantity && Quantity > 0){
		OrdereApples = OrdereApples-this.Quantity;	
	System.out.println(" Product Id : " +id );
	System.out.println(" Product Name : Apple ");
	System.out.println(" Product Description : Freshly Imported American Apples");
	System.out.println(" No of Apples you Ordered : " + Quantity);
	System.out.println(" Price of Each Apple = $2.50 ");
	System.out.println(" Price for Total Ordered Apples = $" + 2.50 * Quantity);
	System.out.println(" No of Apples Left in Inventory : " + OrdereApples);
	}
		
    else if (id ==1 && OrdereApples > this.Quantity ){	
	System.err.println("Please Input Proper Quantity Value");
		}
		
	else if (id ==1 && OrdereApples < this.Quantity) {
	System.err.println("Sorry, Order Cannot be Processed.");
	System.out.println("Maximum Available Apples = " + OrdereApples);
	}
		}

public void orange(int OrderOranges ) {
	
	if(id == 2 && OrderOranges >= this.Quantity && Quantity > 0){
		OrderOranges = OrderOranges-this.Quantity;	
	System.out.println(" Product Id : " +id );
	System.out.println(" Product Name : Orange ");
	System.out.println(" Product Description : Best Grade Canada Oranges");
	System.out.println(" No of Oranges you Ordered : " + Quantity);
	System.out.println(" Price of Each Oranges = $4.50 ");
	System.out.println(" Price for Total Ordered Apples = $" + 4.50 * Quantity);
	System.out.println(" No of Oranges Left in Inventory : " + OrderOranges);
	}


	else if (id ==2 && OrderOranges > this.Quantity ){	
	System.err.println("Please Input Proper Quantity Value");
		}
		
	else if (id ==2 && OrderOranges < this.Quantity) {
	System.err.println("Sorry, Order Cannot be Processed.");
	System.out.println("Maximum Available Oranges = " + OrderOranges);
	}
}

public void Mango(int OrderMangoes){
	
	if(id == 3 && OrderMangoes >= this.Quantity && Quantity > 0){
		OrderMangoes = OrderMangoes-this.Quantity;	
	System.out.println(" Product Id : " +id );
	System.out.println(" Product Name : Mango ");
	System.out.println(" Product Description : Freshly Picked Indian Mangoes");
	System.out.println(" No of Mangoes you Ordered : " + Quantity);
	System.out.println(" Price of Each Apple = $3.75 ");
	System.out.println(" Price for Total Ordered Apples = $" + 3.75 * Quantity);
	System.out.println(" Number of Mangoes Left in Inventory : " + OrderMangoes);
	}

else if (id ==3 && OrderMangoes > this.Quantity){	
	System.err.println("Please Input Proper Quantity Value");
		}
	
	else if(id != 3 && id !=2 && id != 1) {
		System.err.println("Please Input Proper Product Id");
				System.out.println(" 1- Apple, 2- Orange, 3- Mango");
	}
		
	else if (id ==3 && OrderMangoes < this.Quantity) {
	System.err.println("Sorry, Order Cannot be Processed.");
	System.out.println("Maximum available Mangoes = " + OrderMangoes);
	}
	}
}


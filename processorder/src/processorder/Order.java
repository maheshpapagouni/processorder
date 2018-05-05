package processorder;

public class Order {
int id;
int fruit;

public Order(int id, int fruit) {
	super();

	this.id = id;
	this.fruit = fruit;
	
}
 
public void Apple(int OrdereApples ) 
{
		if(id == 1 && OrdereApples >= this.fruit && fruit > 0){
		OrdereApples = OrdereApples-this.fruit;	
	System.out.println(" Product Id : " +id );
	System.out.println(" Product Name : Apple ");
	System.out.println(" Product Description : Freshly Imported American Apples");
	System.out.println(" No of Apples you Ordered : " + fruit);
	System.out.println(" Price of Each Apple = $2.50 ");
	System.out.println(" Price for Total Ordered Apples = $" + 2.50 * fruit);
	System.out.println(" No of Apples Left in Inventory : " + OrdereApples);
	}
		
    else if (id ==1 && OrdereApples > this.fruit ){	
	System.err.println("Please Input Proper Quantity Value");
		}
		
	else if (id ==1 && OrdereApples < this.fruit) {
	System.err.println("Sorry, Order Cannot be Processed.");
	System.out.println("Maximum Available Apples = " + OrdereApples);
	}
		}

public void orange(int OrderOranges ) {
	
	if(id == 2 && OrderOranges >= this.fruit && fruit > 0){
		OrderOranges = OrderOranges-this.fruit;	
	System.out.println(" Product Id : " +id );
	System.out.println(" Product Name : Orange ");
	System.out.println(" Product Description : Best Grade Canada Oranges");
	System.out.println(" No of Oranges you Ordered : " + fruit);
	System.out.println(" Price of Each Oranges = $4.50 ");
	System.out.println(" Price for Total Ordered Apples = $" + 4.50 * fruit);
	System.out.println(" No of Oranges Left in Inventory : " + OrderOranges);
	}


	else if (id ==2 && OrderOranges > this.fruit ){	
	System.err.println("Please Input Proper Quantity Value");
		}
		
	else if (id ==2 && OrderOranges < this.fruit) {
	System.err.println("Sorry, Order Cannot be Processed.");
	System.out.println("Maximum Available Oranges = " + OrderOranges);
	}
}

public void Mango(int OrderMangoes){
	
	if(id == 3 && OrderMangoes >= this.fruit && fruit > 0){
		OrderMangoes = OrderMangoes-this.fruit;	
	System.out.println(" Product Id : " +id );
	System.out.println(" Product Name : Mango ");
	System.out.println(" Product Description : Freshly Picked Indian Mangoes");
	System.out.println(" No of Mangoes you Ordered : " + fruit);
	System.out.println(" Price of Each Apple = $3.75 ");
	System.out.println(" Price for Total Ordered Apples = $" + 3.75 * fruit);
	System.out.println(" Number of Mangoes Left in Inventory : " + OrderMangoes);
	}

else if (id ==3 && OrderMangoes > this.fruit){	
	System.err.println("Please Input Proper Quantity Value");
		}
	
	else if(id != 3 && id !=2 && id != 1) {
		System.err.println("Please Input Proper Product Id");
				System.out.println(" 1- Apple, 2- Orange, 3- Mango");
	}
		
	else if (id ==3 && OrderMangoes < this.fruit) {
	System.err.println("Sorry, Order Cannot be Processed.");
	System.out.println("Maximum available Mangoes = " + OrderMangoes);
	}
	}
}


package entities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IProductService productService=new ProductManager(new FakeBankService());
		productService.Sell(new Product(1,"laptop",1000), new Student(1,"hatice"));
		//IProductService productService=new ProductManager(new CentralBankServiceAdapter());
		//productService.Sell(new Product(1,"laptop",45000), new Customer(1,"hatice",true,false));
		
	}


}

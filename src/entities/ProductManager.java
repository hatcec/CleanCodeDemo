package entities;

public class ProductManager implements IProductService{

	private IBankService _bankService;
	public ProductManager(IBankService bankService) {//construcordan parametre olarak istedim servisi
		_bankService=bankService;
	}
	@Override
	public void Sell(Product product, ICustomer customer) {
		// TODO Auto-generated method stub
		
		float price=product.getPrice();
		price=customer.GetPrice(price);//hangi customer verildiyse ona göre hesap yapacak		
		//CentralBankService bankService=new CentralBankService();//bağımlılık var _bank service olmalı
	    price= _bankService.ConvertRate(new CurrencyRate(price,1));//bağımlılık sıfırlandı
	    System.out.printf("ürün adı:%s, ürün fiyat:%f",product.getName(),price);
		
		
	}

}

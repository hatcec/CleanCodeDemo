package entities;

public class CentralBankServiceAdapter implements IBankService {

	@Override
	public float ConvertRate(CurrencyRate currencyRate) {
		// TODO Auto-generated method stub
		CentralBankService centralBankService=new CentralBankService();
		return centralBankService.ConvertCurrency(currencyRate);
	}

}

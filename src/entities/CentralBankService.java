package entities;

public class CentralBankService {//merkez bankasının kodu
	public float ConvertCurrency(CurrencyRate currencyRate) {
		return currencyRate.getPrice() / (float) 36.95;
	}
}

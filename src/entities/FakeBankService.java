package entities;

public class FakeBankService implements IBankService {
	public float ConvertRate(CurrencyRate currencyRate) {
		return currencyRate.getPrice() / (float) 35.30;//dolara çevirdim
	}
}

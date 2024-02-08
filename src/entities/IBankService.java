package entities;

public interface IBankService {//dolara veya euroya çevirmek. buranın amacı bağımlılığı azaltmak
	float ConvertRate(CurrencyRate currencyRate);
}

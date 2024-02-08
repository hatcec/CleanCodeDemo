package entities;

import java.math.BigDecimal;

public interface ICustomer {
	int getId();
	void setId(int id);
	String getName();
	void setName(String name);
	float GetPrice(float price);
}

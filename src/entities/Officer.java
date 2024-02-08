package entities;


public class Officer implements ICustomer {
	private int id;
	private String name;
	
	public Officer() {
		super();
	}
	
	public Officer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public float GetPrice(float price) {
		// TODO Auto-generated method stub
		return price * (float) 0.80;
	}
	
	

}

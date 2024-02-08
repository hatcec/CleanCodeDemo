package entities;

public class Student implements ICustomer {
	private int id;
	private String name;
	
	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	@Override
	public float GetPrice(float price) {
		// TODO Auto-generated method stub
		return  price * (float) 0.90  ;
	}
	
	
	

}

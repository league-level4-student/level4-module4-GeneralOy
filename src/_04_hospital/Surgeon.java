package _04_hospital;

public class Surgeon extends Doctor {



	Surgeon() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Object performsSurgery() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void doMedicine() {
		// TODO Auto-generated method stub
		
	}

}

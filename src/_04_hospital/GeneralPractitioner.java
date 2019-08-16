package _04_hospital;

public class GeneralPractitioner extends Doctor {



	GeneralPractitioner() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected void doMedicine() {
		for (Patient patient  : assignedPatients) {
			patient.checkPulse();
		}
		
	}




}

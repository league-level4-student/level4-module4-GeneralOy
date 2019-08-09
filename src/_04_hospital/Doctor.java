package _04_hospital;

import java.util.List;

public abstract class Doctor {
	private int numPatients;
	private List<Patient> assignedPatients;
	
	Doctor() {
		
	}

	protected abstract Object performsSurgery();

	protected abstract Object makesHouseCalls();

	protected abstract void doMedicine();

	public List<Patient> getPatients() {
		return assignedPatients;
	}
	public int getNumPatients() {
		return assignedPatients.size();
	}
	public void assignPatient(Patient patient) {
		assignedPatients.add(patient);
	}

}

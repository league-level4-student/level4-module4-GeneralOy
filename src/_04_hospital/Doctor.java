package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Doctor {
	protected List<Patient> assignedPatients = new ArrayList<Patient>();
	
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
	public void assignPatient(Patient patient) throws Exception {
		if(assignedPatients.size() < 3) {
		assignedPatients.add(patient);
		patient.Assigned();
		}else if(assignedPatients.size() >= 3) {
			throw new DoctorFullException();
		}
	}

}

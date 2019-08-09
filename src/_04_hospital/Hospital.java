package _04_hospital;

import java.util.List;

public class Hospital {
	private List<Doctor> totalDoctors;
	private List<Patient> totalPatients;
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		totalDoctors.add(doctor);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return totalDoctors;
	}

	public void addPatient(Patient patient) {
		totalPatients.add(patient);
		
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return totalPatients;
	}
//////vvvvv slight issue? If a doctor has 3 patients they can't get more patients; this should? account for that
	public void assignPatientsToDoctors() {
		int i = 0;
		for (Patient patient : totalPatients) {
			
			totalDoctors.get(i).assignPatient(patient);
			if(i >= 2) {
				i = 0;
			}else {
				i++;
			}
		}
		// TODO Auto-generated method stub
		
	}


}

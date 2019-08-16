package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	private List<Doctor> totalDoctors = new ArrayList<Doctor>();
	private List<Patient> totalPatients = new ArrayList<Patient>();

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
	public void assignPatientsToDoctors() throws Exception {
		for (Doctor doctor : totalDoctors) {
			for (Patient patient : totalPatients) {
				if (doctor.getPatients().size() < 3) {
					if (!patient.getAssigned()) {
						try {
							doctor.assignPatient(patient);
						} catch (DoctorFullException dfe) {
							// TODO: handle exception
						}
					}
				}
			}
		}

		/*
		 * int i = 0; for (Patient patient : totalPatients) {
		 * 
		 * try { totalDoctors.get(i).assignPatient(patient); } catch
		 * (DoctorFullException e) { e.printStackTrace(); } if(i >= totalDoctors.size())
		 * { i = 0; }else { i++; } }
		 */
		// TODO Auto-generated method stub

	}

}

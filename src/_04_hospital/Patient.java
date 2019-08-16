package _04_hospital;

public class Patient {
	private Boolean assigned = false;
	private Boolean feelsCaredFor = false;
	public Object feelsCaredFor() {
		// TODO Auto-generated method stub
		return feelsCaredFor;
	}

	public void checkPulse() {
		this.feelsCaredFor = true;
		// TODO Auto-generated method stub
		
	}

	public Boolean getAssigned() {
		return assigned;
	}

	public void Assigned() {
		assigned = true;
	}

}

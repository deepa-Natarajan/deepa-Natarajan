package interfaceInheritance;

public class HRexcutive extends Employee implements Interviewer {
	
	HRexcutive(){
		this.name="gigi";//using this foraccessing thebaseclass variable
	}
	String[] specialization;
	

	@Override
	public void conductInterview() {
		System.out.println("HR--Conducts Interview");
		
	}

}

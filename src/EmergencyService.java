/*
 * @author Phong Vang
 * @Date
 * @Description
 * 
 */

public class EmergencyService extends Service {

	public double emergencyRate;
	
	//constructors
	public EmergencyService() {
		
	}
	public EmergencyService(double emergencyRate, int invoiceNumber, String firstName, String lastName, double baseRate, double serviceHours ) {
		super(invoiceNumber, firstName, lastName, baseRate, serviceHours);
		this.emergencyRate = emergencyRate;
	}
	
	//Getters and Setters
	public double getEmergencyFee() {
		return emergencyRate;
	}
	public void setEmergencyFee(double emergencyRate) {
		if(this.emergencyRate >= 0)
			this.emergencyRate = emergencyRate;
	}
	
	//override calculateCost method in super class
	public double calculateCost() {
		double total;
		total = (emergencyRate * super.getBaseRate()) * super.getServiceHours();
		return total;
	}
	
}

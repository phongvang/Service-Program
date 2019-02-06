/*
 * @Author Phong Vang
 * @Date 
 * @Description 
 */
public class RegularService extends Service{
	
	private double flatFee;
	
	//constructors
	public RegularService() {
		
	}
	public RegularService(double flatFee, int invoiceNumber, String firstName, String lastName, double baseRate, double serviceHours) {
		super(invoiceNumber, firstName, lastName, baseRate, serviceHours);
		this.flatFee = flatFee;
	}
	
	//Getters and Setters
	public double getFlatFee() {
		return flatFee;
	}
	public void setFlatFee(double flatFee) {
		this.flatFee = flatFee;
	}

	//override method for calculateCost()
	public double calculateCost() {
		double total;
		total = flatFee + (super.getBaseRate() * super.getServiceHours());
		return total;
	}
}

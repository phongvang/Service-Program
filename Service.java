/*
 * @Author Phong Vang
 * @Date: 02/06/2019
 * @Description: This is a super class Service for the base rate of a service.
 * 
 */


public class Service {
	
	private String firstName;
	private String lastName;
	private int invoiceNumber;
	private double baseRate;
	private double serviceHours;
	
	/*
	 * Constructors for super class Service
	 */
	public Service() {
	}
	
	public Service(int invoiceNumber, String firstName, String lastName, double baseRate, double serviceHours) {
		this.invoiceNumber = invoiceNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseRate = baseRate;
		this.serviceHours = serviceHours;
	}
	
	/*
	 * Setters and Getters for super class Service
	 */
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstname() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
	public double getBaseRate() {
		return baseRate;
	}
	
	public void setServiceHours(double serviceHours) {
		this.serviceHours = serviceHours;
	}
	public double getServiceHours() {
		return serviceHours;
	}
	
	/*
	 * A dummy method calculateCost() with return value of 0.0.
	 * This method is meant to be over-ridden by sub classes.
	 */
	public double calculateCost(double serviceHours) {
		return 0.0;
	}
	
	@Override
	public String toString() {
		return "invoiceNumber: " + invoiceNumber + "\nFirst: " + firstName + "\nLast: " + lastName + "\nBase rate: " + baseRate + "\nHours: " + serviceHours;
	}
	
}

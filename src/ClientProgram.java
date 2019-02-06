/*
 * @Author Phong Vang
 * @Date 02/06/2019
 * @Description: Service program to calculate how much a service costs at different rates.
 * 
 */

import java.util.Scanner;

public class ClientProgram {
	
	static Scanner console = new Scanner( System.in );
	
	public static void main (String [] args){
		
		/*
		 * create the service objects
		 */
		Service s1;
		RegularService r1;
		//WeekendService w1;
		EmergencyService e1;
		
		//data members
		int invoiceNumber;
		String firstName;
		String lastName;
		double baseRate = 25.00;
		double serviceHours;
		double flatFee = 50.00;
		double emergencyRate = 2;
		
		/*
		 * Case driven menu using a flag
		 */
		boolean flag = true;
		int choice;
		while(flag) {
			System.out.println("---------- Menu ----------");
			System.out.println("1. Get a service quote. "
							+ "\n2. Request a service. "
							+ "\nEnter choice: ");
			
			choice = console.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Choose the type of service: "
							+ "\n1. Regular Service hours are Monday-Friday 8am-6pm"
							+ "\n2. Emergency Service hours are nightly after 6pm"
							+ "\n3. Main Menu."
							+ "\nEnter choice: ");
					int choice2 = console.nextInt();
					
					switch(choice2) {
						case 1:
							System.out.println("Regular Service");
							System.out.println("Enter service hours: ");
							serviceHours = console.nextDouble();
							
							r1 = new RegularService(flatFee, 0, "", "", baseRate, serviceHours);
							System.out.println("Regular Service Quote"
									+ "\nflat fee charge: $" + flatFee
									+ "\nService hours requested: " + serviceHours
									+ " * $" + baseRate
									+ "\nRegular Service Total: $"+ r1.calculateCost());
							break;
						
						case 2: 
							System.out.println("Emergency Service");
							System.out.println("Enter Service hours: ");
							serviceHours = console.nextInt();
							
							e1 = new EmergencyService(emergencyRate, 0, "", "", baseRate, serviceHours);
							System.out.println("Emergency Service Quote"
									+ "\nEmergency Rate:  Emergency rate * Base rate * service hours"
									+ "\nEmergency Rate: " + emergencyRate + " * " + baseRate + " * " + serviceHours
									+ "\nEmergency Service total: $" + e1.calculateCost());
							break;
							
						case 3:
							break;
					}//end nested switch
				
					
			}//end switch
		}//end while
		
		System.out.println("Enter invoice #: ");
		invoiceNumber = console.nextInt();
		
		System.out.println("Enter First name: ");
		firstName = console.next();
		
		System.out.println("Enter Last name: ");
		lastName = console.next();
		
		System.out.println("Enter service hours: ");
		serviceHours = console.nextDouble();
		
		r1 = new RegularService(flatFee, invoiceNumber, firstName, lastName, baseRate, serviceHours );
		
		System.out.print("Regular Service total: $" + r1.calculateCost() );
		
	}

}

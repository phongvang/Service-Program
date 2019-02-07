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
		 * Case driven menu using a flag.
		 */
		boolean flag = true;
		int choice;
		while(flag) {
			System.out.println("---------- Menu ----------");
			System.out.println("1. Get a Service Quote. "
							+ "\n2. Request a Service. "
							+ "\n3. Exit"
							+ "\nEnter choice: ");
			
			choice = console.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Choose the type of service: "
							+ "\n1. Regular Service hours are Monday-Friday 8am-9pm"
							+ "\n2. Emergency Service hours are nightly after 9pm"
							+ "\n3. Main Menu."
							+ "\nEnter choice: ");
					int quoteChoice = console.nextInt();
					/*
					 * Nested switch statement for choice 1: Get a Service Quote.
					 */
					switch(quoteChoice) {
						case 1:
							System.out.println("---Regular Service Quote---");
							System.out.println("Enter service hours: ");
							serviceHours = console.nextDouble();
							
							r1 = new RegularService(flatFee, 0, "", "", baseRate, serviceHours);
							System.out.println("Regular Service Quote"
									+ "\nflat fee charge: $" + flatFee
									+ "\nService hours requested: " + serviceHours
									+ " * $" + baseRate
									+ "\nRegular Service Total: $"+ r1.calculateCost());
							System.out.println();
							break;
						
						case 2: 
							System.out.println("---Emergency Service Quote---");
							System.out.println("Enter Service hours: ");
							serviceHours = console.nextInt();
							
							e1 = new EmergencyService(emergencyRate, 0, "", "", baseRate, serviceHours);
							System.out.println("mergency Service Quote"
									+ "\nEmergency Rate:  Emergency rate * Base rate * service hours"
									+ "\nEmergency Rate: " + emergencyRate + " * " + baseRate + " * " + serviceHours
									+ "\nEmergency Service total: $" + e1.calculateCost());
							System.out.println();
							break;
							
						case 3:
							System.out.println();
							return;
							
						default:
							System.out.println("Invalid choice. Choose again.");
					}//end nested switch for quote
				
				case 2:
					System.out.println("Choose the type of Service Requested: "
							+ "\n1. Regular Service hours are Monday-Friday 8am-9pm"
							+ "\n2. Emergency Service hours are nightly after 9pm"
							+ "\n3. Main Menu."
							+ "\nEnter choice: ");
					
					int requestChoice = console.nextInt();
					/*
					 * Nested switch statement for choice 2: Request a Service.
					 */
					switch(requestChoice) {
						case 1:
							/*
							 * User input for requesting a regular service.
							 */
							System.out.println("---Regular Service Requested---");
							System.out.print("First name: ");
							firstName = console.next();
							System.out.print("Last name: ");
							lastName = console.next();
							System.out.print("Enter amount of hours: ");
							serviceHours = console.nextDouble();
							//manually entered invoiceNumber. Will make random generator handle this later.
							invoiceNumber = 004124;
							
							r1 = new RegularService(flatFee, invoiceNumber, firstName, lastName, baseRate, serviceHours);
							
							System.out.println("---Reguler Service Request Details---");
							System.out.println("Invoice# " + invoiceNumber 
									+ "\nName: " + firstName + " " + lastName
									+ "\nFlat-Fee: $" + flatFee
									+ "\nHourly Rate: $" + baseRate
									+ "\nHours of service: " + serviceHours + "hrs");
							System.out.println("Total service cost: $" + r1.calculateCost());
							System.out.println();
							break;
						
						case 2: 
							//incomplete
							System.out.println("Emergency Services are temporarily unavailable. \nSorry for the inconvenience. You will be redirected back the Main Menue.");
							System.out.println();
							break;
							
						case 3:
							break;
					}//end nested switch
									
				case 3:
					System.out.println("Thank you for visiting.");
					flag = false;
					break;
					
				default: 
					System.out.println("Invalid input. Please try again.");
					break;
					
			}//end switch
		}//end while
		
		//r1 = new RegularService(flatFee, invoiceNumber, firstName, lastName, baseRate, serviceHours );
		//System.out.print("Regular Service total: $" + r1.calculateCost() );
		
	}

}

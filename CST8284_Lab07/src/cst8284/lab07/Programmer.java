package cst8284.lab07;

//LAB 7: YOU ARE REQUIRED TO MODIFY THIS CODE!!!
//Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.
//SOME MODIFICATION ARE REQUIRED IN THIS SECTION OF YOUR HERE - LOOK CLOSELY!!!
public abstract class Programmer implements Payme{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	//three-argument constructor
	public Programmer(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}
	
	/** CHANGES ARE REQUIRED IN THIS SECTION. 
	* THINK OF THE BEST WAY TO ACCESS PRIVATE VARIABLES.
	* IN THIS PORTION OF YOUR CODE INCLUDE ALL OF SUCH THAT APPLIES.
	*/
	//return first name
	public String getFirstName() {
		return firstName;
	}
	
	//return last name
	public String getLastName() {
		return lastName;
	}
	
	//return social security number
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	//return String representation of Programmer object
	@Override
	public String toString() {
		return String.format("%s%s %s\n%s%s\n", "Programmer: ", getFirstName(), getLastName(),
												"social security number: ", getSocialSecurityNumber());
	} 
	
	//Note: We do NOT implement Payme method getPaymentAmount() here. 
	//THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS....??
	@Override
	public abstract double getPaymentAmount();
}
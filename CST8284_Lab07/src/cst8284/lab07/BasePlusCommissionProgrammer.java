package cst8284.lab07;

//BasePlusCommissionProgrammer class extends CommissionProgrammer.
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 
	private double baseSalary;//base salary per week
	
	//constructor
	public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		if(baseSalary < 0.0) {//validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;                
	}
	
	//set base salary
	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0.0) {//validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;                
	} 
	
	//return base salary
	public double getBaseSalary() {
		return baseSalary;
	}
	
	//calculate earnings; override method earnings in CommissionProgrammer
	//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
	//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
	@Override                                                            
	public double getPaymentAmount() {                                             
		return getBaseSalary() + super.getPaymentAmount();                        
	} 
	
	//return String representation of BasePlusCommissionProgrammer object
	@Override     
	//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
	public String toString() {
		return String.format("%s%.2f", "base-salaried " + super.toString() + "; base salary: $", getBaseSalary());
	}
}
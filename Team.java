
public class Coach {
    private String firstName; 
    private String lastName;
    private int years;

   public Coach() { //default constructor
		
		this.firstName = "?";
		this.lastName = "?";
		this.years = null;
	}
	
	
	public Coach(String first,String last,int years) {
		
		this.firstName=first;
		this.lastName =last;
		this.years = years;
		
	}
	
	//giving the getter methods
	public String getFirstName() {
		return firstName;
		}
	
	public String getLastName() {
		return lastName;
		}
	
	public int getYears() {
		return years;
		}
	
	//giving the setter methods
	public void setFirstName(String someFirstName) {
		this.firstname=someFirstName;
	}
	
	public void setLastName(String someLastName) {
		this.lastname=someLastName;
	}

	public void setYears(int years) {
		this.years= years;
	}


	public String toString() {
		return ("\nlast Name:\t"+ LastName+
				"\nFirst Name:\t"+ firstName+
				"\nYears of Experience:\t"+ years +"\n");
	}

}

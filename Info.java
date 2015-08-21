import java.util.Scanner; 

/* 
 * Program: Info.java
 * Date: 08/18/2015
 * Description: 
 *		This application asks the user for his/her basic 
 *		personal information (full name, birthday and place of birth).
 * History:
 *		08/17/2015 - File Created. AJE
 */
 
 public class Info {
	 
	private String firstName;
	private String lastName;
	private String birthDay;
	private String birthPlace;
	 
	/*
	 * Default constructor initialize personal info to blank.
	 */
	public Info() {
		this("", "", "", "");
	}
	 
	/*
	 * Parameter constructor initialize personal info with
	 * parameters received.
	 */
	public Info(String firstName, String lastName, String birthDay, String birthPlace){
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.birthPlace = birthPlace;
	}
	/*
	 * Get the first name.
	 */
	public String getFirstName(){
		return firstName;
	}
	/*
	 * Get the last name.
	 */
	public String getLastName(){
		return lastName;
	}
	/*
	 * Get the birthday.
	 */
	public String getBirthDay(){
		return birthDay;
	}
	/*
	 * Get the place of birth.
	 */
	public String getBirthPlace(){
		return birthPlace;
	}
	
	/*
	 * Set the first name.
	 */
	public void setFirstName(String aFirst){
		firstName = aFirst;
	}
	/*
	 * Set the last name.
	 */
	public void setLastName(String aLast){
		lastName = aLast;
	}
	/*
	 * Set the birthday.
	 */
	public void setBirthDay(String aBirthDay){
		birthDay = aBirthDay;
	}
	/*
	 * Set the place of birth.
	 */
	public void setBirthPlace(String aPlace){
		birthPlace = aPlace;
	}
	
	/*
	 * Ask the personal info.
	 */
	public void askInfo() {
		Scanner cin = new Scanner(System.in);
		System.out.printf("WELCOME!" + '\n');
		
		System.out.print("What is your first name? ");
		firstName = cin.nextLine();
		
		System.out.print("What is your last name? ");
		lastName = cin.nextLine();
		
		System.out.print("When is your birthday? ");
		birthDay = cin.nextLine();
		
		System.out.print("Where were you born? ");
		birthPlace = cin.nextLine();
		
		System.out.println();
	}
	
	/*
	 * Overloading method toString.
	 */
	public String toString() {
		return "First Name: " + firstName + '\n' +
				"Last Name: " + lastName + '\n' + 
				"Birthday: " + birthDay + '\n' +
				"Born in: " + birthPlace + '\n';
	}
	
	/*
	 * Main method
	 */
	public static void main(String [] args){
		Info myInfo = new Info();
				
		myInfo.askInfo();
		
		System.out.println(myInfo);
		
	}
 }
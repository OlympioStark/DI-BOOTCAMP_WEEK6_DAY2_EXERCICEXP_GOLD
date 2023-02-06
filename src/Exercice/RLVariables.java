package Exercice;

public class RLVariables {
	
	private int mySecretNumber = 10;
	
	public int displaySecret() {
		return this.mySecretNumber;
	}

	public static void main(String[] args) {
		RLVariables notSoPrivate = new RLVariables();
		RLVariables secret = new RLVariables();
		
		System.out.println("Reference variable accessing instance variable: " + secret.mySecretNumber);
		System.out.println("Local Variable: " + notSoPrivate.displaySecret());
		System.out.println("Reference variable accessing instance variable that points to the local variable: " + secret.displaySecret());

	}

}

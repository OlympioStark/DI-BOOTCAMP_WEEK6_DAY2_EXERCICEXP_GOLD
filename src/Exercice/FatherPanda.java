package Exercice;

public class FatherPanda {
	
	public boolean isPredator = false;
	protected int weigth;
	private int age;
	
	public FatherPanda(boolean isPredator, int weigth, int age) {
		super();
		this.isPredator = isPredator;
		this.weigth = weigth;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void afficher() {
		System.out.println("After each meal, Father Panda gains weight: " + weigth);
		System.out.println("And his age is: " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

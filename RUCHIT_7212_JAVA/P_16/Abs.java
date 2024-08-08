/*
16. Write a java program to use abstract class

*/

abstract class Animal{
	public abstract void animalSound();

	public void sleep(){
	
		System.out.println("Zzzzzzzzz");
	}
}

class Dog extends Animal{
	public void animalSound(){
		System.out.println("The dog says: woof.....woof");
	}
}

class Abs{
	public static void main(String[] args)
	{
		Dog myDog = new Dog();
		myDog.animalSound();
		myDog.sleep();
	}
}
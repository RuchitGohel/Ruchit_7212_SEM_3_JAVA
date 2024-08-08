/*
Interface
*/

interface Animal
{
	void makeSound();
	void eat();
}
//Dog class implementing the animal interface

class Dog implements Animal
{
	public void makeSound()
	{
		System.out.println("Woof");
	}
	public void eat()
	{
		System.out.println("Dog eats dogfood.");
	}
}

class Cat implements Animal
{
	public void makeSound()
	{
		System.out.println("Meow");
	}
	public void eat()
	{
		System.out.println("Cat eats catfood.");
	}
}

public class InterfaceEx
{
	public static void main(String args[])
	{	
		Animal dog = new Dog();
		Animal cat = new Cat();

		System.out.println("Dog:");
		dog.makeSound();
		dog.eat();
	
		System.out.println("Cat:");
		cat.makeSound();
		cat.eat();
	
	}
}
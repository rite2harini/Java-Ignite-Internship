/*
ADVANCED 2 – Mini Game Character System

Create a class GameCharacter:

Attributes:
name
health (PRIVATE)
attackPower (PRIVATE)
Requirements:
Constructor using this
Proper encapsulation
Methods:
attack(GameCharacter enemy)
heal()
showStats()
Rules:
attack reduces enemy health
heal increases own health
health should never be accessed directly
Twist:

Each attack should show:
*/
X attacked Y and reduced health by Z
  
  package java_internship_assignment;

import java.util.Scanner;

class Gamecharacter
{	
	String charname;
	private int health;
	private int attackpow;
	private int enemyhealth;
	public int choice;
	public int gethealth()
	{	
		return this.health;
	}
	public void sethealth(int health)
	{	
		this.health=health;
	}
	public void setattackpower(int attackpow)
	{	
		this.attackpow=attackpow;
	}
	public void setenemyhealth(int enemyhealth)
	{	
		this.enemyhealth=enemyhealth;
	}
	
	
	Gamecharacter(String charname)//constructor
	{	
		this.charname=charname;
		
	}
	void attack()
	{	
		enemyhealth=(enemyhealth-attackpow);
		
	}
	void heal()
	{	
		if(health<500)
		{
			health=health+20;
			if(health>500)
			{	
				health=500;
			}
		}
	}
	void showstats()
	{	
		System.out.println("Character Name:"+(charname));
		System.out.println("Attack power:"+(attackpow));
		System.out.println("Health:"+(health));
		
	}
}

public class game1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character name");
		String charname=sc.nextLine();
	
		Gamecharacter c1=new Gamecharacter(charname);
			c1.sethealth(500);
			c1.setattackpower(20);
			c1.setenemyhealth(500);
			while(true)
			{	
				System.out.println("Enter your choice 1-Attack 2-Heal 3-showstats");
				int choice=sc.nextInt();
				

			switch(choice)
			{	
			case 1:
			{	
				c1.attack();
				System.out.println(" X Attacked Y and reduced health by 20");
				break;
			}
			case 2:
							
			{	
				
				
				c1.heal();
				
				break;
			}
			case 3:
			{	
				c1.showstats();
				break;
			}
			default:
			{	
				System.out.println("Wrong input");;
			}
			
					
			}
			}

			
				

}
}


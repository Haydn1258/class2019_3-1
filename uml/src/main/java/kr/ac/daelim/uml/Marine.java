package kr.ac.daelim.uml;

public class Marine {
	public String name;
	public int health;
	public int attackPower;
	
	public void Move()
	{
		System.out.println("마린이 움직인다");
	}
	
	public void Attack()
	{
		System.out.println("마린이 공격한다");
	}
	
	public void underAttack(Charactor charactor)
	{
		System.out.println("마린이 공격받는다");
		
	}
	

}

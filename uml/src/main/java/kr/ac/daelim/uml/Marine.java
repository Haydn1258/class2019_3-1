package kr.ac.daelim.uml;

public class Marine extends Unit {
	public int attackPower;
	
	public void move()
	{
		System.out.println("마린이 움직인다");
	}
	
	public void attack()
	{
		System.out.println("마린이 공격한다");
	}
	
	public void underAttack(Charactor charactor)
	{
		System.out.println("마린이 공격받는다");
		
	}
	

}

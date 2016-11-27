package fcu.iecs.oop.pokemon;

public class Main {
	
	public static void main(String[] args){
		Pokemon p1 = new Pokemon("Psyduck",100);
		Pokemon p2 = new Pokemon("Pikachu",300);
		
		System.out.println("name:"+p1.getName()+"  cp:"+p1.getCp());
		System.out.println("name:"+p2.getName()+"  cp:"+p2.getCp());
		
		System.out.println("Fighting!!");
		GYM.fight(p1, p2);
		
		System.out.println("name:"+p1.getName()+"  cp:"+p1.getCp());
		System.out.println("name:"+p2.getName()+"  cp:"+p2.getCp());
		
	}

}

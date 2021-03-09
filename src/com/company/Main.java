package com.company;

public class Main {

    public static void main(String[] args) {
	Hero h1 = new Hero ();
	h1.setHealth(300);
	h1.setDamage(50);
	h1.heroAttackType="Magic";
	System.out.println(h1.heroAttackType + " " + h1.getHealth() + " " + h1.getDamage());


	Hero hero2=new Hero();
	hero2.setDamage(80);
	hero2.setHealth(350);
	System.out.println(hero2.getHealth()+ " " + hero2.getDamage());

	Boss boss2=new Boss();
	boss2.setHealth(700);
	boss2.setDamage(100);
	boss2.setBossTypeOfProtected("Physical");
	System.out.println(boss2.getHealth() +" " + boss2.getDamage() + " " + boss2.getBossTypeOfProtected());


    }

}

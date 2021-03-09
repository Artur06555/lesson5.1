package com.company;

public class Hero {
    private int health;
     private int damage;
     String heroAttackType;

    public String getHeroAttackType() {
        return heroAttackType;
    }

    public void setHeroAttackType(String heroAttackType) {
        this.heroAttackType = heroAttackType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Hero(){}

     public Hero (int health, int damage, String heroAttackType){
         this.health=health;
         this.damage=damage;
         this.heroAttackType=heroAttackType;

     }


}


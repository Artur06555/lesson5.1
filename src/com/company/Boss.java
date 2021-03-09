package com.company;

public class Boss {
  private int health;
 private int damage;
 private String bossTypeOfProtected;


    public String getBossTypeOfProtected() {
        return bossTypeOfProtected;
    }

    public void setBossTypeOfProtected(String bossTypeOfProtected) {
        this.bossTypeOfProtected = bossTypeOfProtected;
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
}

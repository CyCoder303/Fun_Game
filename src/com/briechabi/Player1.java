package com.briechabi;

public class Player1 {

    //Attributes
    private String name;
    private String weapon;
    private int health;

    public Player1(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if (health < 0 || health > 1000){
            this.health = 1000;
        } else this.health = health;
    }

    //Method
    public void damageByGun1(){
        this.health -= 30;
        if(this.health <= 0){
            this.health = 0;
        }
        System.out.println("Got hit by Gun 1, Health is reduced by 30, your health is now" + this.health);
        if(this.health == 0){
            System.out.println("You are dead" + this.name);
        }
    }

    public void damageByGun2(){
        this.health -= 40;
        if(this.health <= 0){
            this.health = 0;
        }
        System.out.println("Got hit by Vandal, Health is reduced by 40, your health is now: " + this.health);
        if(this.health == 0){
            System.out.println("You are dead" + this.name);
        }
    }
    public void heal(){
        if(this.health <= 0){
            System.out.println("Player is dead, this is not possible");
        }
        else{
            this.health += 100;
            System.out.println("Health is " + this.health);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}

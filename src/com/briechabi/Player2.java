package com.briechabi;

public class Player2 extends Player1{


    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGun1() {
        if(armour){
            this.health -= 20;
            if(this.health<=0){
                this.health =0;
                System.out.println("Armor is on, got hit by gun1, health is reduced by 20, new health " + this.health);
            }
        }
        if(!armour){
            this.health -= 30;
            if(this.health <= 0){
                this.health =0;
                System.out.println("Armor is off, got hit by gun1, health is reduced by 30, now health is"+ this.health);
            }
        }
    }

    @Override
    public void damageByGun2() {
        if(armour){
            this.health -= 60;
            if(this.health<=0){
                this.health =0;
                System.out.println("Armor is on, got hit by gun2, health is reduced by 60, new health " + this.health);
            }
        }
        if(!armour){
            this.health -= 90;
            if(this.health <= 0){
                this.health =0;
                System.out.println("Armor is off, got hit by gun2, health is reduced by 90, now health is"+ this.health);
            }
        }
    }



    @Override
    public void heal(){
        super.heal();
    }
    public boolean isArmour() {
        return armour;
    }

    public void setArmour(boolean armour) {
        this.armour = armour;
    }
}


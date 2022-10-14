package com.briechabi;

public class Main {

    public static void main(String[] args) {
//        Player1 RoboWarrior = new Player1("RoboWarrior", "Dagger", 400);
//
//        System.out.println(RoboWarrior.getName());
//        System.out.println(RoboWarrior.getHealth());
//        RoboWarrior.damageByGun1();
//        System.out.println(RoboWarrior.getHealth());
//        RoboWarrior.heal();
//        System.out.println(RoboWarrior.getHealth());

        Player2 RoboFighter = new Player2("RoboFighter", "Katana", 500, true);

        System.out.println(RoboFighter.getName());
        System.out.println(RoboFighter.getHealth());
        RoboFighter.damageByGun2();
        System.out.println(RoboFighter.getHealth());
        RoboFighter.heal();
        System.out.println(RoboFighter.getHealth());


//        RoboSlime DarkBlob = new RoboSlime("RoboFighter", "Katana", 500, true, effect);
//
//        System.out.println(DarkBlob.getName());
//        System.out.println(DarkBlob.getHealth());
//        DarkBlob.damageByGun2();
//        System.out.println(DarkBlob.getHealth());
//        DarkBlob.heal();
//        System.out.println(DarkBlob.getHealth());
    }
}

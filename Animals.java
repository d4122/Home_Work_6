package ru.geekbrains.Home_work_6;

public class Animals {
    protected int sail;
    protected int run;
    protected String name;




    public void runThroug (int run) {
        System.out.println(name + " пробежал " + run + " метров!");
    }

    public void sailTroug (int sail) {
        System.out.println(name + " проплыл " + sail + " метров!");
    }

    public void info () {
        System.out.println(name + " ");
    }




}

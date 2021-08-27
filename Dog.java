package ru.geekbrains.Home_work_6;

public class Dog extends Animals{
    public Dog (String name) {
        this.name = name;
    }

    @Override
    public void runThroug (int run) {
        if (run <= 500) {
            System.out.println( name + " пробежал " + run + " метров!");
        } else {
            System.out.println(name + " не пробежит столько!");
        }
    }

    @Override
    public void sailTroug (int sail) {
        if (sail <= 10) {
            System.out.println(name + " проплыл " + sail + " метров!" );
        } else {
            System.out.println(name + " не проплывёт столько!");
        }
    }

    public void info () {
        System.out.println(name + " ");
    }

}

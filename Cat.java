package ru.geekbrains.Home_work_6;

public class Cat extends Animals {

    public Cat (String name) {
        this.name = name;

    }
    @Override
    public void sailTroug (int sail) {
        System.out.println(name + " не умеет плавать!!");
    }

    @Override
    public void runThroug (int run) {
        if (run <= 200) {
            System.out.println(name + " пробежал " + run + " метров!");
        } else {
            System.out.println(name + " не пробежит столько!");
        }
    }

    public void info () {
        System.out.println(name + " ");
    }




}

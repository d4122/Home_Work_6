package ru.geekbrains.Home_work_6;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat ("Джеки");
        cat.runThroug(100);
        cat.sailTroug(15);

        System.out.println();

        Dog dog = new Dog("Дэнни");
        dog.runThroug(200);
        dog.sailTroug(10);

        System.out.println();

        Animals [] animals = {
                new Cat ("Барсик"),
                new Cat("Мурзик"),
                new Dog("Бобик"),
                new Dog("Рекс")
        };
        for (int i = 0; i < animals.length; i++) {
            System.out.print(i + 1 + " ");
            animals[i].info();
            animals[i].runThroug(250);
            animals[i].sailTroug(10);
            System.out.println();
            }

            }

        }






//1. Создать классы Собака и Кот с наследованием от класса Животное.

//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
// препятствия. Результатом выполнения действия будет печать в консоль.
// (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

//3. У каждого животного есть ограничения на действия
// (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

// 4. * Добавить подсчет созданных котов, собак и животных.



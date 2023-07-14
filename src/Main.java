
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void  task1 () {
        System.out.println("Задача 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 76789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 76789;

        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    };
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 76789;

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    };
    public static void task4 () {
        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);
        friend *= 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

    };
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

    };
    public static void task6 () {
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println("Общий вес бойцов: " + (firstBoxerWeight + secondBoxerWeight) + " кг!");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами бойцов: " + weightDifference + " кг!");

    };
    public static void task7() {
        System.out.println("Задача 7");
        var firsBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var boxersWeightDiff = secondBoxerWeight - firsBoxerWeight;
        var boxersWeightDiff2 = secondBoxerWeight % firsBoxerWeight;
        System.out.println("Разница весов спортсменов: " + boxersWeightDiff + " кг!");
        System.out.println("или " + boxersWeightDiff2 + " кг!");

    };
    public static void task8() {
        System.out.println("Задача 8");
        var time = 640;
        var jobTime = 8;
        var employees = time / jobTime;
        System.out.println("\n" + "Всего работников в компании — " + employees + " человек");

        var employees2 = employees + 94;
        System.out.println("\n" + "Если в компании работает " + employees2 + " человек, то всего " + (time/employees2) + " часа работы может быть поделено между сотрудниками");


    };

}
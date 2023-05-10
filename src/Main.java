// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, " +
                    "нужно немного подождать.");
        }
    }

    public static void task2() {
        int temperature = 9;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км, то можно ездить спокойно.");
        }
    }

    public static void task4() {
        int age = 60;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        }
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        if (age >= 24 && age < 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
        if (age >= 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора отдохнуть");
        }
    }

    public static void task5() {
        int childAge = 20;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ", то ему нельзя кататься на аттракционе без сопровождения взрослого");
        }
        if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        int placesInVagon = 104;
        int sittingPlaces = 60;
        int stayingPlaces = 42;
        if (placesInVagon <= 102) {
            System.out.println("Имеются места в вагоне");
        } else {
            System.out.println("Вагон полностью забит");
        }
        if (sittingPlaces <= 60 && stayingPlaces <= 42) {
            System.out.println("В вагоне есть сидячие или стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
    }

    public static void task7() {
        int one = 1;
        int two = 2;
        int three = 3;
        if (one < two && two < three) {
            System.out.println("если значение числа равно " + three + ", то оно самое большее");
        } else {
            System.out.println("значение числа меньше необходимого");
        }
    }
}
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
    public static void task1() {
        System.out.println("Задача 1");
        int intVariable = -100;
        System.out.println("Значение переменной intVariable c типом int равно " + intVariable);
        byte byteVariable = -128;
        System.out.println("Значение переменной byteVariable c типом byte равно " + byteVariable);
        short shortVariable = 32767;
        System.out.println("Значение переменной shortVariable c типом short равно " + shortVariable);
        long longVariable = 333L;
        System.out.println("Значение переменной longVariable c типом long равно " + longVariable);
        float floatVariable = 3.14f;
        System.out.println("Значение переменной floatVariable c типом float равно " + floatVariable);
        double doubleVariable = -2.222;
        System.out.println("Значение переменной doubleVariable c типом double равно " + doubleVariable);
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задача 2");
        float fl = 27.12f;
        long lng = 987678965549L;
        double dbl = 2.786;
        char ch = 569;
        short sh = -159;
        int i = 27897;
        byte bt = 67;
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int pupilsLudmila = 23;
        int pupilsAnna = 27;
        int pupilsEkaterina = 30;
        int paperTotal = 480;
        int pupilsTotal = pupilsLudmila + pupilsAnna + pupilsEkaterina;
        int paperPupil = paperTotal / pupilsTotal;
        System.out.println("На каждого ученика рассчитано " + paperPupil + " листов бумаги");
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int bottles2minutes = 16;
        int bottles1minute = bottles2minutes / 2;
        int bottles20minutes = bottles1minute * 20;
        System.out.println("За 20 минут машина произвела " + bottles20minutes + " штук бутылок");
        int bottlesDay = bottles1minute * 60 * 24;
        System.out.println("За сутки машина произвела " + bottlesDay + " штук бутылок");
        int bottles3Days = bottlesDay * 3;
        System.out.println("За 3 дня машина произвела " + bottles3Days + " штук бутылок");
        int bottlesMonth = bottlesDay * 30;
        System.out.println("За 1 месяц (30 дней) машина произвела " + bottlesMonth + " штук бутылок");
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задача 5");
        int cansTotal = 120;
        int cansClassWhite = 2;
        int cansClassBrown = 4;
        int cansClassTotal = cansClassWhite + cansClassBrown;
        int numberClasses = cansTotal / cansClassTotal;
        int cansNumberWhite = cansClassWhite * numberClasses;
        int cansNumberBrown = cansClassBrown * numberClasses;
        System.out.println("В школе, где "+numberClasses+" классов, нужно "+cansNumberWhite+" банок белой краски и "+cansNumberBrown+" банок коричневой краски");
        System.out.println();
    }
    public static void task6() {
        System.out.println("Задача 6");
        short bananasGr = 80 * 5;
        short milkGr = 105 * 2;
        short plombirGr = 100 * 2;
        short eggsGr = 70 * 4;
        int breakfastGr = bananasGr + milkGr + plombirGr + eggsGr;
        System.out.println("Вес завтрака составляет " + breakfastGr + " грамм");
        float breakfastKg = breakfastGr / 1000f;
        System.out.println("Вес завтрака составляет " + breakfastKg + " кг");
        System.out.println();
    }
    public static void task7() {
        System.out.println("Задача 7");
        int loose = 7000;
        int daysLoose250 = loose / 250;
        System.out.println("Худеть " + daysLoose250 + " дней, если терять 250 гр в день");
        int daysLoose500 = loose / 500;
        System.out.println("Худеть " + daysLoose500 + " дней, если терять 500 гр в день");
        int daysAverage = (daysLoose250 + daysLoose500) / 2;
        System.out.println("Худеть " + daysAverage + " дней в среднем");
        System.out.println();

    }
    public static void task8() {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float newSalM = salaryMasha * 1.1f;
        float yearSalDiffM = newSalM * 12 - salaryMasha * 12;
        System.out.println("Маша теперь получает " + newSalM + " рублей. Годовой доход вырос на " + yearSalDiffM + " рублей");
        float newSalD = salaryDenis * 1.1f;
        float yearSalDiffD = newSalD * 12 - salaryDenis * 12;
        System.out.println("Денис теперь получает " + newSalD + " рублей. Годовой доход вырос на " + yearSalDiffD + " рублей");
        float newSalK = salaryKristina * 1.1f;
        float yearSalDiffK = newSalK * 12 - salaryKristina * 12;
        System.out.println("Кристина теперь получает " + newSalK + " рублей. Годовой доход вырос на " + yearSalDiffK + " рублей");
    }
}
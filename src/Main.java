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
    public static void task1(){
        System.out.println("Задача 1");
        int tenDigit = 935647;
        System.out.println("Значение переменной tenDigit  с типом int равно " + tenDigit);
        byte threeDigit = 14;
        System.out.println("Значение переменной threeDigit  с типом int равно " + threeDigit);
        short fiveDigit = 4763;
        System.out.println("Значение переменной fiveDigit  с типом int равно " + fiveDigit);
        long nineteenDigit = 98037462;
        System.out.println("Значение переменной nineteenDigit  с типом int равно " + nineteenDigit);
        float withComma = 8.8378f;
        System.out.println("Значение переменной withComma  с типом int равно " + withComma);
        double redublecated = 9.89374819;
        System.out.println("Значение переменной redublecated  с типом int равно " + redublecated);
    }
    public static void task2(){
        System.out.println("Задача 2");
        float a = 27.12f;
        float b = 987678965549f;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte j = 67;
        System.out.println("Сделана в коде");
    }
    public static void task3(){
        System.out.println("Задача 3");
        byte pavlovna = 23;
        byte sergeevna = 27;
        byte andreevna = 30;
        int totalPupils = pavlovna+sergeevna+andreevna;
        short totalPaper = 480;
        int forPerPupil = totalPaper / totalPupils;
        System.out.println("На каждого ученика рассчитано " + forPerPupil + " листов бумаги");
    }
    public static void task4(){
        System.out.println("Задача 4");
        byte bottlesForTwoMinutes = 16;
        int bottlesPerMinutes = bottlesForTwoMinutes / 2;
        int bottlesInTwentyMinute = bottlesPerMinutes * 20;
        System.out.println("За 20 мин. машина произвела " + bottlesInTwentyMinute + " штук бутылок");
        int bottlesOfDay = bottlesPerMinutes * 60 * 24;
        System.out.println("За сутки машина произвела " + bottlesOfDay + " штук бутылок");
        int bottlesIn3Days = bottlesOfDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        long bottlesInMonth = bottlesOfDay * 30;
        System.out.println("За месяц машина произвела " + bottlesInMonth + " штук бутылок");
    }
    public static void task5(){
        System.out.println("Задача 5");
        byte totalPrints = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        int printsPerClass = whitePerClass + brownPerClass;
        int classrooms = totalPrints / printsPerClass;
        int totalWhitePrints = classrooms * whitePerClass;
        int totalBrownPrints = classrooms * brownPerClass;
        System.out.println("В школе, где " + classrooms + " классов, нужно " + totalWhitePrints + " банок белой краски и " + totalBrownPrints + " банок коричневой краски");
    }
    public static void task6(){
        System.out.println("Задача 6");
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int totalGrams = bananas + milk + iceCream + eggs;
        float totalKilogram = totalGrams / 1000f;
        System.out.println("Всего " + totalGrams + " грамм и " + totalKilogram + " килограм затрака нужно");
    }
    public static void task7(){
        System.out.println("Задача 7");
        int  loseWeight = 7000;
        short minLoseEveryDay = 250;
        short maxLoseEveryDay = 500;
        int daysForLoosingWeight = loseWeight / minLoseEveryDay;
        System.out.println("Если худеть на 250 г. кажый день, то уйдет " + daysForLoosingWeight + " дней");
        int maxDaysForLoosingWeight = loseWeight / maxLoseEveryDay;
        System.out.println("Если худеть на 500 г. кажый день, то уйдет " + maxDaysForLoosingWeight + " дней");
        int averageLoseGrams = (minLoseEveryDay + maxLoseEveryDay) / 2;
        int averageDays = loseWeight / averageLoseGrams;
        System.out.println("Если худеть в среднем темпе кажый день, то уйдет " + averageDays + " дней");
    }
    public static void task8(){
        System.out.println("Задача 8");
        int mashasSalary =  67760;
        double mashasIncreasing = mashasSalary * 10 / 100;
        double newMashasSalary = mashasSalary + mashasIncreasing;
        double mashasRevenueDifference = mashasIncreasing * 12;
        System.out.println("Маша теперь получает " + newMashasSalary + " рублей. Годовой доход вырос на " + mashasRevenueDifference + " рублей");

        int denisSalary = 83690;
        double denisIncreasing = denisSalary * 10 / 100;
        double newDenisSalary = denisSalary + mashasIncreasing;
        double denisRevenueDifference = denisIncreasing * 12;
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + denisRevenueDifference + " рублей");

        int kristinasSalary = 76230;
        double kristinasIncreasing = kristinasSalary * 10 / 100;
        double newKristinasSalary = kristinasSalary + kristinasIncreasing;
        double kristinasRevenueDifference = denisIncreasing * 12;
        System.out.println("Кристина теперь получает " + newKristinasSalary + " рублей. Годовой доход вырос на " + kristinasRevenueDifference + " рублей");
    }

    }
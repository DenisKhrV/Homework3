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
        int firstVariable = 1;
        byte secondVariable = 2;
        short thirdVariable = 3;
        long fourthVariable = 4;
        float fifthVariable = 3.75f;
        double sixthVariable = 2.222;
        System.out.println("Значение переменной firstVariable с типом int равно " + firstVariable);
        System.out.println("Значение переменной secondVariable с типом byte равно " + secondVariable);
        System.out.println("Значение переменной thirdVariable с типом short равно " + thirdVariable);
        System.out.println("Значение переменной fourthVariable с типом long равно " + fourthVariable);
        System.out.println("Значение переменной fifthVariable с типом float равно " + fifthVariable);
        System.out.println("Значение переменной sixthVariable с типом double равно " + sixthVariable);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println("float a = " + a + "long b = " + b + "double c = " + c + "short d = " + d + "short e = " + e + f + g);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte lyudmilaPavelClass = 23;
        byte annaSergeyClass = 27;
        byte ekaterinaAndreyClass = 30;
        short purchase = 480;
        int totalClass = lyudmilaPavelClass + annaSergeyClass + ekaterinaAndreyClass;
        float listPerStudent = (float) purchase / totalClass;
        System.out.println("На каждого ученика рассчитано " + listPerStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte capacity = 16;
        byte time = 2;
        byte capacityPerMinute = (byte) (capacity / time);
        short capacityPerTwentyMinute = (short) (capacityPerMinute * 20);
        System.out.println("За 20 минут машина произвела " + capacityPerTwentyMinute + " штук бутылок");
        int capacityPerDay = capacityPerMinute * 60 * 24;
        System.out.println("За сутки машина произвела " + capacityPerDay + " штук бутылок");
        int capacityPerThreeDays = capacityPerDay * 3;
        System.out.println("За трое суток машина произвела " + capacityPerThreeDays + " штук бутылок");
        float capacityPerMonth = (float) (365.25 * capacityPerDay / 12);
        System.out.println("За месяц машина произвела " + capacityPerMonth + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte banksTotal = 120;
        byte whiteBankPerClass = 2;
        byte brownBankPerClass = 4;
        int classTotal = banksTotal / (whiteBankPerClass + brownBankPerClass);
        int whiteBankNeed = classTotal * whiteBankPerClass;
        int brownBankNeed = classTotal * brownBankPerClass;
        System.out.println("В школе, где " + classTotal + " классов, нужно " + whiteBankNeed + " банок белой краски и " + brownBankNeed + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int weightGrBananas = 80;
        int numberOfBananas = 5;
        int weightGrMilk = 105;
        int numberOfMilk = 2;
        int weightGrIce = 100;
        int numberOfIce = 2;
        int weightGrEgg = 70;
        int numberOfEgg = 4;
        int totalWeightGr = weightGrBananas * numberOfBananas + weightGrEgg * numberOfEgg + weightGrMilk * numberOfMilk + weightGrIce * numberOfIce;
        System.out.println("Общий вес спортзавтрака - " + totalWeightGr + " грамм");
        int grPerKg = 1000;
        float weightKg = totalWeightGr / (float) grPerKg;
        System.out.println("Общий вес спортзавтрака - " + weightKg + " килограмм");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int weightLossMax=500;
        int weightLossMin=250;
        int weightLossNeed=7000;
        double maxDays=weightLossNeed/(double)weightLossMin;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, на похудение уйдёт " + maxDays + " дней");
        double minDays=weightLossNeed/(double)weightLossMax;
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, на похудение уйдёт " + minDays + " дней");
        double averageDaysLoss=(weightLossMax+weightLossMin)/2D;
        double averageDays=(double)weightLossNeed/averageDaysLoss;
        System.out.println("В среднем для достижения результата понадобится " + averageDays + " дней");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int mashaPay=67760;
        int denisPay=83690;
        int kristinaPay=76230;
        float increasePay=1.1F;
        float mashaPayNew=mashaPay*increasePay;
        float denisPayNew=denisPay*increasePay;
        float kristinaPayNew=kristinaPay*increasePay;
        int mashaPayOld=mashaPay*12;
        int denisPayOld=denisPay*12;
        int kristinaPayOld=kristinaPay*12;
        float mashaPayPerYearNew=mashaPayNew*12;
        float denisPayPerYearNew=denisPayNew*12;
        float kristinaPayPerYearNew=kristinaPayNew*12;
        float mashaDifference=mashaPayPerYearNew-mashaPayOld;
        float denisDifference=denisPayPerYearNew-denisPayOld;
        float kristinaDifference=kristinaPayPerYearNew-kristinaPayOld;

        System.out.println("Маша теперь получает "+mashaPayNew +" рублей. Годовой доход вырос на "+mashaDifference+" рублей");
        System.out.println("Денис теперь получает "+denisPayNew +" рублей. Годовой доход вырос на "+denisDifference+" рублей");
        System.out.println("Кристина теперь получает "+kristinaPayNew +" рублей. Годовой доход вырос на "+kristinaDifference+" рублей");
    }
}

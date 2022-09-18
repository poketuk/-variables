public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int apples = 10;
        System.out.println("Значение переменной apples с типом int равно " +apples);
        byte dogs = 4;
        System.out.println("Значение переменной dogs с типом byte равно " +dogs+ " ");
        short cars = 100;
        System.out.println("Значение переменной cars с типом short равно " +cars);
        long days = 10000L;
        System.out.println("Значение переменной days с типом long равно " +days+ " ");
        float figure = 4.467396F;
        System.out.println("Значение переменной figure с типом float равно " +figure);
        double fi = 1.61803339;
        System.out.println("Значение переменной fi с типом float равно " +fi);

        // Задача 2
        System.out.println("Задача 2");
        float v1 = 27.12F;
        long v2 = 987_678_965_549L;
        double v3 = 2.786;
        boolean v4 = false;
        char v5 = 569;
        short v6 = -159;
        int v7 = 27897;
        byte v8 = 67;

        // Задача 3
        System.out.println("Задача 3");
        int pupilsClass1 = 23;
        int pupilsClass2 = 27;
        int pupilsClass3 = 30;
        int papersCounts = 480;
        int papersPerPupil = papersCounts / (pupilsClass1 + pupilsClass2 + pupilsClass3);
        System.out.println("На каждого учника рассчитано " +papersPerPupil+ " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int efficiencyPerMinute = bottles / minutes;
        int twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут машина произвела бутылок " + efficiencyPerMinute * twentyMinutes + " штук");
        int minutesInDay = 1440;
        System.out.println("За " + minutesInDay + " минут машина произвела бутылок " + efficiencyPerMinute * minutesInDay + " штук");
        int minutesInThreeDays = 3 * minutesInDay;
        System.out.println("За " + minutesInThreeDays + " минут машина произвела бутылок " + efficiencyPerMinute * minutesInThreeDays + " штук");
        int minutesInMonth = 10 * minutesInThreeDays;
        System.out.println("За " + minutesInMonth + " минут машина произвела бутылок " + efficiencyPerMinute * minutesInMonth + " штук");

        // Задача 5
        System.out.println("Задача 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        int bananas = 5;
        int bananaPerWeightGr = 80;
        int totalBananasWeightGr = bananas * bananaPerWeightGr;
        int totalMilkWeightGr = 105 * 2;
        int iceCreamBriquette = 2;
        int iceCreamBriquettePerWeightGr = 100;
        int totalIceCreamBriquetteWeightGr = iceCreamBriquette * iceCreamBriquettePerWeightGr;
        int rawEggs = 4;
        int rawEggPerWeightGr = 70;
        int totalRawEggsWeightGr = rawEggs * rawEggPerWeightGr;
        int totalWeightAllProducts = totalBananasWeightGr + totalMilkWeightGr + totalIceCreamBriquetteWeightGr + totalRawEggsWeightGr;
        int grPerKg = 1000;
        float weightKg = totalWeightAllProducts / (float)grPerKg;
        System.out.println("Общий вес всех продуктов " + totalWeightAllProducts + " грамм или " + weightKg + " килограмм");

        // Задача 7
        System.out.println("Задача 7");
        int weightLossProgram1Gr = 250;
        int weightLossProgram2Gr = 500;
        int grPerKgV2 = 1000;
        float weightLossProgram1Kg = weightLossProgram1Gr / (float)grPerKgV2;
        float daysWeightLossProgram1 = 7 / weightLossProgram1Kg;
        System.out.println("При условии потери " + weightLossProgram1Kg + " килограмм в день, спортсмену понадобиться " + (int)daysWeightLossProgram1 + " дней, чтобы похудеть на 7 килограмм");
        float weightLossProgram2Kg = weightLossProgram2Gr / (float)grPerKgV2;
        float daysWeightLossProgram2 = 7 / weightLossProgram2Kg;
        System.out.println("При условии потери " + weightLossProgram2Kg + " килограмм в день, спортсмену понадобиться " + (int)daysWeightLossProgram2 + " дней, чтобы похудеть на 7 килограмм");
        float averageDays = (daysWeightLossProgram1 + daysWeightLossProgram2) / 2;
        System.out.println("В среднем, может понадобиться " + (int)averageDays + " день, чтобы спортсмен похудел на 7 килограмм");

        // Задача 8
        System.out.println("Задача 8");
        int salaryEmployee1 = 67760;
        int salaryEmployee2 = 83690;
        int salaryEmployee3 = 76230;
        int tenPercentSalaryEmployee1 = (salaryEmployee1 * 10) / 100;
        int newSalaryEmployee1 = salaryEmployee1 + tenPercentSalaryEmployee1;
        int tenPercentSalaryEmployee2 = (salaryEmployee2 * 10) / 100;
        int newSalaryEmployee2 = salaryEmployee2 + tenPercentSalaryEmployee2;
        int tenPercentSalaryEmployee3 = (salaryEmployee3 * 10) / 100;
        int newSalaryEmployee3= salaryEmployee3 + tenPercentSalaryEmployee3;
        int oldAnnualSalaryEmployee1 = salaryEmployee1 * 12;
        int newAnnualSalaryEmployee1 = newSalaryEmployee1 * 12;
        int oldAnnualSalaryEmployee2 = salaryEmployee2 * 12;
        int newAnnualSalaryEmployee2 = newSalaryEmployee2 * 12;
        int oldAnnualSalaryEmployee3 = salaryEmployee3 * 12;
        int newAnnualSalaryEmployee3 = newSalaryEmployee3 * 12;
        System.out.println("Маша теперь получает " + newSalaryEmployee1 + " рублей. Годовой доход вырос на " + (newAnnualSalaryEmployee1 - oldAnnualSalaryEmployee1) + " рублей");
        System.out.println("Денис теперь получает " + newSalaryEmployee2 + " рублей. Годовой доход вырос на " + (newAnnualSalaryEmployee2 - oldAnnualSalaryEmployee2) + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryEmployee3 + " рублей. Годовой доход вырос на " + (newAnnualSalaryEmployee3 - oldAnnualSalaryEmployee3) + " рублей");
        }
    }
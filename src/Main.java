public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int toTheBank = 15000;
        int savings = 0;
        int month = 0;
        while (savings < 2_459_000) {
            savings = savings + toTheBank;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + savings);
        }
        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(" " + start);
            start++;
        }
        System.out.println();
        for (start = 10; start >= 1; start--) {
            System.out.print(" " + start);
        }
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            int birth = population / 1000 * 17;
            int death = population / 1000 * 8;
            population = population + birth - death;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        int initialContribution = 0;
        int deposit = 15000;
        double percent = 1.07;
        int amount = 0;
        while (initialContribution <= 12_000_000) {
            initialContribution = (int) (initialContribution * percent + deposit);
            amount++;
            System.out.println("Месяц " + amount + " сумма накоплений равна " + initialContribution);
        }
        System.out.println("Задача 5");
        int iC = 0;
        int d = 15000;
        double per = 1.07;
        int am = 0;
        while (iC <= 12_000_000) {
            iC = (int) (iC * per + d);
            am++;
            if (am % 6 == 0) {
                System.out.println("Месяц " + am + " сумма накоплений равна " + iC);
            }
        }
        System.out.println("Задача 6");
        int age = 0;
        int blank = 0;
        int contribution = 15000;
        double accrual = 1.07;
        while (age <= 108) {
            blank = (int) (blank * accrual + contribution);
            age++;
            if (age % 6 == 0) {
                System.out.println("Месяц " + age + " сумма накоплений равна " + blank);
            }
        }
        System.out.println("Задача 7");
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + ". Необходимо подготовить отчет");
            friday += 7;
        }
        System.out.println("Задача 8");
        int comet = 1896;
        do {
            System.out.println("Комета пролетает " + comet);
            comet += 79;
        }
        while (comet <= 2100);
    }
}



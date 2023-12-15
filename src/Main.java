public class Main {
    public static void main(String[] args) {
        //Task 1
        int age = 17;
        if (age >= 18) {System.out.println("Если возраст человека равен "+age+" то он совершеннолетний");}
        else {System.out.println("Если возраст человека равен "+age+" то он не достиг совершеннолетия, нужно немного подождать");}

        //Task 2
        int temperature = 2;
        if (temperature < 5) {System.out.println("На улице холодно, нужно надеть шапку.");}
        if (temperature >= 5) {System.out.println("Сегодня тепло, можно идти без шапки.");}

        //Task 3
        int speed = 70;
        if (speed > 60) {System.out.println("Если скорость "+speed+", то придется заплатить штраф.");}
        if (speed <= 60) {System.out.println("Если скорость "+speed+", то можно ездить спокойно.");}

        //Task 4
        int age4 = 10;
        if (age4 >=2 && age4 <=6) {System.out.println("Если возраст человека равен "+age4+", то ему нужно ходить в детский сад.");}
        else if (age4 >=7 && age4 <=17) {System.out.println("Если возраст человека равен "+age4+", то ему нужно ходить в школу.");}
        else if (age4 >=18 && age4 <=24) {System.out.println("Если возраст человека равен "+age4+", то его место в университете.");}
        else if (age4 >24) {System.out.println("Если возраст человека равен "+age4+", то ему пора ходить на работу.");}

    }
}
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

    }
}
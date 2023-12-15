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

        //Task 5
        int age5 = 16;
        if (age5 < 5) {System.out.println("Если возраст ребенка равен "+age5+", то он не может кататься на аттракционе.");}
        else if (age5 >=5 && age5 <= 14) {System.out.println("Если возраст ребенка равен "+age5+", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");}
        else if (age5 > 14) {System.out.println("Если возраст ребенка равен "+age5+", то он может кататься без сопровождения взрослого.");}

        //Task 6
        int people = 102;
        int capacityCar = 102;
        int seatPlace = 60 - people;
        int standingPlace = capacityCar - people;
        int peopleOutside = people - capacityCar;
        if (people >= 60 && people < 102) {System.out.println("Если человек "+people+", то в вагоне остается 0 сидячих мест(а) и "+standingPlace+" стоячих мест(а).");}
        else if (people > 0 && people < 60) {System.out.println("Если человек "+people+", то в вагоне остается "+seatPlace+" сидячих мест(а) и "+(capacityCar-60)+" стоячих мест(а).");}
        else if (people >= 102) {System.out.println("Если человек "+people+", то в вагоне мест нет, он полностью забит. Людей которых осталось вне вагона - "+peopleOutside);}

    }
}
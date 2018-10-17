package house;

public class dog{

    public String name;   // кличка
    public int weight; // вес (граммы)
    public double age;    // возраст (дни!!!)
    // добавить конструктор и методы, указанные выше

    public dog(String name, int weight, double age ) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void eat(int foodForDog){
        weight += ( 0.1  *  foodForDog );
        age++;
    }

    @Override
    public String toString(){
       return  name + " is a dog. \nIt's weight is " + (weight/1000) + " kg.\nAnd it is " +
               (age/365) + " year(s) old.\n";
    }
}


/* year = number_of_days / 365;
         week = (number_of_days % 365) /
         DAYS_IN_WEEK;
         days = (number_of_days % 365) %
         DAYS_IN_WEEK; */
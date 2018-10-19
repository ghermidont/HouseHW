package house;

public class dog{

    public String name;   // кличка
    public double weight; // вес (граммы)
    public double dogAge;    // возраст (дни!!!)
    int day = 0;
    // добавить конструктор и методы, указанные выше

    public dog(String name, double weight, double dogAge ) {
        this.name = name;
        this.weight = weight;
        this.dogAge = dogAge;
    }

    public void eat(int foodForDog){
        weight += foodForDog * 1 / 100;
        dogAge++;
        day++;

    }

    @Override
    public String toString(){
       return  name + " is a dog. \nIt's weight is " + ( weight / 1000 ) + " kg.\nAnd it is " +
               String.format("%.1f", dogAge/365) + " year(s) old.\n";
    }
}



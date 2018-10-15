package house;

public class dog {

    public String name;   // кличка
    public int    weight; // вес (граммы)
    public double    age;    // возраст (дни!!!)
    // добавить конструктор и методы, указанные выше

    public dog(String name, int weight, double age ) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString(){

                return  name + " is a dog. \nIt weight is " + weight + " kg.\n And it is " +
                age + "year(s) old.\n";

    }
}

package house;

public class owner{
    public String fullname;   // кличка
    public int food; // вес (граммы)
    public int age;    // возраст (дни!!!)

    public owner(String name, int foodReserve, int age ) {
        this.fullname = name;
        this.food = foodReserve;
        this.age = age;
    }

    public int getFood(int foodForDog){
      do {
        food =- foodForDog;
      }while( food > 80 );
        age++;
        return food;
    }

    @Override
    public String toString(){
        return  fullname + " is the owner. \nFood left: " + (food/1000) + " kg.\nAnd it is " + (age/365) + " year(s) old.\n";
    }
}

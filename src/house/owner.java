package house;

public class owner{
    public String fullname;   // кличка
    public double food; // вес (граммы)
    public int ownerAge;    // возраст (дни!!!)

    public owner(String name, double foodReserve, int age ) {
        this.fullname = name;
        this.food = foodReserve;
        this.ownerAge = age;
    }

    public int getFood(int foodForDog){
        food -= foodForDog;
        ownerAge++;
        return foodForDog;
    }

    @Override
    public String toString(){
        return  fullname + " is the owner. \nFood left: " + ( food / 1000 ) +
                " kg.\nAnd it is " + ( ownerAge / 365 ) + " year(s) old.\n";
    }
}

package house;

public class Main {
    public static void main(String[] args) {

        dog Dog = new dog("Pitrushka", 1000*1, 365*1.6);
        owner Owner = new owner("Ion Petru", 1000*80, 365*20);

        while ( Owner.food!= 0 ) {

            Dog.eat( Owner.getFood(200) );
            System.out.println( Owner );
            System.out.println( Dog );

            if( Owner.food == 0 ){

                double dogWtIncr = Dog.weight - ( 1000 * 1 );

                System.out.println( "#################################\nThe food was enough to feed the dog for: " +
                        Dog.day + " days.\n" + "The dog's weight increased by: " + dogWtIncr / 1000 + " g.\n" +
                        "The current ages of the Owner's and the Dog's are " + Owner.ownerAge / 365 +
                        " and " + String.format("%.1f", Dog.dogAge / 365 ) + " years old." );
            }
        }
    }
}


   /*   1. на какое количество дней хватит еды щенку?
        2. на сколько килограммов увеличился вес щенка после окончания периода кормления?
        3. сколько полных лет будет (целое число!!!) владельцу и щенку в конце периода кормления?

        ! правильным результатом для изложенных выше условий было бы:
        400 дней
        0.8kg
        21 и 3 года соответственно*/

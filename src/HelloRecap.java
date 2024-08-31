public class HelloRecap {

    public static void main(String[] args) {

        Person person1 = new Person("John", "Doe", "id0001");
        Food pasta = new Food("pasta");
        System.out.println(person1);
        System.out.println(person1.getDOCUMENT_ID());


        System.out.println("The first person name is: "
                + person1.getFirstName());

        person1.eat(pasta);

        SuperHero superHero = new SuperHero("Clark",
                "Kent",
                "id002",
                "super strength");
        System.out.println(superHero.getFirstName());
        System.out.println(superHero.getSuperPower());

        superHero.eat(pasta);

        feed(person1, pasta);
        feed(superHero, pasta);


    }

    static void feed(Person person, Food food) {
        System.out.println(person);
        System.out.println(food.getName());
        person.eat(food);
    }

}

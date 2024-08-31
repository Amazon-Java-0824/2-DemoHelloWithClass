public class Person {

    private String firstName;
    private String lastName;
    private final String DOCUMENT_ID;

    public void eat(Food food) {
        System.out.println("Eating " + food.getName() + "...");
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDOCUMENT_ID() {
        return DOCUMENT_ID.toUpperCase();
    }


    public Person(String firstName, String lastName, String documentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        DOCUMENT_ID = documentId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

public class Food {
    private String name;
    private int price;
    private int caloriesFor100grams;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCaloriesFor100grams() {
        return caloriesFor100grams;
    }

    public void setCaloriesFor100grams(int caloriesFor100grams) {
        this.caloriesFor100grams = caloriesFor100grams;
    }

    public Food(String name) {
        this.name = name;
    }
}

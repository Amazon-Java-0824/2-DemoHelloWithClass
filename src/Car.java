public class Car {
     private String model;
     private int yearOfProduction;

     public void turnOnRadio(){
          System.out.println("Turning on radio on my " + model);
          findingRadioStation();
          System.out.println("Na nana anan anan na");
     }

     private void findingRadioStation(){
          System.out.println("Finding radio station");
     }

     public Car(String model, int yearOfProduction){
          this.model = model;
          this.yearOfProduction = yearOfProduction;
     }

     public Car(){}

     @Override
     public String toString() {
          return "Car{" +
                  "model='" + model + '\'' +
                  ", yearOfProduction=" + yearOfProduction +
                  '}';
     }

     public String getModel(){
          return model;
     }

     public int getYearOfProduction(){
          return yearOfProduction;
     }

     public void setModel(String model){
          this.model = model;
     }

     public void setYearOfProduction(int yearOfProduction){
          this.yearOfProduction = yearOfProduction;
     }


}

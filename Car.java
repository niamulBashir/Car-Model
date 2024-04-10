import java.util.Scanner;

class CarClass{
    private String make;
    private String model;
    private int year;
    
   
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    
}

public class Car {
    public static void main(String a[])
    {
  
    CarClass str1 = new CarClass();
    System.out.println("Please Enter Country Name : ");
    Scanner scana = new Scanner(System.in);
    String  country =  scana.next();

    System.out.println("Please Enter model : ");
    Scanner scanb = new Scanner(System.in);
    String  model =  scana.next();
    System.out.println("Please Enter year : ");
    Scanner scanc = new Scanner(System.in);
    int  year = scanc.nextInt();
    str1.setMake(country);
    str1.setModel(model);
    str1.setYear(year);
    System.out.println("Made in :" +str1.getMake() + 
    " Model is : " + str1.getModel() + 
    " Made in The Year of :" +str1.getYear() );
    }
}
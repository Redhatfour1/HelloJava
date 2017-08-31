public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    String firstName = "Louis";
    String middleName = "Warren";
    String lastName = "Haywood";
    String sex = "Male";
    String eyeColor = "Brown";
    Integer heightInInches = 70;
    Integer weightInPounds = 210;

    System.out.println("Name: " + firstName + " " + middleName + " " + lastName + " " + " , Sex: " + sex + " , Eye Color: " + eyeColor + " , Height in inches: " + heightInInches + " , Weight in pounds: " + weightInPounds);

    String reverse = new StringBuffer(firstName).reverse().toString();
    System.out.println(reverse);

    HelloWorld.place("State");
    }
    public static String place(String place) {
      String state = "Washington";
      System.out.println(state);
      return state;
  }
}

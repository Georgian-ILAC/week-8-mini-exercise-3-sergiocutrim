import static java.lang.String.format;

public class Employee extends Person {
  private int id;
  private double hourlyPay;

  public Employee(String firstName, String lastName, int id, double hourlyPay) {
    super(firstName, lastName); //declared the super
    this.id=id;
    this.hourlyPay=hourlyPay;
  }

  public double getRaise(){ //new method to increase the hourly pay by 15%
    hourlyPay *= 1.15;
    return hourlyPay; //return the new hourly pay
  }

  public double payDay(int hoursWorked) { //new method to calculate how employee earned this week
    double totalPay = 0.0;
    if (hoursWorked<=40){
      totalPay=hoursWorked*hourlyPay;
    } else {
      totalPay=(40*hourlyPay) + ((hoursWorked-40)*hourlyPay);
    }
    return totalPay;

  }

  //@Override
  //public String toString() {
  //  String personInfo = String.format("Name: %s %s\n", getFirstName(), getLastName());
  //  String heightInfo = String.format("They are %.1f'%d\"\n", getHeight(), (int) ((getHeight() - (int) getHeight()) * 12));
  //  String payInfo = String.format("They make $%.2f\n", getHourlyPay());
  //  String idInfo = String.format("They have the employee ID %d\n", getId());
  //  return personInfo + heightInfo + payInfo + idInfo;
 // }


  //had to include a new method in person to use the Super.
  // I personally think it was easier to do the way it is above with the gets, but as a part of exercise I did both
  @Override
  public String toString() {
           return "Name: "+ super.toString() + "\n"+
                   "They are: " +getHeight()+ " inches" + "\n"+
                   "They make:$ " + hourlyPay + "\n" +
                   "They have the employee ID: "+ id+ "\n";
  }







  //creating getters and setters for Id and Hourly Pay created as private
  public int getId(){
    return id;
  }
  public void setId(int id){
    this.id = id;
  }
  public double getHourlyPay(){
    return hourlyPay;
  }
  public void setHourlyPay(double hourlyPay){
    this.hourlyPay=hourlyPay;
  }



  }


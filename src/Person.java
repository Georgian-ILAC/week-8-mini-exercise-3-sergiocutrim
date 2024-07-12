public class Person {
    private  String firstName;
    private  String lastName;
    private double height;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {  //included to use the override in the employee with the super
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHeight(){
        return height;
    }  //changed to public so it can be accessed outside

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setHeight(double height){
        this.height=height;
    } //changed to public so it can be accessed outside

}
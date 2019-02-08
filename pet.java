
/**
 * Write a description of class pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pet
{
    // instance variables - replace the example below with your own
    private int age;
    private String petName;

    /**
     * Constructor for objects of class pet
     */
    public Pet()
    {
        // initialise instance variables
        this.petName = "contigo";
        this.age = 10;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printMethod()
    {
        // put your code here
        System.out.println("my dog name is "+ this.petName + " and his age is " + this.age );
    }
}

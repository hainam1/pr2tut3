package tutorial3;

public class activity3 {
    //private variable
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    //constructor
    public activity3(int num, String fname, String lname, int sal){
        this.id=num;
        this.firstName=fname;
        this.lastName=lname;
        this.salary=sal;
    }
    //method
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName+lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int sa){
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        return salary*percent/100;
    }
    public String toString() {
        return "Employee[id=" + id + ", name=" + firstName + lastName +", salary="+salary+"]";
    }
    void display(){
        System.out.println(getId());
        System.out.println(getFirstName());
        System.out.println(getLastName());
        System.out.println(getName());
        System.out.println(getSalary());
        System.out.println(getAnnualSalary());
        System.out.println(raiseSalary(10));
    }
    public static void main(String[] args) {
        activity3 c1 =new activity3(2, "hai", "nam", 100);
        c1.display();
    }

}

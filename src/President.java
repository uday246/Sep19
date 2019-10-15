public class President {
    private String name;
    private double salary;
   
    public President(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
   
    public void setName(String name)
    {
        this.name = name;
    }
   
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
   
    public String getName()
    {
        return this.name;
    }
   
    public double getSalary()
    {
        return this.salary;
    }
   
    public String toString()
    {
        return this.name;
    }
}
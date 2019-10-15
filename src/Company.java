public class Company {
    private String name;
    private President prez;
   
    public Company(String name, President prez)
    {
        this.name = name;
        this.prez = new President(prez.getName(), prez.getSalary());
    }
   
    public void setName(String name)
    {
        this.name = name;
    }
   
    public void setPresident(President prez)
    {
        this.prez = new President(prez.getName(), prez.getSalary());
    }
   
    public String getName()
    {
        return this.name;
    }
   
    public President getPresident()
    {
        return new President(this.prez.getName(), this.prez.getSalary());
    }
    public String toString(){
    	return name+" is run by "+prez.getName();
    }
}
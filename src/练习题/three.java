package 练习题;

public class three
{
    public static void main(String[] args)
    {
        student wdnmd=new student("邱",201711002);
        System.out.println("name={ "+wdnmd.getName()+" },id=[ "+wdnmd.getId()+" }");
    }
}
class student
{
    private String name;
    private int id;
    public student(String n,int i)
    {
        this.name=n;
        this.id=i;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
}
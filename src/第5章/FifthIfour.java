package 第5章;

public class FifthIfour
{
    public static  void main(String[] args)
    {
        var people =new Person[2];
        people[0]=new Employee1("Harry",5000,1989,10,1);
        people[1]=new Student("Maria","computer science");
        for(Person p:people)
            System.out.println(p.getName()+","+p.getDescription());
    }
}

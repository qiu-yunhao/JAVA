package 练习题;
import java.util.Scanner;
public class six
{

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("账户id：");
        String n1=input.nextLine();
        System.out.println("密码是：");
        String n2=input.nextLine();
        System.out.println("邮箱是：");
        String n3=input.nextLine();
        var fuck = new user(n1, n2);
        System.out.println("ID:{ " + fuck.getId() + " },password=[ " + fuck.getPassword() + " ],email:" + fuck.getEmail());
    }
}
class user {
    private String id;
    private String password;
    private String email;

    public user(String i, String p, String e) {
        this.id = i;
        this.password = p;
        this.email = e;
    }

    public user(String i, String p) {
        this.id = i;
        this.password = p;
        this.email = getId() + "@qq.com";
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail()
    {
        String f="@qq.com";
        if(email==null)
            return id+f;
        else
        return email;
    }
}
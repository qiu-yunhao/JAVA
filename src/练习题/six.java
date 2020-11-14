package 练习题;

public class six
{

    public static void main(String[] args)
    {
        var fuck=new user("2020","666","50");
        System.out.println("ID:{ "+fuck.getId()+"},password=["+fuck.getPassword()+"],email:"+fuck.getEmail());
    }
}
class user
{
    private String id;
    private String password;
    private String email;
    public user(String i,String p,String e)
    {
        this.id=i;
        this.password=p;
        this.email=e;
    }
    public user(String i,String p)
    {
        this.id=i;
        this.password=p;
    }

    public String getId() {
        return id;
    }
    public String getPassword()
    {
        return password;
    }
    public String getEmail()
    {
        char f='@';
        String g="qq.com";
        if(email==null)
            return getId()+f+g;
        else
            return email;
    }
}
package 第6章;
import java.lang.reflect.*;
import java.util.*;
public class SixthIten
{
    public static void main(String[] args)
    {
        var element = new Object[1000];
        for(int i=0;i<element.length;i++)
        {
            Integer value = i+1;
            var handler = new TraceHandler(value);
            Object proxy=Proxy.newProxyInstance(
                    ClassLoader.getSystemClassLoader(),
                    new Class[]{Comparable.class},handler);
            element[i]=proxy;
        }
        Integer key=new Random().nextInt(element.length)+1;
        int result = Arrays.binarySearch(element,key);
        if(result>=0)
            System.out.println(element[result]);
    }
}
class TraceHandler implements InvocationHandler
{
    private Integer target;
    public TraceHandler(Integer t)
    {
        target=t;
    }
    public Object invoke(Objects proxy,Method m,Objects[] args)throws Throwable
    {
        System.out.print(target);
        System.out.print("."+m.getName()+"(");
        if(args!=null)
        {
            for(int i=0;i<args.length;i++)
            {
                System.out.print(args[i]);
                if(i<args.length-1)
                    System.out.print(",");
            }
        }
        System.out.println(")");
        return m.invoke(target,args);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}

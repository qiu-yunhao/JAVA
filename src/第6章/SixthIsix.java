package 第6章;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
public class SixthIsix
{
    public static void main(String[] args)
    {
        var planets=new String[]{"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets,(first,second)->first.length()-second.length());
        var time=new Timer(1000,event->System.out.println("the time is"+new Date()));
        time.start();
        JOptionPane.showMessageDialog(null,"结束？");
        System.exit(0);
    }
}

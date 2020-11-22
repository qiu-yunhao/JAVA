package 第6章;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;
public class SixthIseven
{
    public static void main(String[] args)
    {
        var clock=new TalkingClock(1000,true);
        clock.start();
        JOptionPane.showMessageDialog(null,"结束？");
        System.exit(0);
    }
}
class  TalkingClock
{
    private int interval;
    private boolean beep;
    public TalkingClock(int interval,boolean beep)
    {
        this.interval=interval;
        this.beep=beep;
    }
    public void start()
    {
        var listen=new TimePrinter1();
        var time=new Timer(interval,listen);
        time.start();
    }
    public class  TimePrinter1 implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {
            System.out.println("At the tone,the time is ["+Instant.ofEpochMilli(event.getWhen())+"]");
            if(beep)
                Toolkit.getDefaultToolkit().beep();
        }
    }
}

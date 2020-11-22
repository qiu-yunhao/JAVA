package 第6章;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;
public class sixthIthree
{
    public static void main(String[] args)
    {
        TimePrinter listener=new TimePrinter();
        Timer timer=new Timer(10000,listener);
        timer.start();

        JOptionPane.showMessageDialog(null,"结束？");
        System.exit(0);
    }
}
class TimePrinter implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("At the tone,this time is"+Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}


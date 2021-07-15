package 第6章;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;

public class SixthIeight {
    public static void main(String[] args) {
        var clock = new TalkingClock2();
        clock.start(1000, true);
        JOptionPane.showMessageDialog(null, "结束？");
        System.exit(0);
    }
}

class TalkingClock2 {
    public void start(int interval, boolean beep) {
        var listen = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("at the tone,the time is " + Instant.ofEpochMilli(event.getWhen()));
                if (beep)
                    Toolkit.getDefaultToolkit().beep();
            }
        };
        var time = new Timer(interval, listen);
        time.start();
    }
}
package 练习题.题16;

public class thriteen {
}

interface Vehicle2 {
    public void run();

    public void stop();
}

class interfaceDemo {
    public static void main(String[] args) {
        var b1 = new Bike();
        var b2 = new Bus();
        b1.run();
        b1.stop();
        b2.run();
        b2.stop();
    }
}

class Bike implements Vehicle2 {
    public void run() {
        System.out.println("我已经在跑了！");
    }

    public void stop() {
        System.out.println("跑不动了！");
    }
}

class Bus implements Vehicle2 {
    public void run() {
        System.out.println("我已经在跑了！");
    }

    public void stop() {
        System.out.println("跑不动了！");
    }
}

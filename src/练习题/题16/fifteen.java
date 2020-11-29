package 练习题.题16;

public class fifteen {
    public static void main(String[] args) {
        Door[] d = new Door[3];
        d[0] = new Door1();
        d[1] = new Door2();
        d[2] = new Door3();
        for (Door q : d) {
            q.closedoor();
            q.opendoor();
            q.special();
        }
    }
}

interface Gong {
    public void opendoor();

    public void closedoor();
}

abstract class Door implements Gong {
    public void opendoor() {
        System.out.println("开门！");
    }

    public void closedoor() {
        System.out.println("关门");
    }

    public abstract void special();
}

class Door1 extends Door {
    public void special() {
        System.out.println("防盗");
    }
}

class Door2 extends Door {
    public void special() {
        System.out.print("防水");
    }
}

class Door3 extends Door {
    public void special() {
        System.out.print("防弹");
    }
}
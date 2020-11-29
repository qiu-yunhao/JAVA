package 练习题.题16;

public class sixteen {
    public static void main(String[] args) {
        纯净水1 n1 = new 纯净水1();
        n1.water();
        n1.过滤();
        n1.缓冲();
        纯净水2 n2 = new 纯净水2();
        n2.water();
        n2.缓冲();
        纯净水3 n3 = new 纯净水3();
        n3.water();
        n3.过滤();

    }
    /*能否使用数组形式引用接口中的方法
    * water [] w = new water[1];
    * w[0] = new 纯净水1
    * (   w[0].过滤()  )如何实现？*/
}

interface 过滤 {
    public void 过滤();
}

interface 缓冲 {
    public void 缓冲();
}

interface 加热 {
    public void 加热();
}

interface 放糖 {
    public void 放糖();
}

abstract class water {
    public abstract void water();

}

class 纯净水1 extends water implements 过滤, 缓冲 {
    public void water() {
        System.out.println("从某个不知名的地方打水");
    }

    public void 过滤() {
        System.out.println("进行过滤处理");
    }

    public void 缓冲() {
        System.out.println("进行缓冲处理");
    }
}

class 纯净水2 extends water implements 缓冲 {
    @Override
    public void water() {
        System.out.println("从某个不知名的地方打水");
    }

    public void 缓冲() {
        System.out.println("进行缓冲处理");
    }
}

class 纯净水3 extends water implements 过滤 {
    @Override
    public void water() {
        System.out.println("从某个不知名的地方打水");
    }

    @Override
    public void 过滤() {

    }
}

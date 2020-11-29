package 练习题.题16;

public class four
{
    public static void main(String[] args)
    {
        var Fen = new WuMingFen[3];
        Fen[0] = new WuMingFen("牛肉", 2, true);
        Fen[0].check();
        Fen[1] = new WuMingFen("牛肉", 2);
        Fen[2] = new WuMingFen();
        System.out.println();
        for(WuMingFen e:Fen)
        {
            System.out.println("面类={ "+e.getMianma()+" },份量=["+e.getQuantity()+"]");
        }
    }
}

    class WuMingFen
    {
        private String Mianma;//面码
        private int quantity;//质量
        private boolean likeSoup;

        public WuMingFen(String M, int q, boolean t) {
            this.Mianma = M;
            this.quantity = q;
            this.likeSoup = t;
            if (q == 2 && t == true)
            {
                this.Mianma = "酸辣";
            }
        }


        public WuMingFen(String M, int q)
            {
            this.Mianma = M;
            this.quantity = q;
            }

        public WuMingFen() {

        }

        public String getMianma() {
            return Mianma;
        }

        public int getQuantity() {
            return quantity;
        }

        public boolean isLikeSoup() {
            return likeSoup;
        }

        public void check()
        {
            System.out.println("面类：{ " + getMianma() + " }，份量=【 " + getQuantity() + " ]是否有汤：" + isLikeSoup());
        }
    }


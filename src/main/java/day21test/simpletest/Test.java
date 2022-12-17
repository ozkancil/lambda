package day21test.simpletest;

 class Test {
    String name;
    String size;
    double price;
    Test(String name,String size,double price){
        this.name=name;
        this.size=size;
        this.price=price;

    }
}
    class Ready extends Test{
        String color;
        Ready(String name,String size, double price,String color){
            super(name,size,price);
            this.color=color;

        }
        void m(String space){
            System.out.println(color+space+name+space+size+space+price);
        }
    }

    class Execute{
        public static void main(String[] args) {


            Ready r = new Ready("Puma", "10.5", 45.55, "Red");
            System.out.println(r.name);
            System.out.println(r.size);
            System.out.println(r.price);
            System.out.println(r.color);
            r.m(" ");
        }
    }


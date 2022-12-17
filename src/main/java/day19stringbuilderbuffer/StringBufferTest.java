package day19stringbuilderbuffer;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer bf= new StringBuffer("Ozkna");
        bf.append("Cil");

        //If i want to make a new container for bf i do
       bf=new StringBuffer("yavuz");//this erased ozkan and added yavuz
        //we cant just do
        //bf="John";. For stringBuilders and StringBuffers we must create
        //StringBuilders or StringBuffers


        //to constatnly add we do .append
        bf.append("Hasan");
        bf.append("jack");
        System.out.println(bf);

        //Another way we can build a StringBuilder or StringBuffer is
        StringBuilder s=new StringBuilder();
        s.append("meral");
        s.append("cemal");
        //also StringBuffer is multithread, and mutable.
        //StringBuilder is not multi thread and its mutable/

        //we can append chain attach it
        s.append("Luck").append("muck").append("duck").append("knock");

        int cap=s.capacity();
        System.out.println(cap
        );
        int length=s.length();
        System.out.println(length);

        //here the capacity will increase because we add more.
        //capacity increases by 2*current capacity, plus 2.
        s.append(".........................");
        System.out.println(s.capacity());
        System.out.println(s.length());


        //we cannot add Strings to StringBuilders or Buffers
        String name="Ozkan";
        StringBuilder c=new StringBuilder("oz");
        //String add=c; To add builder to string we must do toString
        //c.toString();doing this and just writing String add=c; doesnt work
        //We must do String add=c.toString; for it to work
        String add=c.toString();

        String reverse=c.reverse().toString(); //both works like this.
        System.out.println(reverse+" this");
        StringBuilder reverse1=c.reverse();//but cuz i already did reverse if i do it agian her it
        //doesnt give it for some reason.
        System.out.println(reverse1);


        //Here i am creating a whole new String container and not using teh one from the pool
     String name1=new String("Ozkan");
     //name1="Ozk"; because i put this here it does not let me print ozkan but only Ozk.
     System.out.println(name1);

     //to test if we really created another container is we can do is use the == sign to check
     //because this check the container of pool and sees if its in the same pool.
     String name3="Ozkan";
     String name4="Ozkan";
     System.out.println(name3==name4);//Here because its in the same container we get true
     System.out.println(name4==name1);//here because its in a different container we get false. so the container really did change.
     //the benefit of immutability is that if you have a banking system set up the original name cannot be changed so the money will go to the same place as always.

    }
}

package day21inheritancepolymorphism.thismethod;

public class Food {
    String food;
    char size;
    public void setData(String food){
this.food=food;
//this.size=size;
    }
    public String getInfo(){
        return food;

    }
    public char getSize(){
        return size;
    }

    public static void main(String[] args) {
        Food food=new Food();
        food.setData("soup");

       // System.out.println(food.food);
        //System.out.println(food.size);
        System.out.println(food.getSize());
        food.getInfo();
    }
}

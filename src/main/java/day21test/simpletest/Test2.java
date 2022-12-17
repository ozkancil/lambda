package day21test.simpletest;

    class Person{  //class
        int id;
        String name;
        Person(int id,String name){  //constructor
            this.id=id;
            this.name=name;
        }
    }
    class Emp extends Person{
        float salary;
        Emp(int id,String name,float salary){  //constructor

            super(id,name);//reusing parent constructor  by using super();
            this.salary=salary;
        }

        void display(){
            System.out.println(id+" "+name+" "+salary);
        }
    }

    class TestSuper5{
        public static void main(String[] args){
            Emp e1=new Emp(1,"ankit",45000f);
            e1.display();



        }
    }





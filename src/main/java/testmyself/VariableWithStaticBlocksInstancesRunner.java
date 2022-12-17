package testmyself;

/*
STATIC BLOCKS ARE CALLED WHEN WE CALL CONSTRUCTORS.
 */

public class VariableWithStaticBlocksInstancesRunner {

    public static void main(String[] args) {
        VariablesWithStaticBlocksInstances test=new VariablesWithStaticBlocksInstances();
        System.out.println(test.test1);
        System.out.println(test.lastName);
        System.out.println(VariablesWithStaticBlocksInstances.name);
        System.out.println(VariablesWithStaticBlocksInstances.test2);


    }
}

package day04nestedifswitch;

import day20accessmodifiersinheritance.StudentClass;

public class TestRunner01_ForPackage20 {
    public static void main(String[] args) {
        //It has imported day20accessmodifier package
        //only name is visible cuz its public.
        //when you go out side of the class private is no visible
        //You cant see default as well, only open to small group. employees only. u
        //cannot see it outside the package
        //default modifier is called package private cuz when u are outside of the package u cant see it
        //protected one. it means for a group and their childs. TestRunner01 is in a different package so its not the
        //child of this class.

        StudentClass.Name="Oz";


    }
}

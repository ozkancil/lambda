package day30maps;
/*
Every claass is a non primitive also because it has value and methods so it makes it non primitive.
 */
public class Students {
    public String email;
    public int age;
    public int grade;
    public String nationality;

    public Students(String email, int age, int grade, String nationality) {
        this.email = email;
        this.age = age;
        this.grade = grade;
        this.nationality = nationality;


    }

    @Override
    public String toString() {
        return "Student Info{" +
                "email='" + email + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

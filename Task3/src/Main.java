import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> coursesPassedA = new ArrayList<String>(Arrays.asList("Python 101", "Cybersecurity 101"));
        ArrayList<String> coursesPassedB = new ArrayList<String>(Arrays.asList("Linux for beginners", "Fullstack Javascript Development", "Scripting"));
        ArrayList<String> coursesPassedC = new ArrayList<String>(Arrays.asList("Python 101, Cybersecurity 101", "Linux for beginners", "Fullstack Javascript Development", "Scripting"));
        ArrayList<String> coursesPassedD = new ArrayList<String>(Arrays.asList("Python 101", "Linux for beginners", "Fullstack Javascript Development"));


        Person studentA = new Student("Tim", coursesPassedA, new ArrayList<String>());
        Person studentB = new Student("Sara", coursesPassedB, new ArrayList<String>());
        Person studentC = new Student("Robert", coursesPassedC, new ArrayList<String>());
        Person studentD = new Student("Donald", coursesPassedD, new ArrayList<String>());


        ArrayList<String> canTeachA = new ArrayList<String>(Arrays.asList("Python 101", "Cybersecurity 101", "Linux for beginners"));
        ArrayList<String> canTeachB = new ArrayList<String>(Arrays.asList("Fullstack Javascript Development", "Linux for beginners", "Cybersecurity 101", "Python 101"));


        Person teacherA = new Teacher("Simon", canTeachA, new ArrayList<String>());
        Person teacherB = new Teacher("Kamala", canTeachB, new ArrayList<String>());

        ArrayList<Person> persons = new ArrayList<Person>(Arrays.asList(studentA, studentB, studentC, studentD, teacherA, teacherB));

        coursesPassedB.add("Java 1.0");
        coursesPassedC.add("Java 1.0");
        canTeachB.add("Java 1.0");

        for(Person x : persons) {
         boolean hasCourse = x.addCourse("Java 1.0");
         if(hasCourse) {
             if(x instanceof Student) {
                 System.out.println(x.getName() + " har allerede bestået dette kursus.");
             } else if(x instanceof Teacher) {
                 System.out.println(x.getName() + " kan ikke undervise i dette fag");

             }
         }
        }

    }

}

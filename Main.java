import java.util.ArrayList;
import java.util.List;
import java.util.Collections; //для использования стандартной сортировки

public class Main {
    public static void main(String[] args) {
//region Создали студентов и преподавателей
        Student student1 = new Student("sfn1","ssn1","sln1",1);
        Student student2 = new Student("sfn2","ssn2","sln2",2);
        Student student3 = new Student("sfn3","ssn3","sln3",3);
        Student student4 = new Student("sfn4","ssn4","sln4",4);
        Student student5 = new Student("sfn5","ssn5","sln5",5);
        Student student6 = new Student("sfn6","ssn6","sln6",6);
        Teacher teacher1 = new Teacher("tfn1","tsn1","tln1",1);
        Teacher teacher2 = new Teacher("tfn2","tsn2","tln2",2);
        Teacher teacher3 = new Teacher("tfn3","tsn3","tln3",3);
//endregion

//        region создали списки студентов
        List <Student> list1 = new ArrayList<>();
        List <Student> list2 = new ArrayList<>();
        List <Student> list3 = new ArrayList<>();
        list1.add(student4);
        list1.add(student2);
        list2.add(student5);
        list2.add(student3);
        list3.add(student1);
        list3.add(student6);
//        endregion
//        region Создали студ. группы
        StudentGroup studentGroup1 = new StudentGroup(list1, teacher1);
        StudentGroup studentGroup2 = new StudentGroup(list2, teacher2);
        StudentGroup studentGroup3 = new StudentGroup(list3, teacher3);
//endregion
    testIterator(studentGroup1);
    testIterator(studentGroup2);
    testIterator(studentGroup3);

    //region Проверка итерируемости Student
        System.out.println("Проверка вывода");
        for (Student student: studentGroup1) {
            System.out.println(student);

        }
        //endregion

        //region Сортировка с использованием sort из Collections по id после ввода Comparable
        System.out.println("Проверка сортировки из Collection");
        Collections.sort(list1);
        testIterator(studentGroup1);
        //endregion

        System.out.println("Проверка сортировки через Comparator");

        //region Сортировка через StudentComparator
        list2.sort(new StudentComparator());
        testIterator(studentGroup2);
        //endregion
    }

    public static void testIterator(StudentGroup studentGroup){
        StudentGroupIterator groupIterator = new StudentGroupIterator(studentGroup);
        while (groupIterator.hasNext()){
            System.out.println(groupIterator.next());
        }
        groupIterator.zeroCounter(); //Сброс счетчика

        while (groupIterator.hasNext()){
            Student student = groupIterator.next();
            if (student.getStudentId() == 2){
                groupIterator.remove();
            }
        }
        groupIterator.zeroCounter();
        while (groupIterator.hasNext()){
            System.out.println(groupIterator.next());
        }
    }
}
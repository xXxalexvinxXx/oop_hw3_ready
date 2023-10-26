//класс Студент
    public class Student extends User implements Comparable<Student>{
    private int studentId;

    public Student(String firstName, String secondName, String lastName, int studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }
//region переопределяем компаратор
    @Override
    public int compareTo(Student o) {
        //region сравнение по id студента
        if (o.getStudentId() > studentId)
            return -1;
        if (o.getStudentId() < studentId)
            return 1;
        return 0;
        //endregion
        //endregion
    }
}

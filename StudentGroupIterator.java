import java.util.Iterator;
import java.util.List;
//итерируемый класс
public class StudentGroupIterator implements Iterator<Student> {
    private final List<Student> studentList;
    private int counter;

    //    принимаем не studentList а studentGroup т.к. работаем с группой
    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size(); //проверяем на наличие следующего элемента - счетчик < размер списка
    }

    //    region Сброс счетчика
    public void zeroCounter(){
        counter = 0;
    }
    //    endregion
    @Override
    public Student next() {
        if(!hasNext())
            return null;    //если нет следующего элемента - вернуть null
        return studentList.get(counter++); //иначе - вернуть счетчик +1
    }

    @Override
    public void remove() {
        studentList.remove(--counter);
    }
}
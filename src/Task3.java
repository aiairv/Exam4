import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(Student student1 = new Student("Sasha", "B1", "3", 5));
        students.add(Student student2 = new Student("Masha", "C1", "2",4));
        students.add(Student student3 = new Student("Dasha", "B1", "3",2));
        for (int i = 0; i < students.size(); i++) {
            if (students[i].getGrade() >= 3){
                System.out.println("Переводится на следующий курс");

            }
        }
    }
    void printStudents(List<Student> students, int course){

    }
    }


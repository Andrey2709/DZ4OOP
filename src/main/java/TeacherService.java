import java.util.ArrayList;
import java.util.List;

public class TeacherService<T extends Teacher> {

    private  static List<Teacher> teacherList;


    private static List crete() {
        teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Ivan", 210000, 1306544));
        teacherList.add(new Teacher("Natasha", 400000, 12416452));
        teacherList.add(new Teacher("Lexa", 5000000, 5971243));
        return teacherList;
    }

    public void info(){
        System.out.println(this.teacherList);
    }


    public TeacherService() {
        this.teacherList = crete();
    }

    public void addNewTeacher(T t){
        teacherList.add(t);
    }


}

package patterns;

// outside GOF book.
// We have a Controller, View and model.
// Controller perform a control for all the process in MVC.
public class MVCLesson {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.execute();
    }
}

class Student {
    String name = "Max";
    int age = 20;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface ModelLayer {
    Student getStudent();
}

class DBLayer implements ModelLayer{
    @Override
    public Student getStudent() {
        return new Student();
    }
}

class FileSystemLayer implements ModelLayer{
    @Override
    public Student getStudent() {
        return new Student();
    }
}

// class NetworkLayer

interface View {
    void showStudent(Student student);
}


class ConsoleView implements View {
    @Override
    public void showStudent(Student student) {
        System.out.println("Student name: " + student.getName() + " age: " + student.getAge());
    }
}

class HTMLView implements View {
    @Override
    public void showStudent(Student student) {
        System.out.println("<html><body>Student name: " + student.getName() + " age: " + student.getAge());
    }
}
class Controller {


    ModelLayer modelLayer = new FileSystemLayer();
    View view = new ConsoleView();
    void execute(){
        Student student = modelLayer.getStudent();
        view.showStudent(student);

        }
}



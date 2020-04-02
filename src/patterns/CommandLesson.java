package patterns;

public class CommandLesson {
    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        receiver.RunCommand();

    }
}

interface Command{
    void execute();
}

class MouseClick implements Command{
    @Override
    public void execute() {
        System.out.println("click command");
    }
}

class Receiver {
    Command command = new MouseClick();
    void RunCommand(){
        command.execute();
    }
}
package patterns;

public class VisitorLesson {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.doJob(new ConcreteVisitor());
        Animal cat = new Cat();
        cat.doJob(new ConcreteVisitor());
    }
}

interface Animal {
    void doJob(Visitor visitor);
}

class Dog implements Animal {
    @Override
    public void doJob(Visitor visitor) {
        visitor.doDog();
    }
}

class Cat implements Animal {
    @Override
    public void doJob(Visitor visitor) {
        visitor.doCat();
    }

}

interface Visitor{
    void doDog();
    void doCat();
}

class ConcreteVisitor implements Visitor{
    @Override
    public void doDog() {
        System.out.println("Bark!");
    }

    @Override
    public void doCat() {
        System.out.println("Meuw!");
    }
}
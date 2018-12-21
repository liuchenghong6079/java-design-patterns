package designpatterns.memorandum.whitebox;

public class App {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("On");
        System.out.println(originator);

        Caretaker caretaker = new Caretaker();
        caretaker.saveMemneto(originator.createMemento());
        originator.setState("Off");
        System.out.println(originator);

        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println(originator);

    }

}

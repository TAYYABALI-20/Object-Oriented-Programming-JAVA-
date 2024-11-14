package Incapsulation;

abstract class TopicIncapsulationParentClass {
    abstract void topicIncapsulationMethod();
}

class TopicIncapsulationSubClass extends TopicIncapsulationParentClass {
    void topicIncapsulationMethod() {
        System.out.println("This is a topic on encapsulation.");
    }
}

public class TopicIncapsulation {

    public static void main (String[] args) {

        TopicIncapsulationSubClass topicIncapsulationSubClass = new TopicIncapsulationSubClass();
        topicIncapsulationSubClass.topicIncapsulationMethod();

    }
    
}
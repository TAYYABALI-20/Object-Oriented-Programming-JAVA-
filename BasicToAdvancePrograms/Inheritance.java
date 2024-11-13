package BasicToAdvancePrograms;
class Ball {
    String color;
}

class Football extends Ball {
    
}

public class Inheritance {
    public static void main(String args[]) {

        Football football = new Football();

        football.color = "White";

        System.out.println(football.color);

    }

}
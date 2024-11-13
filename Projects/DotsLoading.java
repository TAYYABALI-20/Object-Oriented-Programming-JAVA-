package Projects;

import java.util.concurrent.TimeUnit;

// Class for animating dots
class Authenticator {

    private int dots;

    private long delay;

    public Authenticator(int dots, long delay) {

        this.dots = dots;

        this.delay = delay;

    }

    public void animateDots() {

        for (int i = 1; i <= dots; i++) {

            try {

                StringBuilder animation = new StringBuilder("Authenticating, please wait ");

                for (int j = 0; j < i; j++) {
                    animation.append(".");
                }

                System.out.print("\r" + animation.toString());

                System.out.flush();

                TimeUnit.MILLISECONDS.sleep(delay);

            } catch (InterruptedException e) {

                System.out.println("\nAnimation interrupted!");

                Thread.currentThread().interrupt();

            }

        }

        System.out.println();
    }
}

// Main class
public class DotsLoading {
    public static void main(String[] args) {

        Authenticator auth = new Authenticator(5, 600);

        auth.animateDots();

    }

}
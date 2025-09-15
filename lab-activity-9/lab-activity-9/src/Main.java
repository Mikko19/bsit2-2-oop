import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PetService service = new PetService();

        System.out.println("Basic checkup: $" + service.calculateFee());
        System.out.println("Checkup with vaccination: $" + service.calculateFee(true));
        System.out.println("Full service: $" + service.calculateFee(true, true));
        System.out.println("Emergency: $" + service.calculateFee("urgent"));

        System.out.println("Welcome to the Pet Clinic!");
        System.out.println("============================");

        Pet dog = new TrainableDog("Buddy", 3);
        Pet cat = new Cat("Whiskers", 2);
        Pet bird = new TrainableBird("Tweety", 1);

        dog.displayInfo();
        cat.displayInfo();
        bird.displayInfo();

        System.out.println("\nTraining Session Started!");
        System.out.println("============================");

        Trainable trainableDog = (TrainableDog) dog;
        Trainable trainableBird = (TrainableBird) bird;

        trainableDog.performTrick();
        trainableBird.performTrick();
    }
}

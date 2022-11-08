package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        final int numberOfBalls = 3;
        Ball[] balls = new Ball[numberOfBalls];
        for (int i = 0; i < numberOfBalls; i++) {
            balls[i] = Lottery.getRandomBall();
            System.out.println("Ball #" + (i + 1) + " - " + balls[i].toString());
        }
    }
}

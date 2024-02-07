package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Even {
    public static void playEven() {
        final String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int maxRandomNumber = 100;

        var questions = new String[Engine.GAMES_ROUND_QUANTITY];
        var correctAnswers = new String[Engine.GAMES_ROUND_QUANTITY];

        for (var i = 0; i < Engine.GAMES_ROUND_QUANTITY; i++) {
            Random random = new Random();
            var number = random.nextInt(maxRandomNumber);

            questions[i] = Integer.toString(number);
            correctAnswers[i] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.playGame(rule, questions, correctAnswers);
    }
}

/**

        * File: Culminating

        * Author: Alexander D. Auton

        * Date Created: June 02, 2026

        * Date Last Modified: June --, 2026

        */
       import java.time.format.DateTimeFormatter;
        import java.util.Scanner;
        import java.util.HashMap;
        import javafx.util.Duration;
        import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
        import javafx.application.Application;
        import javafx.geometry.Insets;
        import javafx.scene.Scene;
        import javafx.scene.layout.StackPane;
        import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
        import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
import javafx.scene.control.TextField;

        public class Culminating extends Application {
	@Override
        public void start(Stage campbellyFeud){
                BorderPane root = new BorderPane();

                GridPane grid = new GridPane();
                grid.setGridLinesVisible(true);

                Label primaryStage = new Label("Text");
                TextField name2 = new TextField("Text2");
                Button name3 = new Button("text3");
                Button bBName = new Button();
                grid.add(primaryStage, 0,0,0,0);
                grid.add(name2, 1,1,1,1);

                grid.setHgap(0);
                grid.setVgap(0);

                grid.setPadding(new Insets(3,3,3,3));

                ColumnConstraints column1 = new ColumnConstraints();
                grid.getColumnConstraints().add(column1);

                column1.setPrefWidth(2);

                int HPos = 0;

                GridPane.setHalignment(primaryStage, HPos);
                root.setCenter(grid);
                Scene scene = new Scene(root);
                campbellyFeud.setScene(scene);
                campbellyFeud.setTitle("Campbelly Feud");
                campbellyFeud.show();
                }
                public class CountdownApp extends Application {
    private int secondsRemaining = 30; //Start Time

    @Override
    public void start(Stage primaryStage) {
        Label timerLabel = new Label(String.valueOf(secondsRemaining));
        timerLabel.setFont(new Font("Arial", 45));

        
        Timeline timeline = new Timeline();
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(1), event -> {
            secondsRemaining--;
            timerLabel.setText(String.valueOf(secondsRemaining));

            if (secondsRemaining <= 0) {
                timeline.stop();
                timerLabel.setText("STRIKE");
            }
        });

        timeline.getKeyFrames().add(keyFrame);
        timeline.setCycleCount(secondsRemaining);
        timeline.play(); // Start the countdown

        StackPane root = new StackPane(timerLabel);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.setTitle("JavaFX Countdown");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
PauseTransition pause = new PauseTransition(Duration.seconds(30));
pause.setOnFinished(event -> {
        
});
timeline.setCycleCount(Animation.INDEFINITE);
timeline.play();
    

        public static void main(String[] args) {
                launch(args);
                Scanner in = new Scanner(System.in);
                System.out.println("Input an integer between 1 & 9 (inclusive)");
                HashMap<String, String> question1 = new HashMap<String, String>();
                HashMap<String, String> question2 = new HashMap<String, String>();
                HashMap<String, String> question3 = new HashMap<String, String>();
                HashMap<String, String> question4 = new HashMap<String, String>();
                HashMap<String, String> question5 = new HashMap<String, String>();
                HashMap<String, String> question6 = new HashMap<String, String>();
                HashMap<String, String> question7 = new HashMap<String, String>();
                HashMap<String, String> question8 = new HashMap<String, String>();
                HashMap<String, String> question9 = new HashMap<String, String>();
                
                question1.put("question", "We asked one student, name a superhero without superpowers. ");
                question1.put("answers", "batman 8");
                question1.put("answers", "black widow 7");
                question1.put("answers", "hawkeye 6");
                question1.put("answers", "daredevil 5");
                question1.put("answers", "green arrow 4");
                question1.put("answers", "iron man 3");
                question1.put("answers", "robin 2");
                question1.put("answers", "ant man 1");

                question2.put("question", "We asked 1 student, name a movie that made over 1 billion at the box office. ");
                question2.put("answers", "avatar 8");
                question2.put("answers", "titanic 7");
                question2.put("answers", "the dark knight 6");
                question2.put("answers", "avengers endgame 5");
                question2.put("answers", "jurassic world 4");
                question2.put("answers", "top gun maverick 3");
                question2.put("answers", "aquaman 2");
                question2.put("answers", "joker 1");
                
                question3.put("question", "We asked 1 student, name a school subject that’s universally loved. ");
                question3.put("answers", "computer science 8");
                question3.put("answers", "physical education 7");
                question3.put("answers", "drama 6");
                question3.put("answers", "visual art 5");
                question3.put("answers", "music 4");
                question3.put("answers", "food and nutrition 3");
                question3.put("answers", "co-op 2");
                question3.put("answers", "aquatics 1");
                
                question4.put("question", "We asked 1 student, name a desired vacation city. ");
                question4.put("answers", "venice 8");
                question4.put("answers", "paris 7");
                question4.put("answers", "havana 6");
                question4.put("answers", "tokyo 5");
                question4.put("answers", "stockholm 4");
                question4.put("answers", "rome 3");
                question4.put("answers", "budapest 2");
                question4.put("answers", "las vegas 1");
                
                question5.put("question", "We asked 1 student, name a fictional weapon they’d like to hold. ");
                question5.put("answers", "lightsaber 8");
                question5.put("answers", "mjolnir 7");
                question5.put("answers", "batarang 6");
                question5.put("answers", "master sword 5");
                question5.put("answers", "one ring 4");
                question5.put("answers", "elder wand 3");
                question5.put("answers", "vibranium shield 2");
                question5.put("answers", "diamond sword 1");
                
                question6.put("question", "We asked 1 student: What is the most useless part of the human body. ");
                question6.put("answers", "body fat 8");
                question6.put("answers", "hair 7");
                question6.put("answers", "pinky 6");
                question6.put("answers", "spleen 5");
                question6.put("answers", "ear lobe 4");
                question6.put("answers", "wisdom teeth 3");
                question6.put("answers", "appendix 2");
                question6.put("answers", "tonsils 1");
                
                question7.put("question", "We asked 5 students: What is the most annoying meme? ");
                question7.put("answers", "six seven 8");
                question7.put("answers", "skibidi toilet 7");
                question7.put("answers", "rickroll 6");
                question7.put("answers", "sigma 5");
                question7.put("answers", "ohio 4");
                question7.put("answers", "amogus 3");
                question7.put("answers", "rizz 2");
                question7.put("answers", "nyan cat 1");
                
                question8.put("question", "We asked 1 student: Name a video game that evolved the field of gaming. ");
                question8.put("answers", "doom 8");
                question8.put("answers", "pac man 7");
                question8.put("answers", "super mario bros 6");
                question8.put("answers", "donkey kong 5");
                question8.put("answers", "dark souls 4");
                question8.put("answers", "minecraft 3");
                question8.put("answers", "angry birds 2");
                question8.put("answers", "pong 1");
                
                question9.put("question", "We asked 1 student: Name the most niche superpower you know. ");
                question9.put("answers", "speed reading 8");
                question9.put("answers", "luck 7");
                question9.put("answers", "omniscience 6");
                question9.put("answers", "unbreakable skin 5");
                question9.put("answers", "transmutation 4");
                question9.put("answers", "eidetic memoty 3");
                question9.put("answers", "rewind time 2");
                question9.put("answers", "trigonometric mastery 1");
                HashMap<Integer, HashMap<String, String>> questions = new HashMap<Integer, HashMap<String, String>>();
                questions.put(1, question1);
                int ques;
                while (!(in.hasNextInt() && ((ques = in.nextInt()) >= 1 && ques <= 9))) {
                System.out.println("Invalid input, try again.");      
                in.nextLine();
                }
	
}
        }}

       /*  because idk where to put this now
       when user inputs answer
       check if ans == answer1
       if true, reveal answer & add points to point counter
       if false
         check if ans == answer 2 etc...
        if timer == 0, ans = false
if ans = false, add 1 strike
if strike == 3
"you lose, retry?"
if answer 1 == true, answer 2 == true, answer 3 == true, etc
"congratulations, you win"
*/
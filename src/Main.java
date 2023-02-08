import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        By Shouryam Kumar
//        This program is coded to take custom quizzes when connected with Database
//        Since there is no database connectivity at this point, questions and answers are hardcoded with the
//        help of function ```hardcodeQuestions``` and ```hardcodeOptions```
//        Further advancement of this project can be tracked with the following repository: https://github.com/shouryam-kumar/Java-cli-quiz

        ArrayList <String> questions = new ArrayList<>();
        ArrayList <String> options = new ArrayList<>();
        ArrayList <Integer> correctOptions = new ArrayList<>();
        ArrayList <Integer> scores = new ArrayList<> ();

//        ------------------------------------------------------------------------------------------------------------------
//        hardcoding questions and options
        hardcodeQuestions(questions);
        hardcodeOptions(options, correctOptions);

//        -------------------------------------------------------------------------------------------------------------------


        System.out.println("Welcome to the testing dashboard. Please choose your further steps");
        System.out.println("1 Add Question \n2 Attempt Quiz \n3 View Scores \n4 Leave Dashboard");

        Scanner sc = new Scanner(System.in);

        String preference = sc.nextLine();

        while (Integer.parseInt(preference) < 4) {
            switch(preference) {
                case "1":
                    addQuestion(questions, options, correctOptions);
                    break;
                case "2":
                    attemptQuiz(questions, options, correctOptions, scores);
                    break;
                case "3":
                    viewScores(scores);
                    break;
            }
            System.out.println("Please choose the next step");
            System.out.println("1 Add Question \n2 Attempt Quiz \n3 View Scores \n4 Leave Dashboard");
            preference = sc.nextLine();
        }
    }


//    Method to add questions
    static void addQuestion(ArrayList <String> questions, ArrayList <String> options, ArrayList <Integer> correctOptions) {
        System.out.println("Please enter the question to be added.");

        Scanner sc = new Scanner(System.in);

        String ques = sc.nextLine();
        questions.add(ques);

        int i = 0;
        while(i<=3){
            switch(i){
                case 0:
                    System.out.println("Please enter the first option");
                    String option1 = sc.nextLine();
                    options.add(option1);
                    break;
                case 1:
                    System.out.println("Please enter the second option");
                    String option2 = sc.nextLine();
                    options.add(option2);
                    break;
                case 2:
                    System.out.println("Please enter the third option");
                    String option3 = sc.nextLine();
                    options.add(option3);
                    break;
                case 3:
                    System.out.println("Please enter the fourth option");
                    String option4 = sc.nextLine();
                    options.add(option4);
                    break;
            }


            i++;
        }

        System.out.println("Please enter the correct option number");
        int correctOption = sc.nextInt();
        correctOptions.add(correctOption);



        System.out.println("Do you want to add another question?");
        System.out.println("1 Yes \n2 No \nPlease enter your desired choice");

        String choice = sc.nextLine();

        if(choice == "1") {
            addQuestion(questions, options, correctOptions);
        } else {
            System.out.println("Thank you!");
        }
    }

    static void attemptQuiz(ArrayList <String> questions, ArrayList <String> options, ArrayList <Integer> correctOptions, ArrayList <Integer> scores) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        for(int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i));
            int choice = 0;
            while(choice <= 3) {
                System.out.println(choice+1 + " " + options.get(i * 4 + choice));
                choice++;
            }

            System.out.println("Please choose the correct option");
            int answer = sc.nextInt();
            if(answer == correctOptions.get(i)){
                score+=10;
                System.out.println("Congratulations! Your answer is absolutely correct!");
            } else{
                System.out.println("Sorry, wrong answer!");
            }

        }

        System.out.println("------------------------------YOUR RESULT---------------------------------------");
        System.out.print("MARKS\t\t\t\t\t\t\t\tPercentage\n");
        System.out.println("--------------------------------------------------------------------------------");
        if(score==0) {
            System.out.println(score + " out of 10\t\t\t\t\t\t\t" + score+ "%");
        } else{
            System.out.println(score + " out of 10\t\t\t\t\t\t" + score+ "%");
        }



        scores.add(score);
    }

    static void viewScores(ArrayList <Integer> scores) {
        System.out.println("------------------------------YOUR RESULT---------------------------------------");
        System.out.print("MARKS\t\t\t\t\t\t\t\tPercentage\n");
        System.out.println("--------------------------------------------------------------------------------");
        for (int score:
             scores) {
            if(score==0) {
                System.out.println(score + " out of 10\t\t\t\t\t\t\t" + score+ "%");
            } else{
                System.out.println(score + " out of 10\t\t\t\t\t\t" + score+ "%");
            }
        }
    }

    static void hardcodeQuestions(ArrayList<String> questions) {
//        question1
        questions.add("1.Who invented Java?");

//        question 2
        questions.add("2.Which language is mother of Java?");


//        question 3
        questions.add("3.When was Java invented?");


//        question 4
        questions.add("4.how many data types in java?");
        questions.add("5.What was java early called when invented?");
        questions.add("6.Who invented Java?");
        questions.add("7.Which language is mother of Java?");
        questions.add("8.When was Java invented?");
        questions.add("9.how many data types in java?");
        questions.add("10.What was java early called when invented?");
    }

    static void hardcodeOptions(ArrayList<String> options, ArrayList<Integer> correctOptions) {
//        question 1
        options.add("Robert Downey Junior");
        options.add("James Gosling");
        options.add("Shouryam");
        options.add("Kamlesh");
        correctOptions.add(2);

//        question 2
        options.add("C");
        options.add("JS");
        options.add("C++");
        options.add("HTML");
        correctOptions.add(1);

//        question 3
        options.add("2023");
        options.add("2002");
        options.add("1995");
        options.add("1990");
        correctOptions.add(3);

//        question 4
        options.add("No Data type");
        options.add("10");
        options.add("6");
        options.add("8");
        correctOptions.add(4);

//        question 5/
        options.add("QAK");
        options.add("SOCKS");
        options.add("PALM");
        options.add("JIVA");
        correctOptions.add(1);

//        question 6
        options.add("Robert Downey Junior");
        options.add("James Gosling");
        options.add("Shouryam");
        options.add("Kamlesh");
        correctOptions.add(2);

//        question 7
        options.add("C");
        options.add("JS");
        options.add("C++");
        options.add("HTML");
        correctOptions.add(1);

//        question 8
        options.add("2023");
        options.add("2002");
        options.add("1995");
        options.add("1990");
        correctOptions.add(3);

//        question 9
        options.add("No Data type");
        options.add("10");
        options.add("6");
        options.add("8");
        correctOptions.add(4);

//        question 10
        options.add("QAK");
        options.add("SOCKS");
        options.add("PALM");
        options.add("JIVA");
        correctOptions.add(1);
    }
}
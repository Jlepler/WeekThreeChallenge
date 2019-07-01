import java.util.*;

public class ResumeApp {


    public static void main(String[] args) {

        Scanner keyIn = new Scanner(System.in);
        String answerBeg;
        String answer;
        Boolean contResumeApp;
        Boolean contAddResume;

        System.out.println("Welcome.");


        /*********Test*******/
        Name myname = new Name();
        System.out.println("Add your name: ");
        myname.setName(keyIn.nextLine());
        System.out.println("Add any reference names or write none");
        System.out.println("Reference One");
        myname.setMiscFirstName((keyIn.nextLine()));




        /********Test*******/

        do
            {
            System.out.println("Would you like to add a new resume, or browse/update an existing resume?");
            answer = keyIn.nextLine();
            //This to use UserResponse class method
            UserResponse j = new UserResponse();

            if (j.answerTFPromptOne(answer) == 1){

            }

            if (contAddResume = true){}
                do{




                }while (contAddResume);






        } while (contResumeApp = true);

    }


    public void initializerName(){
        Name name = new Name(){};
    }
}

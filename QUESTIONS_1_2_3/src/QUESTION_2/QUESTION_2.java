package QUESTION_2;

import java.util.Scanner;

public class QUESTION_2 {

    public static void main(String[] args) {

        System.out.println("Enter the message to be analyzed: ");
        String message_to_analyze = input_message();

        String[] to_finds = {":-\\)",":-\\("};

        int quantity_happy_faces = count_of_ocourrences(message_to_analyze,to_finds[0]);
        int quantity_upset_faces = count_of_ocourrences(message_to_analyze,to_finds[1]);
        sentiment_expressed(quantity_happy_faces, quantity_upset_faces);
    }


    public static String input_message(){

        Scanner scan = new Scanner(System.in);
        String message ="";
        while (message.isEmpty()){
            message = scan.nextLine();
        }
        return message;
    }


    public static int count_of_ocourrences(String text, String symbol){

        Scanner verify = new Scanner(text);
        int count =0;

        while(verify.findInLine(symbol)!= null){
            count++;
        }

        verify.close();
        return count;
    }


    public static void sentiment_expressed(int happy_faces, int upset_faces){
        int result = happy_faces - upset_faces;

        if(result > 0){
            System.out.println("fun");
        }else if(result < 0){
            System.out.println("upset");
        }else{
            System.out.println("neutral");
        }
    }

}

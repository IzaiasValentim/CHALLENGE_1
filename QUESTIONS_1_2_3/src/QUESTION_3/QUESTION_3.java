package QUESTION_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QUESTION_3 {

    public static void main(String[] args) {

        int quantity;
        do{
            String operacao;

            Scanner entrada = new Scanner(System.in);
            System.out.println("Enter the number of operands (1=<n<=100) - or 0 to exit.");
            quantity = entrada.nextInt();

            if(quantity == 0){
                System.out.println("End.");
                entrada.close();
                return;
            } else if (quantity>100) {

                while (quantity>100){
                    System.out.println("Enter a number valid of operands (1=<n<=100) or 0 to exit.");
                    quantity = entrada.nextInt();
                    if(quantity == 0){
                        System.out.println("End.");
                        return;
                    }
                }

            }

            Scanner entrada2 = new Scanner(System.in);

            operacao = entrada2.nextLine();

            List<String> operator = collect_operators(operacao);

            List<String> str_numeros = collect_numbers(operacao);

            operation(operator,str_numeros,quantity);

        }while (quantity!=0);


    }
    public static List<String> collect_operators(String input){

        int cont_char = 0;
        List<String> operators = new ArrayList<>();
        while (cont_char < input.length()){
            String value = String.valueOf(input.charAt(cont_char));

            if(value.contains("+") || value.contains("-")){
                operators.add(value);
            }

            cont_char++;
        }
        return operators;
    }


    public static List<String> collect_numbers(String input){

        String ps = "\\+";
        String ms = "-";

        String [] first_split_plus = input.split(ps);
        List<String> str_numbers = new ArrayList<>();

        for (String word:
                first_split_plus) {
            str_numbers.addAll(List.of(word.split(ms)));
        }
        return str_numbers;
    }


    public static void operation(List<String> operators, List<String> numbers, int operands){

        int cont_operators =0;
        int calculate = 0;
        for (int i = 0; i <operands; i++) {

            if(i>0) {
                if(operators.get(cont_operators).equals("-")){
                    calculate -= Integer.parseInt(numbers.get(i));
                }else if(operators.get(cont_operators).equals("+")){
                    calculate += Integer.parseInt(numbers.get(i));
                }
                cont_operators++;
            }else{
                calculate += Integer.parseInt(numbers.get(0));
            }

        }
        System.out.println("Result: ");
        System.out.println(calculate);
    }

}

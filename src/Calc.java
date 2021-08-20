import java.util.Scanner;

public class Calc {
    public static void main(String [] args) throws MyException {
        System.out.println("Введите выражение для вычисления:");
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        String[] words = string.split(" ");
        if  (words.length < 2) {
            throw new MyException("т.к. строка не является математической операцией");
        }
         if (words.length > 3){
                throw new MyException("//т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        String word1 = words[0];
        String word2 = words[2];
        int number1;
        int number2;
        int result;
        int rome = 0;
        RomeNumber romeNumber1 = new RomeNumber();
        RomeNumber romeNumber2 = new RomeNumber();
        if (romeNumber1.isNumeric(word1)== true && romeNumber2.isNumeric(word2)== true) {
            number1 = Integer.parseInt(words[0]);
            number2 = Integer.parseInt(words[2]);
            if ((number1 <=0 ) || (number1 > 10)){
                throw new MyException("Первое арабское число должно быть от 1 до 10");
            }
            if ((number2 <=0 ) || (number2 > 10)){
                throw new MyException("Второе арабское число должно быть от 1 до 10");
            }
            }
         else if (romeNumber1.isNumeric(word1)== false && romeNumber2.isNumeric(word2)== false){
            romeNumber1.setWord(word1);
            romeNumber2.setWord(word2);
            number1 = romeNumber1.searchRomeNumberIn();
            number2 = romeNumber2.searchRomeNumberIn();
            rome = 1;
            if ((number1 <=0 ) || (number1 > 10)){
                throw new MyException("Первое римское число должно быть от 1 до 10");
            }
            if ((number2 <=0 ) || (number2 > 10)){
                throw new MyException("Второе римское число должно быть от 1 до 10");
            }
        }else {
            throw new MyException("т.к. используются одновременно разные системы счисления");
        }
        switch (words[1]){
            case "+":
                result = number1+number2;
                if (result >= 0 && result < 1){
                    throw new MyException("Результат меньше единицы");
                }
                break;
            case "-":
                result = number1 - number2;
                if (result >= 0 && result < 1){
                    throw new MyException("Результат меньше единицы");
                }
                break;
            case "*":
                result = number1*number2;
                if (result >= 0 && result < 1){
                    throw new MyException("Результат меньше единицы");
                }
                break;
            case "/":
                result = number1/number2;
                if (result >= 0 && result < 1){
                    throw new MyException("Результат меньше единицы");
                }
                break;
            default:
                throw new MyException("Не верный оператор");
        }
        switch (rome){
            case 1:
                if (result < 0) {
                    throw new MyException("т.к. в римской системе нет отрицательных чисел");
                }
                else {
                    String[] romeNumberOut = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", 	"XXIII", 	"XXIV", 	"XXV", 	"XXVI", 	"XXVII", 	"XXVIII", 	"XXIX", 	"XXX", 	"XXXI", 	"XXXII", 	"XXXIII", 	"XXXIV", 	"XXXV", 	"XXXVI", 	"XXXVII", 	"XXXVIII", 	"XXXIX", 	"XL", 	"XLI", 	"XLII", 	"XLIII", 	"XLIV", 	"XLV", 	"XLVI", 	"XLVII", 	"XLVIII", 	"XLIX", 	"L", 	"LI", 	"LII", 	"LIII", 	"LIV", 	"LV", 	"LVI", 	"LVII", 	"LVIII", 	"LIX", 	"LX", 	"LXI", 	"LXII", 	"LXIII", 	"LXIV", 	"LXV", 	"LXVI", 	"LXVII", 	"LXVIII", 	"LXIX", 	"LXX", 	"LXXI", 	"LXXII", 	"LXXIII", 	"LXXIV", 	"LXXV", 	"LXXVI", 	"LXXVII", 	"LXXVIII", 	"LXXIX", 	"LXXX", 	"LXXXI", 	"LXXXII", 	"LXXXIII", 	"LXXXIV", 	"LXXXV", 	"LXXXVI", 	"LXXXVII", 	"LXXXVIII", 	"LXXXIX", 	"XC", 	"XCI", 	"XCII", 	"XCIII", 	"XCIV", 	"XCV", 	"XCVI", 	"XCVII", 	"XCVIII", 	"XCIX", 	"C"
                    };
                    System.out.println(romeNumberOut[result]);
                    break;
                }
                default:
                    System.out.println(result);
                    break;
        }
        }

    }


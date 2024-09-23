import java.util.Random;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String userInput;
        int userData;
        //инициализируем и даём ему начальное значение - время пк
        Random rand = new Random(System.currentTimeMillis());
        JOptionPane.showMessageDialog(null,"привет, это игра 'угадай число'. Чтобы закончить, введи 0");
        userInput = JOptionPane.showInputDialog("Введите число от 1 до 10");
        userData = Integer.parseInt(userInput);
        int userEnd = 0;
        while(userEnd != userData){
            int secret = 1 + rand.nextInt(10);
            if(userData == secret){
                JOptionPane.showMessageDialog(null, "Молодец, ты угадал! Число было: "+ secret);
                JOptionPane.showMessageDialog(null, "Если хочешь закончить, то введи 0");
                userInput = JOptionPane.showInputDialog("Введите число от 1 до 10");
                userData = Integer.parseInt(userInput);
            }
            else {
                JOptionPane.showMessageDialog(null, "Число неверно, попробуйте снова. Число было: "+ secret);
                userInput = JOptionPane.showInputDialog("Введите число от 1 до 10");
                userData = Integer.parseInt(userInput);
            }
        }


    }
}

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class barbellCalculator extends JFrame{

    final int mensBar = 45;
    final double twoFive = 2.5;
    final double five = 5.0;
    final double ten = 10.0;
    final double fifteen = 15.0;
    final double twentyFive = 25.0;
    final double thrityFive = 35.0;
    final double fortyFive = 45.0;

    

    public barbellCalculator() {
        JFrame frame = new JFrame("Barbell Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Barbell Calculator");
        setLayout(new GridBagLayout());


    }
    public static void main(String [] args) {
        barbellCalculator calc = new barbellCalculator();
        calc.pack();
        calc.setVisible(true);
    }

    public double calculate(double input) {
        double sum = 0;
        double subtractBarbell = input - 45;
        double sides = subtractBarbell / 2;

        double fortyFives = sides / 45;
        double thirtyFives = sides / 35;
        double twentyFives = sides / 25;
        double fifteens = sides / 15;
        double tens = sides / 10;
        double fives = sides / 5;
        double twofives = sides / 2.5;

        sides = sides - (45 * fortyFives);
        if(fortyFives != 0) {
            sum = fortyFives;
        }



        return sum;
    }
     
}
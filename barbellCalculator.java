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


    private JButton plateButton;
    private JTextField textInput1;
    private JLabel resultLabel;


    

    public barbellCalculator() {
        JFrame frame = new JFrame("Barbell Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Barbell Calculator");
        setLayout(new GridBagLayout());

        //left components
        GridBagConstraints leftSide = new GridBagConstraints();
        leftSide.gridx = 0;
        leftSide.gridy = 0;
        textInput1 = new JTextField(10);

        //middle components
        GridBagConstraints middle = new GridBagConstraints();
        middle.gridx = 1;
        middle.gridy = 0;
        plateButton = new JButton("Calculate");

        plateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d1 = Double.parseDouble(textInput1.getText());
                String sum = calculate(d1);
                resultLabel.setText(sum);
            }
        });

        //middle components 2
        GridBagConstraints middle2 = new GridBagConstraints();
        middle2.gridx = 0;
        middle2.gridy = -2;
        resultLabel = new JLabel("Barbell Calculator");


        add(textInput1, leftSide);
        add(plateButton, middle);
        add(resultLabel, middle2);




        


    }
    public static void main(String [] args) {
        barbellCalculator calc = new barbellCalculator();
        calc.pack();
        calc.setVisible(true);
        System.out.println(calculate(225));
    }



    public static String calculate(double input) {
        String answer = "You need: ";
        double subtractBarbell = input - 45;
        double sides = subtractBarbell / 2;
        double fortyFives = sides / 45;
        double thirtyFives = sides / 35;
        double twentyFives = sides/ 25;
        double fifteens = sides / 15;
        double tens = sides / 10;
        double fives = sides / 5;
        double twoFives = sides / 2.5;

        if(input > 0) {
            sides = sides - (45 * fortyFives);
            if(fortyFives != 0) {
                answer = answer + fortyFives + " 45 lb plates, ";
            }

            sides = sides - (35 * thirtyFives);
            if(thirtyFives != 0) {
                answer = answer + thirtyFives + " 35 lb plates, ";
            }

            sides = sides - (25 * twentyFives);
            if(twentyFives != 0) {
                answer = answer + twentyFives + " 25 lb plates, ";
            }

            sides = sides - (15 * fifteens);
            if(fifteens != 0) {
                answer = answer + fifteens + " 15 lb plates, ";
            }

            sides = sides - (10 * tens);
            if(tens != 0) {
                answer = answer + tens + " 10 lb plates, ";
            }

            sides = sides - (5 * fives);
            if(fives != 0) {
                answer = answer + tens + " 5 lb plates, ";
            }

            sides = sides - (2.5 * twoFives);
            if(twoFives != 0) {
                answer = answer + twoFives + " 2.5 lb plates, ";
            }
        }
        else {
            answer = "ERROR! ENTER POSITIVE NUMBER DIVISIBLE BY 5";
        }

        return answer;
    }
     
}
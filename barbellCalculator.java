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
    }



    public static String calculate(double input) {
        String answer = "You need: ";
        double subtractBarbell = input - 45;
        double sides = subtractBarbell / 2;
        double sum = 0;


        while (input > 2) {
            sum = subtractBarbell / 45;
            answer = answer + sum;
        }

        return answer;
    }
     
}
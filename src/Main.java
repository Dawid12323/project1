import javax.swing.*;

public class Main {

    private static Object CalculatorGUI;

    public static void main(String[] args) {
        System.out.println("hello");

        CalculatorGUI gui = new CalculatorGUI();
        JFrame frame = new JFrame();
        frame.setContentPane(gui.getPanel());
        frame.setVisible(true);
        frame.setSize(250, 250);
        System.out.println(CalculatorGUI);

    }

}

import javax.swing.*;
import java.awt.*;

 class App extends JFrame {

    Container c;
    JLabel l1;

    App() {
        c = getContentPane();
        c.setBackground(Color.BLACK);
        l1 = new JLabel("Good Afternoon");
        c.add(l1);
    }

}

public class GUI {
    public static void main(String[] args) {
        App a = new App();
        a.setTitle("Hello");
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

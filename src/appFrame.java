
import javax.swing.JFrame;
import java.awt.*;

public class appFrame extends JFrame {

    TitleBar title = new TitleBar();
    public appFrame() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(this.title, BorderLayout.NORTH);
    }

}

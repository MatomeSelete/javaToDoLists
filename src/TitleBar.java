
import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {
    public TitleBar() {
        JLabel TitleText = new JLabel("To Do List App");

        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(new Color(90, 143, 123));

        TitleText.setPreferredSize(new Dimension(400, 80));
        TitleText.setFont(new Font("Sans-sarif", Font.BOLD, 20));
        TitleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(TitleText);
    }
}

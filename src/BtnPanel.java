import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import javax.swing.JButton;

public class BtnPanel extends JPanel {
    private JButton addtask;
    private JButton clear;

    Border emptyborder = BorderFactory.createEmptyBorder();

    public BtnPanel() {
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(Color.yellow);

        addtask = new JButton("Add Task");
        addtask.setBorder(emptyborder);
        addtask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(addtask);

        this.add(Box.createHorizontalStrut(20));

        clear = new JButton("Clear All Task");
        clear.setBorder(emptyborder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(clear);
    }

    public JButton getAddtaskbtn() {
        return addtask;
    }

    public JButton getClearbtn() {
        return clear;
    }

}

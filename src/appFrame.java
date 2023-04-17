
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class appFrame extends JFrame {

    private JButton  addtask;
    private JButton clear;

    TitleBar title = new TitleBar();
    BtnPanel btnPanel = new BtnPanel();

    public appFrame() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(this.title, BorderLayout.NORTH);
        this.add(btnPanel, BorderLayout.SOUTH);

        addtask = btnPanel.getAddtaskbtn();
        clear = btnPanel.getClearbtn();

        addListener();
    }

    public void addListener() {

        addtask.addMouseListener(new MouseAdapter() {
            @Override

            public void mousePressed(MouseEvent e) {



            }

        });

    }

}

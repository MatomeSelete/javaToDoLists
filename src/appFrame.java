
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class appFrame extends JFrame {

    TitleBar title = new TitleBar();
    BtnPanel btnPanel = new BtnPanel();
    List list = new List();
    private JButton  addtask;
    private JButton clear;



    public appFrame() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(this.title, BorderLayout.NORTH);
        this.add(btnPanel, BorderLayout.SOUTH);
        this.add(this.list, BorderLayout.CENTER);

        addtask = btnPanel.getAddtaskbtn();
        clear = btnPanel.getClearbtn();

        addListener();
    }

    public void addListener() {

        addtask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                Task task = new Task();
                list.add(task);
                list.indexnum();
                revalidate();

                JButton done = task.getdonej();
                done.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
//                        super.mouseClicked(e);
//                        task.donestatus();
                        revalidate();
                    }
                });


                JButton remove = task.getremovej();
                remove.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        list.remove(task);
                        list.indexnum();
                        revalidate();
                        repaint();
                    }
                });

            }

        });

    }

}

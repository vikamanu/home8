package home8;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private static final ImageIcon ICON_X = new ImageIcon("unnamed.png");
    private static final ImageIcon ICON_O = new ImageIcon("0-5992eda5.png");
    private static final ImageIcon ICON_DEFAULT = new ImageIcon("belaya-kartinka-bez-nichego-pustaya.jpg");
    public Window() throws HeadlessException {
        JButton[] [] buttons = new JButton[3][3];
        setSize(500, 500);
        setLocation(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("FILE");
        file.addSeparator();
        JMenuItem item1 = new JMenuItem("open");
        JMenuItem item2 = new JMenuItem("save");
        JMenuItem item3 = new JMenuItem("exit");
        JMenu view = new JMenu("VIEW");
        item3.addActionListener(e -> dispose());
        item1.addActionListener(e -> {
            new Window();
            dispose();
        });
        file.add(item1);
        file.add(item2);
        file.add(item3);
        view.add(new JMenuItem("VIEV"));
        view.add(new JMenuItem("EDIT"));
        menuBar.add(file);
        menuBar.add(view);
        add(menuBar);
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Copyright Vika Manu 2021");
        JPanel fp = new JPanel(new GridLayout(3, 3));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                final int finalI = i;
                final int finalJ = j;
                buttons[i][j].addActionListener(e -> {
                    System.out.println(finalI + "" + finalJ);
                    buttons[finalI][finalJ].setIcon(ICON_X);
                    buttons[finalI][finalJ].setDisabledIcon(ICON_X);
                    buttons[finalI][finalJ].setEnabled(false);
                });
                fp.add(buttons[i][j]);
            }
        }

        panel.add(menuBar, BorderLayout.NORTH);
        panel.add(label, BorderLayout.SOUTH);
        panel.add(fp, BorderLayout.CENTER);
        add(panel);
        panel.setVisible(true);
        setResizable(false);
        setVisible(true);

    }



    public static void main(String[] args) {
        new Window();
    }

}

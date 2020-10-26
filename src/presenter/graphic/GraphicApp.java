package presenter.graphic;

import presenter.graphic.button.ButtonActionListener;
import presenter.graphic.frame.FrameEventListener;

import javax.swing.*;
import java.awt.*;

public class GraphicApp
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500, 800));
//        frame.setLayout(new BorderLayout(15, 15));
//        frame.setLayout(new GridLayout(1, 2, 15, 10));
//        frame.setLayout(new FlowLayout());
//        frame.setLayout(new SpringLayout());
//        frame.setLayout(new BoxLayout(frame, BoxLayout.X_AXIS));

//        JTextField input = new JTextField();
//        input.setBounds(15, 15, 140, 40);

//        JPanel panel = new JPanel();
//        panel.add(button, BorderLayout.CENTER);
//        panel.add(input, BorderLayout.CENTER);

        //Sidebar
        Sidebar sidebar = new Sidebar();
        sidebar.addButton("a");
        sidebar.addButton("b");
        frame.add(sidebar, BorderLayout.WEST);
        //Sidebar

        //content
        JPanel content = new JPanel();
//        content.setLayout(new BorderLayout());
//        content.setAlignmentX(240);
//        content.setLayout(new BoxLayout(sidebar, 2));

        JButton button = new JButton("button");
        button.setPreferredSize(new Dimension(100, 20));
        button.addActionListener(new ButtonActionListener(frame));
        JButton button2 = new JButton("button");
//        button.setLay
//        button.setHorizontalAlignment(JTextField.SOUTH);

        content.setPreferredSize(new Dimension(260, 500));
//        content.setAlignmentX(Component.RIGHT_ALIGNMENT);
        content.add(button);
        content.add(button2);
//        content.setLocation(240, 0);
        frame.add(content);
        //content

        frame.addComponentListener(new FrameEventListener(sidebar));
        frame.setLocationRelativeTo(null);
//        frame.pack();
        frame.setVisible(true);
    }
}

package presenter.graphic;

import framework.Container;
import framework.Environment;
import presenter.graphic.button.ButtonActionListener;

import javax.swing.*;
import java.awt.*;

public class GraphicApp
{
    public static void main(String[] args)
    {
        framework.Container container = new Container(new Environment());
        //Sidebar
        Sidebar sidebar = new Sidebar();
        sidebar.addButton("a");
        sidebar.addButton("b");
        //Sidebar

        //content
        JPanel content = new JPanel();

        Frame view = new Frame(sidebar);

        JButton button = new JButton("button");
        button.setPreferredSize(new Dimension(100, 20));
        button.addActionListener(new ButtonActionListener(view));
        JButton button2 = new JButton("button");

        content.setPreferredSize(new Dimension(260, 500));
        content.add(button);
        content.add(button2);
        view.add(content);
        //content

        view.setVisible(true);
    }
}

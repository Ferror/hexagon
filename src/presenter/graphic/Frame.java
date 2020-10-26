package presenter.graphic;

import presenter.graphic.frame.FrameEventListener;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame
{
    public Frame(Sidebar sidebar)
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(500, 800));

        this.add(sidebar, BorderLayout.WEST);
        this.addComponentListener(new FrameEventListener(sidebar));
        this.setLocationRelativeTo(null);
    }
}

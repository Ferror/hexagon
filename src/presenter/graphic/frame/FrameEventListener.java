package presenter.graphic.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class FrameEventListener implements ComponentListener
{
    private final JPanel sidebar;

    public FrameEventListener(JPanel sidebar)
    {
        this.sidebar = sidebar;
    }

    @Override
    public void componentResized(ComponentEvent e)
    {
        Component component = e.getComponent();

        this.sidebar.setSize(sidebar.getWidth(), component.getHeight());
    }

    @Override
    public void componentMoved(ComponentEvent e)
    {
        System.out.println("moved");
    }

    @Override
    public void componentShown(ComponentEvent e)
    {
    }

    @Override
    public void componentHidden(ComponentEvent e)
    {
    }
}

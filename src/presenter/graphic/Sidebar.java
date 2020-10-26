package presenter.graphic;

import javax.swing.JPanel;
import java.awt.*;

public class Sidebar extends JPanel
{
    public Sidebar()
    {
        this.setPreferredSize(new Dimension(240, 500));
        this.setBackground(new Color(120, 30, 50));
    }

    public void addButton(String title)
    {
        Button button = new Button(title);
        button.setPreferredSize(new Dimension(180, 40));

        this.add(button, BorderLayout.PAGE_END);
    }
}

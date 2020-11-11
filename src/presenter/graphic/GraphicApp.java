package presenter.graphic;

import domain.currency.CurrencyStorage;
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
        CurrencyStorage storage = (CurrencyStorage) container.get("domain.currency.CurrencyStorage");
        //Sidebar
        Sidebar sidebar = new Sidebar();
        sidebar.addButton("a");
        sidebar.addButton("b");
        //Sidebar

        //content
        JPanel content = new JPanel();
        Frame view = new Frame(sidebar);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        JPanel buttons = new JPanel();
        JButton button = new JButton("button");
        button.setPreferredSize(new Dimension(100, 20));
        button.addActionListener(new ButtonActionListener(view));
        JButton button2 = new JButton("button");

        buttons.setPreferredSize(new Dimension(260, 500));
        buttons.add(button);
        buttons.add(button2);

        JPanel tablePanel = new JPanel();
        Object[] columnNames = storage.getAll().get(0).serialize().keySet().toArray();
        Object[][] data = new Object[storage.getAll().size()][2];

        for (int i = 0; i < storage.getAll().size(); i++) {
            data[i][0] = storage.getAll().get(i).getName();
            data[i][1] = storage.getAll().get(i).getIso();
        }

        JTable table = new JTable(data, columnNames);
        table.getTableHeader().setBackground(Color.WHITE);
        tablePanel.add(new JScrollPane(table));
        content.add(tablePanel);
        content.add(buttons);
        view.add(content);
        //content

        view.setVisible(true);
    }
}

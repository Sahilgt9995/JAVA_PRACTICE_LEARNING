import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Button {
    public static void main(String[] args) {
        JFrame t = new JFrame("Button Example");

        JButton b1 = new JButton("Previous");
        b1.setBounds(50, 100, 95, 30);
        t.add(b1);

        JButton b2 = new JButton("Play");
        b2.setBounds(150, 100, 95, 30);
        t.add(b2);

        JButton b3 = new JButton("Next");
        b3.setBounds(250, 100, 95, 30);
        t.add(b3);

        t.setSize(800, 600);
        t.setLayout(null);
        t.setVisible(true);

        // Create a panel to hold the table
        String[][] data = readFromCSV();


        String[] column = {"Name", "Age", "ID"};


        JFrame f = new JFrame();


        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);


        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);

    }

    public static String[][] readFromCSV() {
        String inputFilePath = "new.csv";

        ArrayList<Object> dataList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                dataList.add(tokens);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        String[][] data = new String[dataList.size()][];
        data = dataList.toArray(data);
        return data;
    }
}

import javax.swing.*;
import java.awt.*;
public class View {
    JLabel label;
    JButton button = new JButton("Подобрать корень");
    JLabel root = new JLabel();
    JTextField IntervalA = new JTextField("");
    JTextField IntervalB = new JTextField("");
    JTextField addend =  new JTextField();
    JTextField result = new JTextField("");

    public String getAddend()
    {
        return addend.getText();
    }

    public String getResult()
    {
        return result.getText();
    }

    public String getIntervalA()
    {
        return IntervalA.getText();
    }

    public String getIntervalB()
    {
        return IntervalB.getText();
    }

    public void setRoot(String root) {this.root.setText(root);}

    public  void addComponentsToPane(Container pane) {

        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        label = new JLabel("x +");
        pane.add(label, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.02;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(addend, c);

        label = new JLabel(" = ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.0025;
        c.gridx = 2;
        c.gridy = 0;
        pane.add(label, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 0;
        pane.add(result, c);

        label = new JLabel("Начало интервала");
        c.weightx = 0.015;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(label, c);

        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 3;
        pane.add(IntervalA, c);

        label = new JLabel("Конец интервала");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(label, c);

        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 3;
        pane.add(IntervalB, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(root, c);

        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 1;
        pane.add(button, c);
    }
}

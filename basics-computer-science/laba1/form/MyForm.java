import javax.swing.*;

public class MyForm extends JFrame {

    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JButton jButton1;

    public MyForm() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(null);

        jTextField1 = new JTextField();
        jTextField1.setBounds(20, 20, 100, 30);
        add(jTextField1);

        jTextField2 = new JTextField();
        jTextField2.setBounds(20, 60, 100, 30);
        add(jTextField2);

        jTextField3 = new JTextField();
        jTextField3.setBounds(20, 100, 100, 30);
        add(jTextField3);

        jButton1 = new JButton("Посчитать");
        jButton1.setBounds(150, 20, 120, 30);
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));
        add(jButton1);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int x = Integer.valueOf(jTextField1.getText());
        int y = Integer.valueOf(jTextField2.getText());
        jTextField3.setText(Integer.toString(4 * x + 7 * y));
    }
}

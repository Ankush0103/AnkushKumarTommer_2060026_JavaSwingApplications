import javax.swing.*;
public class Button {
    public static void main(String[] args) {
        JFrame f=new JFrame("Button Example");
        JButton b=new JButton("Click Here");
        b.setBounds(50,100,200,30);
        f.add(b);
        f.setSize(350,350);
        f.setLayout(null);
        f.setVisible(true);
    }
}

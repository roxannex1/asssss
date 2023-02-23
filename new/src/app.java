import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class app extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton okButton;
    private JButton clearButton;
    private JPanel Panel;

    public app(){
        setContentPane(Panel);
        setTitle("try to cleate");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JButton button1 = new JButton();
            button1.setPreferredSize(new Dimension(100,100));

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JButton button2 = new JButton();
            button2.setPreferredSize(new Dimension(100,100));
            }
        });
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }   

    public static void main(String[] args) {
        app myapp  = new app();
    }
}

public class StringRecursion{

    String rev(String str){
        if (str.length() == 0)
            return "";
        return
                str.charAT(str.Length() -1) + rev(str.substring(0, str.length()-1));}

    public static void main(String[] args) {
        StringRecursion r=new StringRecursion();
        Scanner sc=new Scanner(System.in);
        System.out.print("String: ");
        String s=sc.nextLine();
        System.out.println("Reversed: "+r.rev(s));
    }
}





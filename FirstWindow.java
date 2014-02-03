package lab1;
//import demos.*;
import javax.swing.*;


public class FirstWindow extends JFrame
{
    JFrame mainFrame;
    JPanel jplPanel;
    public static final int WIDTH = 400; 
    public static final int HEIGHT = 300;

    public FirstWindow( )
    {
        super( );
       
        mainFrame = new JFrame("Awesome!");
        //jplPanel = new JPanel();
        //setTitle("First Window Class");
        mainFrame.setSize(WIDTH, HEIGHT);
        //setDefaultCloseOperation(
                              //JFrame.DO_NOTHING_ON_CLOSE);

        JButton endButton = new JButton("Hi.");
        JButton testButton = new JButton("I'm a button!");
        endButton.addActionListener(new EndingListener( ));
        add(endButton);
        
        //jplPanel.setLayout(new FlowLayout());
        mainFrame.add(endButton);
        mainFrame.add(testButton);
        //testButton.addActionListener(new EndingListener( ));
        //add(testButton);
    }
 //   public class MainWindow extends JFrame
 //   {
 //       JFrame mainFrame = new JFrame("Awesome!");
//    }
}

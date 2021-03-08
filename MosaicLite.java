import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;


class MosaicLiteFrame extends JFrame {
    public MosaicLiteFrame() {  //Default constructor withh boundry and close
        setBounds(200,200,1200,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();       // For the button 
        contentPane.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        contentPane.add(buttonPanel, BorderLayout.SOUTH);  // For the button 

        JButton randomize = new JButton("Randomize");  // For the button 
        buttonPanel.add(randomize);

        //For grid pattern creation Xs
        JPanel xAndOGridPanel = new JPanel();
        contentPane.add(xAndOGridPanel, BorderLayout.CENTER);
        xAndOGridPanel.setLayout( new GridLayout(3,3));

        
    }
}
public class MosaicLite{
    public static void main(String[] args) {
        System.out.println("MosaicLite Starting...");

        MosaicLiteFrame myMosaicLiteFrame = new MosaicLiteFrame();  // For frame to run
        myMosaicLiteFrame.setVisible(true); //to be seen
    }
}
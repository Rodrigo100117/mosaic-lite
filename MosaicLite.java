import javax.swing.JFrame;

class MosaicLiteFrame extends JFrame {
    public MosaicLiteFrame() {  //Default constructor withh boundry and close
        setBounds(200,200,1200,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class MosaicLite{
    public static void main(String[] args) {
        System.out.println("MosaicLite Starting...");

        MosaicLiteFrame myMosaicLiteFrame = new MosaicLiteFrame();  // For frame to run
        myMosaicLiteFrame.setVisible(true); //to be seen
    }
}
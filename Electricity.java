import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Electricity {
    JFrame elecF =new JFrame();
    private JButton PRINTBILLButton;
    private JPanel elecPanel;
    private JLabel ELECTRICITYBILLLabel;
    private JTextField kwhData;
    private JTextField name;
    private JTextField meterData;
    private JTextArea print;
    private JLabel METERNUMBERLabel;
    private JLabel NAMELabel;
    private JLabel UNITSINKWHLabel;

    public Electricity() {
        elecF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        elecF.setContentPane(elecPanel);
        elecF.pack();
        elecF.setLocationRelativeTo(null);
        elecF.setVisible(true);

    PRINTBILLButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            printBill();

        }
    });
}
 public void printBill(){
        double total=Double.parseDouble(kwhData.getText())*6.15;

        print.setText(print.getText()+ "   ELECTRICITY BILL RECIEPT "+ " \n ");
     print.setText(print.getText()+ " ------------------***** ----------------"+ " \n ");
     print.setText(print.getText()+ "\n");
     print.setText(print.getText() + " METER NUMBER :  " + meterData.getText() + " \n");
     print.setText(print.getText() + " NAME : " + name.getText() + " \n");
     print.setText(print.getText() + " UNITS CONSUMED : " + kwhData.getText() + "\n");
     print.setText(print.getText() + " TOTAL AMOUNT :  " + " Rupess " + String.format(" %.2f ",total)+ " Only");
}


}

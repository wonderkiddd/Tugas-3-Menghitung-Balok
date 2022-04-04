//Muhammad Agil Suyuti (123200109)

package tugas3menghitungbalok;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame implements ActionListener {
    JLabel labelTitle, labelPanjang, labelLebar, labelTinggi, labelHasil, labelHasilLuas, labelHasilKeliling, labelHasilVolume, labelHasilLP;
    final JTextField fieldPanjang, fieldLebar, fieldTinggi;
    JButton buttonHitung, buttonReset;
    public Kalkulator(){
        // label judul
        labelTitle      = new JLabel("Cuboid Calculator");

        // label dan field panjang
        labelPanjang    = new JLabel("Length");
        fieldPanjang    = new JTextField(15);
        
        // label dan field lebar
        labelLebar      = new JLabel("Width");
        fieldLebar      = new JTextField(15);

        // label dan field tinggi
        labelTinggi     = new JLabel("Height");
        fieldTinggi     = new JTextField(15);

        //label hasil
        labelHasil          = new JLabel("Result :");
        labelHasilLuas      = new JLabel();
        labelHasilKeliling  = new JLabel();
        labelHasilVolume    = new JLabel();
        labelHasilLP        = new JLabel();

        // button yang digunakan
        buttonHitung    = new JButton("Count");
        buttonReset     = new JButton("Reset");
        
        // mengatur ukuran dan inputan
        setSize(500, 500);
        setTitle("Cuboid Calculator");
        setLayout(null);

        buttonHitung.addActionListener(this);
        buttonReset.addActionListener(this);

        add(labelTitle);
        add(labelPanjang);
        add(fieldPanjang);
        add(labelLebar);
        add(fieldLebar);
        add(labelTinggi);
        add(fieldTinggi);
        add(labelHasil);
        add(labelHasilLuas);
        add(labelHasilKeliling);
        add(labelHasilVolume);
        add(labelHasilLP);
        add(buttonHitung);
        add(buttonReset);

        labelTitle.setBounds(200,10, 150, 20);
        labelPanjang.setBounds(80, 60, 150, 20);
        fieldPanjang.setBounds(200, 60, 200, 20);
        labelLebar.setBounds(80, 110, 150, 20);
        fieldLebar.setBounds(200, 110, 200, 20);
        labelTinggi.setBounds(80, 160, 150, 20);
        fieldTinggi.setBounds(200, 160, 200, 20);
        labelHasil.setBounds(200, 210, 150, 20);
        labelHasilLuas.setBounds(50, 240, 200, 20);
        labelHasilKeliling.setBounds(50, 270, 200, 20);
        labelHasilVolume.setBounds(50, 300, 200, 20);
        labelHasilLP.setBounds(50, 330, 200, 20);
        buttonHitung.setBounds(130, 390, 100, 30);
        buttonReset.setBounds(250, 390, 100, 30);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    // rumus yang digunakan
    public void actionPerformed(ActionEvent e){
        try{
            int luas, keliling, volume, luaspermukaan;
            int p = Integer.parseInt(fieldPanjang.getText());
            int l = Integer.parseInt(fieldLebar.getText());
            int t = Integer.parseInt(fieldTinggi.getText());

            if(e.getSource()==buttonHitung){
                luas = p * l;
                labelHasilLuas.setText("Square Area     : " + luas);
                keliling = 2*p + 2*l;
                labelHasilKeliling.setText("Square Circumference    : " + keliling);
                volume = p * l * t;
                labelHasilVolume.setText("Cuboid Volume     : " + volume);
                luaspermukaan = (2*p*l)+(2*p*t)+(2*t*l);
                labelHasilLP.setText("Cuboid Surface Area   : " + luaspermukaan);

            } else if(e.getSource()==buttonReset){
                clearFields();
            }

            
        // error handling
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "Input hanya angka dan tidak boleh dikosongkan!");
        }
    }

    private void clearFields(){
        fieldPanjang.setText("");
        fieldLebar.setText("");
        fieldTinggi.setText("");
        labelHasilLuas.setText("");
        labelHasilLP.setText("");
        labelHasilVolume.setText("");
        labelHasilKeliling.setText("");
    }
}

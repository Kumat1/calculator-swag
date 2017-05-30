
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Kalkulator extends JFrame {
    Boolean cTambah = false ;
    Boolean cKurang = false ;
    Boolean cBagi = false ;
    Boolean cKali = false ;
    Boolean cPangkat = false;
    String display = "";
    private JButton tmbl1, tmbl2, tmbl3, tmbl4, tmbl5, tmbl6, tmbl7, tmbl8, tmbl9, tmbl0;
    private JButton tmblTambah, tmblKurang, tmblKali, tmblBagi, tmblPangkat;
    private JButton tmblHasil, tmblHapus;
    private double hasil, hasilTemp;
    private JTextField fieldHasil;

    public Kalkulator() {

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));

        p1.add(tmbl1 = new JButton("1"));
        tmbl1.addActionListener(new ListenToOne());
        p1.add(tmbl1, BorderLayout.PAGE_START);
        p1.add(tmbl2 = new JButton("2"));
        tmbl2.addActionListener(new ListenToTwo());
        p1.add(tmbl3 = new JButton("3"));
        tmbl3.addActionListener(new ListenToThree());
        p1.add(tmbl4 = new JButton("4"));
        tmbl4.addActionListener(new ListenToFour());
        p1.add(tmbl5 = new JButton("5"));
        tmbl5.addActionListener(new ListenToFive());
        p1.add(tmbl6 = new JButton("6"));
        tmbl6.addActionListener(new ListenToSix());
        p1.add(tmbl7 = new JButton("7"));
        tmbl7.addActionListener(new ListenToSeven());
        p1.add(tmbl8 = new JButton("8"));
        tmbl8.addActionListener(new ListenToEight());
        p1.add(tmbl9 = new JButton("9"));
        tmbl9.addActionListener(new ListenToNine());
        p1.add(tmbl0 = new JButton("0"));
        tmbl0.addActionListener(new ListenToZero());
        p1.add(tmblHapus = new JButton("C"));
        tmblHapus.addActionListener(new ListenToClear());
        p1.add(tmblHasil = new JButton("="));
        tmblHasil.addActionListener(new ListenToSolve());

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(6, 1));
        p2.add(fieldHasil = new JTextField());
        fieldHasil.setEditable(false);
        p2.add(tmblTambah = new JButton("+"));
        tmblTambah.addActionListener(new ListenToAdd());
        p2.add(tmblKurang = new JButton("-"));
        tmblKurang.addActionListener(new ListenToSubtract());
        p2.add(tmblKali = new JButton("*"));
        tmblKali.addActionListener(new ListenToMultiply());
        p2.add(tmblBagi = new JButton("/"));
        tmblBagi.addActionListener(new ListenToDivide());
        p2.add(tmblPangkat = new JButton("x^n"));
        tmblPangkat.addActionListener(new ListenToPow());

        JPanel p = new JPanel();
        p.setLayout(new GridLayout());
        p.add(p1, BorderLayout.SOUTH);
        p.add(p2, BorderLayout.EAST);
        add(p);
    }

    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();
        calc.pack(); //Agar ukuran frame menyesuaikan
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }

    class ListenToClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            fieldHasil.setText("");
            cTambah = cKurang = cKali = cBagi  = false ;
            hasil = 0;
            hasilTemp = 0 ;
        }
    }

    class ListenToOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = fieldHasil.getText();
            fieldHasil.setText(display + "1");
        }
    }

    class ListenToTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = fieldHasil.getText();
            fieldHasil.setText(display + "2");
        }
    }

    class ListenToThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = fieldHasil.getText();
            fieldHasil.setText(display + "3");
        }
    }

    class ListenToFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = fieldHasil.getText();
            fieldHasil.setText(display + "4");
        }
    }

    class ListenToFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = fieldHasil.getText();
            fieldHasil.setText(display + "5");
        }
    }

    class ListenToSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = fieldHasil.getText();
            fieldHasil.setText(display + "6");
        }
    }

    class ListenToSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = fieldHasil.getText();
            fieldHasil.setText(display + "7");
        }
    }

    class ListenToEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = fieldHasil.getText();
            fieldHasil.setText(display + "8");
        }
    }

    class ListenToNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = fieldHasil.getText();
            fieldHasil.setText(display + "9");
        }
    }

    class ListenToZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = fieldHasil.getText();
            fieldHasil.setText(display + "0");
        }
    }

    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hasil = Double.parseDouble(fieldHasil.getText());
            fieldHasil.setText("");
            cTambah = true ;

        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hasil = Double.parseDouble(fieldHasil.getText());
            fieldHasil.setText("");
            cKurang =true;
        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hasil = Double.parseDouble(fieldHasil.getText());
            fieldHasil.setText("");
            cKali =true;

        }
    }

    class ListenToDivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hasil = Double.parseDouble(fieldHasil.getText());
            fieldHasil.setText("");
            cBagi =true;
        }
    }

    class ListenToPow implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hasil = Double.parseDouble(fieldHasil.getText());
            fieldHasil.setText("");
            cPangkat =true;
        }
    }

    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hasilTemp = Double.parseDouble(  fieldHasil.getText() );
            if ( cTambah == true  )
                hasilTemp = hasil + hasilTemp;
            else if ( cKurang == true  )
                hasilTemp = hasil - hasilTemp;
            else if ( cBagi == true  )
                hasilTemp = hasil / hasilTemp;
            else if ( cKali == true  )
                hasilTemp = hasil * hasilTemp;
            else if ( cPangkat == true  )
                hasilTemp = Math.pow(hasil, hasilTemp);
            fieldHasil.setText( Double.toString( hasilTemp ) );

            cTambah = cKurang = cKali = cBagi = cPangkat = false ;
        }
    }

}
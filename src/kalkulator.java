
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Kalkulator extends JFrame {
    Boolean cekTambah = false ;
    Boolean cekKurang = false ;
    Boolean cekBagi = false ;
    Boolean cekKali = false ;
    Boolean cekPangkat = false;
    String display = "";
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private JButton btnTambah, btnKurang, btnKali, btnBagi, btnPangkat;
    private JButton btnHasil, btnHapus;
    private double hasil, hasilTemp;
    private JTextField fieldHasil;

    public Kalkulator() {

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));

        p1.add(btn1 = new JButton("1"));
        btn1.addActionListener(new ListenToOne());
        p1.add(btn1, BorderLayout.PAGE_START);
        p1.add(btn2 = new JButton("2"));
        btn2.addActionListener(new ListenToTwo());
        p1.add(btn3 = new JButton("3"));
        btn3.addActionListener(new ListenToThree());
        p1.add(btn4 = new JButton("4"));
        btn4.addActionListener(new ListenToFour());
        p1.add(btn5 = new JButton("5"));
        btn5.addActionListener(new ListenToFive());
        p1.add(btn6 = new JButton("6"));
        btn6.addActionListener(new ListenToSix());
        p1.add(btn7 = new JButton("7"));
        btn7.addActionListener(new ListenToSeven());
        p1.add(btn8 = new JButton("8"));
        btn8.addActionListener(new ListenToEight());
        p1.add(btn9 = new JButton("9"));
        btn9.addActionListener(new ListenToNine());
        p1.add(btn0 = new JButton("0"));
        btn0.addActionListener(new ListenToZero());
        p1.add(btnHapus = new JButton("C"));
        btnHapus.addActionListener(new ListenToClear());
        p1.add(btnHasil = new JButton("="));
        btnHasil.addActionListener(new ListenToSolve());

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(6, 1));
        p2.add(fieldHasil = new JTextField());
        fieldHasil.setEditable(false);
        p2.add(btnTambah = new JButton("+"));
        btnTambah.addActionListener(new ListenToAdd());
        p2.add(btnKurang = new JButton("-"));
        btnKurang.addActionListener(new ListenToSubtract());
        p2.add(btnKali = new JButton("*"));
        btnKali.addActionListener(new ListenToMultiply());
        p2.add(btnBagi = new JButton("/"));
        btnBagi.addActionListener(new ListenToDivide());
        p2.add(btnPangkat = new JButton("x^n"));
        btnPangkat.addActionListener(new ListenToPow());

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
            cekTambah = cekKurang = cekKali = cekBagi  = false ;
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
            cekTambah = true ;

        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hasil = Double.parseDouble(fieldHasil.getText());
            fieldHasil.setText("");
            cekKurang =true;
        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hasil = Double.parseDouble(fieldHasil.getText());
            fieldHasil.setText("");
            cekKali =true;

        }
    }

    class ListenToDivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hasil = Double.parseDouble(fieldHasil.getText());
            fieldHasil.setText("");
            cekBagi =true;
        }
    }

    class ListenToPow implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hasil = Double.parseDouble(fieldHasil.getText());
            fieldHasil.setText("");
            cekPangkat =true;
        }
    }

    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hasilTemp = Double.parseDouble(  fieldHasil.getText() );
            if ( cekTambah == true  )
                hasilTemp = hasil + hasilTemp;
            else if ( cekKurang == true  )
                hasilTemp = hasil - hasilTemp;
            else if ( cekBagi == true  )
                hasilTemp = hasil / hasilTemp;
            else if ( cekKali == true  )
                hasilTemp = hasil * hasilTemp;
            else if ( cekPangkat == true  )
                hasilTemp = Math.pow(hasil, hasilTemp);
            fieldHasil.setText( Double.toString( hasilTemp ) );

            cekTambah = cekKurang = cekKali = cekBagi = cekPangkat = false ;
        }
    }

}
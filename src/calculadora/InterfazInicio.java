import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InterfazInicio extends JFrame implements ActionListener {
    private final JMenuBar barraMenu;
    private final JMenu menuUno;
    private final JMenuItem creador;
    private final JTextField areaCalculo;
    private final JButton limpiar, cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, sumar, restar,
            multiplicar, dividir, igual, borrar, eliminar, punto;
    private final JTextArea areaMemoria;
    private final JScrollPane scroll;
    
    private double primerValor = 0;
    private String operador = "";
    private double segundoValor = 0;
    private double resultado = 0;
    
    private String mostrarResultado = "";
    
    protected InterfazInicio() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculadora");
        
        barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);
        
        menuUno = new JMenu("Acerca de");
        barraMenu.add(menuUno);
        
        creador = new JMenuItem("Creador del Software");
        creador.addActionListener(this);
        menuUno.add(creador);
        
        areaMemoria = new JTextArea();
        areaMemoria.setEditable(false);
        areaMemoria.setBackground(new Color(200, 200, 200));
        areaMemoria.setFont(new Font("Arial", 1, 13));
        
        scroll = new JScrollPane(areaMemoria);
        scroll.setBounds(0, 0, 300, 80);
        add(scroll);
        
        areaCalculo = new JTextField();
        areaCalculo.setBounds(0, 80, 350, 70);
        areaCalculo.setFont(new Font("Arial", 1, 18));
        add(areaCalculo);
        
        limpiar = new JButton("CE");
        limpiar.setBounds(0, 390, 75, 60);
        limpiar.setFont(new Font("Arial", 1, 15));
        limpiar.addActionListener(this);
        add(limpiar);
        
        cero = new JButton("0");
        cero.setBounds(75, 390, 75, 60);
        cero.setFont(new Font("Arial", 1, 15));
        cero.addActionListener(this);
        add(cero);
        
        uno = new JButton("1");
        uno.setBounds(0, 330, 75, 60);
        uno.setFont(new Font("Times New Roman", 1, 13));
        uno.addActionListener(this);
        add(uno);
        
        dos = new JButton("2");
        dos.setBounds(75, 330, 75, 60);
        dos.setFont(new Font("Times New Roman", 1, 13));
        dos.addActionListener(this);
        add(dos);
        
        tres = new JButton("3");
        tres.setBounds(150, 330, 75, 60);
        tres.setFont(new Font("Times New Roman", 1, 13));
        tres.addActionListener(this);
        add(tres);
        
        cuatro = new JButton("4");
        cuatro.setBounds(0, 270, 75, 60);
        cuatro.setFont(new Font("Times New Roman", 1, 13));
        cuatro.addActionListener(this);
        add(cuatro);
        
        cinco = new JButton("5");
        cinco.setBounds(75, 270, 75, 60);
        cinco.setFont(new Font("Times New Roman", 1, 13));
        cinco.addActionListener(this);
        add(cinco);
        
        seis = new JButton("6");
        seis.setBounds(150, 270, 75, 60);
        seis.setFont(new Font("Times New Roman", 1, 13));
        seis.addActionListener(this);
        add(seis);
        
        siete = new JButton("7");
        siete.setBounds(0, 210, 75, 60);
        siete.setFont(new Font("Times New Roman", 1, 13));
        siete.addActionListener(this);
        add(siete);
        
        ocho = new JButton("8");
        ocho.setBounds(75, 210, 75, 60);
        ocho.setFont(new Font("Times New Roman", 1, 13));
        ocho.addActionListener(this);
        add(ocho);
        
        nueve = new JButton("9");
        nueve.setBounds(150, 210, 75, 60);
        nueve.setFont(new Font("Times New Roman", 1, 13));
        nueve.addActionListener(this);
        add(nueve);
        
        borrar = new JButton("Borrar");
        borrar.setBounds(75, 150, 75, 60);
        borrar.setFont(new Font("Times New Roman", 1, 11));
        borrar.addActionListener(this);
        add(borrar);
        
        eliminar = new JButton("C");
        eliminar.setBounds(0, 150, 75, 60);
        eliminar.setFont(new Font("Times New Roman", 1, 16));
        eliminar.addActionListener(this);
        add(eliminar);
        
        sumar = new JButton("+");
        sumar.setBounds(225, 270, 75, 60);
        sumar.setFont(new Font("Times New Roman", 1, 13));
        sumar.addActionListener(this);
        add(sumar);
        
        restar = new JButton("-");
        restar.setBounds(225, 210, 75, 60);
        restar.setFont(new Font("Times New Roman", 1, 20));
        restar.addActionListener(this);
        add(restar);
        
        multiplicar = new JButton("*");
        multiplicar.setBounds(225, 150, 75, 60);
        multiplicar.setFont(new Font("Times New Roman", 1, 13));
        multiplicar.addActionListener(this);
        add(multiplicar);
        
        dividir = new JButton("/");
        dividir.setBounds(150, 150, 75, 60);
        dividir.setFont(new Font("Times New Roman", 1, 13));
        dividir.addActionListener(this);
        add(dividir);
        
        igual = new JButton("=");
        igual.setBounds(225, 330, 75, 120);
        igual.setFont(new Font("Times New Roman", 1, 18));
        igual.addActionListener(this);
        igual.setEnabled(false);
        add(igual);
        
        punto = new JButton(".");
        punto.setBounds(150, 390, 75, 60);
        punto.setFont(new Font("Times New Roman", 1, 13));
        punto.addActionListener(this);
        add(punto);
    } 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String contenidoAreaCalculo = "";
        
        if (e.getSource() == igual) {
            contenidoAreaCalculo = areaCalculo.getText();
            segundoValor = Double.parseDouble(contenidoAreaCalculo);
            operaciones();
            areaCalculo.setText(mostrarResultado);
            String textoAreaMemoria = areaMemoria.getText();
            areaMemoria.setText(textoAreaMemoria + "\n" + primerValor + " " + operador + " " + + segundoValor + " = " + mostrarResultado);
            
        } else if (e.getSource() == eliminar) {
            areaMemoria.setText("");
            areaCalculo.setText("");
            punto.setEnabled(true);
            
        } else if (e.getSource() == borrar) {
            contenidoAreaCalculo = areaCalculo.getText();
            
            if (contenidoAreaCalculo.length() > 0) {
                    String nuevoTexto = contenidoAreaCalculo.substring(0, contenidoAreaCalculo.length() - 1);
                    areaCalculo.setText(nuevoTexto);
            }
            
        } else if (e.getSource() == dividir) {
            contenidoAreaCalculo = areaCalculo.getText();
            
            primerValor = Double.parseDouble(contenidoAreaCalculo);
            operador = "/";
            areaCalculo.setText("");
            punto.setEnabled(true);
            igual.setEnabled(true);
            
        } else if (e.getSource() == multiplicar) {
            contenidoAreaCalculo = areaCalculo.getText();
            primerValor = Double.parseDouble(contenidoAreaCalculo);
            operador = "*";
            areaCalculo.setText("");
            punto.setEnabled(true);
            igual.setEnabled(true);
            
        } else if (e.getSource() == restar) {
            contenidoAreaCalculo = areaCalculo.getText();
            primerValor = Double.parseDouble(contenidoAreaCalculo);
            operador = "-";
            areaCalculo.setText("");
            punto.setEnabled(true);
            igual.setEnabled(true);
            
        } else if (e.getSource() == sumar) {
            contenidoAreaCalculo = areaCalculo.getText();
            primerValor = Double.parseDouble(contenidoAreaCalculo);
            operador = "+";
            igual.setEnabled(true);
            areaCalculo.setText("");
            punto.setEnabled(true);
            
        } else if (e.getSource() == punto) {
            contenidoAreaCalculo = areaCalculo.getText();
            String nuevoTexto = contenidoAreaCalculo + ".";
            areaCalculo.setText(nuevoTexto);
            punto.setEnabled(false);
            
        } else if (e.getSource() == cero) {
            contenidoAreaCalculo = areaCalculo.getText();
            String nuevoTexto = contenidoAreaCalculo + "0";
            areaCalculo.setText(nuevoTexto);
            
        } else if (e.getSource() == uno) {
            contenidoAreaCalculo = areaCalculo.getText();
            String nuevoTexto = contenidoAreaCalculo + "1";
            areaCalculo.setText(nuevoTexto);
            
        } else if (e.getSource() == dos) {
            contenidoAreaCalculo = areaCalculo.getText();
            String nuevoTexto = contenidoAreaCalculo + "2";
            areaCalculo.setText(nuevoTexto);
            
        } else if (e.getSource() == tres) {
            contenidoAreaCalculo = areaCalculo.getText();
            String nuevoTexto = contenidoAreaCalculo + "3";
            areaCalculo.setText(nuevoTexto);
            
        } else if (e.getSource() == cuatro) {
            contenidoAreaCalculo = areaCalculo.getText();
            String nuevoTexto = contenidoAreaCalculo + "4";
            areaCalculo.setText(nuevoTexto);
            
        } else if (e.getSource() == cinco) {
            contenidoAreaCalculo = areaCalculo.getText();
            String nuevoTexto = contenidoAreaCalculo + "5";
            areaCalculo.setText(nuevoTexto);
            
        } else if (e.getSource() == seis) {
            contenidoAreaCalculo = areaCalculo.getText();
            String nuevoTexto = contenidoAreaCalculo + "6";
            areaCalculo.setText(nuevoTexto);
            
        } else if (e.getSource() == siete) {
            contenidoAreaCalculo = areaCalculo.getText();
            String nuevoTexto = contenidoAreaCalculo + "7";
            areaCalculo.setText(nuevoTexto);
            
        } else if (e.getSource() == ocho) {
            contenidoAreaCalculo = areaCalculo.getText();
            String nuevoTexto = contenidoAreaCalculo + "8";
            areaCalculo.setText(nuevoTexto);
            
        } else if (e.getSource() == nueve) {
            contenidoAreaCalculo = areaCalculo.getText();
            String nuevoTexto = contenidoAreaCalculo + "9";
            areaCalculo.setText(nuevoTexto);
            
        } else if (e.getSource() == limpiar) {
            areaCalculo.setText("");
            punto.setEnabled(true);  
            
        } else if (e.getSource() == creador) {
            JOptionPane.showMessageDialog(null, "        Andres Bermudez"
                                              + "\n  GitHub: Andres-Bermudez"
                                              + "\n LinkedIn: Andres Bermudez");
        }
    }
    
    private void operaciones() {
        switch (operador) {
            case "+":
                resultado = primerValor + segundoValor;
                mostrarResultado = String.valueOf(resultado);
                break;
            case "-":
                resultado = primerValor - segundoValor;
                mostrarResultado = String.valueOf(resultado);
                break;
            case "*":
                resultado = primerValor * segundoValor;
                mostrarResultado = String.valueOf(resultado);
                break;
            case "/":
                if (segundoValor == 0) {
                    JOptionPane.showMessageDialog(null, "No es posible dividir entre cero(0)");
                    
                } else {
                    resultado = primerValor / segundoValor;
                    mostrarResultado = String.valueOf(resultado);
                }   break;
            default:
                break;
        }
    }
 
    public static void iniciar() {
        InterfazInicio interfazCalculadora = new InterfazInicio();
        interfazCalculadora.setBounds(0, 0, 300, 510);
        interfazCalculadora.setResizable(false);
        interfazCalculadora.setLocationRelativeTo(null);
        interfazCalculadora.setVisible(true);
    }
}

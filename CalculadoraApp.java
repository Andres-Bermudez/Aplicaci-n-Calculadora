import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CalculadoraApp extends JFrame implements ActionListener {
    private JMenuBar barraMenu;
    private JMenu menuUno, menuDos, colorFondo;
    private JMenuItem clasico, oscuro, claro, creador;
    private JTextField areaCalculo;
    private JButton limpiar, cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, sumar, restar,
            multiplicar, dividir, igual, borrar, eliminar, punto;
    private JTextArea areaMemoria;
    private JScrollPane scroll;
    
    public static double primerValor = 0;
    public static String operador = "";
    public static double segundoValor = 0;
    public static double resultado = 0;
    
    public static String mostrarResultado = "";
    
    public CalculadoraApp() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculadora");
        getContentPane().setBackground(new Color(20, 20, 20));
        
        barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);
        
        menuUno = new JMenu("Opciones");
        barraMenu.add(menuUno);
        
        colorFondo = new JMenu("Color de Fondo");
        menuUno.add(colorFondo);
        
        menuDos = new JMenu("Acerca de");
        barraMenu.add(menuDos);
        
        creador = new JMenuItem("Creador del Software");
        creador.addActionListener(this);
        menuDos.add(creador);
        
        clasico = new JMenuItem("Clasico");
        clasico.addActionListener(this);
        colorFondo.add(clasico);
        
        oscuro = new JMenuItem("Oscuro");
        oscuro.addActionListener(this);
        colorFondo.add(oscuro);
        
        claro = new JMenuItem("Claro");
        claro.addActionListener(this);
        colorFondo.add(claro);
        
        areaMemoria = new JTextArea();
        areaMemoria.setEditable(false);
        areaMemoria.setBackground(new Color(200, 200, 200));
        areaMemoria.setFont(new Font("Arial", 1, 13));
        areaMemoria.setForeground(new Color(0, 0, 0));
        
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
        limpiar.setForeground(new Color(0, 0, 0));
        limpiar.addActionListener(this);
        add(limpiar);
        
        cero = new JButton("0");
        cero.setBounds(75, 390, 75, 60);
        cero.setFont(new Font("Arial", 1, 15));
        cero.setForeground(new Color(0, 0, 0));
        cero.addActionListener(this);
        add(cero);
        
        uno = new JButton("1");
        uno.setBounds(0, 330, 75, 60);
        uno.setFont(new Font("Times New Roman", 1, 13));
        uno.setForeground(new Color(0, 0, 0));
        uno.addActionListener(this);
        add(uno);
        
        dos = new JButton("2");
        dos.setBounds(75, 330, 75, 60);
        dos.setFont(new Font("Times New Roman", 1, 13));
        dos.setForeground(new Color(0, 0, 0));
        dos.addActionListener(this);
        add(dos);
        
        tres = new JButton("3");
        tres.setBounds(150, 330, 75, 60);
        tres.setFont(new Font("Times New Roman", 1, 13));
        tres.setForeground(new Color(0, 0, 0));
        tres.addActionListener(this);
        add(tres);
        
        cuatro = new JButton("4");
        cuatro.setBounds(0, 270, 75, 60);
        cuatro.setFont(new Font("Times New Roman", 1, 13));
        cuatro.setForeground(new Color(0, 0, 0));
        cuatro.addActionListener(this);
        add(cuatro);
        
        cinco = new JButton("5");
        cinco.setBounds(75, 270, 75, 60);
        cinco.setFont(new Font("Times New Roman", 1, 13));
        cinco.setForeground(new Color(0, 0, 0));
        cinco.addActionListener(this);
        add(cinco);
        
        seis = new JButton("6");
        seis.setBounds(150, 270, 75, 60);
        seis.setFont(new Font("Times New Roman", 1, 13));
        seis.setForeground(new Color(0, 0, 0));
        seis.addActionListener(this);
        add(seis);
        
        siete = new JButton("7");
        siete.setBounds(0, 210, 75, 60);
        siete.setFont(new Font("Times New Roman", 1, 13));
        siete.setForeground(new Color(0, 0, 0));
        siete.addActionListener(this);
        add(siete);
        
        ocho = new JButton("8");
        ocho.setBounds(75, 210, 75, 60);
        ocho.setFont(new Font("Times New Roman", 1, 13));
        ocho.setForeground(new Color(0, 0, 0));
        ocho.addActionListener(this);
        add(ocho);
        
        nueve = new JButton("9");
        nueve.setBounds(150, 210, 75, 60);
        nueve.setFont(new Font("Times New Roman", 1, 13));
        nueve.setForeground(new Color(0, 0, 0));
        nueve.addActionListener(this);
        add(nueve);
        
        borrar = new JButton("Borrar");
        borrar.setBounds(75, 150, 75, 60);
        borrar.setFont(new Font("Times New Roman", 1, 13));
        borrar.setForeground(new Color(0, 0, 0));
        borrar.addActionListener(this);
        add(borrar);
        
        eliminar = new JButton("C");
        eliminar.setBounds(0, 150, 75, 60);
        eliminar.setFont(new Font("Times New Roman", 1, 16));
        eliminar.setForeground(new Color(255, 0, 0));
        eliminar.addActionListener(this);
        add(eliminar);
        
        sumar = new JButton("+");
        sumar.setBounds(225, 270, 75, 60);
        sumar.setFont(new Font("Times New Roman", 1, 13));
        sumar.setForeground(new Color(0, 0, 0));
        sumar.addActionListener(this);
        add(sumar);
        
        restar = new JButton("-");
        restar.setBounds(225, 210, 75, 60);
        restar.setFont(new Font("Times New Roman", 1, 20));
        restar.setForeground(new Color(0, 0, 0));
        restar.addActionListener(this);
        add(restar);
        
        multiplicar = new JButton("*");
        multiplicar.setBounds(225, 150, 75, 60);
        multiplicar.setFont(new Font("Times New Roman", 1, 13));
        multiplicar.setForeground(new Color(0, 0, 0));
        multiplicar.addActionListener(this);
        add(multiplicar);
        
        dividir = new JButton("/");
        dividir.setBounds(150, 150, 75, 60);
        dividir.setFont(new Font("Times New Roman", 1, 13));
        dividir.setForeground(new Color(0, 0, 0));
        dividir.addActionListener(this);
        add(dividir);
        
        igual = new JButton("=");
        igual.setBounds(225, 330, 75, 120);
        igual.setFont(new Font("Times New Roman", 1, 18));
        igual.setForeground(new Color(0, 0, 0));
        igual.addActionListener(this);
        igual.setEnabled(false);
        add(igual);
        
        punto = new JButton(".");
        punto.setBounds(150, 390, 75, 60);
        punto.setFont(new Font("Times New Roman", 1, 13));
        punto.setForeground(new Color(0, 0, 0));
        punto.addActionListener(this);
        add(punto);
        
    } 
    
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
            
        } else if (e.getSource() == oscuro) {
            barraMenu.setBackground(new Color(50,50,50));
            menuUno.setForeground(new Color(255, 255, 255));
            
            colorFondo.setBackground(new Color(80, 80, 80));
            colorFondo.setForeground(new Color(255, 255, 255));
            
            menuDos.setBackground(new Color(80, 80, 80));
            menuDos.setForeground(new Color(255, 255, 255));
            
            creador.setBackground(new Color(80, 80, 80));
            creador.setForeground(new Color(255, 255, 255));
            
            clasico.setBackground(new Color(80, 80, 80));
            clasico.setForeground(new Color(255, 255, 255));
            
            oscuro.setForeground(new Color(255, 255, 255));
            oscuro.setBackground(new Color(80, 80, 80));
            
            claro.setForeground(new Color(255, 255, 255));
            claro.setBackground(new Color(80, 80, 80));
            
            areaMemoria.setBackground(new Color(80, 80, 80));
            areaMemoria.setForeground(new Color(255, 255, 255));
            
            areaCalculo.setBackground(new Color(50, 50, 50));
            areaCalculo.setForeground(new Color(255, 255, 255));
            
            eliminar.setBackground(new Color(37, 40, 80));
            
            borrar.setBackground(new Color(37, 40, 80));
            borrar.setForeground(new Color(255, 255, 255));
            
            dividir.setBackground(new Color(37, 40, 80));
            dividir.setForeground(new Color(255, 255, 255));
            
            multiplicar.setBackground(new Color(37, 40, 80));
            multiplicar.setForeground(new Color(255, 255, 255));
            
            restar.setBackground(new Color(37, 40, 80));
            restar.setForeground(new Color(255, 255, 255));
            
            sumar.setBackground(new Color(37, 40, 80));
            sumar.setForeground(new Color(255, 255, 255));
            
            igual.setBackground(new Color(37, 40, 80));
            igual.setForeground(new Color(255, 255, 255));
            
            punto.setBackground(new Color(37, 40, 80));
            punto.setForeground(new Color(255, 255, 255));
            
            limpiar.setBackground(new Color(37, 40, 80));
            limpiar.setForeground(new Color(255, 255, 255));
            
            uno.setBackground(new Color(37, 40, 80));
            uno.setForeground(new Color(255, 255, 255));
            
            dos.setBackground(new Color(37, 40, 80));
            dos.setForeground(new Color(255, 255, 255));
            
            tres.setBackground(new Color(37, 40, 80));
            tres.setForeground(new Color(255, 255, 255));
            
            cuatro.setBackground(new Color(37, 40, 80));
            cuatro.setForeground(new Color(255, 255, 255));
            
            cinco.setBackground(new Color(37, 40, 80));
            cinco.setForeground(new Color(255, 255, 255));
            
            seis.setBackground(new Color(37, 40, 80));
            seis.setForeground(new Color(255, 255, 255));
            
            siete.setBackground(new Color(37, 40, 80));
            siete.setForeground(new Color(255, 255, 255));
            
            ocho.setBackground(new Color(37, 40, 80));
            ocho.setForeground(new Color(255, 255, 255));
            
            nueve.setBackground(new Color(37, 40, 80));
            nueve.setForeground(new Color(255, 255, 255));
            
            cero.setBackground(new Color(37, 40, 80));
            cero.setForeground(new Color(255, 255, 255));
            
        } else if (e.getSource() == clasico) {
            CalculadoraApp interfazCalculadora = new CalculadoraApp();
            interfazCalculadora.setBounds(0, 0, 300, 510);
            interfazCalculadora.setResizable(false);
            interfazCalculadora.setLocationRelativeTo(null);
            interfazCalculadora.setVisible(true);
            
            this.setVisible(false);
            
        } else if (e.getSource() == claro) {
            barraMenu.setBackground(new Color(255,255,255));
            menuUno.setForeground(new Color(0, 0, 0));
            
            colorFondo.setBackground(new Color(255,255,255));
            colorFondo.setForeground(new Color(0, 0, 0));
            
            menuDos.setBackground(new Color(255,255,255));
            menuDos.setForeground(new Color(0, 0, 0));
            
            creador.setBackground(new Color(255,255,255));
            creador.setForeground(new Color(0, 0, 0));
            
            clasico.setBackground(new Color(255,255,255));
            clasico.setForeground(new Color(0, 0, 0));
            
            oscuro.setForeground(new Color(255, 255, 255));
            oscuro.setBackground(new Color(0, 0, 0));
            
            claro.setForeground(new Color(255, 255, 255));
            claro.setBackground(new Color(0, 0, 0));
            
            areaMemoria.setBackground(new Color(255, 255, 255));
            areaMemoria.setForeground(new Color(0, 0, 0));
            
            areaCalculo.setBackground(new Color(255, 255, 255));
            areaCalculo.setForeground(new Color(0, 0, 0));
            
            eliminar.setBackground(new Color(255, 255, 255));
            eliminar.setForeground(new Color(255, 0, 0));
            
            borrar.setBackground(new Color(255, 255, 255));
            borrar.setForeground(new Color(0, 0, 0));
            
            dividir.setBackground(new Color(255, 255, 255));
            dividir.setForeground(new Color(0, 0, 0));
            
            multiplicar.setBackground(new Color(255, 255, 255));
            multiplicar.setForeground(new Color(0, 0, 0));
            
            restar.setBackground(new Color(255, 255, 255));
            restar.setForeground(new Color(0, 0, 0));
            
            sumar.setBackground(new Color(255, 255, 255));
            sumar.setForeground(new Color(0, 0, 0));
            
            igual.setBackground(new Color(255, 255, 255));
            igual.setForeground(new Color(0, 0, 0));
            
            punto.setBackground(new Color(255, 255, 255));
            punto.setForeground(new Color(0, 0, 0));
            
            limpiar.setBackground(new Color(255, 255, 255));
            limpiar.setForeground(new Color(0, 0, 0));
            
            uno.setBackground(new Color(255, 255, 255));
            uno.setForeground(new Color(0, 0, 0));
            
            dos.setBackground(new Color(255, 255, 255));
            dos.setForeground(new Color(0, 0, 0));
            
            tres.setBackground(new Color(255, 255, 255));
            tres.setForeground(new Color(0, 0, 0));
            
            cuatro.setBackground(new Color(255, 255, 255));
            cuatro.setForeground(new Color(0, 0, 0));
            
            cinco.setBackground(new Color(255, 255, 255));
            cinco.setForeground(new Color(0, 0, 0));
            
            seis.setBackground(new Color(255, 255, 255));
            seis.setForeground(new Color(0, 0, 0));
            
            siete.setBackground(new Color(255, 255, 255));
            siete.setForeground(new Color(0, 0, 0));
            
            ocho.setBackground(new Color(255, 255, 255));
            ocho.setForeground(new Color(0, 0, 0));
            
            nueve.setBackground(new Color(255, 255, 255));
            nueve.setForeground(new Color(0, 0, 0));
            
            cero.setBackground(new Color(255, 255, 255));
            cero.setForeground(new Color(0, 0, 0));   
            
        } else if (e.getSource() == creador) {
            JOptionPane.showMessageDialog(null, "        Andres Bermudez"
                                              + "\n  GitHub: Andres-Bermudez"
                                              + "\n Facebook: Andres Bermudez");
        }
    }
    
    public void operaciones() {
        if (operador.equals("+")) {
            resultado = primerValor + segundoValor;
            mostrarResultado = String.valueOf(resultado);
            
        } else if (operador.equals("-")) {
            resultado = primerValor - segundoValor;
            mostrarResultado = String.valueOf(resultado);
            
        } else if (operador.equals("*")) {
            resultado = primerValor * segundoValor;
            mostrarResultado = String.valueOf(resultado);
            
        } else if (operador.equals("/")) {
            if (segundoValor == 0) {
                JOptionPane.showMessageDialog(null, "No es posible dividir entre cero(0)");
                
            } else {
                resultado = primerValor / segundoValor;
                mostrarResultado = String.valueOf(resultado);
            }
        }
    }
 
    public static void main(String[] args) {
        CalculadoraApp interfazCalculadora = new CalculadoraApp();
        interfazCalculadora.setBounds(0, 0, 300, 510);
        interfazCalculadora.setResizable(false);
        interfazCalculadora.setLocationRelativeTo(null);
        interfazCalculadora.setVisible(true);
    }
}

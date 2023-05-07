package Extra4_SwingLayouts;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JButton botonPanel1;
    private JLabel etiquetaPanel1;

    private JPanel panel2;
    private JLabel etiquetaPanel2;

    private JPanel panel3;
    private JComboBox<String> comboBoxPanel3;

    private JPanel panel4;
    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel 1-----------------------------------------------------------------------------
        panel1 = new JPanel();
        panel1.setBackground(new Color(255, 170, 255));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        botonPanel1 = new JButton("Presioname!!");
        panel1.add(botonPanel1);
        etiquetaPanel1 = new JLabel("....");
        panel1.add(etiquetaPanel1);
        botonPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiquetaPanel1.setText("Hola, presionaste el boton del panel 1");
            }
        });
        this.getContentPane().add(panel1,0);

        //panel 2----------------------------------------------------------------------------
        String urlImagen = "https://i.pinimg.com/474x/40/1a/33/401a33837de6a0db7ed3913393b31400.jpg";
        panel2 = new JPanel();
        panel2.setBackground(new Color(220,200,100));
        panel2.setLayout(new FlowLayout());
        //Cargar imagen
        try{
            URL url = new URL(urlImagen);
            Image imagen = ImageIO.read(url);
            ImageIcon imagenIcon = new ImageIcon(imagen);
            etiquetaPanel2 = new JLabel(imagenIcon);
            panel2.add(etiquetaPanel2);
            this.getContentPane().add(panel2,1);
        }catch(MalformedURLException me){
            System.out.println("URL no válido");
        }catch(Exception e){
            System.out.println("Error al cargar la imagen");
        }

        //panel 3----------------------------------------------------------------------------
        panel3 = new JPanel();
        panel3.setBackground(new Color(255,130,100));
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elementos = {"Opcion 1","Opcion 2","Opcion 3","Opcion 4" };
        comboBoxPanel3 = new JComboBox<>(elementos);
        comboBoxPanel3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(comboBoxPanel3.getSelectedIndex());
            }
        });
        panel3.add(comboBoxPanel3);
        this.getContentPane().add(panel3,2);

        //panel 4----------------------------------------------------------------------------
        panel4 = new JPanel();
        panel4.setBackground(new Color(130,235,255));
        this.getContentPane().add(panel4,3);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Adios...");
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
}

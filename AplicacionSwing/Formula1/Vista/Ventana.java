package AplicacionSwing.Formula1.Vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
    private JLabel lblID;
    private JLabel lblEdad;
    private JLabel lblPiloto;
    private JLabel lblEquipo;
    private JLabel lblMonoplaza;
    private JLabel lblPodios;
    private JLabel lblImagen;
    private JTextField txtID;
    private JTextField txtEdad;
    private JTextField txtPiloto;
    private JTextField txtEquipo;
    private JTextField txtMonoplaza;
    private JTextField txtPodios;
    private JTextField txtImagen;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnModificar;
    private JButton btnEliminar;
    private JTable tblFormula1;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private GridLayout layout;
    private JScrollPane scrollPane;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(1000,720);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //Panel1 (Formulario)
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(206, 131, 211));
        lblID = new JLabel("ID: ");
        lblEdad = new JLabel("Edad: ");
        lblPiloto = new JLabel("Piloto: ");
        lblEquipo = new JLabel("Equipo: ");
        lblMonoplaza = new JLabel("Monoplaza: ");
        lblPodios = new JLabel("Podios: ");
        lblImagen = new JLabel("URL: ");
        txtID = new JTextField(2);
        txtID.setText("0");
        txtID.setEnabled(false); //No modificar el ID
        txtEdad = new JTextField(3);
        txtPiloto = new JTextField(25);
        txtEquipo = new JTextField(12);
        txtMonoplaza = new JTextField(10);
        txtPodios = new JTextField(3);
        txtImagen = new JTextField(20);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblID);
        panel1.add(txtID);
        panel1.add(lblEdad);
        panel1.add(txtEdad);
        panel1.add(lblPiloto);
        panel1.add(txtPiloto);
        panel1.add(lblEquipo);
        panel1.add(txtEquipo);
        panel1.add(lblMonoplaza);
        panel1.add(txtMonoplaza);
        panel1.add(lblPodios);
        panel1.add(txtPodios);
        panel1.add(lblImagen);
        panel1.add(txtImagen);
        panel1.add(btnAgregar);

        //Panel2 (Tabla)
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(194, 246, 195));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblFormula1 = new JTable();
        scrollPane = new JScrollPane(tblFormula1);
        panel2.add(scrollPane);


        //Panel3 (Mostrar imagen)
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(255, 172, 251));
        lblImagen = new JLabel("");
        panel3.add(lblImagen);


        //Panel4 (Eliminar o Moficar componente/s)
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(252, 194, 165));
        btnModificar = new JButton("Modificar");
        btnEliminar = new JButton("Borrar");
        panel4.add(btnModificar);
        panel4.add(btnEliminar);


        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblID() {
        return lblID;
    }

    public void setLblID(JLabel lblID) {
        this.lblID = lblID;
    }

    public JLabel getLblEdad() {
        return lblEdad;
    }

    public void setLblEdad(JLabel lblEdad) {
        this.lblEdad = lblEdad;
    }

    public JLabel getLblPiloto() {
        return lblPiloto;
    }

    public void setLblPiloto(JLabel lblPiloto) {
        this.lblPiloto = lblPiloto;
    }

    public JLabel getLblEquipo() {
        return lblEquipo;
    }

    public void setLblEquipo(JLabel lblEquipo) {
        this.lblEquipo = lblEquipo;
    }

    public JLabel getLblMonoplaza() {
        return lblMonoplaza;
    }

    public void setLblMonoplaza(JLabel lblMonoplaza) {
        this.lblMonoplaza = lblMonoplaza;
    }

    public JLabel getLblPodios() {
        return lblPodios;
    }

    public void setLblPodios(JLabel lblPodios) {
        this.lblPodios = lblPodios;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(JTextField txtID) {
        this.txtID = txtID;
    }

    public JTextField getTxtEdad() {
        return txtEdad;
    }

    public void setTxtEdad(JTextField txtEdad) {
        this.txtEdad = txtEdad;
    }

    public JTextField getTxtPiloto() {
        return txtPiloto;
    }

    public void setTxtPiloto(JTextField txtPiloto) {
        this.txtPiloto = txtPiloto;
    }

    public JTextField getTxtEquipo() {
        return txtEquipo;
    }

    public void setTxtEquipo(JTextField txtEquipo) {
        this.txtEquipo = txtEquipo;
    }

    public JTextField getTxtMonoplaza() {
        return txtMonoplaza;
    }

    public void setTxtMonoplaza(JTextField txtMonoplaza) {
        this.txtMonoplaza = txtMonoplaza;
    }

    public JTextField getTxtPodios() {
        return txtPodios;
    }

    public void setTxtPodios(JTextField txtPodios) {
        this.txtPodios = txtPodios;
    }

    public JTextField getTxtImagen() {
        return txtImagen;
    }

    public void setTxtImagen(JTextField txtImagen) {
        this.txtImagen = txtImagen;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JTable getTblFormula1() {
        return tblFormula1;
    }

    public void setTblFormula1(JTable tblFormula1) {
        this.tblFormula1 = tblFormula1;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public void limpiarEntradas(){
        txtEdad.setText("");
        txtPiloto.setText("");
        txtEquipo.setText("");
        txtMonoplaza.setText("");
        txtPodios.setText("");
        txtImagen.setText("");
    }
}
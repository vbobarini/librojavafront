/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp_library;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Antonio
 */
public class Lendings extends javax.swing.JPanel {

    Connect conn;
    Connection reg;
    /**
     * Creates new form Principal
     */
    public Lendings() {
        initComponents();
        conn = new Connect();
        reg = conn.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        book_id = new javax.swing.JTextField();
        folio = new javax.swing.JTextField();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Nuevo Préstamo");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Libro ID");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Folio Usuario");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 260, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 260, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 10, 350));

        book_id.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        book_id.setForeground(new java.awt.Color(102, 102, 102));
        book_id.setText("Ingrese el ID del Libro a prestar");
        book_id.setBorder(null);
        book_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                book_idMousePressed(evt);
            }
        });
        book_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_idActionPerformed(evt);
            }
        });
        add(book_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 260, 30));

        folio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        folio.setForeground(new java.awt.Color(102, 102, 102));
        folio.setText("Ingrese el folio del usuario");
        folio.setBorder(null);
        folio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                folioMousePressed(evt);
            }
        });
        add(folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 260, 30));

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonMousePressed(evt);
            }
        });
        button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Prestar");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 260, 50));

        Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itp_library/images/prestamo.gif"))); // NOI18N
        Image.setMaximumSize(new java.awt.Dimension(750, 430));
        Image.setMinimumSize(new java.awt.Dimension(750, 430));
        add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void book_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_idActionPerformed

    private void folioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_folioMousePressed
       if(folio.getText().equals("Ingrese el folio del usuario"))
        folio.setText("");
       if(book_id.getText().equals("") || book_id.getText() == null || book_id.getText().equals(" "))
        book_id.setText("Ingrese el ID del Libro a prestar");
    }//GEN-LAST:event_folioMousePressed

    private void book_idMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_idMousePressed
        if(book_id.getText().equals("Ingrese el ID del Libro a prestar"))
            book_id.setText("");
        if(folio.getText().equals("") || folio.getText() == null || folio.getText().equals(" "))
            folio.setText("Ingrese el folio del usuario");
    }//GEN-LAST:event_book_idMousePressed

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited
    // PRESTAR
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        String fol = folio.getText();
        String book = book_id.getText();
        int intfol = 0;
        
        // Conditions
        if(fol.equals("") || book.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            folio.requestFocus();
        }
        else{
            try
            {
                intfol = Integer.parseInt(folio.getText());
                
                if(intfol <= 0){
                    javax.swing.JOptionPane.showMessageDialog(this, "El folio del usuario debe ser mayor a 0. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                     folio.requestFocus();
                }
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(this, "El folio del usuario debe ser un número entero. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                 folio.requestFocus();
            }            
        }
        
        try {
            // Verificamos el usuario
            boolean pase = UserExist(intfol);
            if(!pase){
                javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún usuario con ese Folio. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                 folio.requestFocus();
            }
            // Verificamos el libro
            else if(!BookExist(book)){
                javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún libro con esa ID. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                 book_id.requestFocus();
            }
            else if(CheckLending(intfol, book)){
                javax.swing.JOptionPane.showMessageDialog(this, "Esa persona ya cuenta con el préstamo de ese mismo Libro. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                 book_id.requestFocus();
            }
            else if(!BookAvailable(book)){
                javax.swing.JOptionPane.showMessageDialog(this, "Ya no hay más libros con esa ID para prestar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                 book_id.requestFocus();
            }
            else{
                InsertLending(intfol, book);// Insertamos el prestamo a la DB.
                folio.setText("");
                book_id.setText("");
            }
              
        } catch (SQLException ex) {
            Logger.getLogger(Lendings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonMousePressed

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    
    public boolean UserExist(int id) throws SQLException{
        boolean res = false;
        Statement stm = reg.createStatement();
        ResultSet re = stm.executeQuery("SELECT `id` FROM `users` WHERE `id` = '"+id+"' LIMIT 1");
        if(re.next())
            res = true;
        
        return res;
    }
    
    public boolean BookExist(String bookid) throws SQLException{
        boolean res = false;
        Statement stm = reg.createStatement();
        ResultSet re = stm.executeQuery("SELECT `id` FROM `books` WHERE `id` = '"+bookid+"' LIMIT 1");
        if(re.next())
            res = true;
        
        return res;
    }
    
    public boolean BookAvailable(String bookid) throws SQLException{
        boolean res = false;
        Statement stm = reg.createStatement();
        ResultSet re = stm.executeQuery("SELECT `available` FROM `books` WHERE `id` = '"+bookid+"' LIMIT 1");
        if(re.next()){
            int av = Integer.parseInt(re.getString("available"));
            if(av >= 1)
                res = true;
        }
        
        return res;
    }
    
    public boolean CheckSanction(int userid, String bookid) throws SQLException, ParseException{
        boolean res = false;
        Statement stm = reg.createStatement();
        ResultSet re = stm.executeQuery("SELECT * FROM `lendings` WHERE `id` = '"+bookid+"' AND `user_id` = '"+userid+"' LIMIT 1");
        System.out.println("1");
        if(re.next()){
            System.out.println("2");
            Date ahora = new Date();
            Date returned = deStringToDate(re.getString("date_return"));
            System.out.println("2");
            int days = diferenciasDeFechas(returned, ahora);
            System.out.println("3");
            System.out.println(days);
            int days2 = diferenciasDeFechas(ahora, returned);
            System.out.println(days2);
            if(days <= 0)
                res = true;
            System.out.println("4");
        }
        System.out.println("5");
        return res;
    }
    
    public boolean CheckLending(int userid, String bookid) throws SQLException{
        boolean res = false;
        Statement stm = reg.createStatement();
        ResultSet re = stm.executeQuery("SELECT * FROM `lendings` WHERE `user_id` = '"+userid+"' AND `book_id` = '"+ bookid +"'");
        if(re.next()){
            res = true;
        }
        
        return res;
    }
    
    public void InsertLending(int id, String bookid) throws SQLException{
        Statement stm = reg.createStatement();
        String date = getFechaActual();
        Date ahora = new Date();
        Date devol = sumarFechasDias(ahora, 15);//Sumamos 15 días a la fecha actual.
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        String dev = formateador.format(devol);
        stm.executeUpdate("INSERT INTO `lendings` (`id`, `user_id`, `book_id`, `date_out`, `date_return`) VALUES (NULL, '"+id+"', '"+ bookid +"', '"+ date +"', '"+dev+"')");
        stm.executeUpdate("UPDATE `books` SET `available` = available-1 WHERE `id` = '"+ bookid +"';");
        javax.swing.JOptionPane.showMessageDialog(this, "¡Prestamo realizado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public void Devolutions(int fo, String bookid) throws SQLException, ParseException{
        Statement stm = reg.createStatement();
        int days = -1;
        boolean ready = false;
        do{
            ResultSet re = stm.executeQuery("SELECT * FROM `lendings` WHERE `book_id` = '"+bookid+"' AND `user_id` = '"+fo+"' LIMIT 1");
            if(re.next()){
                Date ahora = new Date();
                Date returned = deStringToDate(re.getString("date_return"));
                days = diferenciasDeFechas(ahora, returned);                
            }
            ready = true;
        }while(!ready);
        if(ready){
            stm.executeUpdate("DELETE FROM `lendings` WHERE `book_id` = '"+ bookid +"' AND `user_id` = '"+ fo +"' LIMIT 1");
            stm.executeUpdate("UPDATE `books` SET `available` = available+1 WHERE `id` = '"+ bookid +"';");
            if(days <= 0){
                int money = 0;
                money = days * -1;
                int cost = 5;// Costo por día retardado.
                money = money * cost;
                stm.executeUpdate("UPDATE `users` SET `sanctions` = sanctions+1, `sanc_money` = sanc_money+'"+ money +"' WHERE `id` = '"+ fo +"';");
                javax.swing.JOptionPane.showMessageDialog(this, "¡SANCIONADO POR ENTREGA A DESTIEMPO! ($"+money+") \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            javax.swing.JOptionPane.showMessageDialog(this, "¡Devolución realizada correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        }
    }
    
    public static String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }
    
    public static java.sql.Date sumarFechasDias(java.util.Date fch, int dias) {
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(fch.getTime());
        cal.add(Calendar.DATE, dias);
        return new java.sql.Date(cal.getTimeInMillis());
    }
    
    //Diferencias entre dos fechas
    //@param fechaInicial La fecha de inicio
    //@param fechaFinal  La fecha de fin
    //@return Retorna el numero de dias entre dos fechas
    public static synchronized int diferenciasDeFechas(Date fechaInicial, Date fechaFinal) throws ParseException {

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechaInicioString = df.format(fechaInicial);
        try {
            fechaInicial = df.parse(fechaInicioString);
        } catch (ParseException ex) {
        }

        String fechaFinalString = df.format(fechaFinal);
        fechaFinal = df.parse(fechaFinalString);

        long fechaInicialMs = fechaInicial.getTime();
        long fechaFinalMs = fechaFinal.getTime();
        long diferencia = fechaFinalMs - fechaInicialMs;
        double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
        return ((int) dias);
    }

    //Devuele un java.util.Date desde un String en formato dd-MM-yyyy
    //@param La fecha a convertir a formato date
    //@return Retorna la fecha en formato Date
    public static synchronized java.util.Date deStringToDate(String fecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaEnviar = null;
        try {
            fechaEnviar = formatoDelTexto.parse(fecha);
            return fechaEnviar;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JTextField book_id;
    private javax.swing.JPanel button;
    private javax.swing.JTextField folio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}

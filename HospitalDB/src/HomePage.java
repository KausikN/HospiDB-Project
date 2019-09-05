
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kausik N
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l_Username = new javax.swing.JLabel();
        nav = new javax.swing.JPanel();
        view_button = new javax.swing.JButton();
        account_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        add_delete_button = new javax.swing.JButton();
        back = new javax.swing.JButton();
        appointment_button = new javax.swing.JButton();
        l_t = new javax.swing.JLabel();
        l_ID = new javax.swing.JLabel();
        l_n1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 72, 124));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        l_Username.setBackground(new java.awt.Color(234, 234, 234));
        l_Username.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        l_Username.setForeground(new java.awt.Color(237, 234, 234));
        jPanel1.add(l_Username);
        l_Username.setBounds(390, 360, 230, 30);

        nav.setBackground(new java.awt.Color(255, 255, 255));
        nav.setForeground(new java.awt.Color(102, 255, 204));

        view_button.setBackground(new java.awt.Color(5, 32, 74));
        view_button.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        view_button.setForeground(new java.awt.Color(237, 234, 234));
        view_button.setText("VIEW");
        view_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_buttonActionPerformed(evt);
            }
        });

        account_button.setBackground(new java.awt.Color(5, 32, 74));
        account_button.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        account_button.setForeground(new java.awt.Color(237, 234, 234));
        account_button.setText("ACCOUNT");
        account_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_buttonActionPerformed(evt);
            }
        });

        update_button.setBackground(new java.awt.Color(5, 32, 74));
        update_button.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        update_button.setForeground(new java.awt.Color(237, 234, 234));
        update_button.setText("UPDATE");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        add_delete_button.setBackground(new java.awt.Color(5, 32, 74));
        add_delete_button.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        add_delete_button.setForeground(new java.awt.Color(237, 234, 234));
        add_delete_button.setText("INSERT/DELETE");
        add_delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_delete_buttonActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(5, 32, 74));
        back.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        back.setForeground(new java.awt.Color(237, 234, 234));
        back.setText("SIGN OUT");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navLayout = new javax.swing.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(view_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(add_delete_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(update_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(account_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addComponent(account_button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(view_button, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add_delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        jPanel1.add(nav);
        nav.setBounds(0, 0, 220, 800);

        appointment_button.setBackground(new java.awt.Color(0, 255, 255));
        appointment_button.setFont(new java.awt.Font("Calibri", 0, 40)); // NOI18N
        appointment_button.setForeground(new java.awt.Color(0, 51, 204));
        appointment_button.setText("Book Appointment");
        appointment_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointment_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(appointment_button);
        appointment_button.setBounds(530, 620, 430, 130);

        l_t.setBackground(new java.awt.Color(234, 234, 234));
        l_t.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        l_t.setForeground(new java.awt.Color(255, 255, 255));
        l_t.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_t.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(l_t);
        l_t.setBounds(530, 470, 430, 130);

        l_ID.setBackground(new java.awt.Color(234, 234, 234));
        l_ID.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        l_ID.setForeground(new java.awt.Color(237, 234, 234));
        l_ID.setText("ID ");
        jPanel1.add(l_ID);
        l_ID.setBounds(240, 440, 190, 32);

        l_n1.setBackground(new java.awt.Color(234, 234, 234));
        l_n1.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        l_n1.setForeground(new java.awt.Color(237, 234, 234));
        l_n1.setText("Welcome");
        jPanel1.add(l_n1);
        l_n1.setBounds(240, 360, 110, 32);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg"))); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(220, 0, 1030, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String Table;
String Username;
String Password;
String Id;
String Category;
String Choice;

String[] viewable_tables = new String[10];
int viewable_tables_size = 0;
String[] updatable_tables = new String[10];
int updatable_tables_size = 0;
String[] deletable_tables = new String[10];
int deletable_tables_size = 0;

void MySQLConnector_GetUser(){
    try {
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","mysql");
    String s1="select Username, Password, Id, Category from LoginDetails where LoggedIn = 1;";
    Statement st1 = con.createStatement();
    ResultSet rs = st1.executeQuery(s1);
    int rs_size = 0;
    while(rs.next()){
        Username = rs.getString("Username");
        Password = rs.getString("Password");
        Id = rs.getString("Id");
        Category = rs.getString("Category");
        
        rs_size++;
    }
    
    if(rs_size != 1){
        System.out.println("ERROR: Multiple LoggedIn users.");
    }
    
    rs.close();
    con.close();
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());
    }
}

void FindAccesibleTables(String category){
    if(category.equals("Admin")){
        viewable_tables[0] = "Doctors";
        viewable_tables[1] = "Patients";
        viewable_tables[2] = "Rooms";
        viewable_tables[3] = "Staff";
        viewable_tables[4] = "Lab";
        viewable_tables[5] = "Equipment";
        viewable_tables[6] = "MedicalStock";
        viewable_tables[7] = "PatientReport";
        viewable_tables_size = 8;
        
        updatable_tables[0] = "Doctors";
        updatable_tables[1] = "Patients";
        updatable_tables[2] = "Rooms";
        updatable_tables[3] = "Staff";
        updatable_tables[4] = "Lab";
        updatable_tables[5] = "Equipment";
        updatable_tables[6] = "MedicalStock";
        updatable_tables[7] = "PatientReport";
        updatable_tables_size = 8;
        
        deletable_tables[0] = "Doctors";
        deletable_tables[1] = "Patients";
        deletable_tables[2] = "Rooms";
        deletable_tables[3] = "Staff";
        deletable_tables[4] = "Lab";
        deletable_tables[5] = "Equipment";
        deletable_tables[6] = "MedicalStock";
        deletable_tables[7] = "PatientReport";
        deletable_tables_size = 8;
    }
    else if(category.equals("Doctor")){
        viewable_tables[0] = "Doctors";
        viewable_tables[1] = "Patients";
        viewable_tables[2] = "Rooms";
        viewable_tables[3] = "Staff";
        viewable_tables[4] = "Lab";
        viewable_tables[5] = "Equipment";
        viewable_tables[6] = "MedicalStock";
        viewable_tables[7] = "PatientReport";
        viewable_tables_size = 8;
        
        updatable_tables[0] = "PatientReport";
        updatable_tables_size = 1;
        
        deletable_tables_size = 0;
    }
    else if(category.equals("Staff")){
        viewable_tables[0] = "Doctors";
        viewable_tables[1] = "Patients";
        viewable_tables[2] = "Rooms";
        viewable_tables[3] = "Staff";
        viewable_tables[4] = "Lab";
        viewable_tables[5] = "Equipment";
        viewable_tables[6] = "MedicalStock";
        viewable_tables[7] = "PatientReport";
        viewable_tables_size = 8;

        updatable_tables[0] = "Equipment";
        updatable_tables[1] = "MedicalStock";
        updatable_tables[2] = "Patients";
        updatable_tables_size = 3;

        deletable_tables[0] = "Equipment";
        deletable_tables[1] = "MedicalStock";
        deletable_tables[2] = "Patient";
        deletable_tables_size = 3;
    }
    else if(category.equals("Patient")){
        viewable_tables[0] = "Doctors";
        viewable_tables[1] = "PatientReport";
        viewable_tables_size = 2;

        updatable_tables_size = 0;

        deletable_tables_size = 0;
    }
}
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
MySQLConnector_GetUser();
l_Username.setText(Username+"!");
l_ID.setText("ID - "+Id);

FindAccesibleTables(Category);
if(viewable_tables_size == 0){
    view_button.setVisible(false);
}
if(updatable_tables_size == 0){
    update_button.setVisible(false);
}
if(deletable_tables_size == 0){
    add_delete_button.setVisible(false);
}

appointment_button.setVisible(false);
if(Category.equals("Patient")){
    appointment_button.setVisible(true);
    appointment_button.setText("Book Appointment");
}
if(Category.equals("Staff") || Category.equals("Admin")){
    appointment_button.setVisible(true);
    appointment_button.setText("Approve Appointments");
}

    }//GEN-LAST:event_formWindowOpened

    private void view_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_buttonActionPerformed
Table_View h = new Table_View();
HomePage.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_view_buttonActionPerformed

    private void account_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_buttonActionPerformed
AccountDetailsPage h = new AccountDetailsPage();
HomePage.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_account_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
Table_UpdatePageHome h = new Table_UpdatePageHome();
HomePage.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_update_buttonActionPerformed

    private void add_delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_delete_buttonActionPerformed
Table_InsertDeleteHome h = new Table_InsertDeleteHome();
HomePage.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_add_delete_buttonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
LoginPage h = new LoginPage();
HomePage.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void appointment_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointment_buttonActionPerformed


if(Category.equals("Patient")){
    AppointmentPage h = new AppointmentPage();
    HomePage.this.setVisible(false);
    h.setVisible(true);
}
if(Category.equals("Staff") || Category.equals("Admin")){
    AppointmentApprovePage h = new AppointmentApprovePage();
    HomePage.this.setVisible(false);
    h.setVisible(true);
}
    }//GEN-LAST:event_appointment_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account_button;
    private javax.swing.JButton add_delete_button;
    private javax.swing.JButton appointment_button;
    private javax.swing.JButton back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_ID;
    private javax.swing.JLabel l_Username;
    private javax.swing.JLabel l_n1;
    private javax.swing.JLabel l_t;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel nav;
    private javax.swing.JButton update_button;
    private javax.swing.JButton view_button;
    // End of variables declaration//GEN-END:variables
}

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
public class Table_InsertDeleteHome extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public Table_InsertDeleteHome() {
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
        l_t = new javax.swing.JLabel();
        nav = new javax.swing.JPanel();
        view_button = new javax.swing.JButton();
        account_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        add_delete_button = new javax.swing.JButton();
        back = new javax.swing.JButton();
        backhome = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        insert_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 72, 124));
        jPanel1.setLayout(null);

        l_t.setFont(new java.awt.Font("Century Gothic", 1, 88)); // NOI18N
        l_t.setForeground(new java.awt.Color(255, 255, 255));
        l_t.setText("Insert/Delete");
        jPanel1.add(l_t);
        l_t.setBounds(450, 40, 600, 100);

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

        backhome.setBackground(new java.awt.Color(5, 32, 74));
        backhome.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        backhome.setForeground(new java.awt.Color(237, 234, 234));
        backhome.setText("BACK");
        backhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backhomeActionPerformed(evt);
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
            .addComponent(backhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addComponent(account_button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(view_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(add_delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(backhome, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(nav);
        nav.setBounds(0, 0, 220, 800);

        delete_button.setFont(new java.awt.Font("Calibri", 0, 25)); // NOI18N
        delete_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove_user.png"))); // NOI18N
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(delete_button);
        delete_button.setBounds(770, 230, 400, 410);

        insert_button.setFont(new java.awt.Font("Calibri", 0, 25)); // NOI18N
        insert_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_user.jpg"))); // NOI18N
        insert_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(insert_button);
        insert_button.setBounds(270, 230, 420, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String Table;
String Username;
String Password;
String Id;
String Category;
String Choice;

int viewable_tables_size = 0;
int updatable_tables_size = 0;
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
        viewable_tables_size = 8;

        updatable_tables_size = 8;

        deletable_tables_size = 8;
    }
    else if(category.equals("Doctor")){
        viewable_tables_size = 8;

        updatable_tables_size = 1;
        
        deletable_tables_size = 0;
    }
    else if(category.equals("Staff")){
        viewable_tables_size = 8;

        updatable_tables_size = 3;

        deletable_tables_size = 3;
    }
    else if(category.equals("Patient")){
        viewable_tables_size = 2;

        updatable_tables_size = 0;

        deletable_tables_size = 0;
    }
}
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
MySQLConnector_GetUser();

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
    }//GEN-LAST:event_formWindowOpened

    private void view_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_buttonActionPerformed
Table_View h = new Table_View();
Table_InsertDeleteHome.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_view_buttonActionPerformed

    private void account_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_buttonActionPerformed
AccountDetailsPage h = new AccountDetailsPage();
Table_InsertDeleteHome.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_account_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
Table_UpdatePageHome h = new Table_UpdatePageHome();
Table_InsertDeleteHome.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_update_buttonActionPerformed

    private void add_delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_delete_buttonActionPerformed

    }//GEN-LAST:event_add_delete_buttonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
LoginPage h = new LoginPage();
Table_InsertDeleteHome.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void insert_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_buttonActionPerformed
Table_Insert h = new Table_Insert();
Table_InsertDeleteHome.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_insert_buttonActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
Table_Delete h = new Table_Delete();
Table_InsertDeleteHome.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void backhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backhomeActionPerformed
        HomePage h = new HomePage();
        Table_InsertDeleteHome.this.setVisible(false);
        h.setVisible(true);
    }//GEN-LAST:event_backhomeActionPerformed

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
    private javax.swing.JButton back;
    private javax.swing.JButton backhome;
    private javax.swing.JButton delete_button;
    private javax.swing.JButton insert_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_t;
    private javax.swing.JPanel nav;
    private javax.swing.JButton update_button;
    private javax.swing.JButton view_button;
    // End of variables declaration//GEN-END:variables
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kausik N
 */
public class Table_UpdatePageEnter_Backup extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public Table_UpdatePageEnter_Backup() {
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
        Go = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        column_dropdown = new javax.swing.JComboBox<>();
        value_text = new javax.swing.JTextField();
        nav = new javax.swing.JPanel();
        view_button = new javax.swing.JButton();
        account_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        add_delete_button = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        l_t.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        l_t.setForeground(new java.awt.Color(255, 204, 51));
        l_t.setText("Update");

        Go.setBackground(new java.awt.Color(0, 255, 255));
        Go.setForeground(new java.awt.Color(0, 0, 255));
        Go.setText("Update Selection");
        Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoActionPerformed(evt);
            }
        });

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(t1);

        column_dropdown.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                column_dropdownItemStateChanged(evt);
            }
        });

        value_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                value_textKeyReleased(evt);
            }
        });

        view_button.setBackground(new java.awt.Color(0, 255, 255));
        view_button.setForeground(new java.awt.Color(0, 0, 255));
        view_button.setText("VIEW");
        view_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_buttonActionPerformed(evt);
            }
        });

        account_button.setBackground(new java.awt.Color(0, 255, 255));
        account_button.setForeground(new java.awt.Color(0, 51, 204));
        account_button.setText("Account");
        account_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_buttonActionPerformed(evt);
            }
        });

        update_button.setBackground(new java.awt.Color(0, 0, 0));
        update_button.setForeground(new java.awt.Color(0, 0, 255));
        update_button.setText("UPDATE");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        add_delete_button.setBackground(new java.awt.Color(0, 255, 255));
        add_delete_button.setForeground(new java.awt.Color(0, 0, 255));
        add_delete_button.setText("Insert / Delete");
        add_delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_delete_buttonActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 255, 255));
        back.setForeground(new java.awt.Color(0, 0, 255));
        back.setText("Sign Out");
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
            .addComponent(add_delete_button, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(update_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(account_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addComponent(account_button, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(view_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(l_t, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(column_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(value_text, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(Go))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(l_t)
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(column_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(value_text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Go))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static String Table = "";
String[] columns_in_table = new String[200];
String[] update_values = new String[200];
int[] columns_to_change = new int[200];
int columns_in_table_size = 0;
String Username;
String Password;
String Id;
String Category;
String Column;

public static String[] Selected_Ids = new String[50];
public static int Selected_Ids_size = 0;
int viewable_tables_size = 0;
int deletable_tables_size = 0;

int Constrain;

String[] updatable_tables = new String[10];
int updatable_tables_size = 0;

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
        System.out.println("ERROR: Multiple or No LoggedIn users.");
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
        
        updatable_tables[0] = "Doctors";
        updatable_tables[1] = "Patients";
        updatable_tables[2] = "Rooms";
        updatable_tables[3] = "Staff";
        updatable_tables[4] = "Lab";
        updatable_tables[5] = "Equipment";
        updatable_tables[6] = "MedicalStock";
        updatable_tables[7] = "PatientReport";
        updatable_tables_size = 8;

        deletable_tables_size = 8;
    }
    else if(category.equals("Doctor")){
        viewable_tables_size = 8;
        
        updatable_tables[0] = "PatientReport";
        updatable_tables_size = 1;
        
        deletable_tables_size = 0;
    }
    else if(category.equals("Staff")){
        viewable_tables_size = 8;

        updatable_tables[0] = "Equipment";
        updatable_tables[1] = "MedicalStock";
        updatable_tables[2] = "Patients";
        updatable_tables_size = 3;

        deletable_tables_size = 3;
    }
    else if(category.equals("Patient")){
        viewable_tables_size = 2;

        updatable_tables_size = 0;

        deletable_tables_size = 0;
    }
}

void MySQLConnector_GetColumns(){
    try {
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","mysql");
    String s1="show columns from "+Table+";";
    Statement st1 = con.createStatement();
    ResultSet rs = st1.executeQuery(s1);
    int rs_size = 0;
    while(rs.next()){
        columns_in_table[rs_size] = rs.getString("Field");
        
        rs_size++;
    }
    columns_in_table_size = rs_size;
    rs.close();
    con.close();
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());
    }
}

void InitTable(){
    DefaultTableModel dtm = (DefaultTableModel)t1.getModel();
    dtm.setColumnCount(0);
    dtm.setRowCount(0);
    for(int i=0;i<columns_in_table_size;i++){
        dtm.addColumn(columns_in_table[i]);
    }
}

void UpdateTable(){
    try {System.out.println("UpdateTable");
    
    for(int i=0;i<Selected_Ids_size;i++){
        System.out.println(Selected_Ids[i]);
    }
    
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","mysql");
    String s1 = "select * from "+Table+";";
    Statement st1 = con.createStatement();
    ResultSet rs = st1.executeQuery(s1);
    int rs_size = 0;
    while(rs.next()){
        Object[] row = new Object[columns_in_table_size];
        for(int i=0;i<columns_in_table_size;i++){
            row[i] = rs.getObject(columns_in_table[i]);
            if(row[i] == null){
                System.out.println("null present.");
                row[i] = "";
            }
        }
        DefaultTableModel dtm = (DefaultTableModel)t1.getModel();
        
        int flag = 0;
        for(int i=0;i<Selected_Ids_size;i++){
            if(Selected_Ids[i].equals(rs.getString(1))){  //REMEMBER SQL INDEX STARTS FROM 1
                flag = 1;
            }
        }
        
        if(flag == 1)dtm.addRow(row);
        
        rs_size++;
    }
    rs.close();
    con.close();
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());
    }
}

void MySQLConnector_Update(){
    try {
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","mysql");
    String s="";
    Statement st1 = con.createStatement();
    for(int i=1;i<columns_in_table_size;i++){
        for(int j=0;j<Selected_Ids_size;j++){
            if(columns_to_change[i] == 1){
                s = "update "+Table+" set "+columns_in_table[i]+" = '"+update_values[i]+"' where "+columns_in_table[0]+" = "+Selected_Ids[j]+";";
            st1.executeUpdate(s);
            }        
        }
    }
    con.close();
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());
    }
}

    private void GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoActionPerformed
MySQLConnector_Update();
JOptionPane.showMessageDialog(this, "Successfully Updated.");
InitTable();
UpdateTable();
    }//GEN-LAST:event_GoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
update_button.setFocusable(false);

for(int i=0;i<columns_in_table_size;i++){
    columns_to_change[i] = 0;
}

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


column_dropdown.removeAllItems();
MySQLConnector_GetColumns();
for(int i=1;i<columns_in_table_size;i++){
    column_dropdown.addItem(columns_in_table[i]);
}

int column_index = 0;
Column = column_dropdown.getItemAt(column_index);


InitTable();
UpdateTable();
    }//GEN-LAST:event_formWindowOpened

    private void view_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_buttonActionPerformed
Table_View h = new Table_View();
Table_UpdatePageEnter_Backup.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_view_buttonActionPerformed

    private void account_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_buttonActionPerformed
AccountDetailsPage h = new AccountDetailsPage();
Table_UpdatePageEnter_Backup.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_account_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
Table_UpdatePageHome h = new Table_UpdatePageHome();
Table_UpdatePageEnter_Backup.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_update_buttonActionPerformed

    private void add_delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_delete_buttonActionPerformed
Table_InsertDeleteHome h = new Table_InsertDeleteHome();
Table_UpdatePageEnter_Backup.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_add_delete_buttonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
LoginPage h = new LoginPage();
Table_UpdatePageEnter_Backup.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void value_textKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_value_textKeyReleased
for(int i=0;i<columns_in_table_size;i++){
    if(Column.equals(columns_in_table[i])){
        update_values[i] = value_text.getText();
        columns_to_change[i] = 1;
    }
}
    }//GEN-LAST:event_value_textKeyReleased

    private void column_dropdownItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_column_dropdownItemStateChanged
int column_index = column_dropdown.getSelectedIndex();
Column = column_dropdown.getItemAt(column_index);
    }//GEN-LAST:event_column_dropdownItemStateChanged

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
    private javax.swing.JButton Go;
    private javax.swing.JButton account_button;
    private javax.swing.JButton add_delete_button;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> column_dropdown;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_t;
    private javax.swing.JPanel nav;
    private javax.swing.JTable t1;
    private javax.swing.JButton update_button;
    private javax.swing.JTextField value_text;
    private javax.swing.JButton view_button;
    // End of variables declaration//GEN-END:variables
}

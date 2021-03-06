
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
public class Table_Insert_Backup extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public Table_Insert_Backup() {
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
        table_dropdown = new javax.swing.JComboBox<>();
        nav = new javax.swing.JPanel();
        view_button = new javax.swing.JButton();
        account_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        add_delete_button = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ti = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        l_t.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        l_t.setForeground(new java.awt.Color(255, 204, 51));
        l_t.setText("Insert");
        jPanel1.add(l_t);
        l_t.setBounds(360, 20, 150, 48);

        Go.setBackground(new java.awt.Color(0, 255, 255));
        Go.setForeground(new java.awt.Color(0, 0, 255));
        Go.setText("Insert");
        Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoActionPerformed(evt);
            }
        });
        jPanel1.add(Go);
        Go.setBounds(430, 660, 65, 25);

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(t1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 370, 630, 260);

        table_dropdown.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                table_dropdownItemStateChanged(evt);
            }
        });
        jPanel1.add(table_dropdown);
        table_dropdown.setBounds(290, 110, 270, 31);

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

        update_button.setBackground(new java.awt.Color(0, 255, 255));
        update_button.setForeground(new java.awt.Color(0, 0, 255));
        update_button.setText("UPDATE");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        add_delete_button.setBackground(new java.awt.Color(0, 0, 0));
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

        jPanel1.add(nav);
        nav.setBounds(0, 0, 120, 730);

        ti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(ti);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(140, 190, 630, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String Table;
String[] columns_in_table = new String[200];
int columns_in_table_size = 0;
String[] update_values = new String[200];

String Username;
String Password;
String Id;
String Category;
String Column;

String[] Selected_Ids;

int Constrain;

String[] deletable_tables = new String[10];
int deletable_tables_size = 0;
int viewable_tables_size = 0;
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
        viewable_tables_size = 8;

        updatable_tables_size = 1;
        
        deletable_tables_size = 0;
    }
    else if(category.equals("Staff")){
        viewable_tables_size = 8;

        updatable_tables_size = 3;

        deletable_tables[0] = "Equipment";
        deletable_tables[1] = "MedicalStock";
        deletable_tables[2] = "Patient";
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
    DefaultTableModel dtmi = (DefaultTableModel)ti.getModel();
    dtmi.setColumnCount(0);
    dtmi.setRowCount(1);
    dtm.setColumnCount(0);
    dtm.setRowCount(0);
    for(int i=0;i<columns_in_table_size;i++){
        dtm.addColumn(columns_in_table[i]);
        dtmi.addColumn(columns_in_table[i]);
    }
}

void UpdateTable(int condition, String value){
    try {
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","mysql");
    String s1 = "select * from "+Table+";";
    if(condition == 1){
        s1 = "select * from "+Table+" where "+Column+" = '"+value+"';";
    }
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
        dtm.addRow(row);
        
        rs_size++;
    }
    rs.close();
    con.close();
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());
    }
}


void GetInsertValues(){
    for(int i=0;i<ti.getColumnCount();i++){
        update_values[i] = ti.getValueAt(0, i).toString();
    }
}


void MySQLConnector_Insert(){
    GetInsertValues();
    try {
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","mysql");
    String s="";
    Statement st1 = con.createStatement();
    s = "insert into "+Table+" values(";
    for(int i=0;i<columns_in_table_size;i++){
        s = s + "'"+update_values[i]+"'";
        if(i<columns_in_table_size-1)s = s + ", ";
    }
    s = s + ");";
    System.out.println(s);
    st1.executeUpdate(s);
    
    String condition_query = InsertConditions();
    Statement st2 = con.createStatement();
    st2.executeUpdate(condition_query);
    
    con.close();
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());
    }
}


String InsertConditions(){
    String s = "";
    if(Table.equals("Patients")){
        s = "insert into PatientReport("+columns_in_table[0]+") values("+update_values[0]+");";
    }
    
    return s;
}
        
        
        
    private void GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoActionPerformed
int[] Selected_Ids_index;
Selected_Ids_index = t1.getSelectedRows();
Selected_Ids = new String[t1.getSelectedRowCount()];
DefaultTableModel dtm = (DefaultTableModel) t1.getModel();
for(int i=0;i<t1.getSelectedRowCount();i++){
    Selected_Ids[i] = t1.getValueAt(Selected_Ids_index[i], 0).toString();
}

MySQLConnector_Insert();

InitTable();
UpdateTable(0, "");

JOptionPane.showMessageDialog(this, "Successfully inserted.");
    }//GEN-LAST:event_GoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
update_button.setFocusable(false);
        
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

for(int i=0;i<deletable_tables_size;i++){
    table_dropdown.addItem(deletable_tables[i]);
}

int table_index = table_dropdown.getSelectedIndex();
Table = table_dropdown.getItemAt(table_index);

MySQLConnector_GetColumns();

InitTable();
UpdateTable(0, "");
    }//GEN-LAST:event_formWindowOpened

    private void table_dropdownItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_table_dropdownItemStateChanged
int table_index = table_dropdown.getSelectedIndex();
Table = table_dropdown.getItemAt(table_index);

MySQLConnector_GetColumns();


InitTable();
UpdateTable(0,"");
    }//GEN-LAST:event_table_dropdownItemStateChanged

    private void view_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_buttonActionPerformed
Table_View h = new Table_View();
Table_Insert_Backup.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_view_buttonActionPerformed

    private void account_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_buttonActionPerformed
AccountDetailsPage h = new AccountDetailsPage();
Table_Insert_Backup.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_account_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
Table_UpdatePageHome h = new Table_UpdatePageHome();
Table_Insert_Backup.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_update_buttonActionPerformed

    private void add_delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_delete_buttonActionPerformed
Table_InsertDeleteHome h = new Table_InsertDeleteHome();
Table_Insert_Backup.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_add_delete_buttonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
LoginPage h = new LoginPage();
Table_Insert_Backup.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l_t;
    private javax.swing.JPanel nav;
    private javax.swing.JTable t1;
    private javax.swing.JComboBox<String> table_dropdown;
    private javax.swing.JTable ti;
    private javax.swing.JButton update_button;
    private javax.swing.JButton view_button;
    // End of variables declaration//GEN-END:variables
}

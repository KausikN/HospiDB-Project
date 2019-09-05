
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kausik N
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public LoginPage() {
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
        l_c = new javax.swing.JLabel();
        name_text = new javax.swing.JTextField();
        l_p = new javax.swing.JLabel();
        password_text = new javax.swing.JPasswordField();
        login_button = new javax.swing.JButton();
        l_t = new javax.swing.JLabel();
        l_p2 = new javax.swing.JLabel();
        signup_button = new javax.swing.JButton();
        password2_text = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        password_signup_text = new javax.swing.JTextField();
        category_dropdown = new javax.swing.JComboBox<>();
        l_n = new javax.swing.JLabel();
        l_extra = new javax.swing.JLabel();
        id_text = new javax.swing.JTextField();
        patient_panel = new javax.swing.JPanel();
        l_n1 = new javax.swing.JLabel();
        l_n2 = new javax.swing.JLabel();
        l_n3 = new javax.swing.JLabel();
        l_n4 = new javax.swing.JLabel();
        age_text = new javax.swing.JTextField();
        email_text = new javax.swing.JTextField();
        phone_text = new javax.swing.JTextField();
        gender_dropdown = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(50, 117, 170));
        jPanel1.setLayout(null);

        l_c.setBackground(new java.awt.Color(234, 234, 234));
        l_c.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        l_c.setForeground(new java.awt.Color(234, 234, 234));
        l_c.setText("CATEGORY");
        jPanel1.add(l_c);
        l_c.setBounds(540, 370, 140, 32);
        jPanel1.add(name_text);
        name_text.setBounds(610, 200, 220, 30);

        l_p.setBackground(new java.awt.Color(234, 234, 234));
        l_p.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        l_p.setForeground(new java.awt.Color(237, 234, 234));
        l_p.setText("ENTER PASSWORD");
        jPanel1.add(l_p);
        l_p.setBounds(270, 250, 260, 32);

        password_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_textActionPerformed(evt);
            }
        });
        jPanel1.add(password_text);
        password_text.setBounds(610, 250, 220, 30);

        login_button.setBackground(new java.awt.Color(0, 255, 255));
        login_button.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        login_button.setForeground(new java.awt.Color(0, 0, 255));
        login_button.setText("Log In");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(login_button);
        login_button.setBounds(730, 600, 220, 100);

        l_t.setBackground(new java.awt.Color(234, 234, 234));
        l_t.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        l_t.setForeground(new java.awt.Color(255, 255, 255));
        l_t.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_t.setText("HospiDB");
        l_t.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(l_t);
        l_t.setBounds(20, 10, 1200, 130);

        l_p2.setBackground(new java.awt.Color(234, 234, 234));
        l_p2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        l_p2.setForeground(new java.awt.Color(237, 234, 234));
        l_p2.setText("CONFIRM PASSWORD");
        jPanel1.add(l_p2);
        l_p2.setBounds(270, 300, 260, 32);

        signup_button.setBackground(new java.awt.Color(0, 255, 255));
        signup_button.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        signup_button.setForeground(new java.awt.Color(0, 0, 255));
        signup_button.setText("Sign Up");
        signup_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(signup_button);
        signup_button.setBounds(300, 600, 210, 100);

        password2_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password2_textActionPerformed(evt);
            }
        });
        jPanel1.add(password2_text);
        password2_text.setBounds(610, 300, 220, 30);

        exit.setBackground(new java.awt.Color(0, 255, 255));
        exit.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 51, 204));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(540, 600, 160, 100);

        password_signup_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_signup_textActionPerformed(evt);
            }
        });
        jPanel1.add(password_signup_text);
        password_signup_text.setBounds(850, 250, 220, 30);

        category_dropdown.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        category_dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Patient", "Staff", "Doctor" }));
        category_dropdown.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                category_dropdownItemStateChanged(evt);
            }
        });
        jPanel1.add(category_dropdown);
        category_dropdown.setBounds(530, 420, 170, 50);

        l_n.setBackground(new java.awt.Color(234, 234, 234));
        l_n.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        l_n.setForeground(new java.awt.Color(237, 234, 234));
        l_n.setText("ENTER NAME");
        jPanel1.add(l_n);
        l_n.setBounds(270, 200, 190, 32);

        l_extra.setBackground(new java.awt.Color(234, 234, 234));
        l_extra.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        l_extra.setForeground(new java.awt.Color(234, 234, 234));
        l_extra.setText("YOUR ");
        jPanel1.add(l_extra);
        l_extra.setBounds(350, 510, 200, 32);
        jPanel1.add(id_text);
        id_text.setBounds(580, 510, 125, 30);

        patient_panel.setBackground(new java.awt.Color(50, 117, 170));
        patient_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(240, 240, 240))); // NOI18N

        l_n1.setBackground(new java.awt.Color(234, 234, 234));
        l_n1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        l_n1.setForeground(new java.awt.Color(237, 234, 234));
        l_n1.setText("ENTER AGE");

        l_n2.setBackground(new java.awt.Color(234, 234, 234));
        l_n2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        l_n2.setForeground(new java.awt.Color(237, 234, 234));
        l_n2.setText("GENDER");

        l_n3.setBackground(new java.awt.Color(234, 234, 234));
        l_n3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        l_n3.setForeground(new java.awt.Color(237, 234, 234));
        l_n3.setText("ENTER EMAIL");

        l_n4.setBackground(new java.awt.Color(234, 234, 234));
        l_n4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        l_n4.setForeground(new java.awt.Color(237, 234, 234));
        l_n4.setText("PHONE NUMBER");

        gender_dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        javax.swing.GroupLayout patient_panelLayout = new javax.swing.GroupLayout(patient_panel);
        patient_panel.setLayout(patient_panelLayout);
        patient_panelLayout.setHorizontalGroup(
            patient_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patient_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patient_panelLayout.createSequentialGroup()
                        .addComponent(l_n4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phone_text, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                    .addGroup(patient_panelLayout.createSequentialGroup()
                        .addGroup(patient_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(l_n1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_n3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(patient_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_text)
                            .addComponent(age_text)
                            .addComponent(gender_dropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        patient_panelLayout.setVerticalGroup(
            patient_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(patient_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_n1)
                    .addComponent(age_text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patient_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_n2)
                    .addComponent(gender_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(patient_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_n3)
                    .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patient_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_n4)
                    .addComponent(phone_text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(patient_panel);
        patient_panel.setBounds(810, 360, 360, 200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
char state;
int category_index;
String prev_Id;
String[] non_signup_categories = {"Staff", "Doctor"};

void MySQLConnector_Initialize(){
    try {
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","mysql");
    String s1="update LoginDetails set LoggedIn = 0;";
    Statement st1 = con.createStatement();
    st1.executeUpdate(s1);
    con.close();
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());
    }
}

String Id_Generator(String category){
    String id_generated;
    int id_generated_int = 0;
    try {
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","mysql");
    String s1="select Id from LoginDetails where Category = '"+category+"';";System.out.println(s1);
    Statement st1 = con.createStatement();
    ResultSet rs = st1.executeQuery(s1);
    
    while(rs.next()){
        String s = rs.getString("Id");
        if(s.charAt(0) == category.charAt(0)){
            s = s.substring(1);
            if(Integer.parseInt(s) > id_generated_int)id_generated_int = Integer.parseInt(s);
        }

    }
    rs.close();
    con.close();
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());
    }

    id_generated_int = id_generated_int + 1;
    id_generated = category.charAt(0) + "";
    id_generated = id_generated + id_generated_int;
    
    return id_generated;
}


int MySQLConnector_CheckUser(String username, String password, String id, String category){
    int check = 1;
    int injection_check = 1;
    try {
    
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","mysql");
    String s1="select Username, Password, Id, Category from LoginDetails where Username = "+"'"+username+"'"+" and Password = "+"'"+password+"'"+";";
    Statement st1 = con.createStatement();
    ResultSet rs = st1.executeQuery(s1);
    int rs_size = 0;
    while(rs.next()){
        String rs_id = rs.getString("Id");
        String rs_category = rs.getString("Category");

        if(!(rs_id.equals(id) && rs_category.equals(category))){
            check = 0;
        }
        rs_size++;
    }
    if(rs_size == 0)check = 0;
    
    if(check == 1){
        String logged_in_query = "update LoginDetails set LoggedIn = 1 where Id = '"+id+"';";
        Statement logged_in_statement = con.createStatement();
        logged_in_statement.executeUpdate(logged_in_query);
    }
    
    rs.close();
    con.close();
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());
    }
    
    injection_check = SQLInjectionCheck(id)*SQLInjectionCheck(username)*SQLInjectionCheck(password);
    if(injection_check == 0)check=0;
    return check;
}

void MySQLConnector_AddUser(String username, String password, String id, String category){
    try {
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","mysql");
    String s1="insert into LoginDetails values('"+id+"', '"+username+"', '"+password+"', '"+category+"', 0);";
    Statement st1 = con.createStatement();
    st1.executeUpdate(s1);
    con.close();
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());
    }
}

void MySQLConnector_AddPatient(String patientid, String patientname, String age, String gender, String phone, String email){
    try {
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","mysql");
    String s1="insert into Patients values('"+patientid+"', '"+patientname+"', '"+age+"', '"+gender+"', '"+phone+"', '"+email+"');";
    Statement st1 = con.createStatement();
    st1.executeUpdate(s1);
    con.close();
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());
    }
}

int SQLInjectionCheck(String s){
    int check = 1;
    for(int i=0;i<s.length();i++){
        String s_temp = s.charAt(i)+"";
        if(s_temp.equals("'"))check =0;
    }
    return check;
}

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
String username = name_text.getText();
String id = id_text.getText();
String category = category_dropdown.getItemAt(category_dropdown.getSelectedIndex());

MySQLConnector_Initialize();

if(state == 'l')
{
    String password = new String(password_text.getPassword());//System.out.println(password);
    int correct_details = MySQLConnector_CheckUser(username, password, id, category);
    
    if(correct_details == 0)
    {
        System.out.println("Wrong Login Details Entered.");
        JOptionPane.showMessageDialog(this, "Wrong Login details.");
    }
    else 
    {
        System.out.println("Correct Login Details Entered.");
        HomePage tc = new HomePage();
        LoginPage.this.setVisible(false);
        tc.setVisible(true);
    }
}
else if(state == 's')
{
    String password = password_signup_text.getText();//System.out.println(password);
    int correct_details = MySQLConnector_CheckUser(username, password, id, category);
    
    String re_entered_password = password2_text.getText();
    if(!(password.equals(re_entered_password))){
        System.out.println("Reentered Password is wrong.");
        JOptionPane.showMessageDialog(this, "Reentered Password is wrong.");
    }
    else {
        if(correct_details == 1){
            System.out.println("User Already Present.");
            JOptionPane.showMessageDialog(this, "User Already Exists.");
        }
        else {
            int injection_check = SQLInjectionCheck(id)*SQLInjectionCheck(username)*SQLInjectionCheck(password);
            if(injection_check == 1){
                MySQLConnector_AddUser(username, password, id, category);
            
                if(category.equals("Patient")){
                    MySQLConnector_AddPatient(id, username, age_text.getText(), gender_dropdown.getSelectedItem().toString(), phone_text.getText(), email_text.getText());
                }
                System.out.println("User Added.");
                JOptionPane.showMessageDialog(this, "Account Created Succesfully.");
                signup_button.doClick();
            }
            else {
                JOptionPane.showMessageDialog(this, "Invalid Inputs.");
            }
        }
    }
    
}
    }//GEN-LAST:event_login_buttonActionPerformed

    private void signup_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_buttonActionPerformed
if(state == 'l')
{
    state = 's';
    if(category_dropdown.getSelectedItem().toString().equals("Patient"))patient_panel.setVisible(true);
    
    password_signup_text.setVisible(true);
    password_signup_text.setLocation(password_text.getLocation());
    password_text.setVisible(false);
    
    name_text.setText("");
    password_text.setText("");
    category_dropdown.setSelectedIndex(0);
    id_text.setText("");
    l_extra.setText("YOUR ID");

    id_text.setEditable(true);
    id_text.setText(Id_Generator(category_dropdown.getSelectedItem().toString()));
    id_text.setEditable(false);

    l_p2.setVisible(true);
    password2_text.setVisible(true);
    
    signup_button.setText("Login");
    login_button.setText("Create Account");
    
    for(int i=0;i<non_signup_categories.length;i++){
        Object obj = non_signup_categories[i];
        category_dropdown.removeItem(obj);
    }
}
else if(state == 's')
{
    state = 'l';
    patient_panel.setVisible(false);
    
    password_text.setVisible(true);
    password_text.setLocation(password_text.getLocation());
    password_signup_text.setVisible(false);
    id_text.setEditable(true);
    
    name_text.setText("");
    password_text.setText("");
    category_dropdown.setSelectedIndex(0);
    id_text.setText("");
    l_extra.setText("YOUR ID");
    
    l_p2.setVisible(false);
    password2_text.setVisible(false);
    
    signup_button.setText("Sign Up");
    login_button.setText("Login");
    
    for(int i=0;i<non_signup_categories.length;i++){
        category_dropdown.addItem(non_signup_categories[i]);
    }
}

    }//GEN-LAST:event_signup_buttonActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
state = 'l';
category_index = 0;
patient_panel.setVisible(false);


l_p2.setVisible(false);
password2_text.setVisible(false);

String category = category_dropdown.getItemAt(category_index);
l_extra.setText("Enter "+category+" ID");

password_text.setVisible(true);
password_text.setLocation(password_text.getLocation());
password_signup_text.setVisible(false);

l_extra.setText("YOUR ID");

//Delete this
//
/*
HomePage tc = new HomePage();
LoginPage.this.setVisible(false);
tc.setVisible(true);
//*/
    }//GEN-LAST:event_formWindowOpened

    private void password_signup_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_signup_textActionPerformed
    }//GEN-LAST:event_password_signup_textActionPerformed

    private void category_dropdownItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_category_dropdownItemStateChanged
category_index = category_dropdown.getSelectedIndex();
/*
System.out.println("Hi there "+category_index);
String category = category_dropdown.getItemAt(category_index);
l_extra.setText("Enter "+category+" ID");
*/
if(state == 's'){
    id_text.setEditable(true);
    id_text.setText(Id_Generator(category_dropdown.getSelectedItem().toString()));
    id_text.setEditable(false);
    
    if(category_dropdown.getSelectedItem().toString().equals("Patient")){
        patient_panel.setVisible(true);
    }
    else patient_panel.setVisible(false);
}
    }//GEN-LAST:event_category_dropdownItemStateChanged

    private void password2_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password2_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password2_textActionPerformed

    private void password_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_textActionPerformed

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
    public javax.swing.JTextField age_text;
    private javax.swing.JComboBox<String> category_dropdown;
    public javax.swing.JTextField email_text;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> gender_dropdown;
    private javax.swing.JTextField id_text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_c;
    private javax.swing.JLabel l_extra;
    private javax.swing.JLabel l_n;
    private javax.swing.JLabel l_n1;
    private javax.swing.JLabel l_n2;
    private javax.swing.JLabel l_n3;
    private javax.swing.JLabel l_n4;
    private javax.swing.JLabel l_p;
    private javax.swing.JLabel l_p2;
    private javax.swing.JLabel l_t;
    private javax.swing.JButton login_button;
    public javax.swing.JTextField name_text;
    private javax.swing.JTextField password2_text;
    private javax.swing.JTextField password_signup_text;
    private javax.swing.JPasswordField password_text;
    private javax.swing.JPanel patient_panel;
    public javax.swing.JTextField phone_text;
    private javax.swing.JButton signup_button;
    // End of variables declaration//GEN-END:variables
}
package hospitalmanagment;
import UserDao.DoctorsDao;
import UserDao.EmpDao;
import UserPojo.DoctorPojo;
import UserPojo.UserPojo;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class RegisterDoctor extends javax.swing.JFrame {
    HashMap <String, String> doctor;
    public RegisterDoctor() {
        initComponents();
        setLocationRelativeTo(null);
        loadDoctorDetails();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcEmpId = new javax.swing.JComboBox();
        userid = new javax.swing.JTextField();
        doctorId = new javax.swing.JTextField();
        qualification = new javax.swing.JTextField();
        specialist = new javax.swing.JTextField();
        btnRegister1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pwd = new javax.swing.JPasswordField();
        repwd = new javax.swing.JPasswordField();

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(503, 656));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Register Doctor");

        jButton3.setText("logout");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(jButton3))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jButton3))
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame1.setTitle("doctor details\n");
        jInternalFrame1.setVisible(true);

        jLabel1.setText("emp name");

        jLabel2.setText("userid");

        jLabel3.setText("password");

        jLabel4.setText("retype pwd");

        jLabel5.setText("doctorid");

        jLabel6.setText("qualification");

        jLabel7.setText("specialist");

        btnRegister1.setText("Register");
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        repwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repwdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(specialist)
                                .addComponent(qualification)
                                .addComponent(doctorId)
                                .addComponent(jcEmpId, 0, 82, Short.MAX_VALUE)
                                .addComponent(repwd)
                                .addComponent(pwd))
                            .addComponent(userid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnRegister1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addContainerGap())))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(doctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(repwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(specialist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister1)
                    .addComponent(jButton2)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame1)
                    .addComponent(jDesktopPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ManageDoctor me = new ManageDoctor();
        me.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
        if(validateInput() == false){
           JOptionPane.showMessageDialog(null, "please fill all the field ", "empty values", JOptionPane.ERROR_MESSAGE);
           return;
        }
        try {
            String id = jcEmpId.getSelectedItem().toString();
            String userId = userid.getText();
            char [] pw = pwd.getPassword();
            String pwsd = String.valueOf(pw);
            char[] repwd1 = repwd.getPassword();
            String repwsd = String.valueOf(repwd1);
            if(!passwordMatch(pwsd, repwsd)){
                   JOptionPane.showMessageDialog(null, "password does not match ", "empty values", JOptionPane.ERROR_MESSAGE);
                   return;
                   
          
            }
            String doctorid = doctorId.getText();
            String qualificat = qualification.getText();
            String specialis =specialist.getText();
            UserPojo user = new UserPojo();
            DoctorPojo doctor = new DoctorPojo();
            
            user.setUserid(userId);
             user.setUserName(userId);
            user.setEmpId(id);
            user.setPassword(pwsd);
            
            user.setUserType("DOCTOR"); 
            doctor.setDoctorId(doctorid);
            doctor.setQualification(qualificat);
            doctor.setSpecialist(specialis);
            
            doctor.setUserId(userId);
            
            boolean result= DoctorsDao.registerDoctor(user);
            boolean result1 = DoctorsDao.addDoctor(doctor);
            if(result) {
                JOptionPane.showMessageDialog(null, "record successfully added in users","success", JOptionPane.INFORMATION_MESSAGE);
                clearText();
                loadDoctorDetails();
                
            }
            else 
                JOptionPane.showMessageDialog(null, "could not add doctors in users ","error", JOptionPane.ERROR_MESSAGE);
            if(result1) {
                JOptionPane.showMessageDialog(null, "record successfully added in doctor","success", JOptionPane.INFORMATION_MESSAGE);
                clearText();
                loadDoctorDetails();
                
            }
            else 
               JOptionPane.showMessageDialog(null, "could not add receptionnist ","error", JOptionPane.ERROR_MESSAGE);                
        }
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error in sql1", "error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister1ActionPerformed

    private void repwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repwdActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister1;
    private javax.swing.JTextField doctorId;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jcEmpId;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField qualification;
    private javax.swing.JPasswordField repwd;
    private javax.swing.JTextField specialist;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables

    private void loadDoctorDetails() {
        try{
            doctor = EmpDao.getNonRegisteredDoctorsList();
            if(doctor.size () == 0){
                JOptionPane.showMessageDialog(null, "no unregistered doctor present");
                jcEmpId.removeAllItems();
                btnRegister1.setEnabled(false);
                
                return;
            }
            btnRegister1.setEnabled(true);
            Collection keys = doctor.keySet();
            Iterator <String> it = keys.iterator();
            jcEmpId.removeAllItems();
            while (it.hasNext() ) {
                jcEmpId.addItem(it.next());
                
                
            }
            }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error in sql2", "error" , JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
                
            
        } 
    }

    private boolean validateInput() {
            char[] pw = pwd.getPassword();
        char[] repw = repwd.getPassword();
        return !(userid.getText().isEmpty() || pw.length<4 || repw.length<4 );
        
        }

    private void clearText() {
        userid.setText("");
        pwd.setText("");
        repwd.setText("");
        specialist.setText("");
        doctorId.setText("");
        qualification.setText("");
    }
    public boolean passwordMatch (String a , String b){
        return a.equals(b);
    }
}

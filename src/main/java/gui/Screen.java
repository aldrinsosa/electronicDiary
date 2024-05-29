package gui;

import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import logic.Main;
import logic.UserPreferences;
import logic.Contact;

/**
 *
 * @author sosa
 */
public class Screen extends javax.swing.JFrame {

    /**
     * Creates new form Screen
     */
    public Screen() {
        initComponents();
        setIcon();
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
        title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fNameLabel = new javax.swing.JLabel();
        sNameLabel = new javax.swing.JLabel();
        dniLabel = new javax.swing.JLabel();
        birthLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        fNameInput = new javax.swing.JTextField();
        dniInput = new javax.swing.JTextField();
        sNameInput = new javax.swing.JTextField();
        birthInput = new javax.swing.JTextField();
        phoneInput = new javax.swing.JTextField();
        addressInput = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        leftBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        rightBtn = new javax.swing.JButton();
        indexNumber = new javax.swing.JLabel();
        indexLabel = new javax.swing.JLabel();
        themeButton = new javax.swing.JButton();
        alert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Electronic Diary");

        fNameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fNameLabel.setText("F. Name   :");

        sNameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        sNameLabel.setText("L. Name   :    ");

        dniLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dniLabel.setText("DNI   :      ");

        birthLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        birthLabel.setText("Birth D.   : ");

        phoneLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        phoneLabel.setText("Phone   :   ");

        addressLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addressLabel.setText("Address   :  ");

        fNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameInputActionPerformed(evt);
            }
        });

        dniInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniInputActionPerformed(evt);
            }
        });

        phoneInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneInputActionPerformed(evt);
            }
        });

        leftBtn.setText("<<");
        leftBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        rightBtn.setText(">>");
        rightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightBtnActionPerformed(evt);
            }
        });

        indexNumber.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        indexNumber.setText("0");

        indexLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        indexLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        indexLabel.setText("Contact: #");

        themeButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        UserPreferences theme = new UserPreferences();
        String actualTheme = theme.getTheme();
        if(actualTheme.equals("dark")){
            themeButton.setText("🌙️");
        }
        else {
            themeButton.setText("☀️");
        }
        themeButton.setFocusPainted(false);
        themeButton.setIconTextGap(0);
        themeButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
        themeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themeButtonActionPerformed(evt);
            }
        });

        alert.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        alert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(themeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(236, 236, 236))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(fNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dniLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sNameLabel))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dniInput)
                    .addComponent(fNameInput)
                    .addComponent(sNameInput))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(birthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressInput)
                    .addComponent(phoneInput)
                    .addComponent(birthInput))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(indexLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indexNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(leftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(alert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(themeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dniLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dniInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(addressInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indexNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alert, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        themeButton.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void themeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themeButtonActionPerformed
        //get actual theme
        UserPreferences preferences = new UserPreferences();
        String actualTheme = preferences.getTheme();

        if (actualTheme.equals("dark")) {
            preferences.setTheme("light");
            themeButton.setText("☀️");
        } else {
            preferences.setTheme("dark");
            themeButton.setText("🌙️");
        }

        showAlert();
    }//GEN-LAST:event_themeButtonActionPerformed

    private void rightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightBtnActionPerformed
        int index = Integer.parseInt(indexNumber.getText());

        //prevents going out of the array
        if (index == 9) {
            return;
        }

        //get the data
        Contact user = Main.getData(index, "right");

        dniInput.setText(user.getDni());
        fNameInput.setText(user.getfName());
        sNameInput.setText(user.getsName());
        addressInput.setText(user.getAddress());
        phoneInput.setText(user.getPhone());
        birthInput.setText(user.getBirth());

        String newIndex = Integer.toString(index + 1);
        indexNumber.setText(newIndex);
    }//GEN-LAST:event_rightBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        int index = Integer.parseInt(indexNumber.getText());

        Contact contact = new Contact();
        contact.setDni(dniInput.getText());
        contact.setfName(fNameInput.getText());
        contact.setsName(sNameInput.getText());
        contact.setAddress(addressInput.getText());
        contact.setPhone(phoneInput.getText());
        contact.setBirth(birthInput.getText());

        Main.saveData(index, contact);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void leftBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftBtnActionPerformed
        int index = Integer.parseInt(indexNumber.getText());

        //prevents going out of the array
        if (index == 0) {
            return;
        }

        //get the data
        Contact contact = Main.getData(index, "left");

        dniInput.setText(contact.getDni());
        fNameInput.setText(contact.getfName());
        sNameInput.setText(contact.getsName());
        addressInput.setText(contact.getAddress());
        phoneInput.setText(contact.getPhone());
        birthInput.setText(contact.getBirth());

        String newIndex = Integer.toString(index - 1);
        indexNumber.setText(newIndex);
    }//GEN-LAST:event_leftBtnActionPerformed

    private void phoneInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneInputActionPerformed

    private void dniInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniInputActionPerformed

    private void fNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameInputActionPerformed

    private void showAlert() {
        Timer timer = new Timer();

        alert.setText("[ A RESTART IS NECESSARY TO APPLY THE THEME ]");

        //delete the alert after 2 seconds
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                alert.setText("");
            }
        }, 2 * 1000);
    }

    /**
     *
     * @param contact first contact of the db
     * set the first contact at the start of the application
     */
    public void setFirstContact(Contact contact){
        dniInput.setText(contact.getDni());
        fNameInput.setText(contact.getfName());
        sNameInput.setText(contact.getsName());
        addressInput.setText(contact.getAddress());
        phoneInput.setText(contact.getPhone());
        birthInput.setText(contact.getBirth());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressInput;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel alert;
    private javax.swing.JTextField birthInput;
    private javax.swing.JLabel birthLabel;
    private javax.swing.JTextField dniInput;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField fNameInput;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JLabel indexLabel;
    private javax.swing.JLabel indexNumber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton leftBtn;
    private javax.swing.JTextField phoneInput;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton rightBtn;
    private javax.swing.JTextField sNameInput;
    private javax.swing.JLabel sNameLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton themeButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        //get favicon
        URL iconURL = getClass().getResource("/favicon.png");
        ImageIcon img = new ImageIcon(iconURL);

        setIconImage(img.getImage());
    }
}

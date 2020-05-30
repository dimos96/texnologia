
package ticket;


public class AdminPanel extends javax.swing.JFrame {

   
    public AdminPanel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grammi_logout = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        addnewmatch = new javax.swing.JButton();
        viewmatches = new javax.swing.JButton();
        viewusersinformation = new javax.swing.JButton();
        lottery = new javax.swing.JButton();
        viewmembercardrequests = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        grammi_logout.setBackground(new java.awt.Color(0, 102, 255));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setForeground(new java.awt.Color(0, 102, 255));
        logout.setText("LOG OUT");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        addnewmatch.setBackground(new java.awt.Color(0, 102, 255));
        addnewmatch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addnewmatch.setForeground(new java.awt.Color(255, 255, 255));
        addnewmatch.setText("Add New Match");
        addnewmatch.setBorderPainted(false);
        addnewmatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewmatchActionPerformed(evt);
            }
        });

        viewmatches.setBackground(new java.awt.Color(255, 51, 153));
        viewmatches.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewmatches.setForeground(new java.awt.Color(255, 255, 255));
        viewmatches.setText("View Matches");
        viewmatches.setBorderPainted(false);
        viewmatches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewmatchesActionPerformed(evt);
            }
        });

        viewusersinformation.setBackground(new java.awt.Color(255, 153, 51));
        viewusersinformation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewusersinformation.setForeground(new java.awt.Color(255, 255, 255));
        viewusersinformation.setText("View Users Information");
        viewusersinformation.setBorderPainted(false);
        viewusersinformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewusersinformationActionPerformed(evt);
            }
        });

        lottery.setBackground(new java.awt.Color(8, 161, 47));
        lottery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lottery.setForeground(new java.awt.Color(255, 255, 255));
        lottery.setText("Lottery");
        lottery.setBorderPainted(false);
        lottery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotteryActionPerformed(evt);
            }
        });

        viewmembercardrequests.setBackground(new java.awt.Color(204, 153, 255));
        viewmembercardrequests.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewmembercardrequests.setForeground(new java.awt.Color(255, 255, 255));
        viewmembercardrequests.setText("View Member Card Requests");
        viewmembercardrequests.setBorderPainted(false);
        viewmembercardrequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewmembercardrequestsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewmembercardrequests, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(lottery, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewusersinformation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewmatches, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addnewmatch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(addnewmatch, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewmatches, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lottery, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewusersinformation, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewmembercardrequests, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIN");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 153));
        jLabel2.setText("TICKETS");

        javax.swing.GroupLayout grammi_logoutLayout = new javax.swing.GroupLayout(grammi_logout);
        grammi_logout.setLayout(grammi_logoutLayout);
        grammi_logoutLayout.setHorizontalGroup(
            grammi_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grammi_logoutLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(grammi_logoutLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        grammi_logoutLayout.setVerticalGroup(
            grammi_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grammi_logoutLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(grammi_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(grammi_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(grammi_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void addnewmatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewmatchActionPerformed
        AddMatch addmatch = new AddMatch();
        addmatch.setVisible(true);
        addmatch.pack();
        addmatch.setLocationRelativeTo(null);
        
        this.dispose();
        
    }//GEN-LAST:event_addnewmatchActionPerformed

    private void viewusersinformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewusersinformationActionPerformed
        UsersList userslist = new UsersList();
        userslist.setVisible(true);
        userslist.pack();
        userslist.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_viewusersinformationActionPerformed

    private void lotteryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotteryActionPerformed
        Lottery lottery = new Lottery();
        lottery.setVisible(true);
        lottery.pack();
        lottery.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_lotteryActionPerformed

    private void viewmembercardrequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewmembercardrequestsActionPerformed
        ViewMemberCardRequests membercardrequest = new ViewMemberCardRequests();
        membercardrequest.setVisible(true);
        membercardrequest.pack();
        membercardrequest.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_viewmembercardrequestsActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void viewmatchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewmatchesActionPerformed
        viewMatches matches = new viewMatches();
        matches.setVisible(true);
        matches.pack();
        matches.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_viewmatchesActionPerformed

    
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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminPanel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnewmatch;
    private javax.swing.JPanel grammi_logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton lottery;
    private javax.swing.JButton viewmatches;
    private javax.swing.JButton viewmembercardrequests;
    private javax.swing.JButton viewusersinformation;
    // End of variables declaration//GEN-END:variables
}

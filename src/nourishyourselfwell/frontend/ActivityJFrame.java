package nourishyourselfwell.frontend;

import java.util.ArrayList;
import nourishyourselfwell.backend.Activity;
import nourishyourselfwell.backend.ActivityDb;

public class ActivityJFrame extends javax.swing.JFrame {

    public ActivityJFrame() {
        initComponents();
        adb = new ActivityDb(activitiesTable);
        activities = adb.showActivitiesDate();
        displayDate(datePosition);
    }
    
    private void displayDate(int datePosition) {
        previousDate.setEnabled(true);
        nextDate.setEnabled(true);
        if (datePosition == 0) previousDate.setEnabled(false);
        if (datePosition == (activities.size()-1)) nextDate.setEnabled(false);
        Activity activity = (Activity)activities.get(datePosition);
        activitySearchTF.setText(activity.getActivityDate().toString());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        durationTF = new javax.swing.JTextField();
        caloriesTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addActivityB = new javax.swing.JButton();
        editActivityB = new javax.swing.JButton();
        deleteActivityB = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        activityTypeTA = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        startTimeTF = new javax.swing.JFormattedTextField();
        activitySearchTF = new javax.swing.JTextField();
        activityDateTF = new javax.swing.JTextField();
        showActivitiesB = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        activitiesTable = new javax.swing.JTable();
        previousDate = new javax.swing.JButton();
        nextDate = new javax.swing.JButton();

        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 191, 87));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dziennik aktywności fizycznej");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Rodzaj aktywności");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Godzina ");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Czas trwania");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Spalone kalorie");

        durationTF.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        durationTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        durationTF.setText("1,5 h");

        caloriesTF.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        caloriesTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caloriesTF.setText("400 ");
        caloriesTF.setToolTipText("");
        caloriesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caloriesTFActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(199, 151, 29));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("WYKONANA AKTYWNOŚĆ FIZYCZNA");

        addActivityB.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        addActivityB.setText("Dodaj  ");
        addActivityB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActivityBActionPerformed(evt);
            }
        });

        editActivityB.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        editActivityB.setText("Edytuj");
        editActivityB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActivityBActionPerformed(evt);
            }
        });

        deleteActivityB.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        deleteActivityB.setText("Usuń");
        deleteActivityB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActivityBActionPerformed(evt);
            }
        });

        activityTypeTA.setColumns(20);
        activityTypeTA.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        activityTypeTA.setLineWrap(true);
        activityTypeTA.setRows(5);
        jScrollPane2.setViewportView(activityTypeTA);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(199, 151, 29));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DODAJ AKTYWNOŚĆ");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Data");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Wybierz datę wykonanej aktywności fizycznej");
        jLabel10.setFocusable(false);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        startTimeTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        startTimeTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        startTimeTF.setText("12:00");
        startTimeTF.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        activitySearchTF.setEditable(false);
        activitySearchTF.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        activitySearchTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activitySearchTF.setText("rrrr-mm-dd");

        activityDateTF.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        activityDateTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activityDateTF.setText("rrrr-mm-dd");

        showActivitiesB.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        showActivitiesB.setText("Wyszukaj");
        showActivitiesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActivitiesBActionPerformed(evt);
            }
        });

        activitiesTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 176, 83)));
        activitiesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Data", "Rodzaj ", "Godzina ", "Czas ", "Kalorie"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        activitiesTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        activitiesTable.setDoubleBuffered(true);
        activitiesTable.setGridColor(new java.awt.Color(83, 176, 83));
        activitiesTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        activitiesTable.getTableHeader().setResizingAllowed(false);
        activitiesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(activitiesTable);
        if (activitiesTable.getColumnModel().getColumnCount() > 0) {
            activitiesTable.getColumnModel().getColumn(0).setResizable(false);
            activitiesTable.getColumnModel().getColumn(1).setResizable(false);
            activitiesTable.getColumnModel().getColumn(2).setResizable(false);
            activitiesTable.getColumnModel().getColumn(3).setResizable(false);
            activitiesTable.getColumnModel().getColumn(4).setResizable(false);
            activitiesTable.getColumnModel().getColumn(5).setResizable(false);
        }

        previousDate.setText("<");
        previousDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousDateActionPerformed(evt);
            }
        });

        nextDate.setText(">");
        nextDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(activityDateTF))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(startTimeTF)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(durationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addComponent(caloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(addActivityB, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(activitySearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(previousDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(showActivitiesB, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editActivityB, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteActivityB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(activitySearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(previousDate)
                        .addComponent(nextDate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(activityDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startTimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(durationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteActivityB)
                            .addComponent(showActivitiesB)
                            .addComponent(addActivityB)
                            .addComponent(editActivityB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caloriesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caloriesTFActionPerformed
        
    }//GEN-LAST:event_caloriesTFActionPerformed

    private void showActivitiesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActivitiesBActionPerformed
        adb.showActivities(activitySearchTF.getText());  
    }//GEN-LAST:event_showActivitiesBActionPerformed

    private void addActivityBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActivityBActionPerformed
        adb.addActivity(activityDateTF.getText(), activityTypeTA.getText(), 
                startTimeTF.getText(), durationTF.getText(), caloriesTF.getText());
        activitySearchTF.setText(activityDateTF.getText());
        adb.showActivities(activitySearchTF.getText());
    }//GEN-LAST:event_addActivityBActionPerformed

    private void deleteActivityBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActivityBActionPerformed
        adb.deleteActivity();
        adb.showActivities(activitySearchTF.getText());
    }//GEN-LAST:event_deleteActivityBActionPerformed

    private void previousDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousDateActionPerformed
        displayDate(--datePosition);
    }//GEN-LAST:event_previousDateActionPerformed

    private void nextDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextDateActionPerformed
        displayDate(datePosition++);
    }//GEN-LAST:event_nextDateActionPerformed

    private void editActivityBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActivityBActionPerformed
        adb.updateActivity();
        adb.showActivities(activitySearchTF.getText());
    }//GEN-LAST:event_editActivityBActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ActivityJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActivityJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActivityJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActivityJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActivityJFrame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable activitiesTable;
    private javax.swing.JTextField activityDateTF;
    private javax.swing.JTextField activitySearchTF;
    private javax.swing.JTextArea activityTypeTA;
    private javax.swing.JButton addActivityB;
    private javax.swing.JTextField caloriesTF;
    private javax.swing.JButton deleteActivityB;
    private javax.swing.JTextField durationTF;
    private javax.swing.JButton editActivityB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton nextDate;
    private javax.swing.JButton previousDate;
    private javax.swing.JButton showActivitiesB;
    private javax.swing.JFormattedTextField startTimeTF;
    // End of variables declaration//GEN-END:variables
    private ActivityDb adb;
    private ArrayList<Activity> activities;
    private int datePosition;
}

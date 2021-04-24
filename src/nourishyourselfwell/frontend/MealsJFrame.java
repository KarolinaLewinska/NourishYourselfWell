package nourishyourselfwell.frontend;

import java.util.ArrayList;
import nourishyourselfwell.backend.Meal;
import nourishyourselfwell.backend.MealsDb;

public class MealsJFrame extends javax.swing.JFrame {
     
    public MealsJFrame() {
        initComponents();
        mdb = new MealsDb(mealsTable);
        meals = mdb.showMealsDate();
        displayDate(datePosition);
      
    }
    private void displayDate(int datePosition) {
        previousDate.setEnabled(true);
        nextDate.setEnabled(true);
        if (datePosition == 0) previousDate.setEnabled(false);
        if (datePosition == (meals.size()-1)) nextDate.setEnabled(false);
        Meal meal = (Meal)meals.get(datePosition);
        mealsSearchTF.setText(meal.getMealDate().toString());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mealComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        caloriesTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addMealB = new javax.swing.JButton();
        deleteMealB = new javax.swing.JButton();
        editMealB = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        mealNameTA = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mealHourTF = new javax.swing.JFormattedTextField();
        showMealsB = new javax.swing.JButton();
        mealsSearchTF = new javax.swing.JTextField();
        mealDateTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mealsTable = new javax.swing.JTable();
        previousDate = new javax.swing.JButton();
        nextDate = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 395));
        setPreferredSize(new java.awt.Dimension(960, 395));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 191, 87));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dziennik posiłków");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(199, 151, 29));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SPOŻYTE POSIŁKI");

        mealComboBox.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        mealComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "śniadanie", "II śniadanie", "obiad", "podwieczorek", "kolacja", "przekąska", "inne", " " }));
        mealComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nazwa posiłku");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Godzina spożycia ");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Spożyte kalorie");

        caloriesTF.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        caloriesTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caloriesTF.setText("450 ");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Rodzaj posiłku");

        addMealB.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        addMealB.setText("Dodaj ");
        addMealB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMealBActionPerformed(evt);
            }
        });

        deleteMealB.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        deleteMealB.setText("Usuń");
        deleteMealB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMealBActionPerformed(evt);
            }
        });

        editMealB.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        editMealB.setText("Edytuj");
        editMealB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMealBActionPerformed(evt);
            }
        });

        mealNameTA.setColumns(20);
        mealNameTA.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        mealNameTA.setLineWrap(true);
        mealNameTA.setRows(5);
        jScrollPane3.setViewportView(mealNameTA);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(199, 151, 29));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DODAJ POSIŁEK");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Data spożycia");

        mealHourTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        mealHourTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mealHourTF.setText("08:00");
        mealHourTF.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        showMealsB.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        showMealsB.setText("Wyszukaj");
        showMealsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMealsBActionPerformed(evt);
            }
        });

        mealsSearchTF.setEditable(false);
        mealsSearchTF.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        mealsSearchTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mealsSearchTF.setText("rrrr-mm-dd");
        mealsSearchTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealsSearchTFActionPerformed(evt);
            }
        });

        mealDateTF.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        mealDateTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mealDateTF.setText("rrrr-mm-dd");

        mealsTable.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        mealsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Data", "Rodzaj", "Nazwa ", "Godzina", "Kalorie"
            }
        ));
        mealsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        mealsTable.setAutoscrolls(false);
        mealsTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(mealsTable);
        if (mealsTable.getColumnModel().getColumnCount() > 0) {
            mealsTable.getColumnModel().getColumn(0).setResizable(false);
            mealsTable.getColumnModel().getColumn(1).setResizable(false);
            mealsTable.getColumnModel().getColumn(2).setResizable(false);
            mealsTable.getColumnModel().getColumn(3).setResizable(false);
            mealsTable.getColumnModel().getColumn(4).setResizable(false);
            mealsTable.getColumnModel().getColumn(5).setResizable(false);
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

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Wybierz datę spożytych posiłków");
        jLabel10.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(mealHourTF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(caloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mealComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(mealDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mealsSearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(previousDate)
                                        .addGap(18, 18, 18)
                                        .addComponent(nextDate)))))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(addMealB, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showMealsB, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(editMealB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(deleteMealB, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mealsSearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(previousDate)
                        .addComponent(nextDate))
                    .addComponent(mealComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mealDateTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mealHourTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(showMealsB)
                                .addComponent(addMealB))
                            .addComponent(editMealB)
                            .addComponent(deleteMealB))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mealComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealComboBoxActionPerformed
       
    }//GEN-LAST:event_mealComboBoxActionPerformed

    private void showMealsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMealsBActionPerformed
        mdb.showMeals(mealsSearchTF.getText());
    }//GEN-LAST:event_showMealsBActionPerformed

    private void addMealBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMealBActionPerformed
        mdb.addMeal(mealDateTF.getText(), (String)mealComboBox.getSelectedItem(), 
                mealNameTA.getText(), mealHourTF.getText(), caloriesTF.getText());
        mealsSearchTF.setText(mealDateTF.getText());
        mdb.showMeals(mealDateTF.getText());
    }//GEN-LAST:event_addMealBActionPerformed

    private void mealsSearchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealsSearchTFActionPerformed
        
    }//GEN-LAST:event_mealsSearchTFActionPerformed

    private void deleteMealBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMealBActionPerformed
        mdb.deleteMeal();
        mdb.showMealsDate();
    }//GEN-LAST:event_deleteMealBActionPerformed

    private void previousDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousDateActionPerformed
        displayDate(--datePosition);
    }//GEN-LAST:event_previousDateActionPerformed

    private void nextDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextDateActionPerformed
        displayDate(++datePosition);
    }//GEN-LAST:event_nextDateActionPerformed

    private void editMealBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMealBActionPerformed
       mdb.updateMeal();
        
    }//GEN-LAST:event_editMealBActionPerformed
    
   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MealsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MealsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MealsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MealsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MealsJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMealB;
    private javax.swing.JTextField caloriesTF;
    private javax.swing.JButton deleteMealB;
    private javax.swing.JButton editMealB;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> mealComboBox;
    private javax.swing.JTextField mealDateTF;
    private javax.swing.JFormattedTextField mealHourTF;
    private javax.swing.JTextArea mealNameTA;
    private javax.swing.JTextField mealsSearchTF;
    private javax.swing.JTable mealsTable;
    private javax.swing.JButton nextDate;
    private javax.swing.JButton previousDate;
    private javax.swing.JButton showMealsB;
    // End of variables declaration//GEN-END:variables
    private MealsDb mdb;
    private ArrayList<Meal> meals;
    private int datePosition;
}

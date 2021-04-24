package nourishyourselfwell.frontend;

import java.util.ArrayList;

import nourishyourselfwell.backend.Activity;
import nourishyourselfwell.backend.Meal;
import nourishyourselfwell.backend.StatisticsDbActivities;
import nourishyourselfwell.backend.StatisticsDbMeals;

public class StatisticsJFrame extends javax.swing.JFrame {

    public StatisticsJFrame() {
        initComponents();
        sdbM = new StatisticsDbMeals(caloriesTF);
        sdbM2 = new StatisticsDbMeals(favouriteMealTF);
        sdbM3 = new StatisticsDbMeals(averageMealCaloriesTF);
        sdbM4 = new StatisticsDbMeals(sumOfCaloriesTF);
        
        sdbA = new StatisticsDbActivities(mostBurntCaloriesTF);
        sdbA2 = new StatisticsDbActivities(favouriteActivityTF);
        sdbA3 = new StatisticsDbActivities(averageBurntCaloriesTF);
  
        
        meals = sdbM.selectMostCaloricMeal();
        meals2 = sdbM2.selectFavouriteMeal();
        meals3 = sdbM3.selectAverageMealCalories();
        
        
        activities = sdbA.selectMostBurntCalories();
        activities2 = sdbA2.selectFavouriteActivity();
        activities3 = sdbA3.selectAverageBurntCalories();
  
        
        displayData(dataPosition);
       
    }
    public void displayData(int dataPosition) {
        Meal meal = (Meal)meals.get(dataPosition);
        Meal meal2 = (Meal)meals2.get(dataPosition);
        Meal meal3 = (Meal)meals3.get(dataPosition);
        
        
        
        Activity activity = (Activity)activities.get(dataPosition);
        Activity activity2 = (Activity)activities2.get(dataPosition);
        Activity activity3 = (Activity)activities3.get(dataPosition);
       
        
        caloriesTF.setText(String.valueOf(meal.getCalories()));
        favouriteMealTF.setText(String.valueOf(meal2.getMealName()));
        averageMealCaloriesTF.setText(String.valueOf(meal3.getCalories()));
        
        
        
        mostBurntCaloriesTF.setText(String.valueOf(activity.getCalories()));
        favouriteActivityTF.setText(String.valueOf(activity2.getActivityType()));
        averageBurntCaloriesTF.setText(String.valueOf(activity3.getCalories()));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        caloriesTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        favouriteMealTF = new javax.swing.JTextField();
        mostBurntCaloriesTF = new javax.swing.JTextField();
        favouriteActivityTF = new javax.swing.JTextField();
        mealDateTF = new javax.swing.JTextField();
        averageMealCaloriesTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        averageBurntCaloriesTF = new javax.swing.JTextField();
        sumOfCaloriesTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sumOfCaloriesB = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 191, 87));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Moje statystyki");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Najkaloryczniejszy posiłek");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Najwięcej spalonych kalorii");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Ulubiona aktywność fizyczna");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Ulubiony posiłek");

        caloriesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caloriesTFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Suma spożytych kalorii");

        favouriteMealTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favouriteMealTFActionPerformed(evt);
            }
        });

        mostBurntCaloriesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostBurntCaloriesTFActionPerformed(evt);
            }
        });

        favouriteActivityTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favouriteActivityTFActionPerformed(evt);
            }
        });

        mealDateTF.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        mealDateTF.setText("rrrr-mm-dd");
        mealDateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealDateTFActionPerformed(evt);
            }
        });

        averageMealCaloriesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageMealCaloriesTFActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Średnia liczba spożytych kalorii");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Średnia liczba spalonych kalorii ");

        averageBurntCaloriesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageBurntCaloriesTFActionPerformed(evt);
            }
        });

        sumOfCaloriesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOfCaloriesTFActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("Data");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        sumOfCaloriesB.setText("Sprawdź");
        sumOfCaloriesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOfCaloriesBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mealDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sumOfCaloriesB)
                        .addGap(222, 222, 222))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(favouriteActivityTF))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(caloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(favouriteMealTF))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mostBurntCaloriesTF)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(averageBurntCaloriesTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                            .addComponent(averageMealCaloriesTF)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(sumOfCaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(205, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(caloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(favouriteMealTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostBurntCaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favouriteActivityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(averageMealCaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(averageBurntCaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sumOfCaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(mealDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumOfCaloriesB))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caloriesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caloriesTFActionPerformed

    }//GEN-LAST:event_caloriesTFActionPerformed

    private void favouriteMealTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favouriteMealTFActionPerformed

    }//GEN-LAST:event_favouriteMealTFActionPerformed

    private void mostBurntCaloriesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostBurntCaloriesTFActionPerformed

    }//GEN-LAST:event_mostBurntCaloriesTFActionPerformed

    private void favouriteActivityTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favouriteActivityTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_favouriteActivityTFActionPerformed

    private void mealDateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealDateTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mealDateTFActionPerformed

    private void averageMealCaloriesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageMealCaloriesTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_averageMealCaloriesTFActionPerformed

    private void averageBurntCaloriesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageBurntCaloriesTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_averageBurntCaloriesTFActionPerformed

    private void sumOfCaloriesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOfCaloriesTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumOfCaloriesTFActionPerformed

    private void sumOfCaloriesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOfCaloriesBActionPerformed
        sdbM4.selectSumOfCaloriesByDate(mealDateTF.getText(),sumOfCaloriesTF );     
    }//GEN-LAST:event_sumOfCaloriesBActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StatisticsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatisticsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatisticsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatisticsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatisticsJFrame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField averageBurntCaloriesTF;
    private javax.swing.JTextField averageMealCaloriesTF;
    private javax.swing.JTextField caloriesTF;
    private javax.swing.JTextField favouriteActivityTF;
    private javax.swing.JTextField favouriteMealTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mealDateTF;
    private javax.swing.JTextField mostBurntCaloriesTF;
    private javax.swing.JButton sumOfCaloriesB;
    private javax.swing.JTextField sumOfCaloriesTF;
    // End of variables declaration//GEN-END:variables
    private StatisticsDbMeals sdbM, sdbM2, sdbM3, sdbM4;
    private StatisticsDbActivities sdbA, sdbA2, sdbA3;    
    private ArrayList<Meal> meals, meals2, meals3, meals4;   
    private ArrayList<Activity> activities, activities2, activities3;    
    private int dataPosition;

}

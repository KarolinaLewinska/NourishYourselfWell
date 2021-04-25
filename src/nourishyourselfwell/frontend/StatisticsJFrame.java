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
        sdbM4 = new StatisticsDbMeals(sumOfMealsCaloriesTF);
        
        sdbA = new StatisticsDbActivities(mostBurntCaloriesTF);
        sdbA2 = new StatisticsDbActivities(favouriteActivityTF);
        sdbA3 = new StatisticsDbActivities(averageBurntCaloriesTF);
        sdbA4 = new StatisticsDbActivities(sumOfBurntCaloriesTF);
  
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

        jProgressBar1 = new javax.swing.JProgressBar();
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
        sumOfMealsCaloriesTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sumOfMealsCaloriesB = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sumOfBurntCaloriesB = new javax.swing.JButton();
        activityDateTF = new javax.swing.JTextField();
        sumOfBurntCaloriesTF = new javax.swing.JTextField();

        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 191, 87));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Moje statystyki");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Najkaloryczniejszy posiłek");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Najwięcej spalonych kalorii");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Ulubiona aktywność ");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Ulubiony posiłek");

        caloriesTF.setEditable(false);
        caloriesTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caloriesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caloriesTFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Suma spożytych kalorii");

        favouriteMealTF.setEditable(false);
        favouriteMealTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        favouriteMealTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favouriteMealTFActionPerformed(evt);
            }
        });

        mostBurntCaloriesTF.setEditable(false);
        mostBurntCaloriesTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mostBurntCaloriesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostBurntCaloriesTFActionPerformed(evt);
            }
        });

        favouriteActivityTF.setEditable(false);
        favouriteActivityTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        favouriteActivityTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favouriteActivityTFActionPerformed(evt);
            }
        });

        mealDateTF.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        mealDateTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mealDateTF.setText("rrrr-mm-dd");
        mealDateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealDateTFActionPerformed(evt);
            }
        });

        averageMealCaloriesTF.setEditable(false);
        averageMealCaloriesTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        averageMealCaloriesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageMealCaloriesTFActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Średnia liczba spożytych kalorii");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Średnia liczba spalonych kalorii ");

        averageBurntCaloriesTF.setEditable(false);
        averageBurntCaloriesTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        averageBurntCaloriesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageBurntCaloriesTFActionPerformed(evt);
            }
        });

        sumOfMealsCaloriesTF.setEditable(false);
        sumOfMealsCaloriesTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sumOfMealsCaloriesTF.setText("0");
        sumOfMealsCaloriesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOfMealsCaloriesTFActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("Data");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        sumOfMealsCaloriesB.setText("Sprawdź");
        sumOfMealsCaloriesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOfMealsCaloriesBActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setText("Suma spalonych kalorii");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setText("Data");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        sumOfBurntCaloriesB.setText("Sprawdź");
        sumOfBurntCaloriesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOfBurntCaloriesBActionPerformed(evt);
            }
        });

        activityDateTF.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        activityDateTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activityDateTF.setText("rrrr-mm-dd");
        activityDateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityDateTFActionPerformed(evt);
            }
        });

        sumOfBurntCaloriesTF.setEditable(false);
        sumOfBurntCaloriesTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sumOfBurntCaloriesTF.setText("0");
        sumOfBurntCaloriesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOfBurntCaloriesTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(favouriteMealTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(favouriteActivityTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(caloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mostBurntCaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sumOfMealsCaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mealDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sumOfMealsCaloriesB, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activityDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(averageBurntCaloriesTF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(averageMealCaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sumOfBurntCaloriesB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sumOfBurntCaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(favouriteMealTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favouriteActivityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(caloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostBurntCaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(averageMealCaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(averageBurntCaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumOfMealsCaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sumOfMealsCaloriesB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sumOfBurntCaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(mealDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(activityDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sumOfBurntCaloriesB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
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
        
    }//GEN-LAST:event_favouriteActivityTFActionPerformed

    private void mealDateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealDateTFActionPerformed
        
    }//GEN-LAST:event_mealDateTFActionPerformed

    private void averageMealCaloriesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageMealCaloriesTFActionPerformed
        
    }//GEN-LAST:event_averageMealCaloriesTFActionPerformed

    private void averageBurntCaloriesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageBurntCaloriesTFActionPerformed
        
    }//GEN-LAST:event_averageBurntCaloriesTFActionPerformed

    private void sumOfMealsCaloriesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOfMealsCaloriesTFActionPerformed
        
    }//GEN-LAST:event_sumOfMealsCaloriesTFActionPerformed

    private void sumOfMealsCaloriesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOfMealsCaloriesBActionPerformed
        sdbM4.selectSumOfCaloriesByDate(mealDateTF.getText(),sumOfMealsCaloriesTF );     
    }//GEN-LAST:event_sumOfMealsCaloriesBActionPerformed

    private void sumOfBurntCaloriesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOfBurntCaloriesBActionPerformed
        sdbA4.selectSumOfBurntCaloriesByDate(activityDateTF.getText(),sumOfBurntCaloriesTF ); 
    }//GEN-LAST:event_sumOfBurntCaloriesBActionPerformed

    private void activityDateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityDateTFActionPerformed
       
    }//GEN-LAST:event_activityDateTFActionPerformed

    private void sumOfBurntCaloriesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOfBurntCaloriesTFActionPerformed
        
    }//GEN-LAST:event_sumOfBurntCaloriesTFActionPerformed
    
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
    private javax.swing.JTextField activityDateTF;
    private javax.swing.JTextField averageBurntCaloriesTF;
    private javax.swing.JTextField averageMealCaloriesTF;
    private javax.swing.JTextField caloriesTF;
    private javax.swing.JTextField favouriteActivityTF;
    private javax.swing.JTextField favouriteMealTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField mealDateTF;
    private javax.swing.JTextField mostBurntCaloriesTF;
    private javax.swing.JButton sumOfBurntCaloriesB;
    private javax.swing.JTextField sumOfBurntCaloriesTF;
    private javax.swing.JButton sumOfMealsCaloriesB;
    private javax.swing.JTextField sumOfMealsCaloriesTF;
    // End of variables declaration//GEN-END:variables
    private StatisticsDbMeals sdbM, sdbM2, sdbM3, sdbM4;
    private StatisticsDbActivities sdbA, sdbA2, sdbA3, sdbA4;    
    private ArrayList<Meal> meals, meals2, meals3, meals4;   
    private ArrayList<Activity> activities, activities2, activities3, activities4;    
    private int dataPosition;
}

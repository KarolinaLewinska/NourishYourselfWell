package nourishyourselfwell.frontend;

public class StartJFrame extends javax.swing.JFrame {

    public StartJFrame() {
        initComponents();
        mf = new MealsJFrame(); 
        mf.setTitle("Dziennik posiłków");
        mf.setSize(780,480);
        
        af = new ActivityJFrame();
        af.setTitle("Dziennik aktywności fizycznej");
        af.setSize(780,480);
        
        sf = new StatisticsJFrame();
        sf.setTitle("Statystyki");
        sf.setSize(480,480);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mainMenu = new javax.swing.JMenu();
        zakoncz = new javax.swing.JMenuItem();
        diariesMenu = new javax.swing.JMenu();
        mealsDiary = new javax.swing.JMenuItem();
        activityDiary = new javax.swing.JMenuItem();
        statisticsMenu = new javax.swing.JMenu();
        myStatistics = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(195, 166, 63));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nourishyourselfwell/images/logoapp.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dzięki naszej aplikacji ułatwisz kontrolowanie zdrowego trybu życia! ");
        jLabel2.setToolTipText("");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setBackground(new java.awt.Color(253, 253, 230));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Zaplanujesz posiłki i aktywność fizyczną na każdy dzień!");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(239, 191, 87));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nourish Yourself Well");

        mainMenu.setText("Strona główna");

        zakoncz.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        zakoncz.setText("Zakończ");
        zakoncz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zakonczActionPerformed(evt);
            }
        });
        mainMenu.add(zakoncz);

        jMenuBar1.add(mainMenu);

        diariesMenu.setText("Dzienniki");

        mealsDiary.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mealsDiary.setText("Posiłki");
        mealsDiary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealsDiaryActionPerformed(evt);
            }
        });
        diariesMenu.add(mealsDiary);

        activityDiary.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        activityDiary.setText("Aktywność fizyczna");
        activityDiary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityDiaryActionPerformed(evt);
            }
        });
        diariesMenu.add(activityDiary);

        jMenuBar1.add(diariesMenu);

        statisticsMenu.setText("Statystyki");

        myStatistics.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        myStatistics.setText("Moje statystyki");
        myStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myStatisticsActionPerformed(evt);
            }
        });
        statisticsMenu.add(myStatistics);

        jMenuBar1.add(statisticsMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mealsDiaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealsDiaryActionPerformed
        mf.setVisible(true);
    }//GEN-LAST:event_mealsDiaryActionPerformed

    private void zakonczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zakonczActionPerformed
        System.exit(0);
    }//GEN-LAST:event_zakonczActionPerformed

    private void activityDiaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityDiaryActionPerformed
        af.setVisible(true);
    }//GEN-LAST:event_activityDiaryActionPerformed

    private void myStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myStatisticsActionPerformed
        sf.setVisible(true);
    }//GEN-LAST:event_myStatisticsActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartJFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem activityDiary;
    private javax.swing.JMenu diariesMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mainMenu;
    private javax.swing.JMenuItem mealsDiary;
    private javax.swing.JMenuItem myStatistics;
    private javax.swing.JMenu statisticsMenu;
    private javax.swing.JMenuItem zakoncz;
    // End of variables declaration//GEN-END:variables
    private MealsJFrame mf;
    private ActivityJFrame af;
    private StatisticsJFrame sf;
}

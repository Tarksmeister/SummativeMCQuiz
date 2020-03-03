/*
 * This program generates a interactable quiz about The Office
 * Prompts the user to enter their answer to a text box, and evaluates if each answer is correct.
 * Program also totals up number of correct and incorrect answers, and generates a score.
 * Created by Tarkan Dahi on the Third of March, 2020
 */

/**
 *
 * @author tADAH5199
 */
public class newFrm extends javax.swing.JFrame {

    /**
     * Creates new form newFrm
     */
    public newFrm() {
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

        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        titlelbl = new javax.swing.JLabel();
        QuestionOnelbl = new javax.swing.JLabel();
        AnswerOnelbl = new javax.swing.JLabel();
        AnswerOnetxt = new javax.swing.JTextField();
        QuestionTwolbl = new javax.swing.JLabel();
        AnswerTwolbl = new javax.swing.JLabel();
        AnswerTwotxt = new javax.swing.JTextField();
        QuestionThreelbl = new javax.swing.JLabel();
        AnswerThreelbl = new javax.swing.JLabel();
        AnswerThreetxt = new javax.swing.JTextField();
        QuestionFourlbl = new javax.swing.JLabel();
        AnswerFourlbl = new javax.swing.JLabel();
        AnswerFourtxt = new javax.swing.JTextField();
        QuestionFivelbl = new javax.swing.JLabel();
        AnswerFivelbl = new javax.swing.JLabel();
        AnswerFivetxt = new javax.swing.JTextField();
        Submitbtn = new javax.swing.JButton();
        CorrectAnswerlbl = new javax.swing.JLabel();
        WrongAnswerlbl = new javax.swing.JLabel();
        Scorelbl = new javax.swing.JLabel();
        QuestionOneResponselbl = new javax.swing.JLabel();
        QuestionTwoResponselbl = new javax.swing.JLabel();
        QuestionThreeResponselbl = new javax.swing.JLabel();
        QuestionFiveResponselbl = new javax.swing.JLabel();
        QuestionFourResponselbl = new javax.swing.JLabel();
        Promptlbl = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlelbl.setText("Tarkan's Quiz about The Office");

        QuestionOnelbl.setText("Question 1: In S1E1 \"Pilot\": Who started their first day at Dunder Mifflin Scranton? ");

        AnswerOnelbl.setText(" A) Jim Halpert B) Ryan Howard C) Michael Scott D) Erin Hannon");

        AnswerOnetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerOnetxtActionPerformed(evt);
            }
        });

        QuestionTwolbl.setText("Question 2: Who does Michael accidentally hit with his car in the parking lot? ");

        AnswerTwolbl.setText("A) Jim Halpert B) Dwight Schrute C) Stanley Hudson D) Merideth Palmer");

        AnswerTwotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerTwotxtActionPerformed(evt);
            }
        });

        QuestionThreelbl.setText("Question 3: According to \"Prison Mike\", what is the worst thing about prison?");

        AnswerThreelbl.setText("A) The Goblins B) The Orcs C) The Math Teachers D) The Dementors");

        AnswerThreetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerThreetxtActionPerformed(evt);
            }
        });

        QuestionFourlbl.setText("Question 4:  What's in the giant pot that Kevin drops all over the office floor? ");

        AnswerFourlbl.setText("A) Macaroni B) Beef Stew C) Chili D) Gravy");

        AnswerFourtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerFourtxtActionPerformed(evt);
            }
        });

        QuestionFivelbl.setText("Question 5: What type of farm does Dwight own?");

        AnswerFivelbl.setText("A) Beet B) Turnip C) Potato D) Carrot");

        AnswerFivetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerFivetxtActionPerformed(evt);
            }
        });

        Submitbtn.setText("Submit Answer");
        Submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbtnActionPerformed(evt);
            }
        });

        CorrectAnswerlbl.setText("# of Correct Answers: ");

        WrongAnswerlbl.setText("# of Wrong Answers:");

        Scorelbl.setText("Score (%) : ");

        QuestionOneResponselbl.setText("Your answer is:");

        QuestionTwoResponselbl.setText("Your answer is:");

        QuestionThreeResponselbl.setText("Your answer is:");

        QuestionFiveResponselbl.setText("Your answer is:");

        QuestionFourResponselbl.setText("Your answer is:");

        Promptlbl.setText("Please enter the letter of your answer in the box.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(QuestionOnelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(AnswerOnelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AnswerOnetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(QuestionTwolbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AnswerTwolbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AnswerTwotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(QuestionThreelbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AnswerThreelbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AnswerThreetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AnswerFourlbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AnswerFourtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QuestionOneResponselbl, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QuestionTwoResponselbl, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QuestionThreeResponselbl, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(QuestionFiveResponselbl, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(QuestionFivelbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AnswerFivelbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AnswerFivetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QuestionFourResponselbl, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(titlelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Promptlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Submitbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CorrectAnswerlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WrongAnswerlbl)
                    .addComponent(Scorelbl))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuestionFourlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titlelbl)
                    .addComponent(Promptlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionOnelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnswerOnelbl)
                    .addComponent(AnswerOnetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionOneResponselbl)
                .addGap(5, 5, 5)
                .addComponent(QuestionTwolbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnswerTwolbl)
                    .addComponent(AnswerTwotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionTwoResponselbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionThreelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnswerThreelbl)
                    .addComponent(AnswerThreetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(QuestionThreeResponselbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionFourlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnswerFourlbl)
                    .addComponent(AnswerFourtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionFourResponselbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionFivelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnswerFivelbl)
                    .addComponent(AnswerFivetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionFiveResponselbl)
                .addGap(34, 34, 34)
                .addComponent(CorrectAnswerlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WrongAnswerlbl)
                    .addComponent(Submitbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Scorelbl)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnswerOnetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerOnetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerOnetxtActionPerformed

    private void AnswerTwotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerTwotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerTwotxtActionPerformed

    private void AnswerThreetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerThreetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerThreetxtActionPerformed

    private void AnswerFourtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerFourtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerFourtxtActionPerformed

    private void AnswerFivetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerFivetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerFivetxtActionPerformed

    private void SubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbtnActionPerformed
    // Variable Declaration area
    int score = 0;
    final int CORRECT_ANSWER_POINT = 1;
    int numIncorrect;
    double perCorrect;
    
    String answerOne ;
    String answerTwo ;
    String answerThree;
    String answerFour;
    String answerFive;
    
    answerOne = AnswerOnetxt.getText();
    answerTwo = AnswerTwotxt.getText();
    answerThree = AnswerThreetxt.getText();
    answerFour = AnswerFourtxt.getText();
    answerFive = AnswerFivetxt.getText();
    
    //Question 1
    if (answerOne.equals("B") || answerOne.equals("b")) { //Setup so that B or b gives the correct answer and adds a point to total
    score = score + CORRECT_ANSWER_POINT;
    QuestionOneResponselbl.setText("Congratulations, that is the correct answer!");
    } 
    //Setup so that every other answer ends up giving a response that points to the correct answer
    else {
    QuestionOneResponselbl.setText("Sorry that is the wrong answer, the correct answer is B");
    }

    
    
    //Question 2
    if (answerTwo.equals("D") || answerTwo.equals("d")) { //Setup so that D or d gives the correct answer and adds a point to total
    score = score + CORRECT_ANSWER_POINT;
    QuestionTwoResponselbl.setText("Congratulations, that is the correct answer!");
    } 
    //Setup so that every other answer ends up giving a response that points to the correct answer
    else  {
    QuestionTwoResponselbl.setText("Sorry that is the wrong answer, the correct answer is D");
    }
    
    
    //Question 3
    if (answerThree.equals("D") || answerThree.equals("d")) { //Setup so that D or d gives the correct answer and adds a point to total
    score = score + CORRECT_ANSWER_POINT;
    QuestionThreeResponselbl.setText("Congratulations, that is the correct answer!");
    } 
    //Setup so that every other answer ends up giving a response that points to the correct answer
    else {
    QuestionThreeResponselbl.setText("Sorry that is the wrong answer, the correct answer is D");
    }
    
    
    //Question 4
    if (answerFour.equals("C") || answerFour.equals("c")) { //Setup so that C or c gives the correct answer and adds a point to total
    score = score + CORRECT_ANSWER_POINT;
    QuestionFourResponselbl.setText("Congratulations, that is the correct answer!");
    } 
    //Setup so that every other answer ends up giving a response that points to the correct answer
    else {
    QuestionFourResponselbl.setText("Sorry that is the wrong answer, the correct answer is C");
    }
    
  
    
    //Question 5
    if (answerFive.equals("A") || answerFive.equals("a")) { //Setup so that A or a gives the correct answer and adds a point to total
    score = score + CORRECT_ANSWER_POINT;
    QuestionFiveResponselbl.setText("Congratulations, that is the correct answer!");
    } 
    //Setup so that every other answer ends up giving a response that points to the correct answer
    else {
    QuestionFiveResponselbl.setText("Sorry that is the wrong answer, the correct answer is A");
    }
    
    
    //Portion of code calculates the number of correct answers
    //Along with amount of wrong answers, along with your score as a percentage.
    CorrectAnswerlbl.setText("# of Correct Answers:" + score);
    
    numIncorrect = 5 - score;
    
    WrongAnswerlbl.setText("# of Wrong Answers:" + numIncorrect);
    
    perCorrect = score * 20;
    
    Scorelbl.setText("Score (%):" + perCorrect + "%");
    
    
    }//GEN-LAST:event_SubmitbtnActionPerformed

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
            java.util.logging.Logger.getLogger(newFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnswerFivelbl;
    private javax.swing.JTextField AnswerFivetxt;
    private javax.swing.JLabel AnswerFourlbl;
    private javax.swing.JTextField AnswerFourtxt;
    private javax.swing.JLabel AnswerOnelbl;
    private javax.swing.JTextField AnswerOnetxt;
    private javax.swing.JLabel AnswerThreelbl;
    private javax.swing.JTextField AnswerThreetxt;
    private javax.swing.JLabel AnswerTwolbl;
    private javax.swing.JTextField AnswerTwotxt;
    private javax.swing.JLabel CorrectAnswerlbl;
    private javax.swing.JLabel Promptlbl;
    private javax.swing.JLabel QuestionFiveResponselbl;
    private javax.swing.JLabel QuestionFivelbl;
    private javax.swing.JLabel QuestionFourResponselbl;
    private javax.swing.JLabel QuestionFourlbl;
    private javax.swing.JLabel QuestionOneResponselbl;
    private javax.swing.JLabel QuestionOnelbl;
    private javax.swing.JLabel QuestionThreeResponselbl;
    private javax.swing.JLabel QuestionThreelbl;
    private javax.swing.JLabel QuestionTwoResponselbl;
    private javax.swing.JLabel QuestionTwolbl;
    private javax.swing.JLabel Scorelbl;
    private javax.swing.JButton Submitbtn;
    private javax.swing.JLabel WrongAnswerlbl;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titlelbl;
    // End of variables declaration//GEN-END:variables
}

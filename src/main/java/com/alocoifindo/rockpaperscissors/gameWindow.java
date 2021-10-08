
package com.alocoifindo.rockpaperscissors;

import static com.alocoifindo.rockpaperscissors.gameConsole.compInput;
import static com.alocoifindo.rockpaperscissors.gameConsole.compMovement;
import static com.alocoifindo.rockpaperscissors.gameConsole.compScore;
import static com.alocoifindo.rockpaperscissors.gameConsole.namingMovement;
import static com.alocoifindo.rockpaperscissors.gameConsole.userInput;
import static com.alocoifindo.rockpaperscissors.gameConsole.userScore;
import static com.alocoifindo.rockpaperscissors.gameConsole.winnerMeaning;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author facundoferreyra
 */
public class gameWindow extends java.awt.Frame {

    static char userInput;
    static int compInput;

    static char compMovement;

    static int userScore;
    static int compScore;
    
    static int fullUserScore = 0;
    static int fullCompScore = 0;
    /** Creates new form gameWindow */
    public gameWindow() {
        initComponents();
        resultPanel.setVisible(false);
    }

    void win() {
        userScore++;
        userField.setText(String.valueOf(userScore));
         if (userScore == 3) {
            fullUserScore++;
            fullUserField.setText(String.valueOf(fullUserScore));
            resetButton.setText("YOU WIN!");
        }
    }

    void lose() {
        compScore++;
        compField.setText(String.valueOf(compScore));
        if (compScore == 3) {
            fullCompScore++;
            fullCompField.setText(String.valueOf(fullCompScore));
            resetButton.setText("YOU LOSE");
        }
    }
                
    public void winnerMeaning(char user, char comp) {
        String phrase = "";
        String result = "";
        if (user == 'r' && comp == 'r') {
            phrase = "Rock and Rock!";
            result = "DRAW";
        } if (user == 'r' && comp == 'p') {
            phrase = "The Rock is eaten by the Paper.";
            result = "YOU LOSE";
            lose();
        } if (user == 'r' && comp == 's') {
            phrase = "Rock beats Scissors!";
            result = "YOU WIN";
            win();
        } if (user == 'p' && comp == 'r') {
            phrase = "Paper eats the Rock!";
            result = "YOU WIN";
            win();
        } if (user == 'p' && comp == 'p') {
            phrase = "Paper and Paper!";
            result = "DRAW";
        } if (user == 'p' && comp == 's') {
            phrase = "The Paper is cutted by the Scissors!";
            result = "YOU LOSE";
            lose();
        } if (user == 's' && comp == 'r') {
            phrase = "The Scissors is beated by the Rock.";
            result = "YOU LOSE";
            lose();
        } if (user == 's' && comp == 'p') {
            phrase = "Scissors cuts the Paper!";
            result = "YOU WIN";
            win();
        } if (user == 's' && comp == 's') {
            phrase = "Scissors and Scissors!";
            result = "DRAW";
        }
        phraseLabel.setText(phrase);
        resultLabel.setText(result);
    }
    
    public void gameRun() {
        resetButton.setText("ONE MORE TIME!");
        
        boolean gameValid = true;
        
        while (gameValid) {
            
        Random random = new Random();
        compInput = (int)(random.nextDouble() * 3);

        switch (compInput){
        case 0:
           compMovement = 'r';
           resultCompLabel.setIcon(new javax.swing.ImageIcon("/Users/facundoferreyra/NetBeansProjects/RockPaperScissors/img/rock img.png"));
           break;
        case 1:
            compMovement =  'p';
            resultCompLabel.setIcon(new javax.swing.ImageIcon("/Users/facundoferreyra/NetBeansProjects/RockPaperScissors/img/paper img.png"));
            break;
        case 2:
            compMovement =  's';
            resultCompLabel.setIcon(new javax.swing.ImageIcon("/Users/facundoferreyra/NetBeansProjects/RockPaperScissors/img/scissors img.png"));
            break;
        }

        winnerMeaning(userInput,compMovement);
        break;
        }
    }
    
    public void disableButtons(boolean enable){
        rockButton.setEnabled(enable);
        paperButton.setEnabled(enable);
        scissorsButton.setEnabled(enable);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultPanel = new javax.swing.JPanel();
        resultUserLabel = new javax.swing.JLabel();
        resultCompLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        phraseLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        compField = new javax.swing.JTextField();
        userField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fullGameLabel = new javax.swing.JLabel();
        fullCompField = new javax.swing.JTextField();
        fullUserField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rockButton = new javax.swing.JButton();
        scissorsButton = new javax.swing.JButton();
        paperButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));
        setLocationRelativeTo(null);
        setMinimumSize(new java.awt.Dimension(510, 366));
        setPreferredSize(new java.awt.Dimension(510, 379));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultPanel.setBackground(new java.awt.Color(153, 204, 255));
        resultPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultUserLabel.setBackground(new java.awt.Color(204, 255, 204));
        resultPanel.add(resultUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 140, 130));

        resultCompLabel.setBackground(new java.awt.Color(204, 255, 204));
        resultPanel.add(resultCompLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 140, 130));

        resetButton.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        resetButton.setText("ONE MORE TIME!");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        resultPanel.add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, 40));

        jLabel6.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        jLabel6.setText("—");
        resultPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, 40));

        resultLabel.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        resultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultLabel.setText("YOU LOSE");
        resultLabel.setToolTipText("");
        resultPanel.add(resultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 430, 30));

        phraseLabel.setFont(new java.awt.Font("Copperplate", 0, 16)); // NOI18N
        phraseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phraseLabel.setText("It's a feet");
        resultPanel.add(phraseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 430, 30));

        add(resultPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 510, 300));

        titleLabel.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("ROCK, PAPER & SCISSORS");
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 370, 50));

        jLabel1.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        jLabel1.setText("against the computer");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, 20));

        compField.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        compField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        compField.setText("0");
        add(compField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 30, 40));

        userField.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        userField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userField.setText("0");
        add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, 40));

        jLabel3.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("comp");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 50, 40));

        jLabel4.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        jLabel4.setText("user");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, 40));

        jLabel5.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        jLabel5.setText("—");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, 40));

        fullGameLabel.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        fullGameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullGameLabel.setText("FULL GAME");
        fullGameLabel.setToolTipText("");
        add(fullGameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 90, 10));

        fullCompField.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        fullCompField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fullCompField.setText("0");
        add(fullCompField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 30, 30));

        fullUserField.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        fullUserField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fullUserField.setText("0");
        fullUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullUserFieldActionPerformed(evt);
            }
        });
        add(fullUserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 30, 30));

        jLabel2.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        jLabel2.setText("—");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 50, 20, 30));

        jLabel7.setFont(new java.awt.Font("Copperplate", 0, 10)); // NOI18N
        jLabel7.setText("user");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, 30));

        jLabel8.setFont(new java.awt.Font("Copperplate", 0, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("comp");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 50, 30));

        jLabel9.setFont(new java.awt.Font("Helvetica", 0, 9)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("rounds of 3 games");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 90, 10));

        rockButton.setBackground(new java.awt.Color(204, 255, 204));
        rockButton.setIcon(new javax.swing.ImageIcon("/Users/facundoferreyra/NetBeansProjects/RockPaperScissors/img/rock img.png")); // NOI18N
        rockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockButtonActionPerformed(evt);
            }
        });
        add(rockButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 130));

        scissorsButton.setBackground(new java.awt.Color(204, 255, 204));
        scissorsButton.setIcon(new javax.swing.ImageIcon("/Users/facundoferreyra/NetBeansProjects/RockPaperScissors/img/scissors img.png")); // NOI18N
        scissorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorsButtonActionPerformed(evt);
            }
        });
        add(scissorsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 150, 130));

        paperButton.setBackground(new java.awt.Color(204, 255, 204));
        paperButton.setIcon(new javax.swing.ImageIcon("/Users/facundoferreyra/NetBeansProjects/RockPaperScissors/img/paper img.png")); // NOI18N
        paperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperButtonActionPerformed(evt);
            }
        });
        add(paperButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        resultPanel.setVisible(false);
        disableButtons(true);
        if (userScore == 3 || compScore == 3) {
            userScore = 0;
            compScore = 0;
            userField.setText(String.valueOf(userScore));
            compField.setText(String.valueOf(compScore));
        }
       
        if (fullUserScore == 5 || fullCompScore == 5) {
            JFrame frame = new JFrame();
            if (fullUserScore == 5) {
                JOptionPane.showMessageDialog(frame, "You Win!", "Congratulations! 5 matches won.", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "You Lost.", "The Computer wons 5 matches. Sorry.", JOptionPane.ERROR_MESSAGE);
            }
            fullUserScore = 0;
            fullCompScore = 0;
            fullUserField.setText(String.valueOf(fullUserScore));
            fullCompField.setText(String.valueOf(fullCompScore));
        }
    }//GEN-LAST:event_resetButtonActionPerformed

    private void scissorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorsButtonActionPerformed
        userInput = 's';
        disableButtons(false);
        resultPanel.setVisible(true);
        resultUserLabel.setIcon(new javax.swing.ImageIcon("/Users/facundoferreyra/NetBeansProjects/RockPaperScissors/img/scissors img.png"));
        gameRun();
    }//GEN-LAST:event_scissorsButtonActionPerformed

    private void paperButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperButtonActionPerformed
        userInput = 'p';
        disableButtons(false);
        resultPanel.setVisible(true);
        resultUserLabel.setIcon(new javax.swing.ImageIcon("/Users/facundoferreyra/NetBeansProjects/RockPaperScissors/img/paper img.png"));
        gameRun();
    }//GEN-LAST:event_paperButtonActionPerformed

    private void rockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockButtonActionPerformed
        userInput = 'r';
        disableButtons(false);
        resultPanel.setVisible(true);
        resultUserLabel.setIcon(new javax.swing.ImageIcon("/Users/facundoferreyra/NetBeansProjects/RockPaperScissors/img/rock img.png"));
        gameRun();
    }//GEN-LAST:event_rockButtonActionPerformed

    private void fullUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullUserFieldActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gameWindow().setVisible(true);
                
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField compField;
    private javax.swing.JTextField fullCompField;
    private javax.swing.JLabel fullGameLabel;
    private javax.swing.JTextField fullUserField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton paperButton;
    private javax.swing.JLabel phraseLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel resultCompLabel;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JLabel resultUserLabel;
    private javax.swing.JButton rockButton;
    private javax.swing.JButton scissorsButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables

}

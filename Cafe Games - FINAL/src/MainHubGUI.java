import TriviaGame.triviaGUI;
import MatchingGame.matchGUI;
import Checkers.checkersCivilWarGUI;
import TicTacToe.ticTacToeGUI;
import Connect4.connect4GUI;
import java.awt.Color;
import javax.swing.ImageIcon;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * This program was made by Jordan E on June 6, 2016
 * as a game directory for a final project.
 * 
 * Jordan E
 * Nick A
 * Taylor M
 */
public class MainHubGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainHubGUI
     */
    public MainHubGUI() {
        initComponents();
        getContentPane().setBackground(new Color(200,200,200));
        setSize(335,500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Checkers = new javax.swing.JButton();
        Connect4 = new javax.swing.JButton();
        MatchingGame = new javax.swing.JButton();
        Millionare = new javax.swing.JButton();
        TicTacToe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Café Games");
        setIconImage(new ImageIcon(getClass().getResource("CafeGames.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(null);

        Checkers.setBackground(new java.awt.Color(204, 0, 0));
        Checkers.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Checkers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainHub Images/CheckersT.png"))); // NOI18N
        Checkers.setBorderPainted(false);
        Checkers.setContentAreaFilled(false);
        Checkers.setFocusable(false);
        Checkers.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/MainHub Images/Checkers.png"))); // NOI18N
        Checkers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckersActionPerformed(evt);
            }
        });
        getContentPane().add(Checkers);
        Checkers.setBounds(10, 10, 300, 80);

        Connect4.setBackground(new java.awt.Color(255, 255, 0));
        Connect4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Connect4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainHub Images/Connect4T.png"))); // NOI18N
        Connect4.setBorderPainted(false);
        Connect4.setContentAreaFilled(false);
        Connect4.setFocusable(false);
        Connect4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/MainHub Images/Connect4.png"))); // NOI18N
        Connect4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Connect4ActionPerformed(evt);
            }
        });
        getContentPane().add(Connect4);
        Connect4.setBounds(10, 370, 300, 80);

        MatchingGame.setBackground(new java.awt.Color(255, 255, 255));
        MatchingGame.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        MatchingGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainHub Images/MatchingT.png"))); // NOI18N
        MatchingGame.setBorderPainted(false);
        MatchingGame.setContentAreaFilled(false);
        MatchingGame.setFocusable(false);
        MatchingGame.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/MainHub Images/Matching.png"))); // NOI18N
        MatchingGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatchingGameActionPerformed(evt);
            }
        });
        getContentPane().add(MatchingGame);
        MatchingGame.setBounds(10, 100, 300, 80);

        Millionare.setBackground(new java.awt.Color(0, 0, 255));
        Millionare.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Millionare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainHub Images/TriviaT.png"))); // NOI18N
        Millionare.setBorderPainted(false);
        Millionare.setContentAreaFilled(false);
        Millionare.setFocusable(false);
        Millionare.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/MainHub Images/Trivia.png"))); // NOI18N
        Millionare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MillionareActionPerformed(evt);
            }
        });
        getContentPane().add(Millionare);
        Millionare.setBounds(10, 280, 300, 80);

        TicTacToe.setBackground(new java.awt.Color(255, 153, 0));
        TicTacToe.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TicTacToe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainHub Images/TicTacToeT.png"))); // NOI18N
        TicTacToe.setBorderPainted(false);
        TicTacToe.setContentAreaFilled(false);
        TicTacToe.setFocusable(false);
        TicTacToe.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/MainHub Images/TicTacToe.png"))); // NOI18N
        TicTacToe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicTacToeActionPerformed(evt);
            }
        });
        getContentPane().add(TicTacToe);
        TicTacToe.setBounds(10, 190, 300, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TicTacToeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicTacToeActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() { // open tic tac toe
           public void run() {
               new ticTacToeGUI().setVisible(true);
           }
       });
    }//GEN-LAST:event_TicTacToeActionPerformed

    private void CheckersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckersActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() { // open checkers
           public void run() {
               new checkersCivilWarGUI().setVisible(true);
           }
       });
    }//GEN-LAST:event_CheckersActionPerformed

    private void Connect4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Connect4ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() { // open connect 4
           public void run() {
               new connect4GUI().setVisible(true);
           }
       });
    }//GEN-LAST:event_Connect4ActionPerformed

    private void MatchingGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatchingGameActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() { //open the matching game
           public void run() {
               new matchGUI().setVisible(true);
           }
       });
    }//GEN-LAST:event_MatchingGameActionPerformed

    private void MillionareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MillionareActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() { //open the trivia game
           public void run() {
               new triviaGUI().setVisible(true);
           }
       });
    }//GEN-LAST:event_MillionareActionPerformed

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
            java.util.logging.Logger.getLogger(MainHubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainHubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainHubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainHubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainHubGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Checkers;
    private javax.swing.JButton Connect4;
    private javax.swing.JButton MatchingGame;
    private javax.swing.JButton Millionare;
    private javax.swing.JButton TicTacToe;
    // End of variables declaration//GEN-END:variables
}
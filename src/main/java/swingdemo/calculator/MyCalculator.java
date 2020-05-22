package swingdemo.calculator;
import java.util.*;

public class MyCalculator extends javax.swing.JFrame {
    private String expr="";
    public MyCalculator() {
        initComponents();
        calOFF.setEnabled(false);
        calDisable();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        screen = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnAnswer = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        calON = new javax.swing.JRadioButton();
        calOFF = new javax.swing.JRadioButton();
        answerLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOpenParen = new javax.swing.JButton();
        btnCloseParen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        screen.setEditable(false);
        screen.setBackground(new java.awt.Color(255, 255, 255));
        screen.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        screen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        screen.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        screen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        screen.setMargin(new java.awt.Insets(10, 2, 2, 2));

        btn1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn1.setText("1");
        btn1.setAlignmentY(0.6F);
        btn1.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn2.setText("2");
        btn2.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn3.setText("3");
        btn3.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn4.setText("4");
        btn4.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn5.setText("5");
        btn5.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn6.setText("6");
        btn6.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn7.setText("7");
        btn7.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn8.setText("8");
        btn8.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn9.setText("9");
        btn9.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn0.setText("0");
        btn0.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPoint.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        btnPoint.setText(".");
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnClear.setText("CLR");
        btnClear.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnAdd.setText("+");
        btnAdd.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSub.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnSub.setText("-");
        btnSub.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnAnswer.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        btnAnswer.setText("=");
        btnAnswer.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnswerActionPerformed(evt);
            }
        });

        btnMul.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnMul.setText("*");
        btnMul.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnDiv.setText("/");
        btnDiv.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnDelete.setText("Del");
        btnDelete.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnMod.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnMod.setText("MOD");
        btnMod.setMargin(new java.awt.Insets(10, 14, 2, 14));

        calON.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(calON);
        calON.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        calON.setText("ON ");
        calON.setMargin(new java.awt.Insets(10, 5, 2, 2));
        calON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calONActionPerformed(evt);
            }
        });

        calOFF.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(calOFF);
        calOFF.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        calOFF.setText("OFF");
        calOFF.setMargin(new java.awt.Insets(10, 5, 1, 1));
        calOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calOFFActionPerformed(evt);
            }
        });

        answerLabel.setBackground(new java.awt.Color(255, 255, 255));
        answerLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        answerLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        answerLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 2, 2)));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("ANSWER");

        btnOpenParen.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnOpenParen.setText("(");
        btnOpenParen.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnOpenParen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenParenActionPerformed(evt);
            }
        });

        btnCloseParen.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnCloseParen.setText(")");
        btnCloseParen.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnCloseParen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseParenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(screen)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(calOFF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(calON, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOpenParen, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCloseParen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addComponent(btnPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMod, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                    .addComponent(btnAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calON, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calOFF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn0)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAnswer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCloseParen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpenParen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void calDisable()
    {   
        answerLabel.setText("");
        calON.setEnabled(true);
        calOFF.setEnabled(false);
        screen.setText("");   // Clear the whole screen
        expr = "";            // Set our expression to blank
        btn0.setEnabled(false);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btnPoint.setEnabled(false);
        btnAdd.setEnabled(false);
        btnSub.setEnabled(false);
        btnMul.setEnabled(false);
        btnDiv.setEnabled(false);
        btnMod.setEnabled(false);
        btnAnswer.setEnabled(false);
        btnClear.setEnabled(false);
        btnDelete.setEnabled(false); 
        btnOpenParen.setEnabled(false);
        btnCloseParen.setEnabled(false);
    }
    
    private void calEnable()
    {
        calOFF.setEnabled(true);
        calON.setEnabled(false);
        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btnPoint.setEnabled(true);
        btnAdd.setEnabled(true);
        btnSub.setEnabled(true);
        btnMul.setEnabled(true);
        btnDiv.setEnabled(true);
        btnMod.setEnabled(true);
        btnAnswer.setEnabled(true);
        btnClear.setEnabled(true);
        btnDelete.setEnabled(true);
        btnOpenParen.setEnabled(true);
        btnCloseParen.setEnabled(true);
    }
    
    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String str = screen.getText();
        expr = str + "0";
        screen.setText(expr);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        String str = screen.getText();
        expr = str + "-";
        screen.setText(expr);
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
        String str = screen.getText();
        expr = str + "*";
        screen.setText(expr);
    }//GEN-LAST:event_btnMulActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String str = screen.getText();
        expr = str + "4";
        screen.setText(expr);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String str = screen.getText();
        expr = str + "8";
        screen.setText(expr);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String str = screen.getText();
        expr = str + "9";
        screen.setText(expr);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       String str = screen.getText();
        expr = str + "1";
        screen.setText(expr);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String str = screen.getText();
        expr = str + "2";
        screen.setText(expr);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String str = screen.getText();
        expr = str + "3";
        screen.setText(expr);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String str = screen.getText();
        expr = str + "5";
        screen.setText(expr);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       String str = screen.getText();
        expr = str + "6";
        screen.setText(expr);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String str = screen.getText();
        expr = str + "7";
        screen.setText(expr);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
         screen.setText("");
         expr = "";
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        expr = expr.substring(0,expr.length()-1);
        screen.setText(expr);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointActionPerformed
        String str = screen.getText();
        expr = str + ".";
        screen.setText(expr);
    }//GEN-LAST:event_btnPointActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String str = screen.getText();
        expr = str + "+";
        screen.setText(expr);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        String str = screen.getText();
        expr = str + "/";
        screen.setText(expr);
    }//GEN-LAST:event_btnDivActionPerformed

    private void calOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calOFFActionPerformed
        calDisable();
    }//GEN-LAST:event_calOFFActionPerformed

    private void calONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calONActionPerformed
       calEnable();
    }//GEN-LAST:event_calONActionPerformed

    private void btnAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnswerActionPerformed
        answerLabel.setText(evaluate(expr)+"");
        screen.setText("");
        expr="";
    }//GEN-LAST:event_btnAnswerActionPerformed

    private void btnOpenParenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenParenActionPerformed
        String str = screen.getText();
        expr = str + "(";
        screen.setText(expr);
    }//GEN-LAST:event_btnOpenParenActionPerformed

    private void btnCloseParenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseParenActionPerformed
        String str = screen.getText();
        expr = str + ")";
        screen.setText(expr);
    }//GEN-LAST:event_btnCloseParenActionPerformed
    
    
    private int evaluate(String expression) 
    { 
        char[] tokens = expression.toCharArray(); 
 
        Stack<Integer> values = new Stack<>(); 
        Stack<Character> ops = new Stack<>(); 
  
        for (int i = 0; i<tokens.length; i++) 
        { 
            System.out.println(tokens[i]);
             // Current token is a whitespace, skip it 
            if (tokens[i] == ' ') 
                continue; 
  
            // Current token is a number, push it to stack for numbers 
            if (tokens[i] >= '0' && tokens[i] <= '9') 
            { 
                StringBuffer sbuf = new StringBuffer(); 
                // There may be more than one digits in number 
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') 
                    sbuf.append(tokens[i++]); 
               
                values.push(Integer.parseInt(sbuf.toString())); 
                i--;  // So that it doesnt skip any character in the String
            } 
            
            // Current token is an opening brace, push it to 'ops' 
            else if(tokens[i] == '(') 
                ops.push(tokens[i]); 
            
            // Closing brace encountered, solve entire brace 
            else if(tokens[i] == ')') 
            { 
                while (ops.peek() != '(') 
                  values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
                ops.pop(); 
            } 
  
            // Current token is an operator. 
            else if(tokens[i] =='+' || tokens[i] =='-' || tokens[i] =='*' || tokens[i] =='/') 
            { 
               /* if(values.isEmpty())
                {
                    StringBuffer sbuf = new StringBuffer(); 
                // There may be more than one digits in number 
                sbuf.append(tokens[i]);
                i++;
                 while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') 
                    sbuf.append(tokens[i++]); 
               
                 System.out.println(sbuf);
                values.push(Integer.parseInt(sbuf.toString())); 
                i--;
                }*/
                // While top of 'ops' has same or greater precedence to current 
                // token, which is an operator. Apply operator on top of 'ops' 
                // to top two elements in values stack 
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) 
                    values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
  
                // Push current token to 'ops'.
                ops.push(tokens[i]);
            } 
        } 
        
        // Entire expression has been parsed at this point, apply remaining 
        // ops to remaining values 
        while(!ops.empty()) 
        {
            int temp = applyOp(ops.pop(), values.pop(), values.pop());
            values.push(temp);
        }

        // Top of 'values' contains result, return it 
        return values.pop(); 
    } 
  
    // Returns true if 'op2' has higher or same precedence as 'op1', 
    // otherwise returns false. 
    private boolean hasPrecedence(char op1, char op2) 
    { 
        System.out.println(op1);
        if (op2 == '(' || op2 == ')') 
            return false; 
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) 
            return false; 
        else
            return true; 
    } 
  
    // A utility method to apply an operator 'op' on operands 'a'  
    // and 'b'. Return the result. 
    private int applyOp(char op, int b, int a) 
    { 
        switch(op) 
        { 
        case '+': 
            return (a + b); 
        case '-': 
            return (a - b); 
        case '*': 
            return  (a * b); 
        case '/': 
            if (b != 0)
                return (a / b); 
        }  
        return 0;
    } 

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerLabel;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAnswer;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCloseParen;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnOpenParen;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnSub;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton calOFF;
    private javax.swing.JRadioButton calON;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField screen;
    // End of variables declaration//GEN-END:variables
}

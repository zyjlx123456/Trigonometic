package com.gui;

/**
 *
 * @author Administrator
 */

import java.awt.*;
import java.io.InputStream;

import javax.swing.*;

import com.triangle.EdgeAndAngle;
import com.triangle.TriangleEntity;

public class TriangleGUI extends javax.swing.JFrame {

    /**
     * Creates new form Triangle
     */
    public TriangleGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        picture = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                ImageIcon icon = new ImageIcon(getClass().getResource(  
                        "/image/triangle.png")); 
                Image img = icon.getImage();
                g.drawImage(img, 0, 0, icon.getIconWidth(), icon.getIconHeight(), icon.getImageObserver());

                // 细致渲染、绘制背景，可控制截取图片，显示于指定的JPanel位置
                //				g.drawImage(img, 0, 0, frameSize.width, frameSize.height,
                    //							0, 0, icon.getIconWidth(), icon.getIconHeight(), icon.getImageObserver());
            }
        };
        input = new javax.swing.JLabel();
        output = new javax.swing.JLabel();
        edgeBC = new javax.swing.JLabel();
        angleABC = new javax.swing.JLabel();
        inputedgeAB = new javax.swing.JTextField();
        inputedgeBC = new javax.swing.JTextField();
        inputangleABC = new javax.swing.JTextField();
        edgeAB = new javax.swing.JLabel();
        outputedgeAB = new javax.swing.JLabel();
        outputedgeAC = new javax.swing.JLabel();
        outputedgeBC = new javax.swing.JLabel();
        outputedgeABLabel = new javax.swing.JLabel();
        outputedgeACLabel = new javax.swing.JLabel();
        outputedgeBCLabel = new javax.swing.JLabel();
        outputangleACB = new javax.swing.JLabel();
        outputangleABC = new javax.swing.JLabel();
        outputangleBAC = new javax.swing.JLabel();
        outputangleACBLabel = new javax.swing.JLabel();
        outputangleBACLabel = new javax.swing.JLabel();
        outputangleABCLabel = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pictureLayout = new javax.swing.GroupLayout(picture);
        picture.setLayout(pictureLayout);
        pictureLayout.setHorizontalGroup(
            pictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        pictureLayout.setVerticalGroup(
            pictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        input.setFont(new java.awt.Font("宋体", 0, 30)); // NOI18N
        input.setText("输入");

        output.setFont(new java.awt.Font("宋体", 0, 30)); // NOI18N
        output.setText("输出");

        edgeBC.setText("边BC的长度：");

        angleABC.setText("∠ABC的度数：");

        inputedgeAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputedgeABActionPerformed(evt);
            }
        });

        inputedgeBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputedgeBCActionPerformed(evt);
            }
        });

        inputangleABC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputangleABCActionPerformed(evt);
            }
        });

        edgeAB.setText("边AB的长度：");

        outputedgeAB.setText("边AB的长度：");

        outputedgeAC.setText("边AC的长度：");

        outputedgeBC.setText("边BC的长度：");

        outputedgeABLabel.setText("0");

        outputedgeACLabel.setText("0");

        outputedgeBCLabel.setText("0");

        outputangleACB.setText("∠ACB的度数：");

        outputangleABC.setText("∠ABC的度数：");

        outputangleBAC.setText("∠BAC的度数：");

        outputangleACBLabel.setText("0");

        outputangleBACLabel.setText("0");

        outputangleABCLabel.setText("0");

        calculate.setText("计算");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(input))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(angleABC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputangleABC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(outputedgeBC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outputedgeBCLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outputangleBAC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outputangleBACLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edgeBC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(edgeAB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(inputedgeBC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(inputedgeAB, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(outputedgeAC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(outputedgeACLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(outputangleABC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(outputangleABCLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(output)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(outputedgeAB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(outputedgeABLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(outputangleACB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(outputangleACBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {angleABC, edgeBC});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputedgeAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edgeAB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outputedgeAB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outputedgeABLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outputangleACB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outputangleACBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(outputedgeAC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(outputedgeACLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(outputangleABC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(outputangleABCLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(edgeBC)
                                .addComponent(inputedgeBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(outputedgeBC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(outputedgeBCLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(outputangleBAC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(outputangleBACLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(angleABC)
                                    .addComponent(inputangleABC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(74, 74, 74)
                        .addComponent(calculate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void inputedgeABActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void inputangleABCActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void inputedgeBCActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    	String edgeABStr = inputedgeAB.getText().trim();
    	String edgeBCStr = inputedgeBC.getText().trim();
    	String angleABCStr = inputedgeAB.getText().trim();
    	if(edgeABStr.length()==0||edgeBCStr.length()==0||angleABCStr.length()==0){
    		JOptionPane.showMessageDialog(this, "各个输入框不能为空！");
    		return;
    	}
    	
    	double edgeAB = Double.valueOf(inputedgeAB.getText());
    	double edgeBC = Double.valueOf(inputedgeBC.getText());
    	double angleABC = Double.valueOf(inputangleABC.getText());
    	
    	if(edgeAB<=0||edgeBC<=0||angleABC<=0)
    	{
    		JOptionPane.showMessageDialog(this, "值不能小于等于0！");
    		return ;
    	}
    	
    	if(angleABC>=180){
    		JOptionPane.showMessageDialog(this, "夹角不能超过180！");
    		return ;
    	}
    	
    	TriangleEntity entity = new TriangleEntity(new EdgeAndAngle(edgeAB,0),
    			new EdgeAndAngle(edgeBC,0),new EdgeAndAngle(0,angleABC));
    	entity.processTriangle();
    	
    	outputedgeABLabel.setText(entity.getP_a().getEdge()+"");
    	outputangleACBLabel.setText(entity.getP_a().getAngle()+"");
    	outputedgeBCLabel.setText(entity.getP_b().getEdge()+"");
    	outputangleBACLabel.setText(entity.getP_b().getAngle()+"");
    	outputedgeACLabel.setText(entity.getP_c().getEdge()+"");
    	outputangleABCLabel.setText(entity.getP_c().getAngle()+"");
    }                                         

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
            java.util.logging.Logger.getLogger(TriangleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TriangleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TriangleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TriangleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TriangleGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel angleABC;
    private javax.swing.JButton calculate;
    private javax.swing.JLabel edgeAB;
    private javax.swing.JLabel edgeBC;
    private javax.swing.JLabel input;
    private javax.swing.JTextField inputangleABC;
    private javax.swing.JTextField inputedgeAB;
    private javax.swing.JTextField inputedgeBC;
    private javax.swing.JLabel output;
    private javax.swing.JLabel outputangleABC;
    private javax.swing.JLabel outputangleABCLabel;
    private javax.swing.JLabel outputangleACB;
    private javax.swing.JLabel outputangleACBLabel;
    private javax.swing.JLabel outputangleBAC;
    private javax.swing.JLabel outputangleBACLabel;
    private javax.swing.JLabel outputedgeAB;
    private javax.swing.JLabel outputedgeABLabel;
    private javax.swing.JLabel outputedgeAC;
    private javax.swing.JLabel outputedgeACLabel;
    private javax.swing.JLabel outputedgeBC;
    private javax.swing.JLabel outputedgeBCLabel;
    private javax.swing.JPanel picture;
    // End of variables declaration                   
}


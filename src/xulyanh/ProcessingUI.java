/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xulyanh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author PhongNT
 */
public class ProcessingUI extends javax.swing.JFrame {

    /**
     * Creates new form ProcessingUI
     */
    // các thuộc tính của class.
    private BufferedImage modPicture = null;
    private BufferedImage oriPicture = null;
    private ProcessingUI1 pro = new ProcessingUI1();

//    // thuộc tính chứa các hàm xử lý.
//    Processing process = new Processing();
    // thuộc tính xử lý viên
    XuLyVien xlv = new XuLyVien();

    public ProcessingUI() {
        initComponents();

        // set ẩn các radio button khi bắt đầu load form
        this.rd45.setVisible(false);
        this.rdHori.setVisible(false);
        this.rdVertical.setVisible(false);
        this.rd_45.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        pnControll = new javax.swing.JPanel();
        pnCtroll = new javax.swing.JPanel();
        cbFunction = new javax.swing.JComboBox<>();
        pnOK = new javax.swing.JButton();
        rdHori = new javax.swing.JRadioButton();
        rd45 = new javax.swing.JRadioButton();
        rdVertical = new javax.swing.JRadioButton();
        rd_45 = new javax.swing.JRadioButton();
        pnDisplay = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        pnOriPictuer = new javax.swing.JPanel();
        lblOriPicture = new javax.swing.JLabel();
        pnModPicture = new javax.swing.JPanel();
        lblModPicture = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSplitPane4 = new javax.swing.JSplitPane();
        pnOriHistogram = new javax.swing.JPanel();
        btnHistoOri = new javax.swing.JButton();
        pnModHistogram = new javax.swing.JPanel();
        btnHistoMod = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Xử Lý Ảnh");
        setPreferredSize(new java.awt.Dimension(1100, 710));

        jSplitPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSplitPane1.setOneTouchExpandable(true);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(300, 0));

        pnControll.setMinimumSize(new java.awt.Dimension(200, 70));
        pnControll.setPreferredSize(new java.awt.Dimension(0, 0));
        pnControll.setLayout(new java.awt.BorderLayout());

        pnCtroll.setBackground(new java.awt.Color(102, 255, 255));
        pnCtroll.setBorder(javax.swing.BorderFactory.createTitledBorder("Chọn chức năng: "));
        pnCtroll.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnCtroll.setMinimumSize(new java.awt.Dimension(200, 70));
        pnCtroll.setPreferredSize(new java.awt.Dimension(0, 0));
        pnCtroll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbFunction.setMaximumRowCount(20);
        cbFunction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GrayScale Conversion Image", "Binary Image", "Histogram Equalization", "Negative Image", "Thresholding", "Logarithmic transformation", "Power law transforms", "Bit plane slicing", "Spatial Filtering", "Edges processing", "Laplcian Filtered Image", "Sharpened Image", "Sobel Filter", "Soble Filter with Thresholding", "Points Detection", "Lines Detection", "Erosion", "Dilation", "Opening", "Closing", "Boundary Extraction", "Region Filling" }));
        cbFunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFunctionActionPerformed(evt);
            }
        });
        pnCtroll.add(cbFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, -1));

        pnOK.setText("OK");
        pnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnOKActionPerformed(evt);
            }
        });
        pnCtroll.add(pnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        buttonGroup1.add(rdHori);
        rdHori.setText("Horizontal");
        rdHori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdHoriItemStateChanged(evt);
            }
        });
        pnCtroll.add(rdHori, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        buttonGroup1.add(rd45);
        rd45.setText("+45");
        rd45.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rd45ItemStateChanged(evt);
            }
        });
        pnCtroll.add(rd45, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        buttonGroup1.add(rdVertical);
        rdVertical.setText("Vertical");
        rdVertical.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdVerticalItemStateChanged(evt);
            }
        });
        pnCtroll.add(rdVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        buttonGroup1.add(rd_45);
        rd_45.setText("-45");
        rd_45.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rd_45ItemStateChanged(evt);
            }
        });
        pnCtroll.add(rd_45, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        pnControll.add(pnCtroll, java.awt.BorderLayout.CENTER);

        jSplitPane1.setLeftComponent(pnControll);

        pnDisplay.setLayout(new java.awt.BorderLayout());

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane2.setOneTouchExpandable(true);

        jPanel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(391, 370));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.X_AXIS));

        jSplitPane3.setOneTouchExpandable(true);

        pnOriPictuer.setOpaque(false);
        pnOriPictuer.setPreferredSize(new java.awt.Dimension(430, 0));
        pnOriPictuer.setLayout(new java.awt.BorderLayout());

        lblOriPicture.setBackground(new java.awt.Color(102, 102, 255));
        lblOriPicture.setOpaque(true);
        pnOriPictuer.add(lblOriPicture, java.awt.BorderLayout.CENTER);

        jSplitPane3.setLeftComponent(pnOriPictuer);

        pnModPicture.setOpaque(false);
        pnModPicture.setPreferredSize(new java.awt.Dimension(0, 0));
        pnModPicture.setLayout(new java.awt.BorderLayout());

        lblModPicture.setBackground(new java.awt.Color(51, 102, 255));
        lblModPicture.setOpaque(true);
        pnModPicture.add(lblModPicture, java.awt.BorderLayout.CENTER);

        jSplitPane3.setRightComponent(pnModPicture);

        jPanel3.add(jSplitPane3);

        jSplitPane2.setLeftComponent(jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jSplitPane4.setOneTouchExpandable(true);

        pnOriHistogram.setPreferredSize(new java.awt.Dimension(430, 0));
        pnOriHistogram.setLayout(new java.awt.BorderLayout());

        btnHistoOri.setBackground(new java.awt.Color(0, 153, 153));
        btnHistoOri.setText("Biểu đồ Histogram");
        btnHistoOri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoOriActionPerformed(evt);
            }
        });
        pnOriHistogram.add(btnHistoOri, java.awt.BorderLayout.PAGE_START);

        jSplitPane4.setLeftComponent(pnOriHistogram);

        pnModHistogram.setPreferredSize(new java.awt.Dimension(0, 0));
        pnModHistogram.setLayout(new java.awt.BorderLayout());

        btnHistoMod.setBackground(new java.awt.Color(0, 153, 153));
        btnHistoMod.setText("Biểu đồ Histogram");
        btnHistoMod.setPreferredSize(new java.awt.Dimension(100, 25));
        btnHistoMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoModActionPerformed(evt);
            }
        });
        pnModHistogram.add(btnHistoMod, java.awt.BorderLayout.PAGE_START);

        jSplitPane4.setRightComponent(pnModHistogram);

        jPanel4.add(jSplitPane4, java.awt.BorderLayout.CENTER);

        jSplitPane2.setRightComponent(jPanel4);

        pnDisplay.add(jSplitPane2, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(pnDisplay);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Open");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu3.setMnemonic('H');
        jMenu3.setText("About");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        int ref = JOptionPane.showConfirmDialog(null, "Bạn muốn lưu ảnh hay không ?", "Xác nhận lưu",
                JOptionPane.YES_NO_OPTION);
        if (ref == JOptionPane.YES_OPTION) {
            try {
                saveImage(modPicture, "png");
            } catch (IOException ex) {
                Logger.getLogger(ProcessingUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.exit(0);
        }

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Nguyen Thanh Phong_ N16DCCN116");
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        // ảnh được load vào cho modPicture
        modPicture = Processing.getPicture();
        oriPicture = Processing.deepCopyImage(modPicture);
        //scale ảnh cho vừa với panel.
        Image bi = modPicture.getScaledInstance(pnModPicture.getWidth(),
                pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);

        // hiên ảnh lên
        lblOriPicture.setIcon(new ImageIcon(bi));
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void cbFunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFunctionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFunctionActionPerformed

    private void pnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnOKActionPerformed
        // TODO add your handling code here:

        int index = cbFunction.getSelectedIndex();

        try {
            XuLy(index);
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_pnOKActionPerformed

    private void btnHistoOriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoOriActionPerformed
        // TODO add your handling code here:
        int[] tempHisto1 = Processing.histogram(oriPicture);

        // vẽ biểu đồ trong JFreeChart
        DefaultCategoryDataset barChartData1 = new DefaultCategoryDataset();
        for (int i = 0; i < 256; i++) {
            barChartData1.setValue(tempHisto1[i], String.valueOf(i), " ");
        }
        JFreeChart barChart = ChartFactory.createBarChart("Original", "Grey Levels",
                "Frequencies", barChartData1, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt1 = barChart.getCategoryPlot();
        barchrt1.setRangeGridlinePaint(Color.ORANGE);
        ChartPanel barPanel1 = new ChartPanel(barChart);
        pnOriHistogram.add(barPanel1, BorderLayout.CENTER);

        pnOriHistogram.validate();

    }//GEN-LAST:event_btnHistoOriActionPerformed

    private void btnHistoModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoModActionPerformed
        // TODO add your handling code here:
        int[] tempHisto2 = Processing.histogram(modPicture);

        // vẽ biểu đồ trong JFreeChart
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        for (int i = 0; i < 256; i++) {
            barChartData.setValue(tempHisto2[i], String.valueOf(i), " ");
        }
        JFreeChart barChart = ChartFactory.createBarChart("Enhencement", "Grey Levels",
                "Frequencies", barChartData, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt = barChart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.ORANGE);
        ChartPanel barPanel = new ChartPanel(barChart);
        pnModHistogram.add(barPanel, BorderLayout.CENTER);
        pnModHistogram.validate();

    }//GEN-LAST:event_btnHistoModActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            // TODO add your handling code here:
            saveImage(modPicture, "png");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void rdHoriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdHoriItemStateChanged
        try {
            // TODO add your handling code here:
            modPicture = Processing.linesDetection(oriPicture, 1);
            // scale ảnh cho vừa với panel.
            Image bi13 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                    pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
            // hiện thị
            lblModPicture.setIcon(new ImageIcon(bi13));
        } catch (IOException ex) {
            Logger.getLogger(ProcessingUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rdHoriItemStateChanged

    private void rd45ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rd45ItemStateChanged
        // TODO add your handling code here:
        try {
            modPicture = Processing.linesDetection(oriPicture, 2);
            // scale ảnh cho vừa với panel.
            Image bi13 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                    pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
            // hiện thị
            lblModPicture.setIcon(new ImageIcon(bi13));
        } catch (IOException ex) {
            Logger.getLogger(ProcessingUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rd45ItemStateChanged

    private void rdVerticalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdVerticalItemStateChanged
        // TODO add your handling code here:
        try {
            modPicture = Processing.linesDetection(oriPicture, 3);
            // scale ảnh cho vừa với panel.
            Image bi13 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                    pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
            // hiện thị
            lblModPicture.setIcon(new ImageIcon(bi13));
        } catch (IOException ex) {
            Logger.getLogger(ProcessingUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rdVerticalItemStateChanged

    private void rd_45ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rd_45ItemStateChanged
        // TODO add your handling code here:
        try {
            modPicture = Processing.linesDetection(oriPicture, 4);
            // scale ảnh cho vừa với panel.
            Image bi13 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                    pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
            // hiện thị
            lblModPicture.setIcon(new ImageIcon(bi13));
        } catch (IOException ex) {
            Logger.getLogger(ProcessingUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rd_45ItemStateChanged

    void saveImage(BufferedImage image, String typeImage) throws IOException {

        JFileChooser jfc = new JFileChooser();
        int returnVal = jfc.showSaveDialog(null); // Nếu có chọn nút Save thì trả về 0
        if (returnVal == jfc.APPROVE_OPTION) { // APPROVE_OPTION chứng tỏ bạn đã chọn Open or Save rồi
            File file_save = jfc.getSelectedFile(); // APPROVE_OPTION ở đây luôn = 0
            String nameImage = file_save.toString();
            ImageIO.write(image, typeImage, new File(nameImage + '.' + typeImage));
            JOptionPane.showMessageDialog(null, "Lưu thành công", "Lưu ảnh", JOptionPane.INFORMATION_MESSAGE);

        }

    }

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
            java.util.logging.Logger.getLogger(ProcessingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcessingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcessingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcessingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcessingUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistoMod;
    private javax.swing.JButton btnHistoOri;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbFunction;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JLabel lblModPicture;
    private javax.swing.JLabel lblOriPicture;
    private javax.swing.JPanel pnControll;
    private javax.swing.JPanel pnCtroll;
    private javax.swing.JPanel pnDisplay;
    private javax.swing.JPanel pnModHistogram;
    private javax.swing.JPanel pnModPicture;
    private javax.swing.JButton pnOK;
    private javax.swing.JPanel pnOriHistogram;
    private javax.swing.JPanel pnOriPictuer;
    private javax.swing.JRadioButton rd45;
    private javax.swing.JRadioButton rdHori;
    private javax.swing.JRadioButton rdVertical;
    private javax.swing.JRadioButton rd_45;
    // End of variables declaration//GEN-END:variables

    private void XuLy(int index) throws IOException {

        this.rd45.setVisible(false);
        this.rdHori.setVisible(false);
        this.rdVertical.setVisible(false);
        this.rd_45.setVisible(false);

        switch (index) {

            // GrayScale Conversion
            case 0:
                modPicture = Processing.getGrayscaleImage(oriPicture);
                // scale ảnh cho vừa với panel.
                Image bi0 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                        pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                // hiện thị 
                lblModPicture.setIcon(new ImageIcon(bi0));
                break;

            case 1:
                modPicture = Processing.getBinaryImage(oriPicture);
                // scale ảnh cho vừa với panel.
                Image bi01 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                        pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                // hiện thị 
                lblModPicture.setIcon(new ImageIcon(bi01));
                break;
            // equalize
            case 2:
                modPicture = Processing.equalize(oriPicture);
                // scale ảnh cho vừa với panel.
                Image bi1 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                        pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                // hiện thị 
                lblModPicture.setIcon(new ImageIcon(bi1));
                break;
            // negative image
            case 3:
                modPicture = Processing.negativeImage(oriPicture);
                // scale ảnh cho vừa với panel.
                Image bi2 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                        pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                // hiện thị 
                lblModPicture.setIcon(new ImageIcon(bi2));
                break;
            // thresholding
            case 4:
                String s = JOptionPane.showInputDialog("Nhập ngưỡng thresholding");

                int threshoding = Integer.parseInt(s);

                if (threshoding >= 0 && threshoding <= 255) {
                    modPicture = Processing.thresholding(oriPicture, threshoding);
                    // scale ảnh cho vừa với panel.
                    Image bi3 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                            pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                    // hiện thị 
                    lblModPicture.setIcon(new ImageIcon(bi3));

                } else {
                    JOptionPane.showMessageDialog(null, " Nhập sai rồi! 0 <= thresholding <= 255 ");
                }

                break;
            case 5:
                String s1 = JOptionPane.showInputDialog("Nhập hằng số C: ");

                int cons = Integer.parseInt(s1);

                if (cons >= 1 && cons <= 20) {
                    modPicture = Processing.logarithmicTransformation(oriPicture, cons);
                    // scale ảnh cho vừa với panel.
                    Image bi4 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                            pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                    // hiện thị 
                    lblModPicture.setIcon(new ImageIcon(bi4));
                } else {
                    JOptionPane.showMessageDialog(null, " Nhập sai rồi ! 0 <= C <= 10 ");
                }
                break;

            // power law transform
            case 6:
                String s2 = JOptionPane.showInputDialog("Nhập số mũ Gamma,  0 <= Gamma < 1.0 : ");
                float gamma = Float.parseFloat(s2);

                if (gamma >= 0.0 && gamma < 1.0) {
                    // để gia trị c mặc định = 5
                    modPicture = Processing.powerLawTransforms(oriPicture, gamma, 5);
                    // scale ảnh cho vừa với panel.
                    Image bi5 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                            pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                    // hiện thị 
                    lblModPicture.setIcon(new ImageIcon(bi5));
                } else {
                    JOptionPane.showMessageDialog(null, " Nhập sai rồi ! 0 <= Gamma < 1.0 ");
                }
                break;

            // bit plane slicing
            case 7:
                // copy ori vào ảnh temp để xử lý cho khỏi bị ảnh hưởng_ thay đổi đến ảnh chính.
                String s3 = JOptionPane.showInputDialog("Bit cắt thứ:  ");
                int nbit = Integer.parseInt(s3);

                if (nbit >= 0 && nbit <= 7) {
                    modPicture = Processing.bitPlaneSlicing(oriPicture, nbit);
                    // scale ảnh cho vừa với panel.
                    Image bi6 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                            pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                    // hiện thị 
                    lblModPicture.setIcon(new ImageIcon(bi6));
                } else {
                    JOptionPane.showMessageDialog(null, " Nhập sai rồi ! 0 <= bit <= 7 ");
                }
                break;

            // Spatial Filtering 
            case 8:

                pro.setVisible(true);
                break;

            case 9:
                xlv.setVisible(true);
                break;

            case 10:
                modPicture = Processing.laplcianFilteredImage(oriPicture);
                // scale ảnh cho vừa với panel.
                Image bi9 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                        pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                // hiện thị 
                lblModPicture.setIcon(new ImageIcon(bi9));
                break;

            case 11:
                modPicture = Processing.sharpeneImage(oriPicture);
                // scale ảnh cho vừa với panel.
                Image bi10 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                        pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                // hiện thị 
                lblModPicture.setIcon(new ImageIcon(bi10));
                break;
            case 12:
                modPicture = Processing.sobelFilter(oriPicture);
                // scale ảnh cho vừa với panel.
                Image bi11 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                        pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                // hiện thị 
                lblModPicture.setIcon(new ImageIcon(bi11));
                break;
            case 13:
                modPicture = Processing.sobelFilterWithThesholding(oriPicture);
                // scale ảnh cho vừa với panel.
                Image bi12 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                        pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                // hiện thị 
                lblModPicture.setIcon(new ImageIcon(bi12));
                break;

            case 14:

                modPicture = Processing.pointDectection(oriPicture);
                // scale ảnh cho vừa với panel.
                Image bi13 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                        pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                // hiện thị 
                lblModPicture.setIcon(new ImageIcon(bi13));
                break;

            case 15:
                this.rd45.setVisible(true);
                this.rdHori.setVisible(true);
                this.rdVertical.setVisible(true);
                this.rd_45.setVisible(true);
                break;
            case 16:

                modPicture = Processing.erosion(oriPicture);
                // scale ảnh cho vừa với panel.
                Image bi15 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                        pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                // hiện thị 
                lblModPicture.setIcon(new ImageIcon(bi15));
                break;
            case 17:

                modPicture = Processing.dilation(oriPicture);
                // scale ảnh cho vừa với panel.
                Image bi16 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                        pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                // hiện thị 
                lblModPicture.setIcon(new ImageIcon(bi16));
                break;
            case 18:

                modPicture = Processing.opening(oriPicture);
                // scale ảnh cho vừa với panel.
                Image bi17 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                        pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                // hiện thị 
                lblModPicture.setIcon(new ImageIcon(bi17));
                break;
            case 19:

                modPicture = Processing.closing(oriPicture);
                // scale ảnh cho vừa với panel.
                Image bi18 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                        pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                // hiện thị 
                lblModPicture.setIcon(new ImageIcon(bi18));
                break;

            case 20:

                modPicture = Processing.boundaryExtraction(oriPicture);
                // scale ảnh cho vừa với panel.
                Image bi19 = modPicture.getScaledInstance(pnModPicture.getWidth(),
                        pnModPicture.getHeight(), BufferedImage.SCALE_DEFAULT);
                // hiện thị 
                lblModPicture.setIcon(new ImageIcon(bi19));
                break;

            default:

        }

    }
}

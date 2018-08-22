/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatmp1;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.JPanel;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Belle
 */
public class Frame extends javax.swing.JFrame {
    public Container pane;
    JPanel jp1 = new JPanel(); //left panel
    JPanel jp2 = new JPanel(); //right panel
    JLabel jl = new JLabel();
    
    ArrayList<StatePanel> statesArr = new ArrayList<>();
    
    StatePanel s1 = new StatePanel();
    StatePanel s2 = new StatePanel();
    StatePanel s3 = new StatePanel();
    StatePanel s4 = new StatePanel();
    StatePanel s5 = new StatePanel();
    StatePanel s6 = new StatePanel();
    StatePanel s7 = new StatePanel();
    StatePanel s8 = new StatePanel();
    StatePanel s9 = new StatePanel();
    StatePanel s10 = new StatePanel();
    StatePanel s11 = new StatePanel();
    StatePanel s12 = new StatePanel();
    StatePanel s13 = new StatePanel();
    StatePanel s14 = new StatePanel();
    StatePanel s15 = new StatePanel();
    StatePanel s16 = new StatePanel();


    Formatter formatter = new Formatter();
    
   
    Planet earth = new Planet();
    Planet mars = new Planet();
    
    DefaultListModel dm = new DefaultListModel();
    DefaultListModel dm1 = new DefaultListModel();
    DefaultListModel dm2 = new DefaultListModel();
    Entity s = new Entity("Scientist", 0);
    Entity cw = new Entity("Cow", 0);
    Entity l = new Entity("Lion", 0);
    Entity gr = new Entity("Grains", 0);
    Entity h1 = new Entity("Human 1", 0);
    Entity h2 = new Entity("Human 2", 0);
//    Entity e = new Entity("Scientist", 0);
    int m = 0;
    
    //******************************** DECLARING HASHMAP**************************************
    HashMap<StatePanel, ArrayList<StatePanel>> hmap = new HashMap<StatePanel, ArrayList<StatePanel>>();
    
    /**
     * Creates new form Frame
     */
    
    public Frame() {
        initComponents();
        setTitle("Automat MP");
        
        /***********putting in elements to HASHMAP*******************/
        ArrayList<StatePanel> connecting1 = new ArrayList<>(); //array list of states connecting to state 1
        connecting1.add(s2);
        hmap.put(s1, connecting1);
        
        ArrayList<StatePanel> connecting2 = new ArrayList<>();
        connecting2.add(s1);
        connecting2.add(s10);
        connecting2.add(s3);
        hmap.put(s2, connecting2);
        
        ArrayList<StatePanel> connecting3 = new ArrayList<>();
        connecting3.add(s2);
        connecting3.add(s9);
        connecting3.add(s4);
        hmap.put(s3, connecting3);
        
        ArrayList<StatePanel> connecting4 = new ArrayList<>();
        connecting4.add(s3);
        connecting4.add(s10);
        connecting4.add(s5);
        hmap.put(s4, connecting4);
        
        ArrayList<StatePanel> connecting5 = new ArrayList<>();
        connecting5.add(s4);
        connecting5.add(s14);
        connecting5.add(s16);
        hmap.put(s5, connecting5);
        
        ArrayList<StatePanel> connecting6 = new ArrayList<>();
        connecting6.add(s5);
        connecting6.add(s7);
        connecting6.add(s13);
        connecting6.add(s15);
        hmap.put(s6, connecting6);
        
        ArrayList<StatePanel> connecting7 = new ArrayList<>();
        connecting7.add(s6);
        connecting7.add(s16);
        connecting7.add(s8);
        hmap.put(s7, connecting7);
        
        ArrayList<StatePanel> connecting8 = new ArrayList<>();
        connecting8.add(s7);
        hmap.put(s8, connecting8);
        
        ArrayList<StatePanel> connecting9 = new ArrayList<>();
        connecting9.add(s3);
        connecting9.add(s12);
        connecting9.add(s10);
        hmap.put(s9, connecting9);
        
        ArrayList<StatePanel> connecting10 = new ArrayList<>();
        connecting10.add(s2);
        connecting10.add(s4);
        connecting10.add(s9);
        connecting10.add(s11);
        hmap.put(s10, connecting10);
        
        ArrayList<StatePanel> connecting11 = new ArrayList<>();
        connecting11.add(s12);
        connecting11.add(s10);
        connecting11.add(s13);
        hmap.put(s11, connecting11);
        
        ArrayList<StatePanel> connecting12 = new ArrayList<>();
        connecting12.add(s9);
        connecting12.add(s11);
        hmap.put(s12, connecting12);
        
        ArrayList<StatePanel> connecting13 = new ArrayList<>();
        connecting13.add(s11);
        connecting13.add(s6);
        connecting13.add(s16);
        hmap.put(s13, connecting13);
        
        ArrayList<StatePanel> connecting14 = new ArrayList<>();
        connecting14.add(s5);
        connecting14.add(s15);
        hmap.put(s14, connecting14);
        
        ArrayList<StatePanel> connecting15 = new ArrayList<>();
        connecting15.add(s6);
        connecting15.add(s14);
        connecting15.add(s16);
        hmap.put(s15, connecting15);
        
        ArrayList<StatePanel> connecting16 = new ArrayList<>();
        connecting16.add(s13);
        connecting16.add(s15);
        connecting16.add(s7);
        hmap.put(s16, connecting16);
        
        /***********************************************************/
        
        
        statesArr.add(s1);
        statesArr.add(s2);
        statesArr.add(s3);
        statesArr.add(s4);
        statesArr.add(s5);
        statesArr.add(s6);
        statesArr.add(s7);
        statesArr.add(s8);
        statesArr.add(s9);
        statesArr.add(s10);
        statesArr.add(s11);
        statesArr.add(s12);
        statesArr.add(s13);
        statesArr.add(s14);
        statesArr.add(s15);
        statesArr.add(s16);
        
        earth.addOccupant(s.name);
        earth.addOccupant(cw.name);
        earth.addOccupant(l.name);
        earth.addOccupant(gr.name);
        earth.addOccupant(h1.name);
        earth.addOccupant(h2.name);
//        earth.addOccupant(e.name);
        
//        jl.setIcon(new ImageIcon("C:\\Users\\Belle\\Documents\\GitHub\\automat\\AutomatMP1\\src\\images\\automaton.png"));
        jl.setIcon(new ImageIcon("C:\\Users\\Lucia Pineda\\workspace\\AUTOMATMPFINAL\\AutomatMP1\\src\\images\\automaton.png"));

        
        jList1.setModel(dm);
        dm.addElement(s.name);
        dm.addElement(cw.name);
        dm.addElement(l.name);
        dm.addElement(gr.name);
        dm.addElement(h1.name);
        dm.addElement(h2.name);
        
        jl.setBounds(-70, 25, 1000, 700);
        
        s1.setBounds(0, 500, 55, 55);
        s2.setBounds(100, 500, 55, 55);
        s3.setBounds(200, 500, 55, 55);
        s4.setBounds(300, 500, 55, 55);
        s5.setBounds(400, 500, 55, 55);
        s6.setBounds(500, 500, 55, 55);
        s7.setBounds(600, 500, 55, 55);
        s8.setBounds(700, 500, 55, 55);
        s9.setBounds(200, 400, 55, 55);
        s10.setBounds(200, 300, 55, 55);
        s11.setBounds(200, 200, 55, 55);
        s12.setBounds(0, 300, 55, 55);
        s13.setBounds(350, 270, 55, 55);
        s14.setBounds(500, 350, 55, 55);
        s15.setBounds(580, 400, 55, 55);
        s16.setBounds(700, 270, 55, 55);
        
        s1.setLabel("000000");
        s2.setLabel("100110");
        s3.setLabel("000100");
        s4.setLabel("100111");
        s5.setLabel("000101");
        s6.setLabel("111101");
        s7.setLabel("011001");
        s8.setLabel("111111");
        s9.setLabel("110110");
        s10.setLabel("000010");
        s11.setLabel("111010");
        s12.setLabel("010000");
        s13.setLabel("011000"); 
        s14.setLabel("110111");
        s15.setLabel("010001");
        s16.setLabel("111011");
        
            
        s1.setCurrent(true);
        repaint();
        revalidate();
            
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    	setSize(1650,1000);

        sButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        lButton = new javax.swing.JButton();
        gButton = new javax.swing.JButton();
        h1Button = new javax.swing.JButton();
        h2Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        goButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        clrButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        messageTA = new javax.swing.JTextArea();
        jScrollPaneTA = new javax.swing.JScrollPane(messageTA);
        movesLbl = new javax.swing.JLabel();
        helpButton = new javax.swing.JButton();
        solutionsLbl = new javax.swing.JLabel();
        path1Button = new javax.swing.JButton();
        path2Button = new javax.swing.JButton();
        path3Button = new javax.swing.JButton();
        path4Button = new javax.swing.JButton();
        solutionTA = new javax.swing.JTextArea();

       // sButton.setText("Scientist");
        sButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonActionPerformed(evt);
            }
        });

        //cButton.setText("Cow");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        //lButton.setText("Lion");
        lButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lButtonActionPerformed(evt);
            }
        });

        //gButton.setText("Grain");
        gButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButtonActionPerformed(evt);
            }
        });

        //h1Button.setText("Human 1");
        h1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h1ButtonActionPerformed(evt);
            }
        });

        //h2Button.setText("Human 2");
        h2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h2ButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Earth");

        jLabel2.setText("Mars");
        
        movesLbl.setText("Moves: 0");

        jScrollPane3.setViewportView(jList1);

        jScrollPane4.setViewportView(jList2);

        jScrollPane5.setViewportView(jList3);
        
       // goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        clrButton.setText("CLEAR");
        clrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrButtonActionPerformed(evt);
            }
        });
        
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        
        helpButton.setText("HELP");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        
        path1Button.setText("Solution 1");
        path1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                path1ButtonActionPerformed(evt);
            }
        });
        
        path2Button.setText("Solution 2");
        path2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                path2ButtonActionPerformed(evt);
            }
        });
        
        path3Button.setText("Solution 3");
        path3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                path3ButtonActionPerformed(evt);
            }
        });
        
        path4Button.setText("Solution 4");
        path4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                path4ButtonActionPerformed(evt);
            }
        });
        

		pane = getContentPane();
		pane.setLayout(new BoxLayout(pane, BoxLayout.X_AXIS));

		jp1.setPreferredSize(new Dimension(550, 700));
		jp1.setMaximumSize(jp1.getPreferredSize()); 
		jp1.setMinimumSize(jp1.getPreferredSize());
		jp1.setLayout(null);

		jp2.setPreferredSize(new Dimension(1000, 700));
		jp2.setMaximumSize(jp2.getPreferredSize()); 
		jp2.setMinimumSize(jp2.getPreferredSize());
		jp2.setLayout(null);
		
		pane.add(jp1);
		pane.add(jp2);
		
	//	jp2.add(jl);
		
		jp2.add(helpButton);
		helpButton.setBounds(0, 50, 80, 80);
		
		jp2.add(solutionsLbl);
		solutionsLbl.setText("SHORTEST PATHS: ");
		solutionsLbl.setBounds(90, 20, 170, 30);
		solutionsLbl.setVisible(false);
		
		//adding path buttons
		jp2.add(path1Button);	
		path1Button.setBounds(90, 50, 100, 20);
		path1Button.setVisible(false);
		
		jp2.add(path2Button);
		path2Button.setBounds(90, 70, 100, 20);
		path2Button.setVisible(false);
		
		jp2.add(path3Button);
		path3Button.setBounds(90, 90, 100, 20);
		path3Button.setVisible(false);
		
		jp2.add(path4Button);
		path4Button.setBounds(90, 110, 100, 20);
		path4Button.setVisible(false);
		
		jp2.add(solutionTA);
		solutionTA.setBounds(210, 0, 290, 130);
		solutionTA.setVisible(false);
		
		jp2.add(s1);
		jp2.add(s2);
		jp2.add(s3);
		jp2.add(s4);
		jp2.add(s5);
		jp2.add(s6);
		jp2.add(s7);
		jp2.add(s8);
		jp2.add(s9);
		jp2.add(s10);
		jp2.add(s11);
		jp2.add(s12);
		jp2.add(s13);
		jp2.add(s14);
		jp2.add(s15);
		jp2.add(s16);


		jp2.add(jl);
		
		
		jp1.add(jLabel1); // earth
		jLabel1.setBounds(100, 30, 50, 50);
		
		jp1.add(jLabel2); // mars
		jLabel2.setBounds(360, 30, 50, 50);
		
		jp1.add(movesLbl);
		movesLbl.setBounds(305, 250, 50, 50);
		
		jp1.add(jList1); 
		jList1.setBounds(70, 80, 100, 150);
		
		jp1.add(jList2);
		jList2.setBounds(200, 80, 100, 150);
  
		jp1.add(jList3);
		jList3.setBounds(330, 80, 100, 150);
		
		jp1.add(messageTA);
		messageTA.setEditable(false);
		messageTA.setBounds(300, 580, 170, 50);
		
		
		
		goButton.setBounds(300, 300, 80, 80);
//		ImageIcon goImage = new ImageIcon("C:\\Users\\Belle\\Documents\\GitHub\\automat\\AutomatMP1\\src\\images\\go.png");
		ImageIcon goImage = new ImageIcon("C:\\Users\\Lucia Pineda\\workspace\\AUTOMATMPFINAL\\AutomatMP1\\src\\images\\go.png");
		Image goImg = goImage.getImage();
		Image newGoImg = goImg.getScaledInstance(goButton.getWidth(), goButton.getHeight(), Image.SCALE_SMOOTH); //this makes the image fit the button
		ImageIcon goImageIcon = new ImageIcon(newGoImg);
		goButton.setIcon(goImageIcon);
		jp1.add(goButton);
		validate();

		goButton.setOpaque(false);
		goButton.setContentAreaFilled(false);
		goButton.setBorderPainted(false);

		jp1.add(clrButton);
		clrButton.setBounds(300, 390, 80, 80);
		
		jp1.add(resetButton);
		resetButton.setBounds(300, 480, 80, 80);
		
		sButton.setBounds(70, 270, 80, 80);
//		ImageIcon sImage = new ImageIcon("C:\\Users\\Belle\\Documents\\GitHub\\automat\\AutomatMP1\\src\\images\\scientist.png");
		ImageIcon sImage = new ImageIcon("C:\\Users\\Lucia Pineda\\workspace\\AUTOMATMPFINAL\\AutomatMP1\\src\\images\\scientist.png");
		Image sImg = sImage.getImage();
		Image newSImg = sImg.getScaledInstance(sButton.getWidth(), sButton.getHeight(), Image.SCALE_SMOOTH); //this makes the image fit the button
		ImageIcon sImageIcon = new ImageIcon(newSImg);
		sButton.setIcon(sImageIcon);
		jp1.add(sButton);
		validate();
		
		cButton.setBounds(70, 360, 80, 80);
//		ImageIcon cImage = new ImageIcon("C:\\Users\\Belle\\Documents\\GitHub\\automat\\AutomatMP1\\src\\images\\Cow.png");
		ImageIcon cImage = new ImageIcon("C:\\Users\\Lucia Pineda\\workspace\\AUTOMATMPFINAL\\AutomatMP1\\src\\images\\Cow.png");
		Image cImg = cImage.getImage();
		Image newCImg = cImg.getScaledInstance(cButton.getWidth(), cButton.getHeight(), Image.SCALE_SMOOTH); //this makes the image fit the button
		ImageIcon cImageIcon = new ImageIcon(newCImg);
		cButton.setIcon(cImageIcon);
		jp1.add(cButton);
		validate();
		
		lButton.setBounds(70, 450, 80, 80);
//		ImageIcon lImage = new ImageIcon("C:\\Users\\Belle\\Documents\\GitHub\\automat\\AutomatMP1\\src\\images\\Lion.png");
		ImageIcon lImage = new ImageIcon("C:\\Users\\Lucia Pineda\\workspace\\AUTOMATMPFINAL\\AutomatMP1\\src\\images\\Lion.png");
		Image lImg = lImage.getImage();
		Image newLImg = lImg.getScaledInstance(lButton.getWidth(), lButton.getHeight(), Image.SCALE_SMOOTH); //this makes the image fit the button
		ImageIcon lImageIcon = new ImageIcon(newLImg);
		lButton.setIcon(lImageIcon);
		jp1.add(lButton);
		validate();
		
		gButton.setBounds(170, 270, 80, 80);
//		ImageIcon gImage = new ImageIcon("C:\\Users\\Belle\\Documents\\GitHub\\automat\\AutomatMP1\\src\\images\\Grains.png");
		ImageIcon gImage = new ImageIcon("C:\\Users\\Lucia Pineda\\workspace\\AUTOMATMPFINAL\\AutomatMP1\\src\\images\\Grains.png");
		Image gImg = gImage.getImage();
		Image newGImg = gImg.getScaledInstance(gButton.getWidth(), gButton.getHeight(), Image.SCALE_SMOOTH); //this makes the image fit the button
		ImageIcon gImageIcon = new ImageIcon(newGImg);
		gButton.setIcon(gImageIcon);
		jp1.add(gButton);
		validate();
		
		h1Button.setBounds(170, 360, 80, 80);
//		ImageIcon h1Image = new ImageIcon("C:\\Users\\Belle\\Documents\\GitHub\\automat\\AutomatMP1\\src\\images\\Human1.png");
		ImageIcon h1Image = new ImageIcon("C:\\Users\\Lucia Pineda\\workspace\\AUTOMATMPFINAL\\AutomatMP1\\src\\images\\Human1.png");
		Image h1Img = h1Image.getImage();
		Image newH1Img = h1Img.getScaledInstance(h1Button.getWidth(), h1Button.getHeight(), Image.SCALE_SMOOTH); //this makes the image fit the button
		ImageIcon h1ImageIcon = new ImageIcon(newH1Img);
		h1Button.setIcon(h1ImageIcon);
		jp1.add(h1Button);
		validate();

		
		h2Button.setBounds(170, 450, 80, 80);
//		ImageIcon h2Image = new ImageIcon("C:\\Users\\Belle\\Documents\\GitHub\\automat\\AutomatMP1\\src\\images\\Human2.png");
		ImageIcon h2Image = new ImageIcon("C:\\Users\\Lucia Pineda\\workspace\\AUTOMATMPFINAL\\AutomatMP1\\src\\images\\Human2.png");
		Image h2Img = h2Image.getImage();
		Image newH2Img = h2Img.getScaledInstance(h2Button.getWidth(), h2Button.getHeight(), Image.SCALE_SMOOTH); //this makes the image fit the button
		ImageIcon h2ImageIcon = new ImageIcon(newH2Img);
		h2Button.setIcon(h2ImageIcon);
		jp1.add(h2Button);
		validate();
		
		

    }// </editor-fold>//GEN-END:initComponents

    private void sButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonActionPerformed
        // TODO add your handling code here:
    //    formatter.appendToPane(jTextPane1, e.name, Color.blue);
        jList1.setModel(dm);
        jList2.setModel(dm1);
        jList3.setModel(dm2);
        
        if(dm1.size() < 3){
            dm1.addElement(s.name);
        }

        if(dm1.size() == 3)
        {
            h2Button.setEnabled(false);
            cButton.setEnabled(false);
            lButton.setEnabled(false);
            gButton.setEnabled(false);
            h1Button.setEnabled(false);
        }
        
        sButton.setEnabled(false);
    }//GEN-LAST:event_sButtonActionPerformed

    private void lButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lButtonActionPerformed
        // TODO add your handling code here:
        jList1.setModel(dm);
        jList2.setModel(dm1);
        jList3.setModel(dm2);
        
        if(dm1.size() < 3){
            dm1.addElement(l.name);
        }
        
        if(dm1.size() == 3)
        {
            sButton.setEnabled(false);
            cButton.setEnabled(false);
            h2Button.setEnabled(false);
            gButton.setEnabled(false);
            h1Button.setEnabled(false);
        }
        
        
        lButton.setEnabled(false);
    }//GEN-LAST:event_lButtonActionPerformed

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        // TODO add your handling code here:
        
        
        
        jList1.setModel(dm);
        jList2.setModel(dm1);
        jList3.setModel(dm2);
        
        if(dm1.size() < 3){
            dm1.addElement(cw.name);
        }
        
        if(dm1.size() == 3)
        {
            sButton.setEnabled(false);
            h2Button.setEnabled(false);
            lButton.setEnabled(false);
            gButton.setEnabled(false);
            h1Button.setEnabled(false);
        }
        
        
        cButton.setEnabled(false);
    }//GEN-LAST:event_cButtonActionPerformed

    private void gButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButtonActionPerformed
        // TODO add your handling code here:
        jList1.setModel(dm);
        jList2.setModel(dm1);
        jList3.setModel(dm2);
        
        if(dm1.size() < 3){
            dm1.addElement(gr.name);
        }

        if(dm1.size() == 3)
        {
            sButton.setEnabled(false);
            cButton.setEnabled(false);
            lButton.setEnabled(false);
            h1Button.setEnabled(false);
            h2Button.setEnabled(false);
        }
        
        gButton.setEnabled(false);
    }//GEN-LAST:event_gButtonActionPerformed

    private void h1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h1ButtonActionPerformed
        // TODO add your handling code here:
        jList1.setModel(dm);
        jList2.setModel(dm1);
        jList3.setModel(dm2);
        
        if(dm1.size() < 3){
            dm1.addElement(h1.name);
        }
        
        if(dm1.size() == 3)
        {
            sButton.setEnabled(false);
            cButton.setEnabled(false);
            lButton.setEnabled(false);
            gButton.setEnabled(false);
            h2Button.setEnabled(false);
        }
        
        
        h1Button.setEnabled(false);
    }//GEN-LAST:event_h1ButtonActionPerformed

    private void h2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h2ButtonActionPerformed
        // TODO add your handling code here:
        jList1.setModel(dm);
        jList2.setModel(dm1);
        jList3.setModel(dm2);
        
        if(dm1.size() < 3){
            dm1.addElement(h2.name);
        }
        
        
        if(dm1.size() == 3)
        {
            sButton.setEnabled(false);
            cButton.setEnabled(false);
            lButton.setEnabled(false);
            gButton.setEnabled(false);
            h1Button.setEnabled(false);
        }
        
        h2Button.setEnabled(false);
    }//GEN-LAST:event_h2ButtonActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        // TODO add your handling code here:
        jList1.setModel(dm);
        jList2.setModel(dm1);
        jList3.setModel(dm2);
        int c = 0;
        
        
        
        int g = 0;
        String message = new String();
        
        for(int i = 0; i < dm1.size(); i++){
            if(dm1.get(i).equals("Scientist")){
                g = 1;
            }
        }
        System.out.println("g = " + g);

        if(g == 1){ //only if the scientist exists 	
            if(m % 2 == 0){  //if coming from earth to mars
                
                for(int j = 0; j < dm1.size(); j++){ //removes from earth(dm)
             	   System.out.println("Middle[" + j + "] = " + dm1.get(j));
             	   
             	   for(int i = 0; i < dm.size(); i++) {
 	            	   if(dm.get(i).equals(dm1.get(j)))
 	            	   {
 	            		   earth.removeOccupant(dm1.get(j).toString());
 	            		   dm.removeElement(dm1.get(j));
 	            	   }
             	   }       
                 }

                for(int i = 0; i < dm1.size(); i++){ //adds to dm2(mars)
                    dm2.addElement(dm1.get(i));
                    mars.addOccupant(dm1.get(i).toString());
                    if(dm1.get(i).equals("Scientist")){
                        s.setLocation(1);
                    }
                    if(dm1.get(i).equals("Human 1")){
                        h1.setLocation(1);
                    }
                    if(dm1.get(i).equals("Human 2")){
                        h2.setLocation(1);
                    }
                    if(dm1.get(i).equals("Lion")){
                        l.setLocation(1);
                    }
                    if(dm1.get(i).equals("Cow")){
                        cw.setLocation(1);
                    }
                    if(dm1.get(i).equals("Grains")){
                        gr.setLocation(1);
                    }
                }
                for(int i = 0; i < 3; i++){ //removes from middle(dm1)
                    if(dm1.size() > 0){
                        dm1.removeElement(dm1.get(0));
                    }
                }
                m = m + 1;
                movesLbl.setText("Moves: " + m);
                
                System.out.println("*****************Number of occupants on earth: " + earth.getOccupants().size());
            }
            
            else{ //if coming from mars to earth  
               System.out.println("SIZEE: " + dm1.size());
               for(int j = 0; j < dm1.size(); j++){ //removes from mars(dm2)
            	   System.out.println("Middle[" + j + "] = " + dm1.get(j));
            	   
            	   for(int i = 0; i < dm2.size(); i++) {
	            	   if(dm2.get(i).equals(dm1.get(j)))
	            	   {
	            		   mars.removeOccupant(dm1.get(j).toString());
	            		   dm2.removeElement(dm1.get(j));
	            	   }
            	   }       
                }
               
               for(int i = 0; i < dm1.size(); i++){ //adds to earth(dm)
                    dm.addElement(dm1.get(i));
                    earth.addOccupant(dm1.get(i).toString());
                    System.out.println("IM IN");
                    if(dm1.get(i).equals("Scientist")){
                        s.setLocation(0);
                        System.out.println("SCIENTIST LOCATION: " + s.location);
                    }
                    if(dm1.get(i).equals("Human 1")){
                        h1.setLocation(0);
                        System.out.println("HUMAN 1 LOCATION: " + s.location);
                    }
                    if(dm1.get(i).equals("Human 2")){
                        h2.setLocation(0);
                        System.out.println("HUMAN 2 LOCATION: " + s.location);
                    }
                    if(dm1.get(i).equals("Lion")){
                        l.setLocation(0);
                        System.out.println("LION LOCATION: " + s.location);
                    }
                    if(dm1.get(i).equals("Cow")){
                        cw.setLocation(0);
                        System.out.println("COW LOCATION: " + s.location);
                    }
                    if(dm1.get(i).equals("Grains")){
                        gr.setLocation(0);
                        System.out.println("GRAINS LOCATION: " + s.location);
                    }
                }
               
               for(int i = 0; i < 3; i++){  //removes from middle(dm1)
                   if(dm1.size() > 0){
                        dm1.removeElement(dm1.get(0));
                   }
                }
               
               m = m + 1;
               movesLbl.setText("Moves: " + m);
            }
            
            //print current occupants of each planet
        	System.out.println("EARTH'S OCCUPANTS: ");
        	for(int i = 0; i < earth.getOccupants().size(); i++)
        	{
        		System.out.println(earth.getOccupants().get(i));
        	}
        	
        	System.out.println();
        	System.out.println("MARS' OCCUPANTS: ");
        	for(int i = 0; i < mars.getOccupants().size(); i++)
        	{
        		System.out.println(mars.getOccupants().get(i));
        	}
            
        }
        else {
        	System.out.println("The scientist must be present to travel!");
    		message = "The scientist must be \npresent to travel!";
    		messageTA.setText(message);
        }
        
        sButton.setEnabled(true);
        cButton.setEnabled(true);
        lButton.setEnabled(true);
        gButton.setEnabled(true);
        h1Button.setEnabled(true);
        h2Button.setEnabled(true);
        
        if(earth.getOccupants().isEmpty())
        {
        	messageTA.setText("CONGRATS! Everyone made\n it to Mars safely :)");
            sButton.setEnabled(false);
            cButton.setEnabled(false);
            lButton.setEnabled(false);
            gButton.setEnabled(false);
            h1Button.setEnabled(false);
            h2Button.setEnabled(false);
        }
        
        
        if(m % 2 == 0){
            for(int i = 0; i < dm.size(); i++){
                if(!(dm.get(i).equals("Lion"))){
                    c = c + 1;
                }
            }
            if(c == dm.getSize()){
                lButton.setEnabled(false);
            }
            c = 0;
            for(int i = 0; i < dm.size(); i++){
                if(!(dm.get(i).equals("Cow"))){
                    c = c + 1;
                }
            }
            if(c == dm.getSize()){
                cButton.setEnabled(false);
            }
            c = 0;
            for(int i = 0; i < dm.size(); i++){
                if(!(dm.get(i).equals("Grains"))){
                    c = c + 1;
                }
            }
            if(c == dm.getSize()){
                gButton.setEnabled(false);
            }
            c = 0;
            for(int i = 0; i < dm.size(); i++){
                if(!(dm.get(i).equals("Human 1"))){
                    c = c + 1;
                }
            }
            if(c == dm.getSize()){
                h1Button.setEnabled(false);
            }
            c = 0;
            for(int i = 0; i < dm.size(); i++){
                if(!(dm.get(i).equals("Human 2"))){
                    c = c + 1;
                }
            }
            if(c == dm.getSize()){
                h2Button.setEnabled(false);
            }
            c = 0;
        }
        else{
            for(int i = 0; i < dm2.size(); i++){
                if(!(dm2.get(i).equals("Lion"))){
                    c = c + 1;
                }
            }
            if(c == dm2.getSize()){
                lButton.setEnabled(false);
            }
            c = 0;
            for(int i = 0; i < dm2.size(); i++){
                if(!(dm2.get(i).equals("Cow"))){
                    c = c + 1;
                }
            }
            if(c == dm2.getSize()){
                cButton.setEnabled(false);
            }
            c = 0;
            for(int i = 0; i < dm2.size(); i++){
                if(!(dm2.get(i).equals("Grains"))){
                    c = c + 1;
                }
            }
            if(c == dm2.getSize()){
                gButton.setEnabled(false);
            }
            c = 0;
            for(int i = 0; i < dm2.size(); i++){
                if(!(dm2.get(i).equals("Human 1"))){
                    c = c + 1;
                }
            }
            if(c == dm2.getSize()){
                h1Button.setEnabled(false);
            }
            c = 0;
            for(int i = 0; i < dm2.size(); i++){
                if(!(dm2.get(i).equals("Human 2"))){
                    c = c + 1;
                }
            }
            if(c == dm2.getSize()){
                h2Button.setEnabled(false);
            }
            c = 0;
        }
        
        //check if anyone was eaten
        if(g == 1)
        {
	        if(earth.check().equals("valid") && mars.check().equals("valid"))
	        {
	        	System.out.println("Everyone is still OK.");
	        	message = "Everyone is still OK.";
	        	messageTA.setText(message);
	        }
	        else {
	        	System.out.println("Someone was eaten :(");  
	        	
	        	if(!(earth.check().equals("valid"))) //if nobody was eaten
	        	{
	        		message = earth.check();
	        		messageTA.setText(message);
	        		System.out.println("BOOOOOOOOOOOOOOOOOOOOOM BEEEEEEEEEEEEEEEEEEEEEEEEEEEEETCH");
	        		goButton.setEnabled(false);
	        		clrButton.setEnabled(false);
	        		sButton.setEnabled(false);
	        		cButton.setEnabled(false);
	        		gButton.setEnabled(false);
	        		lButton.setEnabled(false);
	        		h1Button.setEnabled(false);
	        		h2Button.setEnabled(false);
	        	}
	        	else if(!(mars.check().equals("valid"))) //if somebody was eaten
	            	{
	            		message = mars.check();
	            		messageTA.setText(message);
	            		goButton.setEnabled(false);
	            		clrButton.setEnabled(false);
	            		sButton.setEnabled(false);
	            		cButton.setEnabled(false);
	            		gButton.setEnabled(false);
	            		lButton.setEnabled(false);
	            		h1Button.setEnabled(false);
	            		h2Button.setEnabled(false);
	
	            	}
	        }
        }
        else {
        	System.out.println("The scientist must be present to travel!");
    		message = "The scientist must be \npresent to travel!";
    		messageTA.setText(message);
        }
        
        s1.setCurrent(false);
        s2.setCurrent(false);
        s3.setCurrent(false);
        s4.setCurrent(false);
        s5.setCurrent(false);
        s6.setCurrent(false);
        s7.setCurrent(false);
        s8.setCurrent(false);
        s9.setCurrent(false);
        s10.setCurrent(false);
        s11.setCurrent(false);
        s12.setCurrent(false);
        s13.setCurrent(false);
        s14.setCurrent(false);
        s15.setCurrent(false);
        s16.setCurrent(false);
        repaint();
        revalidate();
        
        
        System.out.println("Location: " + s.location + h1.location + h2.location + l.location + cw.location + gr.location);
        if(s.location == 0 && h1.location == 0 && h2.location == 0 && l.location == 0 && cw.location == 0 && gr.location == 0){
            
            s1.setCurrent(true);
            repaint();
            revalidate();
            
        }
        else if(s.location == 1 && h1.location == 0 && h2.location == 0 && l.location == 1 && cw.location == 1 && gr.location == 0){
            s2.setCurrent(true);
            repaint();
            revalidate();
        }
        else if(s.location == 0 && h1.location == 0 && h2.location == 0 && l.location == 1 && cw.location == 0 && gr.location == 0){
            s3.setCurrent(true);
            repaint();
            revalidate();
        }
        else if(s.location == 1 && h1.location == 0 && h2.location == 0 && l.location == 1 && cw.location == 1 && gr.location == 1){
            s4.setCurrent(true);
            repaint();
            revalidate();
        }
        else if(s.location == 0 && h1.location == 0 && h2.location == 0 && l.location == 1 && cw.location == 0 && gr.location == 1){
            s5.setCurrent(true);
            repaint();
            revalidate();
        }
        else if(s.location == 1 && h1.location == 1 && h2.location == 1 && l.location == 1 && cw.location == 0 && gr.location == 1){
            s6.setCurrent(true);
            repaint();
            revalidate();
        }
        else if(s.location == 0 && h1.location == 1 && h2.location == 1 && l.location == 0 && cw.location == 0 && gr.location == 1){
            s7.setCurrent(true);
            repaint();
            revalidate();
        }
        else if(s.location == 1 && h1.location == 1 && h2.location == 1 && l.location == 1 && cw.location == 1 && gr.location == 1){
            s8.setCurrent(true);
//            messageTA.setText("CONGRATS! Everyone made\n it to Mars safely :)");
            repaint();
            revalidate();
        }
        else if(s.location == 1 && h1.location == 1 && h2.location == 0 && l.location == 1 && cw.location == 1 && gr.location == 0){
            s9.setCurrent(true);
            repaint();
            revalidate();
        }
        else if(s.location == 0 && h1.location == 0 && h2.location == 0 && l.location == 0 && cw.location == 1 && gr.location == 0){
            s10.setCurrent(true);
            repaint();
            revalidate();
        }
        else if(s.location == 1 && h1.location == 1 && h2.location == 1 && l.location == 0 && cw.location == 1 && gr.location == 0){
            s11.setCurrent(true);
            repaint();
            revalidate();
        }
        else if(s.location == 0 && h1.location == 1 && h2.location == 0 && l.location == 0 && cw.location == 0 && gr.location == 0){
            s12.setCurrent(true);
            repaint();
            revalidate();
        }
        else if(s.location == 0 && h1.location == 1 && h2.location == 1 && l.location == 0 && cw.location == 0 && gr.location == 0){
            s13.setCurrent(true);
            repaint();
            revalidate();
        }
        else if(s.location == 1 && h1.location == 1 && h2.location == 0 && l.location == 1 && cw.location == 1 && gr.location == 1){
            s14.setCurrent(true);
            repaint();
            revalidate();
        }
        else if(s.location == 0 && h1.location == 1 && h2.location == 0 && l.location == 0 && cw.location == 0 && gr.location == 1){
            s15.setCurrent(true);
            repaint();
            revalidate();
        }
        else if(s.location == 1 && h1.location == 1 && h2.location == 1 && l.location == 0 && cw.location == 1 && gr.location == 1){
            s16.setCurrent(true);
            repaint();
            revalidate();
        }
        
        
    }//GEN-LAST:event_goButtonActionPerformed
    
    private ArrayList<StatePanel> find_shortest_path(HashMap<StatePanel, ArrayList<StatePanel>> hm, StatePanel start, StatePanel end)
    {
    	//USING DEPTH FIRST SEARCH:
    	
    	ArrayList<StatePanel> states = new ArrayList<StatePanel>();
    	
//        path = path + [start]
//        if start == end:
//            return path
//        if not graph.has_key(start):
//            return None
//        shortest = None
//        for node in graph[start]:
//            if node not in path:
//                newpath = find_shortest_path(graph, node, end, path)
//                if newpath:
//                    if not shortest or len(newpath) < len(shortest):
//                        shortest = newpath= 
    	
        return states;
    }
    
    private void clrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrButtonActionPerformed
        // TODO add your handling code here:
        dm1.removeAllElements();
        
        jList1.setModel(dm);
        jList2.setModel(dm1);
        jList3.setModel(dm2);
        
        sButton.setEnabled(true);
        cButton.setEnabled(true);
        lButton.setEnabled(true);
        gButton.setEnabled(true);
        h1Button.setEnabled(true);
        h2Button.setEnabled(true);
        
    }//GEN-LAST:event_clrButtonActionPerformed

    //reset moves to 0, clear all JLists, move everything back to earth
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	m = 0;
    	movesLbl.setText("Moves: " + m);
    	
		goButton.setEnabled(true);
		clrButton.setEnabled(true);
		messageTA.setText("");
		
        sButton.setEnabled(true);
        cButton.setEnabled(true);
        lButton.setEnabled(true);
        gButton.setEnabled(true);
        h1Button.setEnabled(true);
        h2Button.setEnabled(true);
        
        s.setLocation(0);
        cw.setLocation(0);
        l.setLocation(0);
        gr.setLocation(0);
        h1.setLocation(0);
        h2.setLocation(0);  
        
        earth.removeAllOccupants();
        mars.removeAllOccupants();
        
        earth.addOccupant(s.name);
        earth.addOccupant(cw.name);
        earth.addOccupant(l.name);
        earth.addOccupant(gr.name);
        earth.addOccupant(h1.name);
        earth.addOccupant(h2.name);
        
    	dm.removeAllElements();
    	dm1.removeAllElements();
    	dm2.removeAllElements();
        
        dm.addElement(s.name);
        dm.addElement(cw.name);
        dm.addElement(l.name);
        dm.addElement(gr.name);
        dm.addElement(h1.name);
        dm.addElement(h2.name);
        
        jList1.setModel(dm);
        jList2.setModel(dm1);
        jList3.setModel(dm2);
        
        messageTA.setText("");
        
        s1.setCurrent(true);
        s2.setCurrent(false);
        s3.setCurrent(false);
        s4.setCurrent(false);
        s5.setCurrent(false);
        s6.setCurrent(false);
        s7.setCurrent(false);
        s8.setCurrent(false);
        s9.setCurrent(false);
        s10.setCurrent(false);
        s11.setCurrent(false);
        s12.setCurrent(false);
        s13.setCurrent(false);
        s14.setCurrent(false);
        s15.setCurrent(false);
        s16.setCurrent(false);
        repaint();
        revalidate();
    	
        
        System.out.println("RESET BUTTON WAS CLICKED!");
        System.out.println("*****************Occupants on Earth: ********************");
        for(int i = 0; i < earth.getOccupants().size(); i++)
        {
        	System.out.println(earth.getOccupants().get(i));
        }
        
        System.out.println("*****************Occupants on Mars: ********************");
        for(int i = 0; i < mars.getOccupants().size(); i++)
        {
        	System.out.println(mars.getOccupants().get(i));
        }
    }
    
    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Help button was clicked!");
    	
    	if(helpButton.getText().equals("HELP"))
    	{
    		helpButton.setText("HIDE");
    		
    		solutionsLbl.setVisible(true);
    		
	    	path1Button.setVisible(true);
	    	path2Button.setVisible(true);
	    	path3Button.setVisible(true);
	    	path4Button.setVisible(true);
	    	
	    	solutionTA.setVisible(true);
	    	
	    	
    	}
    	else if(helpButton.getText().equals("HIDE")){
    		helpButton.setText("HELP");
    		
    		solutionsLbl.setVisible(false);
    		
	    	path1Button.setVisible(false);
	    	path2Button.setVisible(false);
	    	path3Button.setVisible(false);
	    	path4Button.setVisible(false);
	    	
	    	solutionTA.setText("");
	    	solutionTA.setVisible(false);
    	}
    	
    }
    
    private void path1ButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Path 1 button was clicked!");
    	solutionTA.setText("1. Bring Scientist, Lion, and Cow to Mars. \n" +
    			            "2. Bring Scientist and Cow back to Earth. \n" +
    			            "3. Bring Scientist, Grains, and Cow to Mars. \n" +
    			            "4. Bring Scientist and Cow back to Earth. \n" +
    			            "5. Bring Scientist, Human 1, and Human 2 to Mars. \n" +
    			            "6. Bring Scientist and Lion back to Earth. \n" +
    			            "7. Bring Scientist, Cow, and Lion to Mars." );
    }
    
    private void path2ButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Path 2 button was clicked!");
    	solutionTA.setText("1. Bring Scientist, Lion, and Cow to Mars. \n" +
	            "2. Bring Scientist and Lion back to Earth. \n" +
	            "3. Bring Scientist, Grains, and Lion to Mars. \n" +
	            "4. Bring Scientist and Cow back to Earth. \n" +
	            "5. Bring Scientist, Human 1, and Human 2 to Mars. \n" +
	            "6. Bring Scientist and Lion back to Earth. \n" +
	            "7. Bring Scientist, Cow, and Lion to Mars." );
    }
    
    private void path3ButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Path 3 button was clicked!");
    	solutionTA.setText("1. Bring Scientist, Lion, and Cow to Mars. \n" +
	            "2. Bring Scientist and Lion back to Earth. \n" +
	            "3. Bring Scientist, Human 1, and Human 2 to Mars. \n" +
	            "4. Bring Scientist and Cow back to Earth. \n" +
	            "5. Bring Scientist, Grains, and Lion to Mars. \n" +
	            "6. Bring Scientist and Lion back to Earth. \n" +
	            "7. Bring Scientist, Cow, and Lion to Mars." );
    }
    
    private void path4ButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Path 4 button was clicked!");
    	solutionTA.setText("1. Bring Scientist, Lion, and Cow to Mars. \n" +
	            "2. Bring Scientist and Lion back to Earth. \n" +
	            "3. Bring Scientist, Human 1, and Human 2 to Mars. \n" +
	            "4. Bring Scientist and Cow back to Earth. \n" +
	            "5. Bring Scientist, Grains, and Cow to Mars. \n" +
	            "6. Bring Scientist and Cow back to Earth. \n" +
	            "7. Bring Scientist, Cow, and Lion to Mars." );
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Graphics g = new Graphics();
       
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            //    Frame f = new Frame().setVisible(true);
		
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cButton;
    private javax.swing.JButton clrButton;
    private javax.swing.JButton gButton;
    private javax.swing.JButton goButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton h1Button;
    private javax.swing.JButton h2Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton lButton;
    private javax.swing.JButton sButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JButton path1Button;
    private javax.swing.JButton path2Button;
    private javax.swing.JButton path3Button;
    private javax.swing.JButton path4Button;
    private javax.swing.JTextArea messageTA;
    private javax.swing.JTextArea solutionTA;
    private javax.swing.JLabel solutionsLbl;
    private javax.swing.JLabel movesLbl;
    private javax.swing.JScrollPane jScrollPaneTA;
    // End of variables declaration//GEN-END:variables
}

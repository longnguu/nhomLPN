/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author MY LAPTOP
 */
public class BTTGD {
    public static void main(String[] args) {
        new BTTGD();
    }

    public BTTGD() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }

                JFrame frame = new JFrame("Test");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new FormPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }

        });
    }

    public class FormPane extends JPanel {

        public FormPane() {
            setBorder(new EmptyBorder(8, 8, 8, 8));
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weightx = 1;

            GeneralPane generalPane = new GeneralPane();
            generalPane.setBorder(new CompoundBorder(new TitledBorder("General"), new EmptyBorder(4, 4, 4, 4)));
            add(generalPane, gbc);

            gbc.gridy++;

            PropellerPane propellerPane = new PropellerPane();
            propellerPane.setBorder(new CompoundBorder(new TitledBorder("Propeller"), new EmptyBorder(4, 4, 4, 4)));
            add(propellerPane, gbc);
        }

    }

    public class GeneralPane extends JPanel {

        public GeneralPane() {
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.EAST;

            add(new JLabel("Comany:"), gbc);
            gbc.gridx += 2;
            gbc.gridy ++;
            gbc.gridx = 0;
            add(new JLabel("Contact:"), gbc);
            gbc.gridx += 2;

            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.weightx = 0.5;
            add(new JTextField(10), gbc);
            gbc.gridx += 2;
            gbc.gridy++;
            gbc.gridx = 1;
            add(new JTextField(10), gbc);
            gbc.gridx += 2;
           
        }        
    }

    protected class PropellerPane    extends JPanel {

        public PropellerPane() {
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.EAST;

            add(new JLabel("PTI(kW):"), gbc);
            gbc.gridx += 2;
            add(new JLabel("Power(kW):"), gbc);
            gbc.gridy ++;
            gbc.gridx = 0;
            add(new JLabel("R(mm):"), gbc);
            gbc.gridx += 2;
            add(new JLabel("D(mm):"), gbc);

            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.weightx = 0.5;
            add(new JTextField(10), gbc);
            gbc.gridx += 2;
            add(new JTextField(10), gbc);
            gbc.gridy++;
            gbc.gridx = 1;
            add(new JTextField(10), gbc);
            gbc.gridx += 2;
            add(new JTextField(10), gbc);               
        }            
    }
}
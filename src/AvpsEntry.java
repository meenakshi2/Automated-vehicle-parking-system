
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author om
 */
public class AvpsEntry extends javax.swing.JFrame {

    /**
     * Creates new form AvpsEntry
     */
    public AvpsEntry() {
        initComponents();
    }

    AvpsEntry(int sno, String name, String mid) {
       
         initComponents();
slipPrint.setEnabled(false);
                slipcancel.setEnabled(false);


//To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VehicleEntry_ = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cm = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        availStatus = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vehicleNo = new javax.swing.JTextField();
        pButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        s11 = new javax.swing.JLabel();
        s55 = new javax.swing.JLabel();
        s22 = new javax.swing.JLabel();
        s33 = new javax.swing.JLabel();
        s44 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        slipcancel = new javax.swing.JButton();
        slipPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vehicle Entry");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel2.setText("Avps parking slip");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(78, 78, 78))
        );

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));

        jLabel3.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 255));
        jLabel3.setText("Vehicle Type:");

        cm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CAR", "BIKE" }));

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 0));
        jButton1.setText("Check Availability");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        availStatus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        availStatus.setForeground(new java.awt.Color(255, 204, 255));
        availStatus.setText("...");

        jLabel5.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 255));
        jLabel5.setText("Vehicle No :");

        vehicleNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        pButton.setBackground(new java.awt.Color(255, 204, 255));
        pButton.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        pButton.setText("SUBMIT");
        pButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5)
                        .addGap(41, 41, 41)
                        .addComponent(vehicleNo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(cm, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(availStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pButton, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(availStatus)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)
                        .addGap(37, 37, 37)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(vehicleNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addComponent(pButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Vehicle Type : ");

        jLabel7.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("SlipNo : ");

        jLabel8.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Vehicle No :");

        jLabel9.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setText("IN Date & Time :");

        jLabel10.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("Floor No :");

        s11.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        s11.setText("..");

        s55.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        s55.setText("..");

        s22.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        s22.setText("..");

        s33.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        s33.setText("..");

        s44.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        s44.setText("..");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 153));
        jLabel16.setText("Parking Charges: Bike- Rs. 20/- , Car- Rs. 30/- per hour");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 102));
        jLabel17.setText("Please do not leave any valuables inside the vehicle.");

        slipcancel.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        slipcancel.setText("Cancel");
        slipcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slipcancelActionPerformed(evt);
            }
        });

        slipPrint.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        slipPrint.setText("Print");
        slipPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slipPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VehicleEntry_Layout = new javax.swing.GroupLayout(VehicleEntry_);
        VehicleEntry_.setLayout(VehicleEntry_Layout);
        VehicleEntry_Layout.setHorizontalGroup(
            VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VehicleEntry_Layout.createSequentialGroup()
                .addGroup(VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VehicleEntry_Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VehicleEntry_Layout.createSequentialGroup()
                                .addGroup(VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(VehicleEntry_Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(s44, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(VehicleEntry_Layout.createSequentialGroup()
                                .addGroup(VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(VehicleEntry_Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(36, 36, 36)
                                        .addComponent(s55, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(VehicleEntry_Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(81, 81, 81)
                                        .addComponent(s11, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(VehicleEntry_Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(29, 29, 29)
                                        .addComponent(s33, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(VehicleEntry_Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(s22, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(VehicleEntry_Layout.createSequentialGroup()
                        .addGroup(VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(VehicleEntry_Layout.createSequentialGroup()
                                    .addGap(81, 81, 81)
                                    .addComponent(jLabel17))
                                .addGroup(VehicleEntry_Layout.createSequentialGroup()
                                    .addGap(98, 98, 98)
                                    .addComponent(slipPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(slipcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        VehicleEntry_Layout.setVerticalGroup(
            VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VehicleEntry_Layout.createSequentialGroup()
                .addGroup(VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(VehicleEntry_Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(s11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(s22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(s33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VehicleEntry_Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel9))
                            .addGroup(VehicleEntry_Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(s44, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(s55, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(61, 61, 61)
                        .addGroup(VehicleEntry_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(slipPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slipcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(91, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VehicleEntry_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(VehicleEntry_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

   try {
            String vt=(String)cm.getSelectedItem();
            
            ResultSet rs=db.st.executeQuery("select VacantSlots,FloorNo from parking_area where VehicleType='"+vt+"' ");
            int x=0;
            String f="";
            while(rs.next())
            {
                x=rs.getInt(1);
                f=rs.getString(2);
                if(x>0)
                {
                    break;
                }
            }
            if(x!=0)
            {
                availStatus.setText("Available: "+x+" at Floor "+f);
                availStatus.setForeground(Color.green);
                pButton.setEnabled(true);
                
            }
            else
            {
                availStatus.setText("Not Available");
                availStatus.setForeground(Color.red);
                pButton.setEnabled(false);
                s11.setVisible(false);
                s22.setVisible(false);
                s33.setVisible(false);
                s44.setVisible(false);
                s55.setVisible(false);
                slipPrint.setEnabled(false);
                slipcancel.setEnabled(false);
              
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(AvpsAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pButtonActionPerformed





 String vt=((String)cm.getSelectedItem());
        String vn=vehicleNo.getText().trim();
        if(!vn.equals(""))
        {
            int slipNo;
            try 
            {
                ResultSet rs1=db.st.executeQuery("select MAX(SlipNo) from Parking");
                if(rs1.next())
                    slipNo=rs1.getInt(1)+1;
                else
                    slipNo=0;
                //DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy h:mm a");
                //java.util.Date cd=new java.util.Date();
                //String InTime=dateFormat.format(cd);
                LocalDateTime InTime = LocalDateTime.now();
                ResultSet rs=db.st.executeQuery("select VacantSlots, FloorNo from Parking_Area where VehicleType='"+vt+"'");
                String f="";
                int vs=0;
                while(rs.next())
                {
                    vs=rs.getInt(1);
                    if(vs>0)
                    {
                        f=rs.getString(2);
                       db.st.executeUpdate("insert into Parking values("+slipNo+",'"+vt+"','"+vn+"',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,'"+f+"',0,'Present')");
                     db.st.executeUpdate("update Parking_Area set VacantSlots="+(vs-1)+" WHERE floorNo = '"+f+"'");

                        s11.setText(slipNo+"");
                        s22.setText(vt);
                        s33.setText(vn);
                        s44.setText(InTime.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm a")));
                        s55.setText(f);
                       s11.setVisible(true);
                        s22.setVisible(true);
                         s33.setVisible(true);
                          s44.setVisible(true);
                           s55.setVisible(true);
                        slipPrint.setEnabled(true);
                        slipcancel.setEnabled(true);
                        vehicleNo.setText("");
                        break;
                    }
                }
                if(vs==0)
                    JOptionPane.showMessageDialog(null,"Parking Full!!");
                
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex);
                ex.printStackTrace();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Plz Enter Vehicle No. !!!");
            s11.setVisible(false);
            s22.setVisible(false);
            s33.setVisible(false);
            s44.setVisible(false);
            s55.setVisible(false);
            slipPrint.setEnabled(false);
            slipcancel.setEnabled(false);
            
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_pButtonActionPerformed

    private void slipPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slipPrintActionPerformed



 class MyPrint implements Printable
        {
            public int print(Graphics g, PageFormat pf, int page) throws PrinterException 
            {
                if (page > 0) { /* We have only one page, and 'page' is zero-based */
                    return NO_SUCH_PAGE;
                }
                /* User (0,0) is typically outside the imageable area, so we must
                 * translate by the X and Y values in the PageFormat to avoid clipping
                 */
                Graphics2D g2d = (Graphics2D)g;
                g2d.translate(pf.getImageableX(), pf.getImageableY());

                /* Now print the window and its visible contents */
                s11.printAll(g);
                  s22.printAll(g);
                    s33.printAll(g);
                      s44.printAll(g);
                        s55.printAll(g);

                /* tell the caller that this page is part of the printed document */
                return PAGE_EXISTS;
            }
        }
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new MyPrint());
        boolean ok = job.printDialog();
        if (ok) 
        {
            try {
                 job.print();
            } catch (PrinterException ex) {
             /* The job did not successfully complete */
            }
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_slipPrintActionPerformed

    private void slipcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slipcancelActionPerformed




try {
            String sno=s11.getText().trim();
            String f=s55.getText().trim();
            if(!sno.equals(""))
            {
                int x=JOptionPane.showConfirmDialog(null, "Are you sure to Cancel Parking?");
                if(x==JOptionPane.YES_OPTION)
                {
                    ResultSet rs=db.st.executeQuery("select VacantSlots from Parking_Area where floorNo='"+f+"'");
                    rs.next();
                    int vs=rs.getInt(1);
                    db.st.executeUpdate("update Parking_Area set VacantSlots="+(vs+1)+" WHERE floorNo = '"+f+"'");
                    db.st.executeUpdate("Delete from Parking where SlipNo="+sno);
                    JOptionPane.showMessageDialog(null,"Record Removed( Parking Canceled)!!");
                    s11.setVisible(false);
                    s22.setVisible(false);
                    s33.setVisible(false);
                    s44.setVisible(false);
                    s55.setVisible(false);
                    slipPrint.setEnabled(false);
                    slipcancel.setEnabled(false);
                    vehicleNo.setText("");
                }
                
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_slipcancelActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel VehicleEntry_;
    private javax.swing.JLabel availStatus;
    private javax.swing.JComboBox<String> cm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton pButton;
    private javax.swing.JLabel s11;
    private javax.swing.JLabel s22;
    private javax.swing.JLabel s33;
    private javax.swing.JLabel s44;
    private javax.swing.JLabel s55;
    private javax.swing.JButton slipPrint;
    private javax.swing.JButton slipcancel;
    private javax.swing.JTextField vehicleNo;
    // End of variables declaration//GEN-END:variables
}

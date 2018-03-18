import com.mysql.jdbc.Connection;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author om
 */



public class db {
    public static Connection con;
        public static Statement st;
    public static PreparedStatement checkAdmin;
     public static PreparedStatement checkEmp ;
      public static PreparedStatement checkCar ;
       public static PreparedStatement checkBike;
        public static PreparedStatement likeQuery;
         public static PreparedStatement deleteEmp;
          public static PreparedStatement addUser;
           public static PreparedStatement updateId;
            public static PreparedStatement updateName;
     public static PreparedStatement updateRev;
      public static PreparedStatement empEntry;
       public static PreparedStatement empSlip;
        public static PreparedStatement exitVehNo;
         public static PreparedStatement updateOut;
          public static PreparedStatement exitSlip;
    public static PreparedStatement likeId;
    
      
 
  static{  

try{
    
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/avps","root","incapp");
    //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/meradb","root","incapp");
           st=con.createStatement();
           checkAdmin=con.prepareStatement("select * from admin_login where aid=? and pass=? ");
           checkEmp=con.clientPrepareStatement("select * from member_login where mid=? and pass=? ");
            checkCar=con.clientPrepareStatement("select * from parking_area ");
             checkBike=con.clientPrepareStatement("select * from parking_area ");
             likeQuery=con.prepareStatement("select * from member_login where name like ?");
              likeId=con.prepareStatement("select * from member_login where mid like ?");
               deleteEmp=con.prepareStatement("delete from member_login where mid=?");
                 addUser=con.prepareStatement("insert into member_login (mid,name,ph,pass) values(?,?,?,?)");
                  updateId=con.prepareStatement("update member_login set name=?,ph=? where mid=? ");
                  updateName=con.prepareStatement("update member_login set mid=?,name=?,ph=? where name=? ");
                   empEntry=con.prepareStatement("insert into parking(vehicletype,vehicleNo,intimr,floorNo,Revenue,status) values(?,?,CURRENT_TIMESTAMP,?,?,?)");
                   empSlip=con.prepareStatement("select * from parking where vehicleNo=?");
                    exitVehNo=con.prepareStatement("select * from parking where vehicleNo=? and status='Entry'");
                updateOut=con.prepareStatement("update parking set outTime=CURRENT_TIMESTAMP where slipNo=? ");
                updateRev=con.prepareStatement("update parking set revenue=0,status='Exit' where slipNo=?");
                exitSlip=con.prepareStatement("select * from parking where slipNo=? and status='Entry'");
}
catch(Exception ex){
             ex.printStackTrace();   
            }
    } 

   
}
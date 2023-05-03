import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Project_Sjce {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Online Reservation System -Indian RailWays");
		System.out.println("  Welcome to TrainZee !!! ");
		Scanner sathish=new Scanner(System.in);
		System.out.println("Enter the Required Process to be Implemented");
		System.out.println("Press 1 Online Reservation Process" +"\n"+"Press 2 Cancel Reservation");
		int enter=sathish.nextInt();
		if(enter==1) {
			 DataInsertionprc();
		}else if(enter==2){
			delete();
		}
		//       
			
        
	}
  public static void DataInsertionprc() throws SQLException {
	  String Server="jdbc:mysql://@localhost:3306/sk2002";
	  String User="root";
	  String Password="root123";
	  Scanner sathish=new Scanner(System.in);
	  System.out.println("Enter Slot Number");
	  int slot=sathish.nextInt();
	  System.out.println("Enter Your Name: ");
	  String Name=sathish.next();
	  System.out.println("Enter Your Mobile NO: ");
	  String Num=sathish.next();
	  System.out.println("Enter E-Mail Address: ");
	  String Email=sathish.next();
	  System.out.println("Enter Your Departure Place: ");
	  String DeparturePlace=sathish.next();
	  System.out.println("Enter Your Arival Place: ");
	  String boardto=sathish.next();
	  String querry=("insert into Stack1 values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
	  System.out.println("Select your Train: ");
	  System.out.println("Available Trains From"+" "+DeparturePlace + ""+ "to"+" "+boardto);
	  System.out.println("22671 - TEJAS EXPRESS"+"\n"+"12637 - PANDIAN EXP"+"\n"+"12635 - VAIGAI EXP"+"\n"+"22623 - MS MDU EXPRESS"+
	                    "\n"+"16191 - NCJ ANTYODAYA"+"\n"+"12631 - NELLAI EXPRESS");
	 
	  
	  
	  
//	  Connection con=DriverManager.getConnection(Server, User, Password);
//	  PreparedStatement post= con.prepareStatement(querry);
//	  post.setString(1, Name);
//	  post.setString(2, Num);
//	  post.setString(3, Email);
//	  post.setString(4, DeparturePlace);
//	  post.setString(5, boardto);
//	  String ref="22671 - TEJAS EXPRESS";
//	  post.setString(6, ref);
//	  int rows = post.executeUpdate();
	
	  
	  // train details :
	  System.out.println("Enter Train NO: ");
	  int Train =sathish.nextInt();
	  if(Train==22671) {
		  System.out.print("Enter Your Boarding Point (EgmoreJunction , TambaramJunction , ChengalpattuJunction, VillupuramJunction , CuddaloreJunction , MaduraiJunction)");
		  String Board=sathish.next();
		  System.out.println("TranZI Says Your Request Updated Successfully ");
		  System.out.println("Payment Process Started !! ");
		  int nume=sathish.nextInt();
		  if(nume<100) {
			  System.out.println("22671 - TEJAS EXPRESS");
			  System.out.println("Enter :0 -Class Ordinary : 1500"+"\n"+"Enter : 1 -Class AC Seater : 2300"+"\n"+"Enter :2 -Class AC SLeaper : 3700");
			  int cls=sathish.nextInt();
			  if(cls==0) {
				  int clss_Amt =1500;
				  System.out.println("Enter The Number of Tickets:");
				  int tickets=sathish.nextInt();
				  clss_Amt=clss_Amt*tickets;
//				  for(int i=1;i<tickets;i++) {
//					  clss_Amt+=1500;
//					  break;
//				  }
				  System.out.println("No of Tickets : "+tickets);
				  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
				  int code=sathish.nextInt();
				  if(code==01) {
					  System.out.println("Enter card");
					  int cd=sathish.nextInt();
					  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
					  System.out.println("Enter pin ");
					  int pin=sathish.nextInt();
					  if(pin<=9999) {
						  System.out.println("Enter the Amount to be Pay: ");
						  int Amnt=sathish.nextInt();
						  if(Amnt==clss_Amt) {
							  String Res="Reserved";
							  System.out.println("Amount Paid Succesfully");
							  System.out.println("Slot Reserved Successfully");
							  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 22671 - TEJAS EXPRESS"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
									  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
							  System.out.println("Arival_Time: 23.41");
							  System.out.println("Departure_Time: 24.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
							  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
							  Connection con=DriverManager.getConnection(Server, User, Password);
							  PreparedStatement post= con.prepareStatement(querry);
							  post.setInt(1, slot);
							  post.setString(2, Name);
							  post.setString(3, Num);
							  post.setString(4, Email);
							  post.setString(5, DeparturePlace);
							  post.setString(6, boardto);
							  String ref="22671 - TEJAS EXPRESS";
							  post.setString(7, ref);
							  post.setString(8, "Ordinary");
							  post.setString(9, Board);
							  post.setDouble(10, 23.41);
							  post.setDouble(11, 24.01);
							  post.setInt(12, Amnt);
							  String status="Reserved";
							  post.setString(13, status);
							  int rows = post.executeUpdate();
//							  rows = post.executeUpdate();
							  System.out.println("No of rows affected = "+ ""+rows);
							  con.close();
						  }else {
							  System.out.print(" Amount Not Satisfied Try Again !! ");
						  }
					  }else {
						  System.out.println("Invalid Pin Number !! ");
					  }
				  }else {
					  System.out.println("Invalid Process Code");
				  }
				 
			
			  }else if(cls==1) {
				  int clss_Amt =2300;
				  System.out.println("Enter The Number of Tickets:");
				  int tickets=sathish.nextInt();
				  clss_Amt=clss_Amt*tickets;
//				  for(int i=1;i<tickets;i++) {
//					  clss_Amt+=2300;
//					  break;
//				  }
				  System.out.println("No of Tickets : "+tickets);
				  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
				  int code=sathish.nextInt();
				  if(code==01) {
					  System.out.println("Enter card");
					  int cd=sathish.nextInt();
					  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
					  System.out.println("Enter pin ");
					  int pin=sathish.nextInt();
					  if(pin<=9999) {
						  System.out.println("Enter the Amount to be Pay: ");
						  int Amnt=sathish.nextInt();
						  if(Amnt==clss_Amt) {
							  String Res="Reserved";
							  System.out.println("Amount Paid Succesfully");
							  System.out.println("Slot Reserved Successfully");
							  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 22671 - TEJAS EXPRESS"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
									  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
							  System.out.println("Arival_Time: 23.41");
							  System.out.println("Departure_Time: 24.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
							  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
							  Connection con=DriverManager.getConnection(Server, User, Password);
							  PreparedStatement post= con.prepareStatement(querry);
							  post.setInt(1, slot);
							  post.setString(2, Name);
							  post.setString(3, Num);
							  post.setString(4, Email);
							  post.setString(5, DeparturePlace);
							  post.setString(6, boardto);
							  String ref="22671 - TEJAS EXPRESS";
							  post.setString(7, ref);
							  post.setString(8, "AC-Seater");
							  post.setString(9, Board);
							  post.setDouble(10, 23.41);
							  post.setDouble(11, 24.01);
							  post.setInt(12, Amnt);
							  String status="Reserved";
							  post.setString(13, status);
							  int rows = post.executeUpdate();
//							  rows = post.executeUpdate();
							  System.out.println("No of rows affected = "+ ""+rows);
							  con.close();
						  }else {
							  System.out.print(" Amount Not Satisfied Try Again !! ");
						  }
					  }else {
						  System.out.println("Invalid Pin Number !! ");
					  }
				  }else {
					  System.out.println("Invalid Process Code");
				  }
			  
			  
		  }else if(cls==2) {
			  int clss_Amt =3700;
			  System.out.println("Enter The Number of Tickets:");
			  int tickets=sathish.nextInt();
			  clss_Amt=clss_Amt*tickets;
//			  for(int i=1;i<tickets;i++) {
//				  clss_Amt+=3700;
//				  break;
//			  }
			  System.out.println("No of Tickets : "+tickets);
			  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
			  int code=sathish.nextInt();
			  if(code==01) {
				  System.out.println("Enter card");
				  int cd=sathish.nextInt();
				  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
				  System.out.println("Enter pin ");
				  int pin=sathish.nextInt();
				  if(pin<=9999) {
					  System.out.println("Enter the Amount to be Pay: ");
					  int Amnt=sathish.nextInt();
					  if(Amnt==clss_Amt) {
						  String Res="Reserved";
						  System.out.println("Amount Paid Succesfully");
						  System.out.println("Slot Reserved Successfully");
						  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 22671 - TEJAS EXPRESS"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
								  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
						  System.out.println("Arival_Time: 23.41");
						  System.out.println("Departure_Time: 24.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
						  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
						  Connection con=DriverManager.getConnection(Server, User, Password);
						  PreparedStatement post= con.prepareStatement(querry);
						  post.setInt(1, slot);
						  post.setString(2, Name);
						  post.setString(3, Num);
						  post.setString(4, Email);
						  post.setString(5, DeparturePlace);
						  post.setString(6, boardto);
						  String ref="22671 - TEJAS EXPRESS";
						  post.setString(7, ref);
						  post.setString(8, "AC_Sleaper");
						  post.setString(9, Board);
						  post.setDouble(10, 23.41);
						  post.setDouble(11, 24.01);
						  post.setInt(12, Amnt);
						  String status="Reserved";
						  post.setString(13, status);
						  int rows = post.executeUpdate();
//						  rows = post.executeUpdate();
						  System.out.println("No of rows affected = "+ ""+rows);
						  con.close();
					
					  }else {
						  System.out.print(" Amount Not Satisfied Try Again !! ");
					  }
				  }else {
					  System.out.println("Invalid Pin Number !! ");
				  }
			  }else {
				  System.out.println("Invalid Process Code");
			  }
//		  System.out.println("22671 - TEJAS EXPRESS");
//		  System.out.println("Arival_Time: 23.41");
//		  System.out.println("Departure_Time: 24.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
		  
	  }
	  
	  
  }
	  }else if(Train==12637){
		  System.out.print("Enter Your Boarding Point (EgmoreJunction , TambaramJunction , ChengalpattuJunction, VillupuramJunction , CuddaloreJunction , MaduraiJunction)");
		  String Board=sathish.next();
		  System.out.println("TranZI Says Your Request Updated Successfully ");
		  System.out.println("Payment Process Started !! ");
		  int nume=sathish.nextInt();
		  if(nume<100) {
			  System.out.println("12637 - PANDIYAN EXPRESS");
			  System.out.println("Enter :0 -Class Ordinary : 1200"+"\n"+"Enter : 1 -Class AC Seater : 2000"+"\n"+"Enter :2 -Class AC SLeaper : 3100");
			  int cls=sathish.nextInt();
			  if(cls==0) {
				  int clss_Amt =1500;
				  System.out.println("Enter The Number of Tickets:");
				  int tickets=sathish.nextInt();
				  clss_Amt=clss_Amt*tickets;
//				  for(int i=1;i<tickets;i++) {
//					  clss_Amt+=1500;
//					  break;
//				  }
				  System.out.println("No of Tickets : "+tickets);
				  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
				  int code=sathish.nextInt();
				  if(code==01) {
					  System.out.println("Enter card");
					  int cd=sathish.nextInt();
					  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
					  System.out.println("Enter pin ");
					  int pin=sathish.nextInt();
					  if(pin<=9999) {
						  System.out.println("Enter the Amount to be Pay: ");
						  int Amnt=sathish.nextInt();
						  if(Amnt==clss_Amt) {
							  String Res="Reserved";
							  System.out.println("Amount Paid Succesfully");
							  System.out.println("Slot Reserved Successfully");
							  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 12637 - PANDIYAN EXPRESS"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
									  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
							  System.out.println("Arival_Time: 14.41");
							  System.out.println("Departure_Time: 15.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
							  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
							  Connection con=DriverManager.getConnection(Server, User, Password);
							  PreparedStatement post= con.prepareStatement(querry);
							  post.setInt(1, slot);
							  post.setString(2, Name);
							  post.setString(3, Num);
							  post.setString(4, Email);
							  post.setString(5, DeparturePlace);
							  post.setString(6, boardto);
							  String ref="12637 - PANDIYAN EXPRESS";
							  post.setString(7, ref);
							  post.setString(8, "Ordinary");
							  post.setString(9, Board);
							  post.setDouble(10, 14.41);
							  post.setDouble(11, 15.01);
							  post.setInt(12, Amnt);
							  String status="Reserved";
							  post.setString(13, status);
							  int rows = post.executeUpdate();
//							  rows = post.executeUpdate();
							  System.out.println("No of rows affected = "+ ""+rows);
							  con.close();
						  }else {
							  System.out.print(" Amount Not Satisfied Try Again !! ");
						  }
					  }else {
						  System.out.println("Invalid Pin Number !! ");
					  }
				  }else {
					  System.out.println("Invalid Process Code");
				  }
				 
			
			  }else if(cls==1) {
				  int clss_Amt =2300;
				  System.out.println("Enter The Number of Tickets:");
				  int tickets=sathish.nextInt();
				  clss_Amt=clss_Amt*tickets;
//				  for(int i=1;i<tickets;i++) {
//					  clss_Amt+=2300;
//					  break;
//				  }
				  System.out.println("No of Tickets : "+tickets);
				  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
				  int code=sathish.nextInt();
				  if(code==01) {
					  System.out.println("Enter card");
					  int cd=sathish.nextInt();
					  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
					  System.out.println("Enter pin ");
					  int pin=sathish.nextInt();
					  if(pin<=9999) {
						  System.out.println("Enter the Amount to be Pay: ");
						  int Amnt=sathish.nextInt();
						  if(Amnt==clss_Amt) {
							  String Res="Reserved";
							  System.out.println("Amount Paid Succesfully");
							  System.out.println("Slot Reserved Successfully");
							  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 12637 - PANDIYAN EXPRESS"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
									  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
							  System.out.println("Arival_Time: 14.41");
							  System.out.println("Departure_Time: 15.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
							  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
							  Connection con=DriverManager.getConnection(Server, User, Password);
							  PreparedStatement post= con.prepareStatement(querry);
							  post.setInt(1, slot);
							  post.setString(2, Name);
							  post.setString(3, Num);
							  post.setString(4, Email);
							  post.setString(5, DeparturePlace);
							  post.setString(6, boardto);
							  String ref="12637 - PANDIYAN EXPRESS";
							  post.setString(7, ref);
							  post.setString(8, "AC-Seater");
							  post.setString(9, Board);
							  post.setDouble(10, 14.41);
							  post.setDouble(11, 15.01);
							  post.setInt(12, Amnt);
							  String status="Reserved";
							  post.setString(13, status);
							  int rows = post.executeUpdate();
//							  rows = post.executeUpdate();
							  System.out.println("No of rows affected = "+ ""+rows);
							  con.close();
						  }else {
							  System.out.print(" Amount Not Satisfied Try Again !! ");
						  }
					  }else {
						  System.out.println("Invalid Pin Number !! ");
					  }
				  }else {
					  System.out.println("Invalid Process Code");
				  }
			  
			  
		  }else if(cls==2) {
			  int clss_Amt =3700;
			  System.out.println("Enter The Number of Tickets:");
			  int tickets=sathish.nextInt();
			  clss_Amt=clss_Amt*tickets;
//			  for(int i=1;i<tickets;i++) {
//				  clss_Amt+=3700;
//				  break;
//			  }
			  System.out.println("No of Tickets : "+tickets);
			  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
			  int code=sathish.nextInt();
			  if(code==01) {
				  System.out.println("Enter card");
				  int cd=sathish.nextInt();
				  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
				  System.out.println("Enter pin ");
				  int pin=sathish.nextInt();
				  if(pin<=9999) {
					  System.out.println("Enter the Amount to be Pay: ");
					  int Amnt=sathish.nextInt();
					  if(Amnt==clss_Amt) {
						  String Res="Reserved";
						  System.out.println("Amount Paid Succesfully");
						  System.out.println("Slot Reserved Successfully");
						  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 12637 - PANDIYAN EXPRESS"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
								  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
						  System.out.println("Arival_Time: 14.41");
						  System.out.println("Departure_Time: 15.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
						  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
						  Connection con=DriverManager.getConnection(Server, User, Password);
						  PreparedStatement post= con.prepareStatement(querry);
						  post.setInt(1, slot);
						  post.setString(2, Name);
						  post.setString(3, Num);
						  post.setString(4, Email);
						  post.setString(5, DeparturePlace);
						  post.setString(6, boardto);
						  String ref="12637 - PANDIYAN EXPRESS";
						  post.setString(7, ref);
						  post.setString(8, "AC_Sleaper");
						  post.setString(9, Board);
						  post.setDouble(10, 14.41);
						  post.setDouble(11, 15.01);
						  post.setInt(12, Amnt);
						  String status="Reserved";
						  post.setString(13, status);
						  int rows = post.executeUpdate();
//						  rows = post.executeUpdate();
						  System.out.println("No of rows affected = "+ ""+rows);
						  con.close();
					
					  }else {
						  System.out.print(" Amount Not Satisfied Try Again !! ");
					  }
				  }else {
					  System.out.println("Invalid Pin Number !! ");
				  }
			  }else {
				  System.out.println("Invalid Process Code");
			  }
//		  System.out.println("22671 - TEJAS EXPRESS");
//		  System.out.println("Arival_Time: 23.41");
//		  System.out.println("Departure_Time: 24.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
		  
	  }
	  
	  
  }
		  }else if(Train==12635){
			  System.out.print("Enter Your Boarding Point (EgmoreJunction , TambaramJunction , ChengalpattuJunction, VillupuramJunction , CuddaloreJunction , MaduraiJunction)");
			  String Board=sathish.next();
			  System.out.println("TranZI Says Your Request Updated Successfully ");
			  System.out.println("Payment Process Started !! ");
			  int nume=sathish.nextInt();
			  if(nume<100) {
				  System.out.println("12635 - VAIGAI SUPERFAST EXPRESS");
				  System.out.println("Enter :0 -Class Ordinary : 2500"+"\n"+"Enter : 1 -Class AC Seater : 3000"+"\n"+"Enter :2 -Class AC SLeaper : 4100");
				  int cls=sathish.nextInt();
				  if(cls==0) {
					  int clss_Amt =2500;
					  System.out.println("Enter The Number of Tickets:");
					  int tickets=sathish.nextInt();
					  clss_Amt=clss_Amt*tickets;
//					  for(int i=1;i<tickets;i++) {
//						  clss_Amt+=1500;
//						  break;
//					  }
					  System.out.println("No of Tickets : "+tickets);
					  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
					  int code=sathish.nextInt();
					  if(code==01) {
						  System.out.println("Enter card");
						  int cd=sathish.nextInt();
						  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
						  System.out.println("Enter pin ");
						  int pin=sathish.nextInt();
						  if(pin<=9999) {
							  System.out.println("Enter the Amount to be Pay: ");
							  int Amnt=sathish.nextInt();
							  if(Amnt==clss_Amt) {
								  String Res="Reserved";
								  System.out.println("Amount Paid Succesfully");
								  System.out.println("Slot Reserved Successfully");
								  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 12635 - VAIGAI SUPERFAST EXPRESS"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
										  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
								  System.out.println("Arival_Time: 18.41");
								  System.out.println("Departure_Time: 19.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
								  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
								  Connection con=DriverManager.getConnection(Server, User, Password);
								  PreparedStatement post= con.prepareStatement(querry);
								  post.setInt(1, slot);
								  post.setString(2, Name);
								  post.setString(3, Num);
								  post.setString(4, Email);
								  post.setString(5, DeparturePlace);
								  post.setString(6, boardto);
								  String ref="12635 - VAIGAI SUPERFAST EXPRESS";
								  post.setString(7, ref);
								  post.setString(8, "Ordinary");
								  post.setString(9, Board);
								  post.setDouble(10, 18.41);
								  post.setDouble(11, 19.01);
								  post.setInt(12, Amnt);
								  String status="Reserved";
								  post.setString(13, status);
								  int rows = post.executeUpdate();
//								  rows = post.executeUpdate();
								  System.out.println("No of rows affected = "+ ""+rows);
								  con.close();
							  }else {
								  System.out.print(" Amount Not Satisfied Try Again !! ");
							  }
						  }else {
							  System.out.println("Invalid Pin Number !! ");
						  }
					  }else {
						  System.out.println("Invalid Process Code");
					  }
					 
				
				  }else if(cls==1) {
					  int clss_Amt =3000;
					  System.out.println("Enter The Number of Tickets:");
					  int tickets=sathish.nextInt();
					  clss_Amt=clss_Amt*tickets;
//					  for(int i=1;i<tickets;i++) {
//						  clss_Amt+=2300;
//						  break;
//					  }
					  System.out.println("No of Tickets : "+tickets);
					  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
					  int code=sathish.nextInt();
					  if(code==01) {
						  System.out.println("Enter card");
						  int cd=sathish.nextInt();
						  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
						  System.out.println("Enter pin ");
						  int pin=sathish.nextInt();
						  if(pin<=9999) {
							  System.out.println("Enter the Amount to be Pay: ");
							  int Amnt=sathish.nextInt();
							  if(Amnt==clss_Amt) {
								  String Res="Reserved";
								  System.out.println("Amount Paid Succesfully");
								  System.out.println("Slot Reserved Successfully");
								  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 12635 - VAIGAI SUPERFAST EXPRESS"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
										  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
								  System.out.println("Arival_Time: 18.41");
								  System.out.println("Departure_Time: 19.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
								  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
								  Connection con=DriverManager.getConnection(Server, User, Password);
								  PreparedStatement post= con.prepareStatement(querry);
								  post.setInt(1, slot);
								  post.setString(2, Name);
								  post.setString(3, Num);
								  post.setString(4, Email);
								  post.setString(5, DeparturePlace);
								  post.setString(6, boardto);
								  String ref="12635 - VAIGAI SUPERFST";
								  post.setString(7, ref);
								  post.setString(8, "AC-Seater");
								  post.setString(9, Board);
								  post.setDouble(10, 18.41);
								  post.setDouble(11, 19.01);
								  post.setInt(12, Amnt);
								  String status="Reserved";
								  post.setString(13, status);
								  int rows = post.executeUpdate();
//								  rows = post.executeUpdate();
								  System.out.println("No of rows affected = "+ ""+rows);
								  con.close();
							  }else {
								  System.out.print(" Amount Not Satisfied Try Again !! ");
							  }
						  }else {
							  System.out.println("Invalid Pin Number !! ");
						  }
					  }else {
						  System.out.println("Invalid Process Code");
					  }
				  
				  
			  }else if(cls==2) {
				  int clss_Amt =4100;
				  System.out.println("Enter The Number of Tickets:");
				  int tickets=sathish.nextInt();
				  clss_Amt=clss_Amt*tickets;
//				  for(int i=1;i<tickets;i++) {
//					  clss_Amt+=3700;
//					  break;
//				  }
				  System.out.println("No of Tickets : "+tickets);
				  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
				  int code=sathish.nextInt();
				  if(code==01) {
					  System.out.println("Enter card");
					  int cd=sathish.nextInt();
					  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
					  System.out.println("Enter pin ");
					  int pin=sathish.nextInt();
					  if(pin<=9999) {
						  System.out.println("Enter the Amount to be Pay: ");
						  int Amnt=sathish.nextInt();
						  if(Amnt==clss_Amt) {
							  String Res="Reserved";
							  System.out.println("Amount Paid Succesfully");
							  System.out.println("Slot Reserved Successfully");
							  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 12635 - VAIGAI SUPERFAST EXPRESS"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
									  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
							  System.out.println("Arival_Time: 18.41");
							  System.out.println("Departure_Time: 19.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
							  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
							  Connection con=DriverManager.getConnection(Server, User, Password);
							  PreparedStatement post= con.prepareStatement(querry);
							  post.setInt(1, slot);
							  post.setString(2, Name);
							  post.setString(3, Num);
							  post.setString(4, Email);
							  post.setString(5, DeparturePlace);
							  post.setString(6, boardto);
							  String ref="12635 - VAIGAI SUPERFST";
							  post.setString(7, ref);
							  post.setString(8, "AC_Sleaper");
							  post.setString(9, Board);
							  post.setDouble(10, 18.41);
							  post.setDouble(11, 19.01);
							  post.setInt(12, Amnt);
							  String status="Reserved";
							  post.setString(13, status);
							  int rows = post.executeUpdate();
//							  rows = post.executeUpdate();
							  System.out.println("No of rows affected = "+ ""+rows);
							  con.close();
						
						  }else {
							  System.out.print(" Amount Not Satisfied Try Again !! ");
						  }
					  }else {
						  System.out.println("Invalid Pin Number !! ");
					  }
				  }else {
					  System.out.println("Invalid Process Code");
				  }
//			  System.out.println("22671 - TEJAS EXPRESS");
//			  System.out.println("Arival_Time: 23.41");
//			  System.out.println("Departure_Time: 24.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
			  
		  }
		  
		  
	  }
		  }else if(Train==22623){
			  System.out.print("Enter Your Boarding Point (EgmoreJunction , TambaramJunction , ChengalpattuJunction, VillupuramJunction , CuddaloreJunction , MaduraiJunction)");
			  String Board=sathish.next();
			  System.out.println("TranZI Says Your Request Updated Successfully ");
			  System.out.println("Payment Process Started !! ");
			  int nume=sathish.nextInt();
			  if(nume<100) {
				  System.out.println("22623 - MS-MDU");
				  System.out.println("Enter :0 -Class Ordinary : 1500"+"\n"+"Enter : 1 -Class AC Seater : 2300"+"\n"+"Enter :2 -Class AC SLeaper : 3700");
				  int cls=sathish.nextInt();
				  if(cls==0) {
					  int clss_Amt =1500;
					  System.out.println("Enter The Number of Tickets:");
					  int tickets=sathish.nextInt();
					  clss_Amt=clss_Amt*tickets;
//					  for(int i=1;i<tickets;i++) {
//						  clss_Amt+=1500;
//						  break;
//					  }
					  System.out.println("No of Tickets : "+tickets);
					  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
					  int code=sathish.nextInt();
					  if(code==01) {
						  System.out.println("Enter card");
						  int cd=sathish.nextInt();
						  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
						  System.out.println("Enter pin ");
						  int pin=sathish.nextInt();
						  if(pin<=9999) {
							  System.out.println("Enter the Amount to be Pay: ");
							  int Amnt=sathish.nextInt();
							  if(Amnt==clss_Amt) {
								  String Res="Reserved";
								  System.out.println("Amount Paid Succesfully");
								  System.out.println("Slot Reserved Successfully");
								  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 22623 - MS-MDU EXP"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
										  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
								  System.out.println("Arival_Time: 11.41");
								  System.out.println("Departure_Time: 12.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
								  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
								  Connection con=DriverManager.getConnection(Server, User, Password);
								  PreparedStatement post= con.prepareStatement(querry);
								  post.setInt(1, slot);
								  post.setString(2, Name);
								  post.setString(3, Num);
								  post.setString(4, Email);
								  post.setString(5, DeparturePlace);
								  post.setString(6, boardto);
								  String ref="22623 - MS-MDU EXP";
								  post.setString(7, ref);
								  post.setString(8, "Ordinary");
								  post.setString(9, Board);
								  post.setDouble(10, 11.41);
								  post.setDouble(11, 12.01);
								  post.setInt(12, Amnt);
								  String status="Reserved";
								  post.setString(13, status);
								  int rows = post.executeUpdate();
//								  rows = post.executeUpdate();
								  System.out.println("No of rows affected = "+ ""+rows);
								  con.close();
							  }else {
								  System.out.print(" Amount Not Satisfied Try Again !! ");
							  }
						  }else {
							  System.out.println("Invalid Pin Number !! ");
						  }
					  }else {
						  System.out.println("Invalid Process Code");
					  }
					 
				
				  }else if(cls==1) {
					  int clss_Amt =2300;
					  System.out.println("Enter The Number of Tickets:");
					  int tickets=sathish.nextInt();
					  clss_Amt=clss_Amt*tickets;
//					  for(int i=1;i<tickets;i++) {
//						  clss_Amt+=2300;
//						  break;
//					  }
					  System.out.println("No of Tickets : "+tickets);
					  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
					  int code=sathish.nextInt();
					  if(code==01) {
						  System.out.println("Enter card");
						  int cd=sathish.nextInt();
						  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
						  System.out.println("Enter pin ");
						  int pin=sathish.nextInt();
						  if(pin<=9999) {
							  System.out.println("Enter the Amount to be Pay: ");
							  int Amnt=sathish.nextInt();
							  if(Amnt==clss_Amt) {
								  String Res="Reserved";
								  System.out.println("Amount Paid Succesfully");
								  System.out.println("Slot Reserved Successfully");
								  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 22623 - MS-MDU"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
										  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
								  System.out.println("Arival_Time: 11.41");
								  System.out.println("Departure_Time: 12.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
								  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
								  Connection con=DriverManager.getConnection(Server, User, Password);
								  PreparedStatement post= con.prepareStatement(querry);
								  post.setInt(1, slot);
								  post.setString(2, Name);
								  post.setString(3, Num);
								  post.setString(4, Email);
								  post.setString(5, DeparturePlace);
								  post.setString(6, boardto);
								  String ref="22623 - MS-MDU EXP";
								  post.setString(7, ref);
								  post.setString(8, "AC-Seater");
								  post.setString(9, Board);
								  post.setDouble(10, 11.41);
								  post.setDouble(11, 12.01);
								  post.setInt(12, Amnt);
								  String status="Reserved";
								  post.setString(13, status);
								  int rows = post.executeUpdate();
//								  rows = post.executeUpdate();
								  System.out.println("No of rows affected = "+ ""+rows);
								  con.close();
							  }else {
								  System.out.print(" Amount Not Satisfied Try Again !! ");
							  }
						  }else {
							  System.out.println("Invalid Pin Number !! ");
						  }
					  }else {
						  System.out.println("Invalid Process Code");
					  }
				  
				  
			  }else if(cls==2) {
				  int clss_Amt =3700;
				  System.out.println("Enter The Number of Tickets:");
				  int tickets=sathish.nextInt();
				  clss_Amt=clss_Amt*tickets;
//				  for(int i=1;i<tickets;i++) {
//					  clss_Amt+=3700;
//					  break;
//				  }
				  System.out.println("No of Tickets : "+tickets);
				  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
				  int code=sathish.nextInt();
				  if(code==01) {
					  System.out.println("Enter card");
					  int cd=sathish.nextInt();
					  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
					  System.out.println("Enter pin ");
					  int pin=sathish.nextInt();
					  if(pin<=9999) {
						  System.out.println("Enter the Amount to be Pay: ");
						  int Amnt=sathish.nextInt();
						  if(Amnt==clss_Amt) {
							  String Res="Reserved";
							  System.out.println("Amount Paid Succesfully");
							  System.out.println("Slot Reserved Successfully");
							  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 22623 - MS-MDU EXPRESS"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
									  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
							  System.out.println("Arival_Time: 11.41");
							  System.out.println("Departure_Time: 12.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
							  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
							  Connection con=DriverManager.getConnection(Server, User, Password);
							  PreparedStatement post= con.prepareStatement(querry);
							  post.setInt(1, slot);
							  post.setString(2, Name);
							  post.setString(3, Num);
							  post.setString(4, Email);
							  post.setString(5, DeparturePlace);
							  post.setString(6, boardto);
							  String ref="22623 - MS-MDU EXP";
							  post.setString(7, ref);
							  post.setString(8, "AC_Sleaper");
							  post.setString(9, Board);
							  post.setDouble(10, 11.41);
							  post.setDouble(11, 12.01);
							  post.setInt(12, Amnt);
							  String status="Reserved";
							  post.setString(13, status);
							  int rows = post.executeUpdate();
//							  rows = post.executeUpdate();
							  System.out.println("No of rows affected = "+ ""+rows);
							  con.close();
						
						  }else {
							  System.out.print(" Amount Not Satisfied Try Again !! ");
						  }
					  }else {
						  System.out.println("Invalid Pin Number !! ");
					  }
				  }else {
					  System.out.println("Invalid Process Code");
				  }
//			  System.out.println("22671 - TEJAS EXPRESS");
//			  System.out.println("Arival_Time: 23.41");
//			  System.out.println("Departure_Time: 24.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
			  
		  }
		  
		  
	  }
		  }else if(Train==16191){
			  System.out.print("Enter Your Boarding Point (EgmoreJunction , TambaramJunction , ChengalpattuJunction, VillupuramJunction , CuddaloreJunction , MaduraiJunction)");
			  String Board=sathish.next();
			  System.out.println("TranZI Says Your Request Updated Successfully ");
			  System.out.println("Payment Process Started !! ");
			  int nume=sathish.nextInt();
			  if(nume<100) {
				  System.out.println("16191 - NCJ-ANTYODAYA EXPRESS");
				  System.out.println("Enter :0 -Class Ordinary : 2500"+"\n"+"Enter : 1 -Class AC Seater : 3000"+"\n"+"Enter :2 -Class AC SLeaper : 4100");
				  int cls=sathish.nextInt();
				  if(cls==0) {
					  int clss_Amt =1500;
					  System.out.println("Enter The Number of Tickets:");
					  int tickets=sathish.nextInt();
					  clss_Amt=clss_Amt*tickets;
//					  for(int i=1;i<tickets;i++) {
//						  clss_Amt+=1500;
//						  break;
//					  }
					  System.out.println("No of Tickets : "+tickets);
					  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
					  int code=sathish.nextInt();
					  if(code==01) {
						  System.out.println("Enter card");
						  int cd=sathish.nextInt();
						  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
						  System.out.println("Enter pin ");
						  int pin=sathish.nextInt();
						  if(pin<=9999) {
							  System.out.println("Enter the Amount to be Pay: ");
							  int Amnt=sathish.nextInt();
							  if(Amnt==clss_Amt) {
								  String Res="Reserved";
								  System.out.println("Amount Paid Succesfully");
								  System.out.println("Slot Reserved Successfully");
								  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 16191 - NCJ-ANTYODAYA EXPRESS"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
										  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
								  System.out.println("Arival_Time: 1.41");
								  System.out.println("Departure_Time: 2.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
								  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
								  Connection con=DriverManager.getConnection(Server, User, Password);
								  PreparedStatement post= con.prepareStatement(querry);
								  post.setInt(1, slot);
								  post.setString(2, Name);
								  post.setString(3, Num);
								  post.setString(4, Email);
								  post.setString(5, DeparturePlace);
								  post.setString(6, boardto);
								  String ref="16191 - NCJ-ANTYODAYA EXPRESS";
								  post.setString(7, ref);
								  post.setString(8, "Ordinary");
								  post.setString(9, Board);
								  post.setDouble(10, 1.41);
								  post.setDouble(11, 2.01);
								  post.setInt(12, Amnt);
								  String status="Reserved";
								  post.setString(13, status);
								  int rows = post.executeUpdate();
//								  rows = post.executeUpdate();
								  System.out.println("No of rows affected = "+ ""+rows);
								  con.close();
							  }else {
								  System.out.print(" Amount Not Satisfied Try Again !! ");
							  }
						  }else {
							  System.out.println("Invalid Pin Number !! ");
						  }
					  }else {
						  System.out.println("Invalid Process Code");
					  }
					 
				
				  }else if(cls==1) {
					  int clss_Amt =3000;
					  System.out.println("Enter The Number of Tickets:");
					  int tickets=sathish.nextInt();
					  clss_Amt=clss_Amt*tickets;
//					  for(int i=1;i<tickets;i++) {
//						  clss_Amt+=2300;
//						  break;
//					  }
					  System.out.println("No of Tickets : "+tickets);
					  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
					  int code=sathish.nextInt();
					  if(code==01) {
						  System.out.println("Enter card");
						  int cd=sathish.nextInt();
						  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
						  System.out.println("Enter pin ");
						  int pin=sathish.nextInt();
						  if(pin<=9999) {
							  System.out.println("Enter the Amount to be Pay: ");
							  int Amnt=sathish.nextInt();
							  if(Amnt==clss_Amt) {
								  String Res="Reserved";
								  System.out.println("Amount Paid Succesfully");
								  System.out.println("Slot Reserved Successfully");
								  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 16191 - NCJ-ANTYODAYA EXPRESS"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
										  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
								  System.out.println("Arival_Time: 1.41");
								  System.out.println("Departure_Time: 2.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
								  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
								  Connection con=DriverManager.getConnection(Server, User, Password);
								  PreparedStatement post= con.prepareStatement(querry);
								  post.setInt(1, slot);
								  post.setString(2, Name);
								  post.setString(3, Num);
								  post.setString(4, Email);
								  post.setString(5, DeparturePlace);
								  post.setString(6, boardto);
								  String ref="16191 - ANTYODAYA EXPRESS";
								  post.setString(7, ref);
								  post.setString(8, "AC-Seater");
								  post.setString(9, Board);
								  post.setDouble(10, 1.41);
								  post.setDouble(11, 2.01);
								  post.setInt(12, Amnt);
								  String status="Reserved";
								  post.setString(13, status);
								  int rows = post.executeUpdate();
//								  rows = post.executeUpdate();
								  System.out.println("No of rows affected = "+ ""+rows);
								  con.close();
							  }else {
								  System.out.print(" Amount Not Satisfied Try Again !! ");
							  }
						  }else {
							  System.out.println("Invalid Pin Number !! ");
						  }
					  }else {
						  System.out.println("Invalid Process Code");
					  }
				  
				  
			  }else if(cls==2) {
				  int clss_Amt =4100;
				  System.out.println("Enter The Number of Tickets:");
				  int tickets=sathish.nextInt();
				  clss_Amt=clss_Amt*tickets;
//				  for(int i=1;i<tickets;i++) {
//					  clss_Amt+=3700;
//					  break;
//				  }
				  System.out.println("No of Tickets : "+tickets);
				  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
				  int code=sathish.nextInt();
				  if(code==01) {
					  System.out.println("Enter card");
					  int cd=sathish.nextInt();
					  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
					  System.out.println("Enter pin ");
					  int pin=sathish.nextInt();
					  if(pin<=9999) {
						  System.out.println("Enter the Amount to be Pay: ");
						  int Amnt=sathish.nextInt();
						  if(Amnt==clss_Amt) {
							  String Res="Reserved";
							  System.out.println("Amount Paid Succesfully");
							  System.out.println("Slot Reserved Successfully");
							  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 16191 - NCJ-ANTYODAYA EXPRESS"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
									  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
							  System.out.println("Arival_Time: 1.41");
							  System.out.println("Departure_Time: 2.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
							  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
							  Connection con=DriverManager.getConnection(Server, User, Password);
							  PreparedStatement post= con.prepareStatement(querry);
							  post.setInt(1, slot);
							  post.setString(2, Name);
							  post.setString(3, Num);
							  post.setString(4, Email);
							  post.setString(5, DeparturePlace);
							  post.setString(6, boardto);
							  String ref="16191 - NCJ-ANTYODAYA EXPRESS";
							  post.setString(7, ref);
							  post.setString(8, "AC_Sleaper");
							  post.setString(9, Board);
							  post.setDouble(10, 1.41);
							  post.setDouble(11, 2.01);
							  post.setInt(12, Amnt);
							  String status="Reserved";
							  post.setString(13, status);
							  int rows = post.executeUpdate();
//							  rows = post.executeUpdate();
							  System.out.println("No of rows affected = "+ ""+rows);
							  con.close();
						
						  }else {
							  System.out.print(" Amount Not Satisfied Try Again !! ");
						  }
					  }else {
						  System.out.println("Invalid Pin Number !! ");
					  }
				  }else {
					  System.out.println("Invalid Process Code");
				  }
//			  System.out.println("22671 - TEJAS EXPRESS");
//			  System.out.println("Arival_Time: 23.41");
//			  System.out.println("Departure_Time: 24.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
			  
		  }
		  
		  
	  }
		  }else if(Train==12631){
			  System.out.print("Enter Your Boarding Point (EgmoreJunction , TambaramJunction , ChengalpattuJunction, VillupuramJunction , CuddaloreJunction , MaduraiJunction)");
			  String Board=sathish.next();
			  System.out.println("TranZI Says Your Request Updated Successfully ");
			  System.out.println("Payment Process Started !! ");
			  int nume=sathish.nextInt();
			  if(nume<100) {
				  System.out.println("12631 - NELLAI SUPERFAST EXP");
				  System.out.println("Enter :0 -Class Ordinary : 1500"+"\n"+"Enter : 1 -Class AC Seater : 2300"+"\n"+"Enter :2 -Class AC SLeaper : 3700");
				  int cls=sathish.nextInt();
				  if(cls==0) {
					  int clss_Amt =1500;
					  System.out.println("Enter The Number of Tickets:");
					  int tickets=sathish.nextInt();
					  clss_Amt=clss_Amt*tickets;
//					  for(int i=1;i<tickets;i++) {
//						  clss_Amt+=1500;
//						  break;
//					  }
					  System.out.println("No of Tickets : "+tickets);
					  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
					  int code=sathish.nextInt();
					  if(code==01) {
						  System.out.println("Enter card");
						  int cd=sathish.nextInt();
						  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
						  System.out.println("Enter pin ");
						  int pin=sathish.nextInt();
						  if(pin<=9999) {
							  System.out.println("Enter the Amount to be Pay: ");
							  int Amnt=sathish.nextInt();
							  if(Amnt==clss_Amt) {
								  String Res="Reserved";
								  System.out.println("Amount Paid Succesfully");
								  System.out.println("Slot Reserved Successfully");
								  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 12631 - NELLAI SUPERFAST EXP"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
										  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
								  System.out.println("Arival_Time: 17.41");
								  System.out.println("Departure_Time: 18.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
								  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
								  Connection con=DriverManager.getConnection(Server, User, Password);
								  PreparedStatement post= con.prepareStatement(querry);
								  post.setInt(1, slot);
								  post.setString(2, Name);
								  post.setString(3, Num);
								  post.setString(4, Email);
								  post.setString(5, DeparturePlace);
								  post.setString(6, boardto);
								  String ref="12631 - NELLAI SUPERFAST EXP";
								  post.setString(7, ref);
								  post.setString(8, "Ordinary");
								  post.setString(9, Board);
								  post.setDouble(10, 17.41);
								  post.setDouble(11, 18.01);
								  post.setInt(12, Amnt);
								  String status="Reserved";
								  post.setString(13, status);
								  int rows = post.executeUpdate();
//								  rows = post.executeUpdate();
								  System.out.println("No of rows affected = "+ ""+rows);
								  con.close();
							  }else {
								  System.out.print(" Amount Not Satisfied Try Again !! ");
							  }
						  }else {
							  System.out.println("Invalid Pin Number !! ");
						  }
					  }else {
						  System.out.println("Invalid Process Code");
					  }
					 
				
				  }else if(cls==1) {
					  int clss_Amt =2300;
					  System.out.println("Enter The Number of Tickets:");
					  int tickets=sathish.nextInt();
					  clss_Amt=clss_Amt*tickets;
//					  for(int i=1;i<tickets;i++) {
//						  clss_Amt+=2300;
//						  break;
//					  }
					  System.out.println("No of Tickets : "+tickets);
					  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
					  int code=sathish.nextInt();
					  if(code==01) {
						  System.out.println("Enter card");
						  int cd=sathish.nextInt();
						  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
						  System.out.println("Enter pin ");
						  int pin=sathish.nextInt();
						  if(pin<=9999) {
							  System.out.println("Enter the Amount to be Pay: ");
							  int Amnt=sathish.nextInt();
							  if(Amnt==clss_Amt) {
								  String Res="Reserved";
								  System.out.println("Amount Paid Succesfully");
								  System.out.println("Slot Reserved Successfully");
								  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 12631 - NELLAI SUPERFAST EXP"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
										  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
								  System.out.println("Arival_Time: 17.41");
								  System.out.println("Departure_Time: 18.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
								  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
								  Connection con=DriverManager.getConnection(Server, User, Password);
								  PreparedStatement post= con.prepareStatement(querry);
								  post.setInt(1, slot);
								  post.setString(2, Name);
								  post.setString(3, Num);
								  post.setString(4, Email);
								  post.setString(5, DeparturePlace);
								  post.setString(6, boardto);
								  String ref="12631 - NELLAI SUPERFAST EXP";
								  post.setString(7, ref);
								  post.setString(8, "AC-Seater");
								  post.setString(9, Board);
								  post.setDouble(10, 17.41);
								  post.setDouble(11, 18.01);
								  post.setInt(12, Amnt);
								  String status="Reserved";
								  post.setString(13, status);
								  int rows = post.executeUpdate();
//								  rows = post.executeUpdate();
								  System.out.println("No of rows affected = "+ ""+rows);
								  con.close();
							  }else {
								  System.out.print(" Amount Not Satisfied Try Again !! ");
							  }
						  }else {
							  System.out.println("Invalid Pin Number !! ");
						  }
					  }else {
						  System.out.println("Invalid Process Code");
					  }
				  
				  
			  }else if(cls==2) {
				  int clss_Amt =3700;
				  System.out.println("Enter The Number of Tickets:");
				  int tickets=sathish.nextInt();
				  clss_Amt=clss_Amt*tickets;
//				  for(int i=1;i<tickets;i++) {
//					  clss_Amt+=3700;
//					  break;
//				  }
				  System.out.println("No of Tickets : "+tickets);
				  System.out.print("Total Amount : "+clss_Amt+"\n"+"Proceed to Pay Enter 01");
				  int code=sathish.nextInt();
				  if(code==01) {
					  System.out.println("Enter card");
					  int cd=sathish.nextInt();
					  System.out.println("Card Inserted Successfully"+"\n"+"Card Holder Name : "+""+Name);
					  System.out.println("Enter pin ");
					  int pin=sathish.nextInt();
					  if(pin<=9999) {
						  System.out.println("Enter the Amount to be Pay: ");
						  int Amnt=sathish.nextInt();
						  if(Amnt==clss_Amt) {
							  String Res="Reserved";
							  System.out.println("Amount Paid Succesfully");
							  System.out.println("Slot Reserved Successfully");
							  System.out.println("Collect Your Receipt :"+"\n"+" TRAIN : 12631 - NELLAI SUPERFST EXP"+"\n"+"NAME: "+Name+"\n"+"Mobile: "+Num+"\n"+"E_MAIL :"+Email
									  +"\n"+"Tickets :"+""+tickets+"\n"+"Amount Paid : "+""+Amnt+"\n"+"Status: "+""+Res);
							  System.out.println("Arival_Time: 17.41");
							  System.out.println("Departure_Time: 18.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
							  System.out.println("From" + ""+ Board +""+ "To"+""+boardto);
							  Connection con=DriverManager.getConnection(Server, User, Password);
							  PreparedStatement post= con.prepareStatement(querry);
							  post.setInt(1, slot);
							  post.setString(2, Name);
							  post.setString(3, Num);
							  post.setString(4, Email);
							  post.setString(5, DeparturePlace);
							  post.setString(6, boardto);
							  String ref="12631 - NELLAI SUPERFAST EXP";
							  post.setString(7, ref);
							  post.setString(8, "AC_Sleaper");
							  post.setString(9, Board);
							  post.setDouble(10, 17.41);
							  post.setDouble(11, 18.01);
							  post.setInt(12, Amnt);
							  String status="Reserved";
							  post.setString(13, status);
							  int rows = post.executeUpdate();
//							  rows = post.executeUpdate();
							  System.out.println("No of rows affected = "+ ""+rows);
							  con.close();
						
						  }else {
							  System.out.print(" Amount Not Satisfied Try Again !! ");
						  }
					  }else {
						  System.out.println("Invalid Pin Number !! ");
					  }
				  }else {
					  System.out.println("Invalid Process Code");
				  }
//			  System.out.println("22671 - TEJAS EXPRESS");
//			  System.out.println("Arival_Time: 23.41");
//			  System.out.println("Departure_Time: 24.00"+"\n"+""+"Your Boarding Point : " +" "+ Board);
			  
		  }
		  
		  
	  }
		  }
  }
  public static void delete() throws SQLException {
	  String Server="jdbc:mysql://@localhost:3306/sk2002";
	  String User="root";
	  String Password="root123";
	  Scanner sathish=new Scanner(System.in);
	  int slot=sathish.nextInt();
	  String querry="Delete from Stack1 where Slot_No = " +slot;
        
		Connection con= DriverManager.getConnection(Server, User, Password);
		Statement state=con.createStatement();
		int rows =state.executeUpdate(querry);
		System.out.println(rows+""+"Rows Affected");
		System.out.println("Your Reservation has Cancelled Successfully");
  }
}

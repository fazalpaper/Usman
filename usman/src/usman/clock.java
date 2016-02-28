package usman;
import java.awt.*;
import java.applet.*;
import java.applet.*;
import java.awt.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class clock extends Applet implements Runnable{
	
	
	public clock() {
		
		
	
	}
   Thread t,t1;
   String minute;
   String second;
   
   
   public void start(){
      t = new Thread(this);
      t.start();
     
   }
   
  
   
   
   @SuppressWarnings("static-access")
public void run(){
	   
	   
      t1 = Thread.currentThread();
      while(t1 == t){
         repaint();
         try{
            t1.sleep(1000);    
         //   System.out.print("");
            
            if(minute .equals("29")  && second .equals("5") )
            {
            	aziz();
            }
            
            
            
            
         }
         catch(InterruptedException e){}
      }
      
      
      
   }
   public void paint(Graphics g){
      Calendar cal = new GregorianCalendar();
      String hour = String.valueOf(cal.get(Calendar.HOUR));
     String minute  = String.valueOf(cal.get(Calendar.MINUTE));
      String second = String.valueOf(cal.get(Calendar.SECOND));
      g.drawString(hour + ":" + minute + ":" + second, 20, 30);
   }
   
   
   public void aziz(){
	   
	   
	   String dbacc = "pharmacy";
		String dbu = "pharmacy";
		String dbpas = "fazaldin";
		
		DateFormat mm = new SimpleDateFormat("dd-MMM-yy-hh-mm");	// 
	    Date dateobj = new Date();
	    String mmm = mm.format(dateobj).toUpperCase();
	 
  
	    Runtime rt = Runtime.getRuntime();
		
		try {
			  
			   //    rt.exec(new String[]{"cmd.exe","/c","C:\\Program Files"});

			 	rt.exec("cmd.exe /c start expdp "+dbu+"/"+dbpas+"  schemas="+dbacc+" directory=TEST_DIR dumpfile="+mmm+".dmp logfile="+mmm+".log version=10.2.0 ");
			 	
			 	
			//   rt.exec("cmd.exe /c start impdp "+a+"/"+b+"  schemas=pharmacy directory=TEST_DIR dumpfile=14-JUL-15-03-50.dmp logfile=14-JUL-15-03-50.log table_exists_action=replace ");
		    	
		    } catch (IOException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
	   

	   
   }
   
}
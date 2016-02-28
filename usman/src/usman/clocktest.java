package usman;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class clocktest implements Runnable {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		int a=0;

		  
		
        while (a < 11) {
           
        	try {
        	    Thread.sleep(3000);  
        	   
        	   aziz();
        	    
        	} catch(InterruptedException ex) {
        	    Thread.currentThread().interrupt();
        	}

        	
       //     count++;
        }
		
     
	}
	
	
	 private static void aziz(){
		   
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

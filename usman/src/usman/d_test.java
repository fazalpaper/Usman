package usman;

public class d_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String date = "28 May  , 2014";
		
		String aa = date.replace(",", "-");
		
		
		String[] dd = aa.split("(?!^)");
		
		 StringBuffer result = new StringBuffer();
		int w = 0;
		for(int a = 0;a< dd.length; a++)
		{
			
			if(dd[a].equals(" "))
			{ dd[a]="-";
			}
			else{if(dd[a].equals("-"))
					{
				dd[a]=" ";
					}		
			}
			
			result.append( dd[a]);
		w++; 
		}
		
		System.out.println(result);
		 
		
		
	}

}

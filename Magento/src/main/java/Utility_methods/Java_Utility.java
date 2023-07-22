package Utility_methods;

import java.util.Date;
import java.util.Random;

public class Java_Utility {
	
	 public int getRandom()
	 {
		Random r=new Random();
		int num=r.nextInt(10000);
		return num;
	 }
	 
	 public Date getDate() 
	 {
		 Date da=new Date();
		 return da;
	 }

}

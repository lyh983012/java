package problem2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Serial {
	
	static public void main(String args[]) throws IOException {
		FileOutputStream out = new FileOutputStream("theTime");                    
		ObjectOutputStream s =  new ObjectOutputStream(out);
		s.writeObject("Today");
		s.writeObject(new Date());
		s.flush();
		//具体程序exp4的test mian1中
	}
	

}

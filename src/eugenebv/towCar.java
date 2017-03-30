package eugenebv;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.io.IOException;

import com.sun.jna.Native;



public class towCar {
	
	public static void down() throws AWTException
	{
		//b = 1;
		Robot robot = new Robot();

	
		
		robot.keyPress(KeyEvent.VK_DOWN);
    	robot.keyRelease(KeyEvent.VK_DOWN);		

	}
	
	public static void repeat(int b) throws AWTException
	{
		for (int i = 1; i<=b; i++)
		{
			down();
		}
	}

	
	
	private static final int SW_RESTORE = 9;
	public static void main(String[] args) throws IOException, InterruptedException
	{
        }
        
        public static void towCAR2(){
		User32 user32 = (User32) Native.loadLibrary("User32.dll", User32.class);
        int window = user32.FindWindowA(null, "GTA:SA:MP");
        boolean success = user32.ShowWindow(window, SW_RESTORE);
        if (success) {
            System.out.println("Success");
            towcar();
        } else {
            System.out.println("Fail: " + Native.getLastError() + "\nGTA:SA:MP NOT FOUND");
        }
	}
		
		
        public static void towcar()
        {
        //do the stuff
		try {
	        Robot robot = new Robot();
	        

	        for (int i = 0; i<=10; i++)	 
	        {
	        	robot.keyPress(KeyEvent.VK_T);
		        robot.keyRelease(KeyEvent.VK_T);
		        robot.keyPress(KeyEvent.VK_SLASH);
		        robot.keyRelease(KeyEvent.VK_SLASH);
		        robot.keyPress(KeyEvent.VK_T);
		        robot.keyRelease(KeyEvent.VK_T);
		        robot.keyPress(KeyEvent.VK_O);
		        robot.keyRelease(KeyEvent.VK_O);
		        robot.keyPress(KeyEvent.VK_W);
		        robot.keyRelease(KeyEvent.VK_W);
		        robot.keyPress(KeyEvent.VK_C);
		        robot.keyRelease(KeyEvent.VK_C);
		        robot.keyPress(KeyEvent.VK_A);
		        robot.keyRelease(KeyEvent.VK_A);
		        robot.keyPress(KeyEvent.VK_R);
		        robot.keyRelease(KeyEvent.VK_R);
		        //robot.delay(200);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        robot.keyRelease(KeyEvent.VK_ENTER);
		        robot.delay(200);
		        if(i > 0)
		        {
		        repeat(i);
		        }
		        	robot.keyPress(KeyEvent.VK_ENTER);
		        	robot.keyRelease(KeyEvent.VK_ENTER);

		       
		        
		       
	        }

	} catch (AWTException e) {
	        e.printStackTrace();
	}
		
}
}
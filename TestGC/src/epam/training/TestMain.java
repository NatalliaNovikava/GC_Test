package epam.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestMain {
    private static final int OBJECT_SIZE = 40000;
    

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        
		List objectList = null;
		Random myRandom = new Random();
		
		while (true)
		{   
			objectList = new ArrayList();
			for (int i = 0; i < OBJECT_SIZE; i++)
			{
				objectList.add(myRandom.nextInt());
			}
			objectList = null;
		}	
	}

}

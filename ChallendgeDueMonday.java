
public class ChallendgeDueMonday {

	public static void main( String arg[]){
		
		boolean loops=true;
       //PATTERN 1
		//*
		//**
		//***
		//****
		//*****
		//Pattern1
		System.out.println("Pattern 1:");
		while (loops)
		{
			for(int i=1;i<=5;i++){
				 
	            for(int j=1;j<=i;j++){
	                if (j%2==0 || j%2!=0)
	                {
	                	System.out.print("*");
	                }
	            
	               
	            }
	            
	            System.out.println();
			}
			
			
		//Pattern2
			//     *
			  //  ***
			  // *****
			 // *******
			// *********
			System.out.println(" ");
			System.out.println("Pattern 2:");
		
			
			while (loops)
			{
				for(int i=1;i<=9;i+=2){
					 
		            for(int j=1;j<=i;j++){
		                if (j%2==0 || j%2!=0)
		                {
		                	System.out.print("*");
		                }
		            
		               
		            }
		            
		            System.out.println();
				}
			
			
		
		
		
		
		
		
		
		
		
	//PATTERN 3	
				System.out.println(" ");
			System.out.println("Pattern 3:");
        while (loops)
        {
		for(int i=1;i<=7;i+=2){
 
            for(int j=1;j<=i;j++)
            {
            	//System.out.print(j);
            	if (j%2==0)
            	{
            		System.out.print("A");
            	}
            	
            	if (j%2!=0)
            	{
            		System.out.print("*");
            	}
            	loops=false;
                
                
            }
            System.out.println();
		}
		
		
		
		
		
		
        }
  


	}

}
}
}

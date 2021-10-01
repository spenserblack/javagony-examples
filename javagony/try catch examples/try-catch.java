public class Main {
  public static void main(String[ ] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }


    try  
        {  
        int data=50/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  


    try  
        {  
        int data=50/0; //may throw exception   
        }  
             // handling the exception  
    catch(Exception e)  
        {  
                  // displaying the custom message  
            System.out.println("Can't divided by zero");  
        }  



       int d = 0;
       int n = 20;
  try {
       int fraction = n / d;
       System.out.println("This line will not be Executed");
  } 
  catch (ArithmeticException e) {
       System.out.println("In the catch Block due to Exception = " + e);
  }

  }
}
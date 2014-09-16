package test_proj;

public class Main
{
    public static void main(String[] args)
    {
        DemoData dd = new DemoData();
        
        displayGreeting();
        dd.display();
    }
    
    private static void displayGreeting()
    {
        System.out.println("HI...");
        System.out.println("******"); 
      
        
        System.out.println("test1");
        System.out.println("test2");
        System.out.println("test3");
      
        
        System.out.println("changes added via other developer");
        
        System.out.println("changes123...");
        System.out.println("changes456...");
    }
}

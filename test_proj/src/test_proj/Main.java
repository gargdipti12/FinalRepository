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
        System.out.println("Welcome here...");
    }
}

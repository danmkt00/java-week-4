package exceptions.examples;

public class Example2
{
    public static void main(String[] args)
    {
        try
        {
            String text = null;
            System.out.println(text.length()); // risky code
        }
        catch (NullPointerException e)
        {
            System.out.println("Caught a null pointer!");
        }
        finally
        {
            System.out.println("This block always runs.");
        }
    }
}

public class Demo{
  public static void main( String[] args)
  {
    int n = 5;
    if (args.length != 0)
    {
      try
      {
         n = Integer.parseInt(args[0]);
      }
      catch (NumberFormatException e)
      {
         n = 5;
      }
    }
    for (int i = 0; i < n; i ++)
    {
      for (int j = n - i; j > 0; j --)
      {
        System.out.print(i + 1);
      }
      System.out.println();
    }
  }
}

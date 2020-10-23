public class Demo{
public static void Pyramid(String[] args)
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

public static String arrtoString(int[] arr){
  String adder = "{";
  for (int i = 0; i < arr.length; i ++)
  {
    adder = adder + Integer.toString(arr[i]);
    if (i != arr.length - 1)
    {
       adder = adder + ", ";
    }
  }
  return adder + "}";
}
public static String arrayDeepToString(int[][] arr){
  String adderd = "{";
  for (int i = 0; i < arr.length; i ++)
  {
    adderd = adderd + arrtoString(arr[i]);
    if (i != arr.length - 1)
    {
      adderd = adderd + ", ";
    }
  }
  return adderd + "}";
}

public static int[][] create2DArray(int rows, int cols, int maxValue){
  int[][] thing = new int[rows][cols];
  for (int i = 0; i < rows ; i ++)
  {
    for (int j = 0; j < cols ; j ++)
    {
      thing[i][j] = (int)(Math.random() * maxValue);
    }
  }
  return thing;
}

public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
  int[] thenumbers = new int[rows];
  for (int i = 0; i < rows; i ++ )
  {
   thenumbers[i] = (int)(Math.random() * cols);
  }
  int[][] thing = new int[rows][];
  for (int i = 0; i < rows; i ++ )
  {
   thing[i] = new int[thenumbers[i]];
  }
  for (int i = 0; i < rows ; i ++)
  {
    for (int j = 0; j < thenumbers[i] ; j ++)
    {
      thing[i][j] = (int)(Math.random() * maxValue);
    }
  }
  return thing;
}

  public static void main( String[] args){
    int[] arr = {1, 2, 3};
    int[][] arr2 = { {4, 1, 3, 2}, {4, 0, 4, 0}, {4, 4, 3, 4}, {4, 3, 1, 2}, {0, 0, 0, 0} };
    System.out.println(arrtoString(arr));
    System.out.println(arrayDeepToString(arr2));
    System.out.println(arrayDeepToString(create2DArray( 4, 5 ,7)));
    System.out.println(arrayDeepToString(create2DArrayRandomized(4, 5 ,100)));


  }
}

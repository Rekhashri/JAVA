public class testMultiDArray {
  public static void main(String[] args) {

    int[] oneDarray = {12,38,66};
    System.out.println(oneDarray[1]);
                            //1          2     
    int[][] multiDarray = {{12,49,78},{22,33,4,55}};
    System.out.println(multiDarray[1][3]);

    double[][] doublearray = new double[4][2];//[4][] allowed  but [][2] not allowed
    doublearray[3][1]=9.9;
    System.out.println(doublearray[3][1]);

    for(int array=0;array<multiDarray.length; array++){
      for(int i=0; i<multiDarray[array].length;i++){
        System.out.println(multiDarray[array][i] + '\t');
      }
      System.out.println();
    }
  }
}

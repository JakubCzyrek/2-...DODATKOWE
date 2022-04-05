class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int szer1=5;
    int wys =4;
    for(int k=0;k<3;k++)
    {
    for(int i=1;i<=wys;i++)
    {
     for(int j=1;j<=szer1 - i;j++) {System.out.print(" ");}
     for(int a=0;a<i;a++) {System.out.print("*");}
      System.out.print("\n");
    }
   }
  }
}

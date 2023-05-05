import java.util.Scanner;                     
class Main {
  public static void main(String[] args){
    char[][] grid=new char[3][3];             //declaring matrix
     Main ob = new Main();
    grid[0][0]=' ';                           // default values
    grid[0][1]=' ';                             
    grid[0][2]=' ';
    grid[1][0]=' ';
    grid[1][1]=' ';
    grid[1][2]=' ';
    grid[2][0]=' ';
    grid[2][1]=' ';
    grid[2][2]=' ';
      System.out.println("Start the game");
       ob.display(grid);
    Scanner o = new Scanner(System.in);
    while(true){
    System.out.println("Enter your location player 1");
     int s1=o.nextInt();
    switch(s1){                      //entering 'X' by player 1
      case 1: grid[0][0] = 'X';break;
      case 2: grid[0][1] = 'X';break;
      case 3: grid[0][2] = 'X';break;
      case 4: grid[1][0] = 'X';break;
      case 5: grid[1][1] = 'X';break;
      case 6: grid[1][2] = 'X';break;
      case 7: grid[2][0] = 'X';break;
      case 8: grid[2][1] = 'X';break;
      case 9: grid[2][2] = 'X';}ob.display(grid);
    
       System.out.println("Enter your location player 2");
     int s2=o.nextInt();
    switch(s2){                         //entering 'O' by player 2
      case 1: grid[0][0] = 'O';break;
      case 2: grid[0][1] = 'O';break;
      case 3: grid[0][2] = 'O';break;
      case 4: grid[1][0] = 'O';break;
      case 5: grid[1][1] = 'O';break;
      case 6: grid[1][2] = 'O';break;
      case 7: grid[2][0] = 'O';break;
      case 8: grid[2][1] = 'O';break;
      case 9: grid[2][2] = 'O';}ob.display(grid);
    }
  }
  
  
  void display(char grid[][])
  {
    for(int i=0;i<3;i+=1)                    //display the game board
      {
        for(int j=0;j<2;j++)
           System.out.print(grid[i][j]+"|");
           System.out.println(grid[i][2]);
          if(i<2) 
          System.out.println("-----");
      }
  }

}

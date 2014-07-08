
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dragonslayer
 */

/**
* Stack A -> Source
* Stack B -> Destination 
* Stack C -> Spare
*/
public class Hanoi {
    
    static int disk;
    static int count=0;
    
    Hanoi(int x){
        disk = x;
    }
    
    private void TowersOfHanoi(int disk, char source, char destination, char spare){
        count++;
        if (disk == 1) {
// There is only one disk to be moved. Just move it.
        System.out.println("Move a disk from "+ source + " to " + destination);
        }
       else {
// Move all but one disk to the spare stack, then
// move the bottom disk, then put all the other
// disks on top of it.
        TowersOfHanoi(disk-1, source, spare, destination);
        System.out.println("Move a disk from "+ source + " to " + destination);

        TowersOfHanoi(disk-1, spare, destination, source);
            }
        
    }
        
  public static void main (String[] args){
    char source = 'A';
    char destination = 'B';
    char spare ='C';
      
      Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number of disks in A(source):");
        int x=ob.nextInt();
      Hanoi H = new Hanoi(x);
      H.TowersOfHanoi(disk, source, destination, spare);
      
      System.out.println("Number of steps = "+count);
  }  
  
}

import java. util. Scanner; 
import java.util.Random ; 
public class RandomWord
{   
public static void main(String[] args) {
  

int check=0,char1,char2;
  
int loop_count=0; 
  
String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
  
String random_word, guessWord; 
  
int randomIndex; 
  
int diff=0; 
  
Scanner in = new Scanner(System. in);
  
Random rand = new Random();
  
while (check == 0){
	 

       System.out.print("enter a word: ");
  
       guessWord=in.next().toUpperCase();
      
       random_word="";
      
       for(int i=0;i<guessWord.length();i++){
      
       randomIndex=rand.nextInt(26);
      
       random_word=random_word+alpha.charAt(randomIndex);
       }
      
       diff=0;
      
       for(int i=0;i<guessWord.length();i++){
      
       char1=(int)guessWord.charAt(i); 
       char2=(int)random_word.charAt(i);
      
       diff=diff+Math.abs(char1-char2); 
       }

//display
       System.out.println("the user’s word "+guessWord);
       System.out.println("the random string "+random_word);
       System.out.println("the difference score "+diff);
       System.out.println();
      
         
       loop_count++; //incremenr loop count variable
      
       if (diff==0){
       System.out.println("Correct word Guessed");
       System.out.println("No of loop required to make a match: "+loop_count);
       break;
       }
      
   }
}
}
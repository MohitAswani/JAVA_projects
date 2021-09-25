import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;


public class Main {

    public static void main(String[] args) {

        try {
            File file=new File("movies.txt");
            Scanner scanner=new Scanner(file);
            ArrayList<String> al=new ArrayList<>();
            while(scanner.hasNextLine())
            {
                String s=scanner.nextLine();
                al.add(s);
            }
            int index=(int)(Math.random()*al.size());
            char[] toGuess=al.get(index).toCharArray();
            char[] guess=new char[toGuess.length];
            for(int i=0;i<toGuess.length;i++)
                guess[i]=' ';
            System.out.print("YOU ARE GUESSIMG:");
            for(int i=0;i<toGuess.length;i++)
            {
                if(guess[i]==' ')
                {
                    System.out.print("_ ");
                }
                else
                    System.out.print(guess[i]+" ");
            }
            System.out.println();
            int tries=0;
            Scanner input=new Scanner(System.in);
            while(tries!=10)
            {
                if(Arrays.equals(toGuess,guess))
                {
                    System.out.println("YOU WIN!");
                    System.out.print("YOU CORRECTLY GUESSED!");
                    for(int i=0;i<toGuess.length;i++)
                    {
                        System.out.print(guess[i]);
                    }
                    System.out.println();
                    break;
                }
                System.out.println("YOU HAVE ENTERED "+tries+" WRONG LETTERS");
                System.out.print("ENTER YOUR GUESS:");
                char inp=input.next().charAt(0);
                boolean flg=false;
                for(int i=0;i<toGuess.length;i++) {
                    if (toGuess[i] == inp) {
                        guess[i] = inp;
                        flg = true;
                    }
                }
                if(!flg)
                {
                    tries++;
                }
                System.out.print("YOU ARE GUESSIMG:");
                for(int i=0;i<toGuess.length;i++)
                {
                    if(guess[i]==' ')
                    {
                        System.out.print("_ ");
                    }
                    else
                    System.out.print(guess[i]+" ");
                }
                System.out.println();

            }
            if(tries==10) {
                System.out.print("Sorry you lost the movie was:");
                for(int i=0;i<toGuess.length;i++)
                {
                    System.out.print(toGuess[i]);
                }
                System.out.println();
            }
        }
        catch (FileNotFoundException exception)
        {
            System.out.println("FILE MISSING");
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("INDEX OUT OF BOUNDS!");
        }
    }
}

package _packageOne;

public class UnlabelledContinueDemo
{
    public static void main(String[] args) {
        String myPhrase = "peter piper picked a " + "peck of pickled peppers";
        int max = myPhrase.length();
        int numPs=0;

        for(int i=0;i<max; i++){
            //Trying to find p characters in the phrase

            if (myPhrase.charAt(i) != 'p')
            continue; // unlabelled continue

            numPs++;
            }
        System.out.println("Found " + numPs + " ps in the string");
        }
    }


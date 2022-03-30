public class CheckPangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean result=PangramCheck(str);
        if (result == true)
        {
            System.out.println(str + " is a pangram");
        }
        else
        {
            System.out.print(str + " is not a pangram");
        }

    }

     public static boolean PangramCheck(String str)
    {

        boolean[] aplphabetList = new boolean[26];

        int index = 0;

        for (int i = 0; i < str.length(); i++) {

            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
            {
                index = str.charAt(i) - 'A';
            }

            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
            {
                index = str.charAt(i) - 'a';

            }
            else
            {
                continue;
            }
            aplphabetList[index] = true;
        }
        for (int i = 0; i <= 25; i++)
        {
            if (aplphabetList[i] == false)
            {
                return(false);
            }

        }

        // If all characters were present
        return (true);
    }
}

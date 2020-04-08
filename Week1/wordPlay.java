package Week1;

    public class wordPlay {

        public static boolean isVowel(char ch)
        {
            ch=Character.toUpperCase(ch);
            if ((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
                return true;
            else
                return false;
        }

        public static String replaceVowels(String phrase, char ch)
        {
            StringBuilder sb=new StringBuilder(phrase);
            for (int i=0;i<phrase.length();i++)
            {
                if (isVowel(sb.charAt(i)))
                {
                    sb.setCharAt(i,ch);
                }
            }
            return sb.toString();
        }

        public static String emphasize(String phrase, char ch)
        {
            StringBuilder sb=new StringBuilder(phrase);
            ch=Character.toUpperCase(ch);
            for (int i=0;i<phrase.length();i++)
            {
                char c = Character.toUpperCase(phrase.charAt(i));
                if (c==ch)
                    if (i % 2 == 0) {
                        sb.setCharAt(i, '*');
                    } else {
                        sb.setCharAt(i, '+');
                    }
            }
            return sb.toString();

        }

        public static void main(String args[])
        {
            wordPlay wp =new wordPlay();
            System.out.println( wp.isVowel('e'));
            System.out.println(wp.replaceVowels("hello world", 'a'));
            System.out.println(wp.emphasize("hello world", 'l'));
        }

    }
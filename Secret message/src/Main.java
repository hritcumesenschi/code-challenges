import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Main
{
    public static void main(String[] args)
    {
        File file = new File("/home/iasmina/IdeaProjects/Secret message/input");
        char c;
        try (FileReader fr = new FileReader(file))
        {
            int ok;
            while ((ok = fr.read()) != -1) {
                c = (char) ok;
                if(Character.isUpperCase(c))
                    if(c != 'X') System.out.print(c);
                    else System.out.print(' ');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
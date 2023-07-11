import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        File myFile = new File("/Users/yusufsahin/Projects/JavaWebTraining/Fileio01/src/dosya.txt");
        FileWriter writer = new FileWriter(myFile, true);

        try {

            writer.write("\nMerhaba Dünya,tekrar!");
        }catch (IOException e){
            throw  new RuntimeException(e);
        }finally {
            writer.close();
        }
        File myReadFile= new File("/Users/yusufsahin/Projects/JavaWebTraining/Fileio01/src/dosya.txt");
        FileReader fileReader= new FileReader(myReadFile);
        BufferedReader reader= new BufferedReader(fileReader);
        String line=null;
        try {
          while ((line=reader.readLine())!=null){
              System.out.println(line);
          }
        }catch (FileNotFoundException ex)
        {
            throw new RuntimeException(ex);
        }catch (IOException ex)
        {
            throw  new RuntimeException(ex);
        }
        finally {
            reader.close();
        }
    }
}
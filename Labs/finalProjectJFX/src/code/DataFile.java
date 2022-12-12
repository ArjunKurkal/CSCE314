package code;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
public class DataFile {
    public File dir;
    public File input;
    public DataFile(String dir, String input){
        this.dir = new File(dir);
        this.input = new File(input);
    }
    public ArrayList<String> loadDirectory(){
        if (!this.dir.exists()) return null;
        ArrayList<String > l = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(this.dir))){
            String line;
            while ((line = reader.readLine()) != null) l.add(line.strip());
        } catch(IOException e){
            e.printStackTrace();
        }
        return l;
    }
    public ArrayList<Integer> loadSampleInput(){
        if (!this.input.exists()) return null;
        ArrayList<Integer > l = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(this.input))){
            String line;
            while ((line = reader.readLine()) != null) l.add(Integer.parseInt(line.strip()));
        } catch(IOException e){
            e.printStackTrace();
        }
        return l;
    }
}

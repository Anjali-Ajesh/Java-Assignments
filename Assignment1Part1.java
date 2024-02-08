import java.io.*;

public class Assignment1Part1  {

    public void getData() throws IOException
    {
        System.out.println("Get data");
        BufferedReader bf=new BufferedReader(
                new InputStreamReader(System.in)
        )
                ;
        String str=bf.readLine();
        System.out.println("Data is"+
                Integer.parseInt(str));

    }
    public static void main(String[] args)
            throws IOException{

        Assignment1Part1 a= new Assignment1Part1();
        a.getData();
    }


}

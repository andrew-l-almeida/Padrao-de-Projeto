import java.util.Scanner;

public class Main{
    
    public static void main(final String[] args) {

        Player decoder = null;

        Scanner scan = new Scanner(System.in);
        System.out.print("Wich Player would you like to Play? MKV or Mp4?:");

        String Choice = scan.nextLine();

        if(Choice.indexOf("MKV") >= 0){
            decoder = new Mkv();
        }
        
        else if( Choice.indexOf("MP4") >= 0 ){
            decoder = new Mp4();
        }

        else{
            System.out.println("Error 404");
            scan.close();
            return;
        }

        decoder.playVideo();

        scan.close();

    }

}
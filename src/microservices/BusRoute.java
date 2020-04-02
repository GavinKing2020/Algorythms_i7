package microservices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BusRoute {

    public static void main(String[] args) {

//        int[] line = {3, 3 , 4, 2, 5, 6, 8, 4};
//        System.out.println(isRouteDirect(line, 3, 6));

        // Path path = Paths.get("temp.txt");
        // System.out.println(path);

        // File fname = args[0];

        File inFile = null;
        if (0 < args.length) {
            inFile = new File(args[0]);
        }
        System.out.println(inFile);
        System.out.println(inFile.getAbsolutePath());

//        BufferedReader br = new BufferedReader(new File(inFile));

//        String fname = args[0];
//        File file = File

//        f.getAbsolutePath()
//
//
//        if (fname.exists()) &&f.canWrite

    }

    public static boolean isRouteDirect (int[] line, int dep_sid, int arr_sid){

            boolean depSidExist = false;
            boolean arrSidExist = false;

            for (int i=1; i<line.length; i++){
                if (line[i] == dep_sid) depSidExist = true;
                if (line[i] == arr_sid) arrSidExist = true;
            }
            return (depSidExist && arrSidExist);
        }


}

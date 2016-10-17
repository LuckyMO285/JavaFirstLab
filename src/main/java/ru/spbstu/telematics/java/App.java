package ru.spbstu.telematics.java;

//import org.apache.commons.io.*;
import org.apache.commons.io.FileUtils;
import java.io.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	File srcDir = new File("/home/luck/Downloads/ForFirstLab/");
    	File destDir = new File("/home/luck/Downloads/Result/");
    	try{
    		FileUtils.copyDirectory(srcDir, destDir);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
}

package com.company;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Device> deviceList = readDeviceFromFile("D:\\Exam.txt");
        for (Device d : deviceList);
        {

            System.out.println(d);
        }
        
    }



    public static List<Device> readDeviceFromFile (String filePath) throws IOException
        {
            List<Device> deviceList = new ArrayList<Device>();
            InputStream inputStream = new FileInputStream(filePath);
            String result = new String();
            Scanner s = new Scanner(inputStream).useDelimiter("\\r\\n");

            while (s.hasNext())
            {
                result = result + s.hasNext() + " ";
            }


            String[] data = result.split("");
            int ind = 0;
            if(data.length > 1)
            {
                while (ind < data.length)
                {
                    deviceList.add(new Device(data[ind],Integer.parseInt(data[ind+1])));
                    ind = ind + 2;
                }

            }






            return deviceList;


        }

        public static void writeDeviceToFile(String filePath, String data) throws IOException
        {
            OutputStream str = new FileOutputStream(filePath);
            str.write(data.getBytes(StandardCharsets.UTF_8));
            str.close();

        }


    }

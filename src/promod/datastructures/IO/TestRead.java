package promod.datastructures.IO;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by pmanickam on 6/19/2018 at 2:27 PM
 */
public class TestRead {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://www.google.com");
        URLConnection urlConnection = url.openConnection();
        InputStream is = urlConnection.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while (br.readLine()!=null){

            System.out.println(br.readLine());
        }


        }

}

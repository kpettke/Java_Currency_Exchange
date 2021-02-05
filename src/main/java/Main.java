import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.MalformedURLException;

public class Main {

        public static void main(String [] args) throws IOException {

           URL url = new URL("https://cat-fact.herokuapp.com/facts/random" );
           InputStreamReader reader = new InputStreamReader(url.openStream());

           Cat cat = new Gson().fromJson(reader, Cat.class);

           System.out.println(cat);

        }
}

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



           URL urlBTC = new URL("https://www.alphavantage.co/query?function=CURRENCY_EXCHANGE_RATE&from_currency=BTC&to_currency=CNY&apikey=9RY8VYZ0ITVYTG92" );
           // URL urlBTC = new URL("https://api.ratesapi.io/api/latest?symbols=USD,GBP" );
            InputStreamReader readerBTC = new InputStreamReader(urlBTC.openStream());
            RealtimeCurrencyExchangeRate btc = new Gson().fromJson(readerBTC, RealtimeCurrencyExchangeRate.class);

            public static void printParsedObject ( RealtimeCurrencyExchangeRate btc)
                {
                    printPageInfo(btc.getRealtimeCurrencyExchangeRate());
                    System.out.println();

                }

                public static void printPageInfo (Pageinfo pageinfo)
            {
                
            }




           // Btc btc = new Gson().fromJson(readerBTC, Btc.class);

           //System.out.println(btc.getRealtimeCurrencyExchangeRate());
            System.out.println(btc);



        }
}
//9RY8VYZ0ITVYTG92
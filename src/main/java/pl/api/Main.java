/*
 * by Krzysztof Pettke Kantor
 */

package pl.api;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import pl.api.model.RealtimeCurrencyExchangeRate;
import pl.api.model.Cat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //catApi();
        exchange();
        return ;

    }

    public static void catApi() throws IOException {
        URL url = new URL("https://cat-fact.herokuapp.com/facts/random");
        InputStreamReader reader = new InputStreamReader(url.openStream());

        Cat cat = new Gson().fromJson(reader, Cat.class);

        System.out.println(cat.getText());
    }

    public static void exchange() throws IOException {

        Scanner scannerFrom = new Scanner(System.in);
        System.out.println("Podaj walute źródłową");
        String currencyFrom = scannerFrom.nextLine();

        Scanner scannerTo = new Scanner(System.in);
        System.out.println("Podaj walute docelową");
        String currencyTo = scannerTo.nextLine();

        URL urlBTC = new URL("https://www.alphavantage.co/query?function=CURRENCY_EXCHANGE_RATE&from_currency=" + currencyFrom + "&to_currency=" + currencyTo + "&apikey=9RY8VYZ0ITVYTG92");


        InputStreamReader readerBTC = new InputStreamReader(urlBTC.openStream());
        RealtimeCurrencyExchangeRate btc = new Gson().fromJson(readerBTC, RealtimeCurrencyExchangeRate.class);


        //System.out.println(btc.getRealtimeCurrencyExchangeRate().getBidPrice());  //ALTERNATYWA bez wywoływania metody
        printParsedObject(btc);
        return;
    }

    public static void printParsedObject(RealtimeCurrencyExchangeRate realtimeCurrencyExchangeRate) {
        printCurrency(realtimeCurrencyExchangeRate.getRealtimeCurrencyExchangeRate());
        System.out.println();

    }

    public static void printCurrency(RealtimeCurrencyExchangeRate btc) {
        System.out.println(btc.getBidPrice());
    }

}
//            public static void printParsedObject (RealtimeCurrencyExchangeRate realtimeCurrencyExchangeRate)   DO DOPRACOWANIA !!!!!!!!!!!!!!
//            {
//                printPageInfo(realtimeCurrencyExchangeRate.getCurrency());
//                System.out.println();
//
//            }
//
//            public static void  printPageInfo(Btc btc)
//            {
//                System.out.println(btc.getBidPrice());
//            }Wymieniać się




/// api key 9RY8VYZ0ITVYTG92
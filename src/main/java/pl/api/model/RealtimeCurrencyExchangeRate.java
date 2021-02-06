import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RealtimeCurrencyExchangeRate {

    @SerializedName("Realtime Currency Exchange Rate")
    @Expose
    private RealtimeCurrencyExchangeRate realtimeCurrencyExchangeRate;

    public RealtimeCurrencyExchangeRate getRealtimeCurrencyExchangeRate() {
        return realtimeCurrencyExchangeRate;
    }

    public void setRealtimeCurrencyExchangeRate(RealtimeCurrencyExchangeRate realtimeCurrencyExchangeRate) {
        this.realtimeCurrencyExchangeRate = realtimeCurrencyExchangeRate;
    }

    @Override
    public String toString() {
        return "RealtimeCurrencyExchangeRate{" +
                "realtimeCurrencyExchangeRate=" + realtimeCurrencyExchangeRate +
                '}';
    }
}


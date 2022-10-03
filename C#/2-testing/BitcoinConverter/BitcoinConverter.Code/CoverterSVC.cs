using System;
using System.Net.Http;
using System.Threading.Tasks;
using System.Text;
using System.Text.Json;

namespace Bitcoin
{
    public class ConvertSvc
    {
        private HttpClient client;
        private const string BITCOIN_CURRENTPRICE_URL = "https://api.coindesk.com/v1/bpi/currentprice.json";
        public ConvertSvc()
        {
            this.client = new HttpClient();
        }

        public ConvertSvc(HttpClient http)
        {
            this.client = http;
        }
        public enum Currency 
        {
            USD,
            GBP,
            EUR        
        }

        public async Task<double> GetExchangeRate(Currency currency)
        {
            double rate = 0;
            try
            {
                var response = await this.client.GetStringAsync(BITCOIN_CURRENTPRICE_URL);
                var jsonDoc = JsonDocument.Parse(Encoding.ASCII.GetBytes(response));
                var rateString = jsonDoc.RootElement.GetProperty("bpi").GetProperty(currency.ToString()).GetProperty("rate");
                rate = Double.Parse(rateString.GetString());

            } catch 
            {
                rate = -1;
            }
            return Math.Round(rate, 4);
        }

        public async Task<double> ConvertBitcoins(Currency currency, double coins)
        {
            double value = 0;

            if (coins < 0)
            {
                throw new ArgumentException("Number of bitcoins must not be less than 0");
            }
            var exchangeRate = await GetExchangeRate(currency);
            if (exchangeRate >= 0)
            {
                value = exchangeRate * coins;
            } else 
            {
                value = -1;
            }
            return Math.Round(value, 4);
        }
    }
}

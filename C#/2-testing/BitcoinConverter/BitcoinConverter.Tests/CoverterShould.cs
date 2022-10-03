using System;
using Xunit;
using Moq;
using Moq.Protected;
using System.Net;
using System.Net.Http;
using System.Threading;
using System.Threading.Tasks;

namespace Bitcoin.Tests
{
    public class ConvertSvcShould
    {
        private const string MOCK_JSON_RESPONSE = @"{""time"": {""updated"": ""Oct 15, 2020 22:55:00 UTC"",""updatedISO"": ""2020-10-15T22:55:00+00:00"",""updateduk"": ""Oct 15, 2020 at 23:55 BST""},""chartName"": ""Bitcoin"",""bpi"": {""USD"": {""code"": ""USD"",""symbol"": ""&#36;"",""rate"": ""11,486.5341"",""description"": ""United States Dollar"",""rate_float"": 11486.5341},""GBP"": {""code"": ""GBP"",""symbol"": ""&pound;"",""rate"": ""8,900.8693"",""description"": ""British Pound Sterling"",""rate_float"": 8900.8693},""EUR"": {""code"": ""EUR"",""symbol"": ""&euro;"",""rate"": ""9,809.3278"",""description"": ""Euro"",""rate_float"": 9809.3278}}}";

        private ConvertSvc mock;

        public ConvertSvcShould()
        {
            mock = GetMockConverter();
        }

        private ConvertSvc GetMockConverter()
        {
            var handlerMock = new Mock<HttpMessageHandler>();
            var response = new HttpResponseMessage
            {
                StatusCode = HttpStatusCode.OK,
                Content = new StringContent(MOCK_JSON_RESPONSE)
            };

            handlerMock.Protected().Setup<Task<HttpResponseMessage>>(
                "SendAsync",
                ItExpr.IsAny<HttpRequestMessage>(),
                ItExpr.IsAny<CancellationToken>()).ReturnsAsync(response);
            
            var httpClient = new HttpClient(handlerMock.Object);

            var converter = new ConvertSvc(httpClient);

            return converter;
        }

        [Fact]
        public async void GetExchangeRate_USDExchangeRate()
        {
            var exchangeRate = await mock.GetExchangeRate(ConvertSvc.Currency.USD);
            double expected = 11486.5341;
            Assert.Equal(expected, exchangeRate);
        }

        [Fact]
        public async void GetExchangeRate_GPBExchangeRate()
        {
            var exchangeRate = await mock.GetExchangeRate(ConvertSvc.Currency.GBP);
            double expected = 8900.8693;
            Assert.Equal(expected, exchangeRate);
        }

        [Fact]
        public async void GetExchangeRate_EURExchangeRate()
        {
            var exchangeRate = await mock.GetExchangeRate(ConvertSvc.Currency.EUR);
            double expected = 9809.3278;
            Assert.Equal(expected, exchangeRate);
        }

        [Theory]
        [InlineData(ConvertSvc.Currency.USD, 1, 11486.5341)]
        [InlineData(ConvertSvc.Currency.GBP, 1, 8900.8693)]
        [InlineData(ConvertSvc.Currency.EUR, 1, 9809.3278)]
        public async void ConvertBitcoins_BitcoinsToCurrency_ReturnsCurrency(ConvertSvc.Currency currency, double bitcoins, double converted)
        {
            var converter = await mock.ConvertBitcoins(currency, bitcoins);
            var expected = converter;
            Assert.Equal(expected, converted);
        }

        [Fact]
        public async void ConvertBitcoins_BitcoinAPIServiceUnavailable_ReturnsNegativeOne()
        {
            var handlerMock = new Mock<HttpMessageHandler>();
            var response = new HttpResponseMessage
            {
                StatusCode = HttpStatusCode.ServiceUnavailable,
                Content = new StringContent("problems..."),
            };

            handlerMock
               .Protected()
               .Setup<Task<HttpResponseMessage>>(
                  "SendAsync",
                  ItExpr.IsAny<HttpRequestMessage>(),
                  ItExpr.IsAny<CancellationToken>())
               .ReturnsAsync(response);

            var httpClient = new HttpClient(handlerMock.Object);

            var converter = new ConvertSvc(httpClient);

            //act
            var amount = await converter.ConvertBitcoins(ConvertSvc.Currency.USD, 5);

            //assert
            var expected = -1;
            Assert.Equal(expected, amount);
        }

        [Fact]
        public async void ConvertBitcoins_BitcoinsLessThanZero_ThrowsArgumentException()
        {
            //act
            Task result() => mock.ConvertBitcoins(ConvertSvc.Currency.USD, -1);

            //assert
            await Assert.ThrowsAsync<ArgumentException>(result);
        }

    }
}

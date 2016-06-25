package candystore.webservices;

import candystore.webservices.schemas.com.cdyne.ws.weatherws.ForecastReturn;
import candystore.webservices.schemas.com.cdyne.ws.weatherws.GetCityForecastByZIP;
import candystore.webservices.schemas.com.cdyne.ws.weatherws.Weather;

/**
 * WeatherSOAPService
 * 1. Create your service object (this object)
 * 2. Use WSImport to generate the service objects (I put them in a schemas folder)
 * 3. Use client generated to call methods see: getForecastByZIP() as an example
 * 4. Write your test
 */
public class WeatherSOAPService {

	/**
	 * getForecastByZIP
	 * Using the client generated by wsimport
	 * @param zipCode zipCode to use to request forecast
	 * @return Forecast response
	 */
	public ForecastReturn getForecastByZIP(String zipCode) {
		ForecastReturn response = null;
		
		Weather weather = new Weather();
		
		GetCityForecastByZIP byZipRequest = new GetCityForecastByZIP();
		byZipRequest.setZIP(zipCode);
	
		response = (ForecastReturn) weather.getWeatherSoap().getCityForecastByZIP(zipCode);		
		
		return response;
	}


}
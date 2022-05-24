package Weather;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

//import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

public class JSONQuestion {

	public float JSONQuestion(String platfrm, String coinbase)
			throws FileNotFoundException, IOException, ParseException {

		String path = System.getProperty("user.dir") + "/JSONfile/coinDCX.json";

		Object obj = new JSONParser().parse(new FileReader(path));
		int  count =0;
		float b;
		float LargetBTC = 0;
		
		JSONArray jsonArr = (JSONArray) obj;

		for (int i = 0; i < jsonArr.size(); i++) {
			
			JSONObject jsonOB = (JSONObject) jsonArr.get(i);

			String platform = jsonOB.get("platform").toString();
			String coin = jsonOB.get("coin").toString();
		
			if (platform.equalsIgnoreCase(platfrm) && coin.equalsIgnoreCase(coinbase)) {
				b = Float.parseFloat(jsonOB.get("priceInInr").toString());
				System.out.println("value of coin ---  " + coin + "   value of platform ---- " + platform);
				if (count == 0) {
					LargetBTC = b;
					
					continue;

				} else {
					if (LargetBTC < b) {
						LargetBTC = b;
			
					}
						
				}
				
			}
			
			count++;
		}
		
		return LargetBTC;

	}

	@Test
	public void getMaxValue() throws FileNotFoundException, IOException, ParseException {

		System.out.println("largest value ----- " + JSONQuestion("wazirX", "BTC"));
		System.out.println("largest value ----- " + JSONQuestion("wazirX", "ETH"));
		System.out.println("largest value ----- " + JSONQuestion("Coindcx", "ETH"));
		System.out.println("largest value ----- " + JSONQuestion("Coindcx", "BTC"));
	}
}

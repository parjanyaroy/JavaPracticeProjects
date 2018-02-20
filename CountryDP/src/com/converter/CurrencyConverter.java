package com.converter;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
	
	Map currencyMap = new HashMap<String,Double>();
	
	public CurrencyConverter() {
		currencyMap.put("USD",1.0);
		currencyMap.put("CAN",0.8180);
		currencyMap.put("HKD",0.128983);
		currencyMap.put("SAR",0.266645);
		currencyMap.put("GBP",1.57217);
		currencyMap.put("EUR",1.11598);
		currencyMap.put("INR",0.0157311);
		currencyMap.put("AUD",0.772744);
		currencyMap.put("NZD",0.684621);
		currencyMap.put("MXN",0.0648290);
	}
	
	public double convertToDollar(String currency,double amount) throws IllegalArgumentException
	{
		if(null!=currencyMap.get(currency))
		{
			return ((double) amount*((double)currencyMap.get(currency)));
		}
		else
			throw new IllegalArgumentException("Currency Format Not Supported");
	}

}

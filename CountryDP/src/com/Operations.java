package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.converter.CurrencyConverter;
import com.entity.Account;
import com.entity.Country;
import com.entity.Region;

public class Operations {
	
	static CurrencyConverter currencyConverter = new CurrencyConverter();

	public static void main(String[] args) {
		Set<Region> regions = new HashSet<Region>();
		readDataIntoObject("C:\\Users\\parroy\\Desktop\\TestData.csv", regions);
		Iterator<Region> iRegion = regions.iterator();
		while(iRegion.hasNext())
		{
			Region r1 = iRegion.next();
			System.out.println(r1.getRegionName()+" "+r1.getNetRegionProfit()+r1.getGrossRegionProfit());
		}
		System.out.println();
	}

	static void readDataIntoObject(String csvFile, Set<Region> regions) {

		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		try {
			br = new BufferedReader(new FileReader(csvFile));
			int counter = 0;
			while ((line = br.readLine()) != null) {
				String[] entities = line.split(cvsSplitBy);
				if (counter != 0)
					PopulateRegionObject(entities, regions);
				counter++;

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Format of Data is Incorrect");
		} finally {
		}
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void PopulateRegionObject(String[] entities, Set<Region> regions) {
		// Region -- Country -- Id
		String pRegion = entities[0];
		String pCountry = entities[1];
		String pId = entities[2];
		// Currency -- NetProfit -- Tax
		String pCurrency = entities[3];
		String pNetProfit = entities[4];
		String pTax = entities[5];

		Region newRegion = null;
		Iterator<Region> i1 = regions.iterator();
		while (i1.hasNext()) {
			Region r1 = i1.next();
			if (r1.getRegionName() == pRegion) {
				newRegion = r1;
				break;
			}
		}
		if (null == newRegion) // Later Upgrade with Factory Builder Pattern
		{
			newRegion = new Region();
			newRegion.setRegionName(pRegion);
		}
		regions.add(newRegion);

		Country newCountry = null;
		Iterator<Country> i2 = newRegion.getCountries().iterator();
		while (i2.hasNext()) {
			Country c1 = i2.next();
			if (c1.getCountryName() == pCountry) {
				newCountry = c1;
				break;
			}
		}
		if (null == newCountry) // Later Upgrade with Factory Builder Pattern
		{
			newCountry = new Country();
			newCountry.setCountryName(pCountry);
			newCountry.setCurrency(pCurrency);

		}
		newRegion.getCountries().add(newCountry);

		Account newAccount = null;
		Iterator<Account> i3 = newCountry.getAccounts().iterator();
		while (i3.hasNext()) {
			Account a1 = i3.next();
			if (a1.getId() == Integer.parseInt(pId)) {
				newAccount = a1;
				break;
			}
		}
		if (null == newAccount) // Later Upgrade with Factory Builder Pattern
		{
			newAccount = new Account();
			newAccount.setId(Integer.parseInt(pId));
			newAccount.setNetProfit(currencyConverter.convertToDollar(newCountry.getCurrency().trim(),
					Double.parseDouble(pNetProfit)));
			newAccount.setTaxRate(Float.parseFloat(pTax));
			newAccount.calculateNetProfit();
		}
		newCountry.getAccounts().add(newAccount);

	}

}

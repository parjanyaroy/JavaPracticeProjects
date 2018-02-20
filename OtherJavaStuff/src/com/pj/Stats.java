package com.pj;
import java.util.*;
import java.util.concurrent.*;

public class Stats {
	public static class StatisticsAggregatorImpl implements StatisticsAggregator {
		
		Map<String,Set<Double>> map = new HashMap<String,Set<Double>>();
		
		@Override
		public void putNewPrice(String symbol, double price) {
			Set<Double> stocks=null;
		if(map.get(symbol)!=null)
		{
			 stocks = map.get(symbol);
			
		}
		else
		{
			stocks = new HashSet<Double>();
			map.put(symbol,stocks);
			
		}
		stocks.add(price);
		}

		@Override
		public double getAveragePrice(String symbol) {
			if(map.get(symbol)!=null)
			{
				Set<Double> stocks = map.get(symbol);
				Iterator<Double> i1 = stocks.iterator();
				int ctr=0;
				double price=0.0D;
				while(i1.hasNext())
				{
					price+=i1.next();
					ctr++;
				}
				return ((Double)price/ctr);
				
			} 
			return -1;
		}

		@Override
		public int getTickCount(String symbol) {
			if(map.get(symbol)!=null)
			return map.get(symbol).size();
			return 0;
		}
	}

	////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

	public interface StatisticsAggregator {
		// This is an input. Make note of this price.
		public void putNewPrice(String symbol, double price);

		// Get the average price
		public double getAveragePrice(String symbol);

		// Get the total number of prices recorded
		public int getTickCount(String symbol);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			final StatisticsAggregator stats = new StatisticsAggregatorImpl();
			final Set<String> symbols = new TreeSet<>();

			String line = scanner.nextLine();
			String[] inputs = line.split(",");
			int threads = Integer.parseInt(inputs[0]);
			ExecutorService pool = Executors.newFixedThreadPool(threads);
			for (int i = 1; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String symbol = tokens[0];
				symbols.add(symbol);
				final double price = Double.parseDouble(tokens[1]);
				pool.submit(new Runnable() {
					@Override
					public void run() {
						stats.putNewPrice(symbol, price);
					}
				});

			}
			pool.shutdown();
			try {
				pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (String symbol : symbols) {
				System.out.println(String.format("%s %.4f %d", symbol,
						stats.getAveragePrice(symbol),
						stats.getTickCount(symbol)));
			}
		}
		scanner.close();

	}
}
package com.pj.webcrawler;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebCrawler {
	
	static Set<String> sites = new HashSet<String>();
	
	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		System.out.println("WebSite");
		String site = sc.nextLine();
		System.out.println("Search String");
		String searchString = sc.nextLine();
		processPage(site,searchString);
	}
 
	public static void processPage(String URL,String searchString) throws IOException {
		//check if the given URL is already in set
		if(sites.add(URL))
		{
			//get useful information
			Document doc = Jsoup.connect("http://www.mit.edu/").get();
 			if(doc.text().contains(searchString)){
				System.out.println(URL);
			}
 			//get all links and recursively call the processPage method
			Elements questions = doc.select("a[href]");
			for(Element link: questions){
				if(link.attr("href").contains("mit.edu"))
					processPage(link.attr("abs:href"),searchString);
			}
		}
	}

}

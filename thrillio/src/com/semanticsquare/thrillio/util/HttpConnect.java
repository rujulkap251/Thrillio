package com.semanticsquare.thrillio.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class HttpConnect {
	public static String download(String souceUrl) throws MalformedURLException, URISyntaxException {
		System.out.println("Downloading: " + souceUrl);
		URL url = new URI(souceUrl).toURL();
		
		try {
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			int responseCode = con.getResponseCode();
			
			if(responseCode >= 200 && responseCode < 302) { //ok
				return IOUtil.read(con.getInputStream());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}

package com.semanticsquare.thrillio.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class IOUtil {
	public static void read(List<String> data, String filename) {
		try(BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))){
			String line;
			//int count = 0;
			while((line = in.readLine()) != null) {
				data.add(line);
				//count++;
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String read(InputStream in) {
		StringBuilder build = new StringBuilder(); 
		try(BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"))){
			String line;
			while((line = br.readLine()) != null) {
				build.append(line).append("\n");
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return build.toString();
	}

	public static void write(String webpage, long id) {
		try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/Users/rujulk/Documents/Tutorials/jid/thrillio/pages/" + String.valueOf(id) + ".html"), "UTF-8"))){
			writer.write(webpage);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

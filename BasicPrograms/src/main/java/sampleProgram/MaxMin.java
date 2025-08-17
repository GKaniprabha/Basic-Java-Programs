package sampleProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class MaxMin {
	@Test
	public void method() {
		List <Integer> names = new ArrayList<Integer>();
		names.add(49);
		names.add(2);
		names.add(400);
		names.add(1500);
		names.add(58);
		names.add(72);
		names.add(8543);
		Collections.sort(names);
		System.out.println(names.get(6));
		double[] numArray = {49, 70.15, 100, 55.99, -200, 500, 48};
		double largest = numArray[0];
		for(double num : numArray) {
			if(largest<num) {
				largest = num;
			}
		}
		System.out.println("Maximum: "+largest);
		for(double min : numArray) {
			if(largest>min) {
				largest = min;
			}
		}
		System.out.println("Minimum: "+largest);
		Set <Double> abc = new TreeSet<Double>();
		abc.add(87.01);
		abc.add(99.0);
		abc.add(4.55);
		abc.add(999.86);
		abc.add(202.99);
		abc.add(202.9865205423);
		abc.add(5928.0);
		System.out.println(abc);
		List<Double>xyz= new ArrayList<Double>(abc);
		System.out.println(xyz.get(6));
		
	}

	//public static void main(String[] args) {
		
		
}

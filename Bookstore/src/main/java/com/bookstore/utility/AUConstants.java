package com.bookstore.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AUConstants {
	
	public final static String AU = "AU";
	
	public final static Map<String, String> mapOfAUStates = new HashMap<String, String>() {
		{			
			put("ACT", "Australian Captial Territory");
			put("NSW", "New South Wales");
			put("NT", "Northern Territory");
			put("QLD", "Queensland");
			put("SA", "Southern Australia");
			put("TAS", "Tasmania");
			put("VIC", "Victoria");			
			put("WA", "Western Australia");		
		}
	};
	
	public final static List<String> listOfAUStatesCode = new ArrayList<>(mapOfAUStates.keySet());
	public final static List<String> listOfAUStatesName = new ArrayList<>(mapOfAUStates.values());
}

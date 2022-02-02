package com.crm.SDET.Practice;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadTheDataFromJson {
	@Test
	public void readDataFromExcel() throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		FileReader fr=new FileReader("./data/data.json");
		Object obj = parser.parse(fr);
		JSONObject jobj = (JSONObject)obj;
		System.out.println(jobj.get("designation").toString()+ " "+jobj.get("name").toString()+ " "+jobj.get("surname").toString());
	}

}

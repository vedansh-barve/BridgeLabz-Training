package com.json.iplsanitizer;

public class IplCensorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IplJsonProcessor.process();

        // checks CSV file
        IplCsvProcessor.process();
	}

}

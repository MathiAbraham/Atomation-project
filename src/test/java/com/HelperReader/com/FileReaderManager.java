package com.HelperReader.com;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
	//filereadermanager
	public static FileReaderManager getinstanceFR() {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}
	
	//config_Reader
	public Config_Reader getInstanceCR() throws Throwable {
		Config_Reader cr = new Config_Reader();
		return cr;
	}

}

package model;

import java.net.URL;
import java.util.ArrayList;

public abstract class AbstractWebAction implements WebAction {
	
	protected static final String EMPTY_STRING = ""; 
	
	protected URL url; 
	
	protected String result; 
	
	protected ArrayList<String> response;
	
	public AbstractWebAction(URL inputUrl) {
		this.url = inputUrl;
		this.response = new ArrayList<String>();
		
	}
	
	public URL getUrl() {
		return this.url;
	}
	
	public String getResult() {
		return this.result;
	}
	
	public ArrayList<String> getResponse(){
		return this.response;
	}
	
	public void setResult(String resultText) {
		this.result = resultText;
	}
	
	public abstract void execute(); 
	
	public abstract void clearResponse();

}
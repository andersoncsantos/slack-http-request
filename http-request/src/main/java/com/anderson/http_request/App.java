package com.anderson.http_request;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class App {
    public static void main( String[] args ) throws UnirestException{
        /*get*/
    	HttpResponse<JsonNode>
    		res = Unirest
    				.get("https://slack.com/api/channels.history?"
    						+ "token=xoxp-318392221105-318942821602-626453242320-bacc497c229b8041d987510a6b7c0048&"
    						+ "channel=C9E03H9L7&"
    						+ "pretty=1")
    				.asJson();
    	
    	System.out.println(res.getBody());
    	 
    	/*post*/
    	/*HttpResponse<JsonNode>
		res = Unirest
				.post("https://slack.com/api/reactions.add?"
						+ "token=xoxp-318392221105-318942821602-626453242320-bacc497c229b8041d987510a6b7c0048&"
						+ "name=heavy_check_mark&"
						+ "channel=C9E03H9L7&"
						+ "timestamp=1557012441.000100"
						+ "&pretty=1")
				.asJson();
	
    	System.out.println(res.getBody());*/
    }
}

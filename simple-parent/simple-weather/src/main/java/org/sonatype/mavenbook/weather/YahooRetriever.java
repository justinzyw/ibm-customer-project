package org.sonatype.mavenbook.weather;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.log4j.Logger;

public class YahooRetriever {

	private static Logger log = Logger.getLogger(YahooRetriever.class);

	public InputStream retrieve(String zipcode) throws Exception {
		log.info( "Retrieving Weather Data" );
//		String url = "http://weather.yahooapis.com/forecastrss?p=" + zipcode;
        String url = "https://api.map.baidu.com/telematics/v3/weather?location=%E9%83%91%E5%B7%9E&output=xml&ak=A72e372de05e63c8740b2622d0ed8ab1";
        // Use this if you need to connect via a corporate proxy
//      String proxyHost = "[proxy server]";
//      int proxyPort = [proxy server port];
//      SocketAddress addr = new InetSocketAddress(proxyHost, proxyPort);
//      Proxy httpProxy = new Proxy(Proxy.Type.HTTP, addr);
//      URLConnection conn = new URL(url).openConnection(httpProxy);
		URLConnection conn = new URL(url).openConnection();
		return conn.getInputStream();
	}

}

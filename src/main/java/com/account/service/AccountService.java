package com.account.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import com.account.dto.AccountDetails;

/**
 * Class used for account related services TODO : Convert to interface
 * 
 * @author namratarane
 * 
 */
public class AccountService {

	public static final String SERVICE_ENDPOINT = "http://myopenissues.com/magento/index.php/customer/account/createpost/";

	/**
	 * Metthod that calls the web service. Returns true or false for success or failure 
	 * @param details
	 * @return
	 * @throws Exception
	 */
	public boolean createAccount(AccountDetails details) throws Exception {

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(SERVICE_ENDPOINT);

		List<NameValuePair> nvps = constructRequest(details);
		httpPost.setEntity(new UrlEncodedFormEntity(nvps));

		CloseableHttpResponse response = null;

		try {
			response = httpclient.execute(httpPost);
			System.out.println("Webservice response = "+response);
			// todo : need a little better handling of this 
	        int status = response.getStatusLine().getStatusCode();
	        
	        /*
	         * Note : For some reason the webservice response is 302 Temporarily moved 
	         * even when account is created from Magento UI, but the account still gets created
	         */
	        if (status >= 200 && status < 400) {
	        	return true;
	        } else {
	        	return false;
	        }
		} finally {
			response.close();
		}

	}

	private List<NameValuePair> constructRequest(AccountDetails details) {
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("firstname", details.getFname()));
		nvps.add(new BasicNameValuePair("lastname", details.getLname()));
		nvps.add(new BasicNameValuePair("email", details.getEmail()));
		nvps.add(new BasicNameValuePair("is_subscribed", details
				.getNewsletter()));
		nvps.add(new BasicNameValuePair("password", details.getPassword()));
		nvps.add(new BasicNameValuePair("confirmation", details
				.getConfirmPassword()));

		return nvps;

	}

}

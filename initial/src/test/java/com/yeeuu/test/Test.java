package com.yeeuu.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;

public class Test {

	public static void main(String[] args) {
		try {
			String loginUrl = "http://localhost:8080/locks";
			List<NameValuePair> params = new ArrayList<NameValuePair>();
			Params par = new Params();
			par.setAction("open");
			par.setKey("ddsksdfjkdjfkdsf");
			par.setSn("05172717");
			String jsonString = JSON.toJSONString(par)
					;
			params.add(new BasicNameValuePair("params",jsonString));
			CloseableHttpClient httpclient = HttpClientBuilder.create().build();

			HttpPost httppost = new HttpPost(loginUrl);
			httppost.setEntity(new UrlEncodedFormEntity(params));

			CloseableHttpResponse response = httpclient.execute(httppost);
			System.out.println(response.toString());

			HttpEntity entity = response.getEntity();
			String jsonStr = EntityUtils.toString(entity, "utf-8");
			System.out.println(jsonStr);

			httppost.releaseConnection();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

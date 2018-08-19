package com.iota.mdxdoclet.example;

public class CURL extends BaseExport {

	@Override
	protected String getPost() {
		return "curl http://localhost:14265 \n" +
			   "-X POST \n" +
			   "-H 'Content-Type: application/json' \n" +
			   "-H 'X-IOTA-API-Version: 1' \n" +
			   "-d '" + BaseExport.CMD + "'";
	}

	@Override
	public String getName() {
		return "cURL";
	}

}

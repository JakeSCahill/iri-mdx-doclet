package com.iota.mdxdoclet.example;

public class NodeJS extends BaseExport {

	@Override
	protected String getPost() {
		return "var request = require('request');\n" + 
				"\n" + 
				"var command = " + BaseExport.CMD + "\n" + 
				"\n" + 
				"var options = {\n" + 
				"  url: 'http://localhost:14265',\n" + 
				"  method: 'POST',\n" + 
				"  headers: {\n" + 
				"    'Content-Type': 'application/json',\n" + 
				"		'X-IOTA-API-Version': '1',\n" + 
				"    'Content-Length': Buffer.byteLength(JSON.stringify(command))\n" + 
				"  },\n" + 
				"  json: command\n" + 
				"};\n" + 
				"\n" + 
				"request(options, function (error, response, data) {\n" + 
				"  if (!error && response.statusCode == 200) {\n" + 
				"    console.log(data);\n" + 
				"  }\n" + 
				"});";
	}

	@Override
	public String getName() {
		return "NodeJS";
	}

    @Override
    public String getLanguage() {
        return "javascript";
    }

}

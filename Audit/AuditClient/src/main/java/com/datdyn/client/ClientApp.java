/*
SPDX-License-Identifier: Apache-2.0
*/

package com.datdyn.client;


import org.hyperledger.fabric.gateway.Contract;
import org.hyperledger.fabric.gateway.ContractException;
import org.jetbrains.annotations.NotNull;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import java.util.concurrent.TimeoutException;

public class ClientApp {

	static {
		System.setProperty("org.hyperledger.fabric.sdk.service_discovery.as_localhost", "false");
	}


	public String submitTransactionToBlockchain(@org.jetbrains.annotations.NotNull Contract contractInstance, @NotNull JSONObject request) throws ContractException, TimeoutException, InterruptedException {
		byte[] response = contractInstance.submitTransaction("createFileDetails",request.toString());
		String result=new String(response);
		System.out.println("The Result is "+result);
		return result;

	}

	public String queryFileDetails(Contract contractInstance,String fileResearchHash) throws ContractException, ParseException {
		byte[] response= contractInstance.evaluateTransaction("getFileDetails",fileResearchHash);
		String results =new String(response);
		System.out.println(" the results are"+results);
		return results;

	}


	public String updateFileDetails(Contract contractInstance,JSONObject request) throws ContractException, InterruptedException, TimeoutException {
		byte[] response= contractInstance.submitTransaction("updateFileDetails",request.toString());
		System.out.println((" the response is "+response));
		String results =new String(response);
		System.out.println(" the results are"+results);
		return results;


	}


	public String  getFileHistory(Contract contractInstance, String fileResearchHash) throws ContractException, InterruptedException, TimeoutException {
		System.out.println(" have entered ant identifire is"+fileResearchHash);
		byte [] response=contractInstance.evaluateTransaction("QueryFileHistory",fileResearchHash);
		System.out.println(" the byte reponse is"+response);
		String result =new String(response);
		System.out.println(" the results are"+result);
		return result;
	}

}

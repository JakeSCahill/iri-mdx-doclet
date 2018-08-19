package com.iota.mdxdoclet;

public enum ApiCall {
	NODE_INFO("getNodeInfo"),
	GET_NEIGHBORS("getNeighbors"),
	ADD_NEIGHBORS("addNeighbors"),
	REMOVE_NEIGHBORS("removeNeighbors"),
	GET_TIPS("getTips"),
	FIND_TRANSACTIONS("findTransactions"),
	GET_TRYTES("getTrytes"),
	GET_INCLUSION_STATE("getInclusionStates"),
	GET_BALANCE("getBalances"),
	GET_TRANSACTION_APPROVE("getTransactionsToApprove"),
	WERE_ADDRESSES_SPENT_FROM("wereAddressesSpentFrom"),
	INTERRUPT_ATTACH("interruptAttachingToTangle"),
	
	BROADCAST_TRANSACTION("broadcastTransactions"), //-> return nothing?
	STORE_TRANSACTION("storeTransactions"), 		//-> return nothing?
	ATTACH_TANGLE("attachToTangle", "trytes");
	
	
	private String command;
	private String param;
	
	ApiCall(String command){
		this(command, null);
	}
	
	ApiCall(String command, String param){
		this.command = command;
		this.param = param;
	}
	
	public String getCommand() {
		return command;
	}
	
	public String getCommandStatement() {
		return command + "Statement";
	}
	
	public boolean hasParam() {
		return param != null;
	}
	
	public String getParam() {
		return param;
	}
	
	public static ApiCall getApiCall(String function) {
		for (ApiCall api : ApiCall.values()) {
			if (function.equals(api.getCommandStatement())) {
				return api;
			}
		}
		return null;
	}
	
	public static boolean isApiCall(String function) {
		return getApiCall(function) != null;
	}
	
	@Override
	public String toString() {
		return command;
	}
}
package com.hashedin.app;

public class TestCase {
	
	public static void main(String[] args) {
		
		
		AgentOrders agentOrders = new AgentOrders();
		try {
			agentOrders.login();
			agentOrders.Agent();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

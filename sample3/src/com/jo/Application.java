package com.jo;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new Service();
		
		ServiceConfiguration serviceConfiguration = 
				service.getClass().getAnnotation(ServiceConfiguration.class);
		
		System.out.println(serviceConfiguration.defaultEndpoint()+" - "+serviceConfiguration);
	}

}

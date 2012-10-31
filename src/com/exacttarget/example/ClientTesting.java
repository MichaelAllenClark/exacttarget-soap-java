package com.exacttarget.example;

import java.rmi.RemoteException;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContextFactory;
import com.exacttarget.wsdl.partnerapi.*;
import org.apache.axis2.context.*;

public class ClientTesting {
	
	public static void main(String[] args) throws AxisFault {
		
		ConfigurationContext configurationContext = null;
		
		System.out.println("Getting Started" );
		EndpointReference endPointReference = new EndpointReference("https://webservice.exacttarget.com/Service.asmx");
		
		try {			
			configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem("repository","axis2-config.xml");
			PartnerAPIStub ps = new PartnerAPIStub(configurationContext);
			ServiceClient serviceClient = ps._getServiceClient();
	        Options options = new Options();
	        options.setTo(endPointReference);
	        serviceClient.setOptions(options);	        
	        options.setTimeOutInMilliSeconds(60000);	        
	        
	        //CreateTriggeredSend.Run(ps,"ExampleTSD","example@example.com","Darth", "Vader");	  
	        //CreateDataExtension.Run(ps, "API Created DE Example - Java", "API Created DE Example - Java");
	        //CreateImportDefinition.Run(ps,"API Created ImportDefinition - Java", "APICreatedIDJava", "API Created DE Example - Java","importexample.csv");
	        //PerformImportDefinition.Run(ps, "APICreatedIDJava");
	        RetrieveImportResultsSummary.Run(ps,"126640754");
	        
	        //UpdateSubscriber.Run(ps,"mclark@exacttarget.com",1947888);
			
		} catch (RemoteException e) {			
			e.printStackTrace();
		}

	}

}

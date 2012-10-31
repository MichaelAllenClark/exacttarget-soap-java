/*
 * An XML document type.
 * Localname: RetrieveRequestMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.RetrieveRequestMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one RetrieveRequestMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class RetrieveRequestMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.RetrieveRequestMsgDocument
{
    
    public RetrieveRequestMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVEREQUESTMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RetrieveRequestMsg");
    
    
    /**
     * Gets the "RetrieveRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.RetrieveRequestMsgDocument.RetrieveRequestMsg getRetrieveRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RetrieveRequestMsgDocument.RetrieveRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.RetrieveRequestMsgDocument.RetrieveRequestMsg)get_store().find_element_user(RETRIEVEREQUESTMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RetrieveRequestMsg" element
     */
    public void setRetrieveRequestMsg(com.exacttarget.wsdl.partnerapi.RetrieveRequestMsgDocument.RetrieveRequestMsg retrieveRequestMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RetrieveRequestMsgDocument.RetrieveRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.RetrieveRequestMsgDocument.RetrieveRequestMsg)get_store().find_element_user(RETRIEVEREQUESTMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.RetrieveRequestMsgDocument.RetrieveRequestMsg)get_store().add_element_user(RETRIEVEREQUESTMSG$0);
            }
            target.set(retrieveRequestMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "RetrieveRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.RetrieveRequestMsgDocument.RetrieveRequestMsg addNewRetrieveRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RetrieveRequestMsgDocument.RetrieveRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.RetrieveRequestMsgDocument.RetrieveRequestMsg)get_store().add_element_user(RETRIEVEREQUESTMSG$0);
            return target;
        }
    }
    /**
     * An XML RetrieveRequestMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class RetrieveRequestMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.RetrieveRequestMsgDocument.RetrieveRequestMsg
    {
        
        public RetrieveRequestMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETRIEVEREQUEST$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RetrieveRequest");
        
        
        /**
         * Gets the "RetrieveRequest" element
         */
        public com.exacttarget.wsdl.partnerapi.RetrieveRequest getRetrieveRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.RetrieveRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.RetrieveRequest)get_store().find_element_user(RETRIEVEREQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "RetrieveRequest" element
         */
        public void setRetrieveRequest(com.exacttarget.wsdl.partnerapi.RetrieveRequest retrieveRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.RetrieveRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.RetrieveRequest)get_store().find_element_user(RETRIEVEREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.exacttarget.wsdl.partnerapi.RetrieveRequest)get_store().add_element_user(RETRIEVEREQUEST$0);
                }
                target.set(retrieveRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "RetrieveRequest" element
         */
        public com.exacttarget.wsdl.partnerapi.RetrieveRequest addNewRetrieveRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.RetrieveRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.RetrieveRequest)get_store().add_element_user(RETRIEVEREQUEST$0);
                return target;
            }
        }
    }
}

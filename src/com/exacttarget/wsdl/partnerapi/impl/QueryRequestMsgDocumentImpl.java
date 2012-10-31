/*
 * An XML document type.
 * Localname: QueryRequestMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.QueryRequestMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one QueryRequestMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class QueryRequestMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.QueryRequestMsgDocument
{
    
    public QueryRequestMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYREQUESTMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "QueryRequestMsg");
    
    
    /**
     * Gets the "QueryRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.QueryRequestMsgDocument.QueryRequestMsg getQueryRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.QueryRequestMsgDocument.QueryRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.QueryRequestMsgDocument.QueryRequestMsg)get_store().find_element_user(QUERYREQUESTMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryRequestMsg" element
     */
    public void setQueryRequestMsg(com.exacttarget.wsdl.partnerapi.QueryRequestMsgDocument.QueryRequestMsg queryRequestMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.QueryRequestMsgDocument.QueryRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.QueryRequestMsgDocument.QueryRequestMsg)get_store().find_element_user(QUERYREQUESTMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.QueryRequestMsgDocument.QueryRequestMsg)get_store().add_element_user(QUERYREQUESTMSG$0);
            }
            target.set(queryRequestMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.QueryRequestMsgDocument.QueryRequestMsg addNewQueryRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.QueryRequestMsgDocument.QueryRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.QueryRequestMsgDocument.QueryRequestMsg)get_store().add_element_user(QUERYREQUESTMSG$0);
            return target;
        }
    }
    /**
     * An XML QueryRequestMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class QueryRequestMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.QueryRequestMsgDocument.QueryRequestMsg
    {
        
        public QueryRequestMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUERYREQUEST$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "QueryRequest");
        
        
        /**
         * Gets the "QueryRequest" element
         */
        public com.exacttarget.wsdl.partnerapi.QueryRequest getQueryRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.QueryRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.QueryRequest)get_store().find_element_user(QUERYREQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "QueryRequest" element
         */
        public void setQueryRequest(com.exacttarget.wsdl.partnerapi.QueryRequest queryRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.QueryRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.QueryRequest)get_store().find_element_user(QUERYREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.exacttarget.wsdl.partnerapi.QueryRequest)get_store().add_element_user(QUERYREQUEST$0);
                }
                target.set(queryRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "QueryRequest" element
         */
        public com.exacttarget.wsdl.partnerapi.QueryRequest addNewQueryRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.QueryRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.QueryRequest)get_store().add_element_user(QUERYREQUEST$0);
                return target;
            }
        }
    }
}

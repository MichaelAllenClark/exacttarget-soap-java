/*
 * An XML document type.
 * Localname: DefinitionRequestMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DefinitionRequestMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one DefinitionRequestMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class DefinitionRequestMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.DefinitionRequestMsgDocument
{
    
    public DefinitionRequestMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONREQUESTMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DefinitionRequestMsg");
    
    
    /**
     * Gets the "DefinitionRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.DefinitionRequestMsgDocument.DefinitionRequestMsg getDefinitionRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DefinitionRequestMsgDocument.DefinitionRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.DefinitionRequestMsgDocument.DefinitionRequestMsg)get_store().find_element_user(DEFINITIONREQUESTMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DefinitionRequestMsg" element
     */
    public void setDefinitionRequestMsg(com.exacttarget.wsdl.partnerapi.DefinitionRequestMsgDocument.DefinitionRequestMsg definitionRequestMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DefinitionRequestMsgDocument.DefinitionRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.DefinitionRequestMsgDocument.DefinitionRequestMsg)get_store().find_element_user(DEFINITIONREQUESTMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DefinitionRequestMsgDocument.DefinitionRequestMsg)get_store().add_element_user(DEFINITIONREQUESTMSG$0);
            }
            target.set(definitionRequestMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "DefinitionRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.DefinitionRequestMsgDocument.DefinitionRequestMsg addNewDefinitionRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DefinitionRequestMsgDocument.DefinitionRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.DefinitionRequestMsgDocument.DefinitionRequestMsg)get_store().add_element_user(DEFINITIONREQUESTMSG$0);
            return target;
        }
    }
    /**
     * An XML DefinitionRequestMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class DefinitionRequestMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.DefinitionRequestMsgDocument.DefinitionRequestMsg
    {
        
        public DefinitionRequestMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIBEREQUESTS$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DescribeRequests");
        
        
        /**
         * Gets the "DescribeRequests" element
         */
        public com.exacttarget.wsdl.partnerapi.ArrayOfObjectDefinitionRequest getDescribeRequests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ArrayOfObjectDefinitionRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.ArrayOfObjectDefinitionRequest)get_store().find_element_user(DESCRIBEREQUESTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DescribeRequests" element
         */
        public boolean isSetDescribeRequests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIBEREQUESTS$0) != 0;
            }
        }
        
        /**
         * Sets the "DescribeRequests" element
         */
        public void setDescribeRequests(com.exacttarget.wsdl.partnerapi.ArrayOfObjectDefinitionRequest describeRequests)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ArrayOfObjectDefinitionRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.ArrayOfObjectDefinitionRequest)get_store().find_element_user(DESCRIBEREQUESTS$0, 0);
                if (target == null)
                {
                    target = (com.exacttarget.wsdl.partnerapi.ArrayOfObjectDefinitionRequest)get_store().add_element_user(DESCRIBEREQUESTS$0);
                }
                target.set(describeRequests);
            }
        }
        
        /**
         * Appends and returns a new empty "DescribeRequests" element
         */
        public com.exacttarget.wsdl.partnerapi.ArrayOfObjectDefinitionRequest addNewDescribeRequests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ArrayOfObjectDefinitionRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.ArrayOfObjectDefinitionRequest)get_store().add_element_user(DESCRIBEREQUESTS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "DescribeRequests" element
         */
        public void unsetDescribeRequests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIBEREQUESTS$0, 0);
            }
        }
    }
}

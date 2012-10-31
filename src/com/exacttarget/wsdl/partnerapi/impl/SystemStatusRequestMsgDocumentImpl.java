/*
 * An XML document type.
 * Localname: SystemStatusRequestMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SystemStatusRequestMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one SystemStatusRequestMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class SystemStatusRequestMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SystemStatusRequestMsgDocument
{
    
    public SystemStatusRequestMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMSTATUSREQUESTMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SystemStatusRequestMsg");
    
    
    /**
     * Gets the "SystemStatusRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.SystemStatusRequestMsgDocument.SystemStatusRequestMsg getSystemStatusRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SystemStatusRequestMsgDocument.SystemStatusRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.SystemStatusRequestMsgDocument.SystemStatusRequestMsg)get_store().find_element_user(SYSTEMSTATUSREQUESTMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SystemStatusRequestMsg" element
     */
    public void setSystemStatusRequestMsg(com.exacttarget.wsdl.partnerapi.SystemStatusRequestMsgDocument.SystemStatusRequestMsg systemStatusRequestMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SystemStatusRequestMsgDocument.SystemStatusRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.SystemStatusRequestMsgDocument.SystemStatusRequestMsg)get_store().find_element_user(SYSTEMSTATUSREQUESTMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SystemStatusRequestMsgDocument.SystemStatusRequestMsg)get_store().add_element_user(SYSTEMSTATUSREQUESTMSG$0);
            }
            target.set(systemStatusRequestMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "SystemStatusRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.SystemStatusRequestMsgDocument.SystemStatusRequestMsg addNewSystemStatusRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SystemStatusRequestMsgDocument.SystemStatusRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.SystemStatusRequestMsgDocument.SystemStatusRequestMsg)get_store().add_element_user(SYSTEMSTATUSREQUESTMSG$0);
            return target;
        }
    }
    /**
     * An XML SystemStatusRequestMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class SystemStatusRequestMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SystemStatusRequestMsgDocument.SystemStatusRequestMsg
    {
        
        public SystemStatusRequestMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OPTIONS$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Options");
        
        
        /**
         * Gets the "Options" element
         */
        public com.exacttarget.wsdl.partnerapi.SystemStatusOptions getOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SystemStatusOptions target = null;
                target = (com.exacttarget.wsdl.partnerapi.SystemStatusOptions)get_store().find_element_user(OPTIONS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Options" element
         */
        public boolean isSetOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPTIONS$0) != 0;
            }
        }
        
        /**
         * Sets the "Options" element
         */
        public void setOptions(com.exacttarget.wsdl.partnerapi.SystemStatusOptions options)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SystemStatusOptions target = null;
                target = (com.exacttarget.wsdl.partnerapi.SystemStatusOptions)get_store().find_element_user(OPTIONS$0, 0);
                if (target == null)
                {
                    target = (com.exacttarget.wsdl.partnerapi.SystemStatusOptions)get_store().add_element_user(OPTIONS$0);
                }
                target.set(options);
            }
        }
        
        /**
         * Appends and returns a new empty "Options" element
         */
        public com.exacttarget.wsdl.partnerapi.SystemStatusOptions addNewOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SystemStatusOptions target = null;
                target = (com.exacttarget.wsdl.partnerapi.SystemStatusOptions)get_store().add_element_user(OPTIONS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Options" element
         */
        public void unsetOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPTIONS$0, 0);
            }
        }
    }
}

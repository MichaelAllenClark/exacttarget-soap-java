/*
 * An XML document type.
 * Localname: DefinitionResponseMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DefinitionResponseMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one DefinitionResponseMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class DefinitionResponseMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.DefinitionResponseMsgDocument
{
    
    public DefinitionResponseMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONRESPONSEMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DefinitionResponseMsg");
    
    
    /**
     * Gets the "DefinitionResponseMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.DefinitionResponseMsgDocument.DefinitionResponseMsg getDefinitionResponseMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DefinitionResponseMsgDocument.DefinitionResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.DefinitionResponseMsgDocument.DefinitionResponseMsg)get_store().find_element_user(DEFINITIONRESPONSEMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DefinitionResponseMsg" element
     */
    public void setDefinitionResponseMsg(com.exacttarget.wsdl.partnerapi.DefinitionResponseMsgDocument.DefinitionResponseMsg definitionResponseMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DefinitionResponseMsgDocument.DefinitionResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.DefinitionResponseMsgDocument.DefinitionResponseMsg)get_store().find_element_user(DEFINITIONRESPONSEMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DefinitionResponseMsgDocument.DefinitionResponseMsg)get_store().add_element_user(DEFINITIONRESPONSEMSG$0);
            }
            target.set(definitionResponseMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "DefinitionResponseMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.DefinitionResponseMsgDocument.DefinitionResponseMsg addNewDefinitionResponseMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DefinitionResponseMsgDocument.DefinitionResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.DefinitionResponseMsgDocument.DefinitionResponseMsg)get_store().add_element_user(DEFINITIONRESPONSEMSG$0);
            return target;
        }
    }
    /**
     * An XML DefinitionResponseMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class DefinitionResponseMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.DefinitionResponseMsgDocument.DefinitionResponseMsg
    {
        
        public DefinitionResponseMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBJECTDEFINITION$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ObjectDefinition");
        private static final javax.xml.namespace.QName REQUESTID$2 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RequestID");
        
        
        /**
         * Gets array of all "ObjectDefinition" elements
         */
        public com.exacttarget.wsdl.partnerapi.ObjectDefinition[] getObjectDefinitionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OBJECTDEFINITION$0, targetList);
                com.exacttarget.wsdl.partnerapi.ObjectDefinition[] result = new com.exacttarget.wsdl.partnerapi.ObjectDefinition[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ObjectDefinition" element
         */
        public com.exacttarget.wsdl.partnerapi.ObjectDefinition getObjectDefinitionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ObjectDefinition target = null;
                target = (com.exacttarget.wsdl.partnerapi.ObjectDefinition)get_store().find_element_user(OBJECTDEFINITION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ObjectDefinition" element
         */
        public int sizeOfObjectDefinitionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBJECTDEFINITION$0);
            }
        }
        
        /**
         * Sets array of all "ObjectDefinition" element
         */
        public void setObjectDefinitionArray(com.exacttarget.wsdl.partnerapi.ObjectDefinition[] objectDefinitionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(objectDefinitionArray, OBJECTDEFINITION$0);
            }
        }
        
        /**
         * Sets ith "ObjectDefinition" element
         */
        public void setObjectDefinitionArray(int i, com.exacttarget.wsdl.partnerapi.ObjectDefinition objectDefinition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ObjectDefinition target = null;
                target = (com.exacttarget.wsdl.partnerapi.ObjectDefinition)get_store().find_element_user(OBJECTDEFINITION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(objectDefinition);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ObjectDefinition" element
         */
        public com.exacttarget.wsdl.partnerapi.ObjectDefinition insertNewObjectDefinition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ObjectDefinition target = null;
                target = (com.exacttarget.wsdl.partnerapi.ObjectDefinition)get_store().insert_element_user(OBJECTDEFINITION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ObjectDefinition" element
         */
        public com.exacttarget.wsdl.partnerapi.ObjectDefinition addNewObjectDefinition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ObjectDefinition target = null;
                target = (com.exacttarget.wsdl.partnerapi.ObjectDefinition)get_store().add_element_user(OBJECTDEFINITION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ObjectDefinition" element
         */
        public void removeObjectDefinition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBJECTDEFINITION$0, i);
            }
        }
        
        /**
         * Gets the "RequestID" element
         */
        public java.lang.String getRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RequestID" element
         */
        public org.apache.xmlbeans.XmlString xgetRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "RequestID" element
         */
        public boolean isSetRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUESTID$2) != 0;
            }
        }
        
        /**
         * Sets the "RequestID" element
         */
        public void setRequestID(java.lang.String requestID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTID$2);
                }
                target.setStringValue(requestID);
            }
        }
        
        /**
         * Sets (as xml) the "RequestID" element
         */
        public void xsetRequestID(org.apache.xmlbeans.XmlString requestID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTID$2);
                }
                target.set(requestID);
            }
        }
        
        /**
         * Unsets the "RequestID" element
         */
        public void unsetRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUESTID$2, 0);
            }
        }
    }
}

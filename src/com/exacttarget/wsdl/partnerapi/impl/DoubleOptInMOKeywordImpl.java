/*
 * XML Type:  DoubleOptInMOKeyword
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML DoubleOptInMOKeyword(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class DoubleOptInMOKeywordImpl extends com.exacttarget.wsdl.partnerapi.impl.BaseMOKeywordImpl implements com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword
{
    
    public DoubleOptInMOKeywordImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFAULTPUBLICATION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DefaultPublication");
    private static final javax.xml.namespace.QName INVALIDPUBLICATIONMESSAGE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "InvalidPublicationMessage");
    private static final javax.xml.namespace.QName INVALIDRESPONSEMESSAGE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "InvalidResponseMessage");
    private static final javax.xml.namespace.QName MISSINGPUBLICATIONMESSAGE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MissingPublicationMessage");
    private static final javax.xml.namespace.QName NEEDPUBLICATIONMESSAGE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NeedPublicationMessage");
    private static final javax.xml.namespace.QName PROMPTMESSAGE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PromptMessage");
    private static final javax.xml.namespace.QName SUCCESSMESSAGE$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SuccessMessage");
    private static final javax.xml.namespace.QName UNEXPECTEDERRORMESSAGE$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UnexpectedErrorMessage");
    private static final javax.xml.namespace.QName VALIDPUBLICATIONS$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ValidPublications");
    private static final javax.xml.namespace.QName VALIDRESPONSES$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ValidResponses");
    
    
    /**
     * Gets the "DefaultPublication" element
     */
    public com.exacttarget.wsdl.partnerapi.List getDefaultPublication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(DEFAULTPUBLICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DefaultPublication" element
     */
    public void setDefaultPublication(com.exacttarget.wsdl.partnerapi.List defaultPublication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(DEFAULTPUBLICATION$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.List)get_store().add_element_user(DEFAULTPUBLICATION$0);
            }
            target.set(defaultPublication);
        }
    }
    
    /**
     * Appends and returns a new empty "DefaultPublication" element
     */
    public com.exacttarget.wsdl.partnerapi.List addNewDefaultPublication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().add_element_user(DEFAULTPUBLICATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "InvalidPublicationMessage" element
     */
    public java.lang.String getInvalidPublicationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDPUBLICATIONMESSAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvalidPublicationMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetInvalidPublicationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVALIDPUBLICATIONMESSAGE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InvalidPublicationMessage" element
     */
    public void setInvalidPublicationMessage(java.lang.String invalidPublicationMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDPUBLICATIONMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVALIDPUBLICATIONMESSAGE$2);
            }
            target.setStringValue(invalidPublicationMessage);
        }
    }
    
    /**
     * Sets (as xml) the "InvalidPublicationMessage" element
     */
    public void xsetInvalidPublicationMessage(org.apache.xmlbeans.XmlString invalidPublicationMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVALIDPUBLICATIONMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INVALIDPUBLICATIONMESSAGE$2);
            }
            target.set(invalidPublicationMessage);
        }
    }
    
    /**
     * Gets the "InvalidResponseMessage" element
     */
    public java.lang.String getInvalidResponseMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDRESPONSEMESSAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvalidResponseMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetInvalidResponseMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVALIDRESPONSEMESSAGE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InvalidResponseMessage" element
     */
    public void setInvalidResponseMessage(java.lang.String invalidResponseMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDRESPONSEMESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVALIDRESPONSEMESSAGE$4);
            }
            target.setStringValue(invalidResponseMessage);
        }
    }
    
    /**
     * Sets (as xml) the "InvalidResponseMessage" element
     */
    public void xsetInvalidResponseMessage(org.apache.xmlbeans.XmlString invalidResponseMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVALIDRESPONSEMESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INVALIDRESPONSEMESSAGE$4);
            }
            target.set(invalidResponseMessage);
        }
    }
    
    /**
     * Gets the "MissingPublicationMessage" element
     */
    public java.lang.String getMissingPublicationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISSINGPUBLICATIONMESSAGE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MissingPublicationMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetMissingPublicationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MISSINGPUBLICATIONMESSAGE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MissingPublicationMessage" element
     */
    public void setMissingPublicationMessage(java.lang.String missingPublicationMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISSINGPUBLICATIONMESSAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MISSINGPUBLICATIONMESSAGE$6);
            }
            target.setStringValue(missingPublicationMessage);
        }
    }
    
    /**
     * Sets (as xml) the "MissingPublicationMessage" element
     */
    public void xsetMissingPublicationMessage(org.apache.xmlbeans.XmlString missingPublicationMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MISSINGPUBLICATIONMESSAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MISSINGPUBLICATIONMESSAGE$6);
            }
            target.set(missingPublicationMessage);
        }
    }
    
    /**
     * Gets the "NeedPublicationMessage" element
     */
    public java.lang.String getNeedPublicationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEEDPUBLICATIONMESSAGE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NeedPublicationMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetNeedPublicationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEEDPUBLICATIONMESSAGE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NeedPublicationMessage" element
     */
    public void setNeedPublicationMessage(java.lang.String needPublicationMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEEDPUBLICATIONMESSAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEEDPUBLICATIONMESSAGE$8);
            }
            target.setStringValue(needPublicationMessage);
        }
    }
    
    /**
     * Sets (as xml) the "NeedPublicationMessage" element
     */
    public void xsetNeedPublicationMessage(org.apache.xmlbeans.XmlString needPublicationMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEEDPUBLICATIONMESSAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NEEDPUBLICATIONMESSAGE$8);
            }
            target.set(needPublicationMessage);
        }
    }
    
    /**
     * Gets the "PromptMessage" element
     */
    public java.lang.String getPromptMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROMPTMESSAGE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PromptMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetPromptMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROMPTMESSAGE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PromptMessage" element
     */
    public void setPromptMessage(java.lang.String promptMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROMPTMESSAGE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROMPTMESSAGE$10);
            }
            target.setStringValue(promptMessage);
        }
    }
    
    /**
     * Sets (as xml) the "PromptMessage" element
     */
    public void xsetPromptMessage(org.apache.xmlbeans.XmlString promptMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROMPTMESSAGE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROMPTMESSAGE$10);
            }
            target.set(promptMessage);
        }
    }
    
    /**
     * Gets the "SuccessMessage" element
     */
    public java.lang.String getSuccessMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUCCESSMESSAGE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SuccessMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetSuccessMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUCCESSMESSAGE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SuccessMessage" element
     */
    public void setSuccessMessage(java.lang.String successMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUCCESSMESSAGE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUCCESSMESSAGE$12);
            }
            target.setStringValue(successMessage);
        }
    }
    
    /**
     * Sets (as xml) the "SuccessMessage" element
     */
    public void xsetSuccessMessage(org.apache.xmlbeans.XmlString successMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUCCESSMESSAGE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUCCESSMESSAGE$12);
            }
            target.set(successMessage);
        }
    }
    
    /**
     * Gets the "UnexpectedErrorMessage" element
     */
    public java.lang.String getUnexpectedErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNEXPECTEDERRORMESSAGE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UnexpectedErrorMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetUnexpectedErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNEXPECTEDERRORMESSAGE$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UnexpectedErrorMessage" element
     */
    public void setUnexpectedErrorMessage(java.lang.String unexpectedErrorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNEXPECTEDERRORMESSAGE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNEXPECTEDERRORMESSAGE$14);
            }
            target.setStringValue(unexpectedErrorMessage);
        }
    }
    
    /**
     * Sets (as xml) the "UnexpectedErrorMessage" element
     */
    public void xsetUnexpectedErrorMessage(org.apache.xmlbeans.XmlString unexpectedErrorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNEXPECTEDERRORMESSAGE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UNEXPECTEDERRORMESSAGE$14);
            }
            target.set(unexpectedErrorMessage);
        }
    }
    
    /**
     * Gets the "ValidPublications" element
     */
    public com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidPublications getValidPublications()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidPublications target = null;
            target = (com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidPublications)get_store().find_element_user(VALIDPUBLICATIONS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValidPublications" element
     */
    public void setValidPublications(com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidPublications validPublications)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidPublications target = null;
            target = (com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidPublications)get_store().find_element_user(VALIDPUBLICATIONS$16, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidPublications)get_store().add_element_user(VALIDPUBLICATIONS$16);
            }
            target.set(validPublications);
        }
    }
    
    /**
     * Appends and returns a new empty "ValidPublications" element
     */
    public com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidPublications addNewValidPublications()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidPublications target = null;
            target = (com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidPublications)get_store().add_element_user(VALIDPUBLICATIONS$16);
            return target;
        }
    }
    
    /**
     * Gets the "ValidResponses" element
     */
    public com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidResponses getValidResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidResponses target = null;
            target = (com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidResponses)get_store().find_element_user(VALIDRESPONSES$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValidResponses" element
     */
    public void setValidResponses(com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidResponses validResponses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidResponses target = null;
            target = (com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidResponses)get_store().find_element_user(VALIDRESPONSES$18, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidResponses)get_store().add_element_user(VALIDRESPONSES$18);
            }
            target.set(validResponses);
        }
    }
    
    /**
     * Appends and returns a new empty "ValidResponses" element
     */
    public com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidResponses addNewValidResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidResponses target = null;
            target = (com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidResponses)get_store().add_element_user(VALIDRESPONSES$18);
            return target;
        }
    }
    /**
     * An XML ValidPublications(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ValidPublicationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidPublications
    {
        
        public ValidPublicationsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALIDPUBLICATION$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ValidPublication");
        
        
        /**
         * Gets array of all "ValidPublication" elements
         */
        public com.exacttarget.wsdl.partnerapi.List[] getValidPublicationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALIDPUBLICATION$0, targetList);
                com.exacttarget.wsdl.partnerapi.List[] result = new com.exacttarget.wsdl.partnerapi.List[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ValidPublication" element
         */
        public com.exacttarget.wsdl.partnerapi.List getValidPublicationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.List target = null;
                target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(VALIDPUBLICATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ValidPublication" element
         */
        public int sizeOfValidPublicationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALIDPUBLICATION$0);
            }
        }
        
        /**
         * Sets array of all "ValidPublication" element
         */
        public void setValidPublicationArray(com.exacttarget.wsdl.partnerapi.List[] validPublicationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(validPublicationArray, VALIDPUBLICATION$0);
            }
        }
        
        /**
         * Sets ith "ValidPublication" element
         */
        public void setValidPublicationArray(int i, com.exacttarget.wsdl.partnerapi.List validPublication)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.List target = null;
                target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(VALIDPUBLICATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(validPublication);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ValidPublication" element
         */
        public com.exacttarget.wsdl.partnerapi.List insertNewValidPublication(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.List target = null;
                target = (com.exacttarget.wsdl.partnerapi.List)get_store().insert_element_user(VALIDPUBLICATION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ValidPublication" element
         */
        public com.exacttarget.wsdl.partnerapi.List addNewValidPublication()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.List target = null;
                target = (com.exacttarget.wsdl.partnerapi.List)get_store().add_element_user(VALIDPUBLICATION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ValidPublication" element
         */
        public void removeValidPublication(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALIDPUBLICATION$0, i);
            }
        }
    }
    /**
     * An XML ValidResponses(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ValidResponsesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.DoubleOptInMOKeyword.ValidResponses
    {
        
        public ValidResponsesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALIDRESPONSE$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ValidResponse");
        
        
        /**
         * Gets array of all "ValidResponse" elements
         */
        public java.lang.String[] getValidResponseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALIDRESPONSE$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "ValidResponse" element
         */
        public java.lang.String getValidResponseArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDRESPONSE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "ValidResponse" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetValidResponseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALIDRESPONSE$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "ValidResponse" element
         */
        public org.apache.xmlbeans.XmlString xgetValidResponseArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALIDRESPONSE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "ValidResponse" element
         */
        public int sizeOfValidResponseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALIDRESPONSE$0);
            }
        }
        
        /**
         * Sets array of all "ValidResponse" element
         */
        public void setValidResponseArray(java.lang.String[] validResponseArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(validResponseArray, VALIDRESPONSE$0);
            }
        }
        
        /**
         * Sets ith "ValidResponse" element
         */
        public void setValidResponseArray(int i, java.lang.String validResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDRESPONSE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(validResponse);
            }
        }
        
        /**
         * Sets (as xml) array of all "ValidResponse" element
         */
        public void xsetValidResponseArray(org.apache.xmlbeans.XmlString[]validResponseArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(validResponseArray, VALIDRESPONSE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "ValidResponse" element
         */
        public void xsetValidResponseArray(int i, org.apache.xmlbeans.XmlString validResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALIDRESPONSE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(validResponse);
            }
        }
        
        /**
         * Inserts the value as the ith "ValidResponse" element
         */
        public void insertValidResponse(int i, java.lang.String validResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(VALIDRESPONSE$0, i);
                target.setStringValue(validResponse);
            }
        }
        
        /**
         * Appends the value as the last "ValidResponse" element
         */
        public void addValidResponse(java.lang.String validResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDRESPONSE$0);
                target.setStringValue(validResponse);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ValidResponse" element
         */
        public org.apache.xmlbeans.XmlString insertNewValidResponse(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(VALIDRESPONSE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ValidResponse" element
         */
        public org.apache.xmlbeans.XmlString addNewValidResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALIDRESPONSE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ValidResponse" element
         */
        public void removeValidResponse(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALIDRESPONSE$0, i);
            }
        }
    }
}

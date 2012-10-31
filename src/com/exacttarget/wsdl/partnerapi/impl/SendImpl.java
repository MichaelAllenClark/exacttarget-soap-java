/*
 * XML Type:  Send
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Send
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Send(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SendImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.Send
{
    
    public SendImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMAIL$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Email");
    private static final javax.xml.namespace.QName LIST$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "List");
    private static final javax.xml.namespace.QName SENDDATE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendDate");
    private static final javax.xml.namespace.QName FROMADDRESS$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FromAddress");
    private static final javax.xml.namespace.QName FROMNAME$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FromName");
    private static final javax.xml.namespace.QName DUPLICATES$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Duplicates");
    private static final javax.xml.namespace.QName INVALIDADDRESSES$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "InvalidAddresses");
    private static final javax.xml.namespace.QName EXISTINGUNDELIVERABLES$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExistingUndeliverables");
    private static final javax.xml.namespace.QName EXISTINGUNSUBSCRIBES$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExistingUnsubscribes");
    private static final javax.xml.namespace.QName HARDBOUNCES$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "HardBounces");
    private static final javax.xml.namespace.QName SOFTBOUNCES$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SoftBounces");
    private static final javax.xml.namespace.QName OTHERBOUNCES$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OtherBounces");
    private static final javax.xml.namespace.QName FORWARDEDEMAILS$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ForwardedEmails");
    private static final javax.xml.namespace.QName UNIQUECLICKS$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UniqueClicks");
    private static final javax.xml.namespace.QName UNIQUEOPENS$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UniqueOpens");
    private static final javax.xml.namespace.QName NUMBERSENT$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NumberSent");
    private static final javax.xml.namespace.QName NUMBERDELIVERED$32 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NumberDelivered");
    private static final javax.xml.namespace.QName UNSUBSCRIBES$34 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Unsubscribes");
    private static final javax.xml.namespace.QName MISSINGADDRESSES$36 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MissingAddresses");
    private static final javax.xml.namespace.QName SUBJECT$38 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subject");
    private static final javax.xml.namespace.QName PREVIEWURL$40 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PreviewURL");
    private static final javax.xml.namespace.QName LINKS$42 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Links");
    private static final javax.xml.namespace.QName EVENTS$44 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Events");
    private static final javax.xml.namespace.QName SENTDATE$46 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SentDate");
    private static final javax.xml.namespace.QName EMAILNAME$48 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EmailName");
    private static final javax.xml.namespace.QName STATUS$50 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Status");
    private static final javax.xml.namespace.QName ISMULTIPART$52 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsMultipart");
    private static final javax.xml.namespace.QName SENDLIMIT$54 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendLimit");
    private static final javax.xml.namespace.QName SENDWINDOWOPEN$56 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendWindowOpen");
    private static final javax.xml.namespace.QName SENDWINDOWCLOSE$58 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendWindowClose");
    private static final javax.xml.namespace.QName ISALWAYSON$60 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsAlwaysOn");
    private static final javax.xml.namespace.QName SOURCES$62 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Sources");
    private static final javax.xml.namespace.QName NUMBERTARGETED$64 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NumberTargeted");
    private static final javax.xml.namespace.QName NUMBERERRORED$66 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NumberErrored");
    private static final javax.xml.namespace.QName NUMBEREXCLUDED$68 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NumberExcluded");
    private static final javax.xml.namespace.QName ADDITIONAL$70 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Additional");
    private static final javax.xml.namespace.QName BCCEMAIL$72 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BccEmail");
    private static final javax.xml.namespace.QName EMAILSENDDEFINITION$74 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EmailSendDefinition");
    private static final javax.xml.namespace.QName SUPPRESSIONLISTS$76 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SuppressionLists");
    
    
    /**
     * Gets the "Email" element
     */
    public com.exacttarget.wsdl.partnerapi.Email getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Email target = null;
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().find_element_user(EMAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Email" element
     */
    public boolean isSetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAIL$0) != 0;
        }
    }
    
    /**
     * Sets the "Email" element
     */
    public void setEmail(com.exacttarget.wsdl.partnerapi.Email email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Email target = null;
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().find_element_user(EMAIL$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Email)get_store().add_element_user(EMAIL$0);
            }
            target.set(email);
        }
    }
    
    /**
     * Appends and returns a new empty "Email" element
     */
    public com.exacttarget.wsdl.partnerapi.Email addNewEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Email target = null;
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().add_element_user(EMAIL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Email" element
     */
    public void unsetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAIL$0, 0);
        }
    }
    
    /**
     * Gets array of all "List" elements
     */
    public com.exacttarget.wsdl.partnerapi.List[] getListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LIST$2, targetList);
            com.exacttarget.wsdl.partnerapi.List[] result = new com.exacttarget.wsdl.partnerapi.List[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "List" element
     */
    public com.exacttarget.wsdl.partnerapi.List getListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(LIST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "List" element
     */
    public int sizeOfListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIST$2);
        }
    }
    
    /**
     * Sets array of all "List" element
     */
    public void setListArray(com.exacttarget.wsdl.partnerapi.List[] listArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(listArray, LIST$2);
        }
    }
    
    /**
     * Sets ith "List" element
     */
    public void setListArray(int i, com.exacttarget.wsdl.partnerapi.List list)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(LIST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(list);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "List" element
     */
    public com.exacttarget.wsdl.partnerapi.List insertNewList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().insert_element_user(LIST$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "List" element
     */
    public com.exacttarget.wsdl.partnerapi.List addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().add_element_user(LIST$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "List" element
     */
    public void removeList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIST$2, i);
        }
    }
    
    /**
     * Gets the "SendDate" element
     */
    public java.util.Calendar getSendDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetSendDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SENDDATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendDate" element
     */
    public boolean isSetSendDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "SendDate" element
     */
    public void setSendDate(java.util.Calendar sendDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDDATE$4);
            }
            target.setCalendarValue(sendDate);
        }
    }
    
    /**
     * Sets (as xml) the "SendDate" element
     */
    public void xsetSendDate(org.apache.xmlbeans.XmlDateTime sendDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SENDDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SENDDATE$4);
            }
            target.set(sendDate);
        }
    }
    
    /**
     * Unsets the "SendDate" element
     */
    public void unsetSendDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDDATE$4, 0);
        }
    }
    
    /**
     * Gets the "FromAddress" element
     */
    public java.lang.String getFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMADDRESS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FromAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMADDRESS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "FromAddress" element
     */
    public boolean isSetFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FROMADDRESS$6) != 0;
        }
    }
    
    /**
     * Sets the "FromAddress" element
     */
    public void setFromAddress(java.lang.String fromAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMADDRESS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMADDRESS$6);
            }
            target.setStringValue(fromAddress);
        }
    }
    
    /**
     * Sets (as xml) the "FromAddress" element
     */
    public void xsetFromAddress(org.apache.xmlbeans.XmlString fromAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMADDRESS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMADDRESS$6);
            }
            target.set(fromAddress);
        }
    }
    
    /**
     * Unsets the "FromAddress" element
     */
    public void unsetFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FROMADDRESS$6, 0);
        }
    }
    
    /**
     * Gets the "FromName" element
     */
    public java.lang.String getFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FromName" element
     */
    public org.apache.xmlbeans.XmlString xgetFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMNAME$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "FromName" element
     */
    public boolean isSetFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FROMNAME$8) != 0;
        }
    }
    
    /**
     * Sets the "FromName" element
     */
    public void setFromName(java.lang.String fromName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMNAME$8);
            }
            target.setStringValue(fromName);
        }
    }
    
    /**
     * Sets (as xml) the "FromName" element
     */
    public void xsetFromName(org.apache.xmlbeans.XmlString fromName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMNAME$8);
            }
            target.set(fromName);
        }
    }
    
    /**
     * Unsets the "FromName" element
     */
    public void unsetFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FROMNAME$8, 0);
        }
    }
    
    /**
     * Gets the "Duplicates" element
     */
    public int getDuplicates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DUPLICATES$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Duplicates" element
     */
    public org.apache.xmlbeans.XmlInt xgetDuplicates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DUPLICATES$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Duplicates" element
     */
    public boolean isSetDuplicates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DUPLICATES$10) != 0;
        }
    }
    
    /**
     * Sets the "Duplicates" element
     */
    public void setDuplicates(int duplicates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DUPLICATES$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DUPLICATES$10);
            }
            target.setIntValue(duplicates);
        }
    }
    
    /**
     * Sets (as xml) the "Duplicates" element
     */
    public void xsetDuplicates(org.apache.xmlbeans.XmlInt duplicates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DUPLICATES$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DUPLICATES$10);
            }
            target.set(duplicates);
        }
    }
    
    /**
     * Unsets the "Duplicates" element
     */
    public void unsetDuplicates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DUPLICATES$10, 0);
        }
    }
    
    /**
     * Gets the "InvalidAddresses" element
     */
    public int getInvalidAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDADDRESSES$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvalidAddresses" element
     */
    public org.apache.xmlbeans.XmlInt xgetInvalidAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INVALIDADDRESSES$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "InvalidAddresses" element
     */
    public boolean isSetInvalidAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVALIDADDRESSES$12) != 0;
        }
    }
    
    /**
     * Sets the "InvalidAddresses" element
     */
    public void setInvalidAddresses(int invalidAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDADDRESSES$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVALIDADDRESSES$12);
            }
            target.setIntValue(invalidAddresses);
        }
    }
    
    /**
     * Sets (as xml) the "InvalidAddresses" element
     */
    public void xsetInvalidAddresses(org.apache.xmlbeans.XmlInt invalidAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INVALIDADDRESSES$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INVALIDADDRESSES$12);
            }
            target.set(invalidAddresses);
        }
    }
    
    /**
     * Unsets the "InvalidAddresses" element
     */
    public void unsetInvalidAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVALIDADDRESSES$12, 0);
        }
    }
    
    /**
     * Gets the "ExistingUndeliverables" element
     */
    public int getExistingUndeliverables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTINGUNDELIVERABLES$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExistingUndeliverables" element
     */
    public org.apache.xmlbeans.XmlInt xgetExistingUndeliverables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EXISTINGUNDELIVERABLES$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExistingUndeliverables" element
     */
    public boolean isSetExistingUndeliverables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXISTINGUNDELIVERABLES$14) != 0;
        }
    }
    
    /**
     * Sets the "ExistingUndeliverables" element
     */
    public void setExistingUndeliverables(int existingUndeliverables)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTINGUNDELIVERABLES$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXISTINGUNDELIVERABLES$14);
            }
            target.setIntValue(existingUndeliverables);
        }
    }
    
    /**
     * Sets (as xml) the "ExistingUndeliverables" element
     */
    public void xsetExistingUndeliverables(org.apache.xmlbeans.XmlInt existingUndeliverables)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EXISTINGUNDELIVERABLES$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(EXISTINGUNDELIVERABLES$14);
            }
            target.set(existingUndeliverables);
        }
    }
    
    /**
     * Unsets the "ExistingUndeliverables" element
     */
    public void unsetExistingUndeliverables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXISTINGUNDELIVERABLES$14, 0);
        }
    }
    
    /**
     * Gets the "ExistingUnsubscribes" element
     */
    public int getExistingUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTINGUNSUBSCRIBES$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExistingUnsubscribes" element
     */
    public org.apache.xmlbeans.XmlInt xgetExistingUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EXISTINGUNSUBSCRIBES$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExistingUnsubscribes" element
     */
    public boolean isSetExistingUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXISTINGUNSUBSCRIBES$16) != 0;
        }
    }
    
    /**
     * Sets the "ExistingUnsubscribes" element
     */
    public void setExistingUnsubscribes(int existingUnsubscribes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTINGUNSUBSCRIBES$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXISTINGUNSUBSCRIBES$16);
            }
            target.setIntValue(existingUnsubscribes);
        }
    }
    
    /**
     * Sets (as xml) the "ExistingUnsubscribes" element
     */
    public void xsetExistingUnsubscribes(org.apache.xmlbeans.XmlInt existingUnsubscribes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EXISTINGUNSUBSCRIBES$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(EXISTINGUNSUBSCRIBES$16);
            }
            target.set(existingUnsubscribes);
        }
    }
    
    /**
     * Unsets the "ExistingUnsubscribes" element
     */
    public void unsetExistingUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXISTINGUNSUBSCRIBES$16, 0);
        }
    }
    
    /**
     * Gets the "HardBounces" element
     */
    public int getHardBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HARDBOUNCES$18, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "HardBounces" element
     */
    public org.apache.xmlbeans.XmlInt xgetHardBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HARDBOUNCES$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "HardBounces" element
     */
    public boolean isSetHardBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HARDBOUNCES$18) != 0;
        }
    }
    
    /**
     * Sets the "HardBounces" element
     */
    public void setHardBounces(int hardBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HARDBOUNCES$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HARDBOUNCES$18);
            }
            target.setIntValue(hardBounces);
        }
    }
    
    /**
     * Sets (as xml) the "HardBounces" element
     */
    public void xsetHardBounces(org.apache.xmlbeans.XmlInt hardBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HARDBOUNCES$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HARDBOUNCES$18);
            }
            target.set(hardBounces);
        }
    }
    
    /**
     * Unsets the "HardBounces" element
     */
    public void unsetHardBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HARDBOUNCES$18, 0);
        }
    }
    
    /**
     * Gets the "SoftBounces" element
     */
    public int getSoftBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFTBOUNCES$20, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SoftBounces" element
     */
    public org.apache.xmlbeans.XmlInt xgetSoftBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOFTBOUNCES$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "SoftBounces" element
     */
    public boolean isSetSoftBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTBOUNCES$20) != 0;
        }
    }
    
    /**
     * Sets the "SoftBounces" element
     */
    public void setSoftBounces(int softBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFTBOUNCES$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOFTBOUNCES$20);
            }
            target.setIntValue(softBounces);
        }
    }
    
    /**
     * Sets (as xml) the "SoftBounces" element
     */
    public void xsetSoftBounces(org.apache.xmlbeans.XmlInt softBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOFTBOUNCES$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOFTBOUNCES$20);
            }
            target.set(softBounces);
        }
    }
    
    /**
     * Unsets the "SoftBounces" element
     */
    public void unsetSoftBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTBOUNCES$20, 0);
        }
    }
    
    /**
     * Gets the "OtherBounces" element
     */
    public int getOtherBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERBOUNCES$22, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "OtherBounces" element
     */
    public org.apache.xmlbeans.XmlInt xgetOtherBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OTHERBOUNCES$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "OtherBounces" element
     */
    public boolean isSetOtherBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHERBOUNCES$22) != 0;
        }
    }
    
    /**
     * Sets the "OtherBounces" element
     */
    public void setOtherBounces(int otherBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERBOUNCES$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OTHERBOUNCES$22);
            }
            target.setIntValue(otherBounces);
        }
    }
    
    /**
     * Sets (as xml) the "OtherBounces" element
     */
    public void xsetOtherBounces(org.apache.xmlbeans.XmlInt otherBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OTHERBOUNCES$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OTHERBOUNCES$22);
            }
            target.set(otherBounces);
        }
    }
    
    /**
     * Unsets the "OtherBounces" element
     */
    public void unsetOtherBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHERBOUNCES$22, 0);
        }
    }
    
    /**
     * Gets the "ForwardedEmails" element
     */
    public int getForwardedEmails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORWARDEDEMAILS$24, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ForwardedEmails" element
     */
    public org.apache.xmlbeans.XmlInt xgetForwardedEmails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FORWARDEDEMAILS$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "ForwardedEmails" element
     */
    public boolean isSetForwardedEmails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORWARDEDEMAILS$24) != 0;
        }
    }
    
    /**
     * Sets the "ForwardedEmails" element
     */
    public void setForwardedEmails(int forwardedEmails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORWARDEDEMAILS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORWARDEDEMAILS$24);
            }
            target.setIntValue(forwardedEmails);
        }
    }
    
    /**
     * Sets (as xml) the "ForwardedEmails" element
     */
    public void xsetForwardedEmails(org.apache.xmlbeans.XmlInt forwardedEmails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FORWARDEDEMAILS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FORWARDEDEMAILS$24);
            }
            target.set(forwardedEmails);
        }
    }
    
    /**
     * Unsets the "ForwardedEmails" element
     */
    public void unsetForwardedEmails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORWARDEDEMAILS$24, 0);
        }
    }
    
    /**
     * Gets the "UniqueClicks" element
     */
    public int getUniqueClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUECLICKS$26, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "UniqueClicks" element
     */
    public org.apache.xmlbeans.XmlInt xgetUniqueClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNIQUECLICKS$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "UniqueClicks" element
     */
    public boolean isSetUniqueClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUECLICKS$26) != 0;
        }
    }
    
    /**
     * Sets the "UniqueClicks" element
     */
    public void setUniqueClicks(int uniqueClicks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUECLICKS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIQUECLICKS$26);
            }
            target.setIntValue(uniqueClicks);
        }
    }
    
    /**
     * Sets (as xml) the "UniqueClicks" element
     */
    public void xsetUniqueClicks(org.apache.xmlbeans.XmlInt uniqueClicks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNIQUECLICKS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(UNIQUECLICKS$26);
            }
            target.set(uniqueClicks);
        }
    }
    
    /**
     * Unsets the "UniqueClicks" element
     */
    public void unsetUniqueClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUECLICKS$26, 0);
        }
    }
    
    /**
     * Gets the "UniqueOpens" element
     */
    public int getUniqueOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUEOPENS$28, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "UniqueOpens" element
     */
    public org.apache.xmlbeans.XmlInt xgetUniqueOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNIQUEOPENS$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "UniqueOpens" element
     */
    public boolean isSetUniqueOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUEOPENS$28) != 0;
        }
    }
    
    /**
     * Sets the "UniqueOpens" element
     */
    public void setUniqueOpens(int uniqueOpens)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUEOPENS$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIQUEOPENS$28);
            }
            target.setIntValue(uniqueOpens);
        }
    }
    
    /**
     * Sets (as xml) the "UniqueOpens" element
     */
    public void xsetUniqueOpens(org.apache.xmlbeans.XmlInt uniqueOpens)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNIQUEOPENS$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(UNIQUEOPENS$28);
            }
            target.set(uniqueOpens);
        }
    }
    
    /**
     * Unsets the "UniqueOpens" element
     */
    public void unsetUniqueOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUEOPENS$28, 0);
        }
    }
    
    /**
     * Gets the "NumberSent" element
     */
    public int getNumberSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERSENT$30, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberSent" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERSENT$30, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "NumberSent" element
     */
    public boolean isNilNumberSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERSENT$30, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "NumberSent" element
     */
    public boolean isSetNumberSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBERSENT$30) != 0;
        }
    }
    
    /**
     * Sets the "NumberSent" element
     */
    public void setNumberSent(int numberSent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERSENT$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERSENT$30);
            }
            target.setIntValue(numberSent);
        }
    }
    
    /**
     * Sets (as xml) the "NumberSent" element
     */
    public void xsetNumberSent(org.apache.xmlbeans.XmlInt numberSent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERSENT$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBERSENT$30);
            }
            target.set(numberSent);
        }
    }
    
    /**
     * Nils the "NumberSent" element
     */
    public void setNilNumberSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERSENT$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBERSENT$30);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "NumberSent" element
     */
    public void unsetNumberSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBERSENT$30, 0);
        }
    }
    
    /**
     * Gets the "NumberDelivered" element
     */
    public int getNumberDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERDELIVERED$32, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberDelivered" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERDELIVERED$32, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "NumberDelivered" element
     */
    public boolean isNilNumberDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERDELIVERED$32, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "NumberDelivered" element
     */
    public boolean isSetNumberDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBERDELIVERED$32) != 0;
        }
    }
    
    /**
     * Sets the "NumberDelivered" element
     */
    public void setNumberDelivered(int numberDelivered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERDELIVERED$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERDELIVERED$32);
            }
            target.setIntValue(numberDelivered);
        }
    }
    
    /**
     * Sets (as xml) the "NumberDelivered" element
     */
    public void xsetNumberDelivered(org.apache.xmlbeans.XmlInt numberDelivered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERDELIVERED$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBERDELIVERED$32);
            }
            target.set(numberDelivered);
        }
    }
    
    /**
     * Nils the "NumberDelivered" element
     */
    public void setNilNumberDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERDELIVERED$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBERDELIVERED$32);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "NumberDelivered" element
     */
    public void unsetNumberDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBERDELIVERED$32, 0);
        }
    }
    
    /**
     * Gets the "Unsubscribes" element
     */
    public int getUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSUBSCRIBES$34, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Unsubscribes" element
     */
    public org.apache.xmlbeans.XmlInt xgetUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNSUBSCRIBES$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "Unsubscribes" element
     */
    public boolean isSetUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNSUBSCRIBES$34) != 0;
        }
    }
    
    /**
     * Sets the "Unsubscribes" element
     */
    public void setUnsubscribes(int unsubscribes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSUBSCRIBES$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSUBSCRIBES$34);
            }
            target.setIntValue(unsubscribes);
        }
    }
    
    /**
     * Sets (as xml) the "Unsubscribes" element
     */
    public void xsetUnsubscribes(org.apache.xmlbeans.XmlInt unsubscribes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNSUBSCRIBES$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(UNSUBSCRIBES$34);
            }
            target.set(unsubscribes);
        }
    }
    
    /**
     * Unsets the "Unsubscribes" element
     */
    public void unsetUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNSUBSCRIBES$34, 0);
        }
    }
    
    /**
     * Gets the "MissingAddresses" element
     */
    public int getMissingAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISSINGADDRESSES$36, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MissingAddresses" element
     */
    public org.apache.xmlbeans.XmlInt xgetMissingAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MISSINGADDRESSES$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "MissingAddresses" element
     */
    public boolean isSetMissingAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MISSINGADDRESSES$36) != 0;
        }
    }
    
    /**
     * Sets the "MissingAddresses" element
     */
    public void setMissingAddresses(int missingAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISSINGADDRESSES$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MISSINGADDRESSES$36);
            }
            target.setIntValue(missingAddresses);
        }
    }
    
    /**
     * Sets (as xml) the "MissingAddresses" element
     */
    public void xsetMissingAddresses(org.apache.xmlbeans.XmlInt missingAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MISSINGADDRESSES$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MISSINGADDRESSES$36);
            }
            target.set(missingAddresses);
        }
    }
    
    /**
     * Unsets the "MissingAddresses" element
     */
    public void unsetMissingAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MISSINGADDRESSES$36, 0);
        }
    }
    
    /**
     * Gets the "Subject" element
     */
    public java.lang.String getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Subject" element
     */
    public org.apache.xmlbeans.XmlString xgetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "Subject" element
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$38) != 0;
        }
    }
    
    /**
     * Sets the "Subject" element
     */
    public void setSubject(java.lang.String subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECT$38);
            }
            target.setStringValue(subject);
        }
    }
    
    /**
     * Sets (as xml) the "Subject" element
     */
    public void xsetSubject(org.apache.xmlbeans.XmlString subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBJECT$38);
            }
            target.set(subject);
        }
    }
    
    /**
     * Unsets the "Subject" element
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$38, 0);
        }
    }
    
    /**
     * Gets the "PreviewURL" element
     */
    public java.lang.String getPreviewURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIEWURL$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PreviewURL" element
     */
    public org.apache.xmlbeans.XmlString xgetPreviewURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREVIEWURL$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "PreviewURL" element
     */
    public boolean isSetPreviewURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREVIEWURL$40) != 0;
        }
    }
    
    /**
     * Sets the "PreviewURL" element
     */
    public void setPreviewURL(java.lang.String previewURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIEWURL$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREVIEWURL$40);
            }
            target.setStringValue(previewURL);
        }
    }
    
    /**
     * Sets (as xml) the "PreviewURL" element
     */
    public void xsetPreviewURL(org.apache.xmlbeans.XmlString previewURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREVIEWURL$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREVIEWURL$40);
            }
            target.set(previewURL);
        }
    }
    
    /**
     * Unsets the "PreviewURL" element
     */
    public void unsetPreviewURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREVIEWURL$40, 0);
        }
    }
    
    /**
     * Gets array of all "Links" elements
     */
    public com.exacttarget.wsdl.partnerapi.Link[] getLinksArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINKS$42, targetList);
            com.exacttarget.wsdl.partnerapi.Link[] result = new com.exacttarget.wsdl.partnerapi.Link[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Links" element
     */
    public com.exacttarget.wsdl.partnerapi.Link getLinksArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Link target = null;
            target = (com.exacttarget.wsdl.partnerapi.Link)get_store().find_element_user(LINKS$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Links" element
     */
    public int sizeOfLinksArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKS$42);
        }
    }
    
    /**
     * Sets array of all "Links" element
     */
    public void setLinksArray(com.exacttarget.wsdl.partnerapi.Link[] linksArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linksArray, LINKS$42);
        }
    }
    
    /**
     * Sets ith "Links" element
     */
    public void setLinksArray(int i, com.exacttarget.wsdl.partnerapi.Link links)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Link target = null;
            target = (com.exacttarget.wsdl.partnerapi.Link)get_store().find_element_user(LINKS$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(links);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Links" element
     */
    public com.exacttarget.wsdl.partnerapi.Link insertNewLinks(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Link target = null;
            target = (com.exacttarget.wsdl.partnerapi.Link)get_store().insert_element_user(LINKS$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Links" element
     */
    public com.exacttarget.wsdl.partnerapi.Link addNewLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Link target = null;
            target = (com.exacttarget.wsdl.partnerapi.Link)get_store().add_element_user(LINKS$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "Links" element
     */
    public void removeLinks(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKS$42, i);
        }
    }
    
    /**
     * Gets array of all "Events" elements
     */
    public com.exacttarget.wsdl.partnerapi.TrackingEvent[] getEventsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENTS$44, targetList);
            com.exacttarget.wsdl.partnerapi.TrackingEvent[] result = new com.exacttarget.wsdl.partnerapi.TrackingEvent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Events" element
     */
    public com.exacttarget.wsdl.partnerapi.TrackingEvent getEventsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TrackingEvent target = null;
            target = (com.exacttarget.wsdl.partnerapi.TrackingEvent)get_store().find_element_user(EVENTS$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Events" element
     */
    public int sizeOfEventsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTS$44);
        }
    }
    
    /**
     * Sets array of all "Events" element
     */
    public void setEventsArray(com.exacttarget.wsdl.partnerapi.TrackingEvent[] eventsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventsArray, EVENTS$44);
        }
    }
    
    /**
     * Sets ith "Events" element
     */
    public void setEventsArray(int i, com.exacttarget.wsdl.partnerapi.TrackingEvent events)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TrackingEvent target = null;
            target = (com.exacttarget.wsdl.partnerapi.TrackingEvent)get_store().find_element_user(EVENTS$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(events);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Events" element
     */
    public com.exacttarget.wsdl.partnerapi.TrackingEvent insertNewEvents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TrackingEvent target = null;
            target = (com.exacttarget.wsdl.partnerapi.TrackingEvent)get_store().insert_element_user(EVENTS$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Events" element
     */
    public com.exacttarget.wsdl.partnerapi.TrackingEvent addNewEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TrackingEvent target = null;
            target = (com.exacttarget.wsdl.partnerapi.TrackingEvent)get_store().add_element_user(EVENTS$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "Events" element
     */
    public void removeEvents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTS$44, i);
        }
    }
    
    /**
     * Gets the "SentDate" element
     */
    public java.util.Calendar getSentDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTDATE$46, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SentDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetSentDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SENTDATE$46, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SentDate" element
     */
    public boolean isNilSentDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SENTDATE$46, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SentDate" element
     */
    public boolean isSetSentDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENTDATE$46) != 0;
        }
    }
    
    /**
     * Sets the "SentDate" element
     */
    public void setSentDate(java.util.Calendar sentDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTDATE$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENTDATE$46);
            }
            target.setCalendarValue(sentDate);
        }
    }
    
    /**
     * Sets (as xml) the "SentDate" element
     */
    public void xsetSentDate(org.apache.xmlbeans.XmlDateTime sentDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SENTDATE$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SENTDATE$46);
            }
            target.set(sentDate);
        }
    }
    
    /**
     * Nils the "SentDate" element
     */
    public void setNilSentDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SENTDATE$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SENTDATE$46);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SentDate" element
     */
    public void unsetSentDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENTDATE$46, 0);
        }
    }
    
    /**
     * Gets the "EmailName" element
     */
    public java.lang.String getEmailName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILNAME$48, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmailName" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILNAME$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "EmailName" element
     */
    public boolean isSetEmailName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILNAME$48) != 0;
        }
    }
    
    /**
     * Sets the "EmailName" element
     */
    public void setEmailName(java.lang.String emailName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILNAME$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILNAME$48);
            }
            target.setStringValue(emailName);
        }
    }
    
    /**
     * Sets (as xml) the "EmailName" element
     */
    public void xsetEmailName(org.apache.xmlbeans.XmlString emailName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILNAME$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILNAME$48);
            }
            target.set(emailName);
        }
    }
    
    /**
     * Unsets the "EmailName" element
     */
    public void unsetEmailName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILNAME$48, 0);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$50, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "Status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$50) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$50);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$50);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$50, 0);
        }
    }
    
    /**
     * Gets the "IsMultipart" element
     */
    public boolean getIsMultipart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMULTIPART$52, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsMultipart" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsMultipart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMULTIPART$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsMultipart" element
     */
    public boolean isSetIsMultipart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISMULTIPART$52) != 0;
        }
    }
    
    /**
     * Sets the "IsMultipart" element
     */
    public void setIsMultipart(boolean isMultipart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMULTIPART$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISMULTIPART$52);
            }
            target.setBooleanValue(isMultipart);
        }
    }
    
    /**
     * Sets (as xml) the "IsMultipart" element
     */
    public void xsetIsMultipart(org.apache.xmlbeans.XmlBoolean isMultipart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMULTIPART$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMULTIPART$52);
            }
            target.set(isMultipart);
        }
    }
    
    /**
     * Unsets the "IsMultipart" element
     */
    public void unsetIsMultipart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISMULTIPART$52, 0);
        }
    }
    
    /**
     * Gets the "SendLimit" element
     */
    public int getSendLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDLIMIT$54, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendLimit" element
     */
    public org.apache.xmlbeans.XmlInt xgetSendLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SENDLIMIT$54, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendLimit" element
     */
    public boolean isSetSendLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDLIMIT$54) != 0;
        }
    }
    
    /**
     * Sets the "SendLimit" element
     */
    public void setSendLimit(int sendLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDLIMIT$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDLIMIT$54);
            }
            target.setIntValue(sendLimit);
        }
    }
    
    /**
     * Sets (as xml) the "SendLimit" element
     */
    public void xsetSendLimit(org.apache.xmlbeans.XmlInt sendLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SENDLIMIT$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SENDLIMIT$54);
            }
            target.set(sendLimit);
        }
    }
    
    /**
     * Unsets the "SendLimit" element
     */
    public void unsetSendLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDLIMIT$54, 0);
        }
    }
    
    /**
     * Gets the "SendWindowOpen" element
     */
    public java.util.Calendar getSendWindowOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWOPEN$56, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendWindowOpen" element
     */
    public org.apache.xmlbeans.XmlTime xgetSendWindowOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(SENDWINDOWOPEN$56, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendWindowOpen" element
     */
    public boolean isSetSendWindowOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDWINDOWOPEN$56) != 0;
        }
    }
    
    /**
     * Sets the "SendWindowOpen" element
     */
    public void setSendWindowOpen(java.util.Calendar sendWindowOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWOPEN$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDWINDOWOPEN$56);
            }
            target.setCalendarValue(sendWindowOpen);
        }
    }
    
    /**
     * Sets (as xml) the "SendWindowOpen" element
     */
    public void xsetSendWindowOpen(org.apache.xmlbeans.XmlTime sendWindowOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(SENDWINDOWOPEN$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(SENDWINDOWOPEN$56);
            }
            target.set(sendWindowOpen);
        }
    }
    
    /**
     * Unsets the "SendWindowOpen" element
     */
    public void unsetSendWindowOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDWINDOWOPEN$56, 0);
        }
    }
    
    /**
     * Gets the "SendWindowClose" element
     */
    public java.util.Calendar getSendWindowClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWCLOSE$58, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendWindowClose" element
     */
    public org.apache.xmlbeans.XmlTime xgetSendWindowClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(SENDWINDOWCLOSE$58, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendWindowClose" element
     */
    public boolean isSetSendWindowClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDWINDOWCLOSE$58) != 0;
        }
    }
    
    /**
     * Sets the "SendWindowClose" element
     */
    public void setSendWindowClose(java.util.Calendar sendWindowClose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWCLOSE$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDWINDOWCLOSE$58);
            }
            target.setCalendarValue(sendWindowClose);
        }
    }
    
    /**
     * Sets (as xml) the "SendWindowClose" element
     */
    public void xsetSendWindowClose(org.apache.xmlbeans.XmlTime sendWindowClose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(SENDWINDOWCLOSE$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(SENDWINDOWCLOSE$58);
            }
            target.set(sendWindowClose);
        }
    }
    
    /**
     * Unsets the "SendWindowClose" element
     */
    public void unsetSendWindowClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDWINDOWCLOSE$58, 0);
        }
    }
    
    /**
     * Gets the "IsAlwaysOn" element
     */
    public boolean getIsAlwaysOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISALWAYSON$60, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsAlwaysOn" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsAlwaysOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISALWAYSON$60, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsAlwaysOn" element
     */
    public boolean isSetIsAlwaysOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISALWAYSON$60) != 0;
        }
    }
    
    /**
     * Sets the "IsAlwaysOn" element
     */
    public void setIsAlwaysOn(boolean isAlwaysOn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISALWAYSON$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISALWAYSON$60);
            }
            target.setBooleanValue(isAlwaysOn);
        }
    }
    
    /**
     * Sets (as xml) the "IsAlwaysOn" element
     */
    public void xsetIsAlwaysOn(org.apache.xmlbeans.XmlBoolean isAlwaysOn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISALWAYSON$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISALWAYSON$60);
            }
            target.set(isAlwaysOn);
        }
    }
    
    /**
     * Unsets the "IsAlwaysOn" element
     */
    public void unsetIsAlwaysOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISALWAYSON$60, 0);
        }
    }
    
    /**
     * Gets the "Sources" element
     */
    public com.exacttarget.wsdl.partnerapi.Send.Sources getSources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send.Sources target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send.Sources)get_store().find_element_user(SOURCES$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Sources" element
     */
    public boolean isSetSources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCES$62) != 0;
        }
    }
    
    /**
     * Sets the "Sources" element
     */
    public void setSources(com.exacttarget.wsdl.partnerapi.Send.Sources sources)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send.Sources target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send.Sources)get_store().find_element_user(SOURCES$62, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Send.Sources)get_store().add_element_user(SOURCES$62);
            }
            target.set(sources);
        }
    }
    
    /**
     * Appends and returns a new empty "Sources" element
     */
    public com.exacttarget.wsdl.partnerapi.Send.Sources addNewSources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send.Sources target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send.Sources)get_store().add_element_user(SOURCES$62);
            return target;
        }
    }
    
    /**
     * Unsets the "Sources" element
     */
    public void unsetSources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCES$62, 0);
        }
    }
    
    /**
     * Gets the "NumberTargeted" element
     */
    public int getNumberTargeted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERTARGETED$64, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberTargeted" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberTargeted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERTARGETED$64, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberTargeted" element
     */
    public boolean isSetNumberTargeted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBERTARGETED$64) != 0;
        }
    }
    
    /**
     * Sets the "NumberTargeted" element
     */
    public void setNumberTargeted(int numberTargeted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERTARGETED$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERTARGETED$64);
            }
            target.setIntValue(numberTargeted);
        }
    }
    
    /**
     * Sets (as xml) the "NumberTargeted" element
     */
    public void xsetNumberTargeted(org.apache.xmlbeans.XmlInt numberTargeted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERTARGETED$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBERTARGETED$64);
            }
            target.set(numberTargeted);
        }
    }
    
    /**
     * Unsets the "NumberTargeted" element
     */
    public void unsetNumberTargeted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBERTARGETED$64, 0);
        }
    }
    
    /**
     * Gets the "NumberErrored" element
     */
    public int getNumberErrored()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERERRORED$66, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberErrored" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberErrored()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERERRORED$66, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberErrored" element
     */
    public boolean isSetNumberErrored()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBERERRORED$66) != 0;
        }
    }
    
    /**
     * Sets the "NumberErrored" element
     */
    public void setNumberErrored(int numberErrored)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERERRORED$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERERRORED$66);
            }
            target.setIntValue(numberErrored);
        }
    }
    
    /**
     * Sets (as xml) the "NumberErrored" element
     */
    public void xsetNumberErrored(org.apache.xmlbeans.XmlInt numberErrored)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERERRORED$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBERERRORED$66);
            }
            target.set(numberErrored);
        }
    }
    
    /**
     * Unsets the "NumberErrored" element
     */
    public void unsetNumberErrored()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBERERRORED$66, 0);
        }
    }
    
    /**
     * Gets the "NumberExcluded" element
     */
    public int getNumberExcluded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEREXCLUDED$68, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberExcluded" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberExcluded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEREXCLUDED$68, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberExcluded" element
     */
    public boolean isSetNumberExcluded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEREXCLUDED$68) != 0;
        }
    }
    
    /**
     * Sets the "NumberExcluded" element
     */
    public void setNumberExcluded(int numberExcluded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEREXCLUDED$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEREXCLUDED$68);
            }
            target.setIntValue(numberExcluded);
        }
    }
    
    /**
     * Sets (as xml) the "NumberExcluded" element
     */
    public void xsetNumberExcluded(org.apache.xmlbeans.XmlInt numberExcluded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEREXCLUDED$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEREXCLUDED$68);
            }
            target.set(numberExcluded);
        }
    }
    
    /**
     * Unsets the "NumberExcluded" element
     */
    public void unsetNumberExcluded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEREXCLUDED$68, 0);
        }
    }
    
    /**
     * Gets the "Additional" element
     */
    public java.lang.String getAdditional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONAL$70, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Additional" element
     */
    public org.apache.xmlbeans.XmlString xgetAdditional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONAL$70, 0);
            return target;
        }
    }
    
    /**
     * True if has "Additional" element
     */
    public boolean isSetAdditional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONAL$70) != 0;
        }
    }
    
    /**
     * Sets the "Additional" element
     */
    public void setAdditional(java.lang.String additional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONAL$70, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDITIONAL$70);
            }
            target.setStringValue(additional);
        }
    }
    
    /**
     * Sets (as xml) the "Additional" element
     */
    public void xsetAdditional(org.apache.xmlbeans.XmlString additional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONAL$70, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDITIONAL$70);
            }
            target.set(additional);
        }
    }
    
    /**
     * Unsets the "Additional" element
     */
    public void unsetAdditional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONAL$70, 0);
        }
    }
    
    /**
     * Gets the "BccEmail" element
     */
    public java.lang.String getBccEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BCCEMAIL$72, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BccEmail" element
     */
    public org.apache.xmlbeans.XmlString xgetBccEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BCCEMAIL$72, 0);
            return target;
        }
    }
    
    /**
     * True if has "BccEmail" element
     */
    public boolean isSetBccEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BCCEMAIL$72) != 0;
        }
    }
    
    /**
     * Sets the "BccEmail" element
     */
    public void setBccEmail(java.lang.String bccEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BCCEMAIL$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BCCEMAIL$72);
            }
            target.setStringValue(bccEmail);
        }
    }
    
    /**
     * Sets (as xml) the "BccEmail" element
     */
    public void xsetBccEmail(org.apache.xmlbeans.XmlString bccEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BCCEMAIL$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BCCEMAIL$72);
            }
            target.set(bccEmail);
        }
    }
    
    /**
     * Unsets the "BccEmail" element
     */
    public void unsetBccEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BCCEMAIL$72, 0);
        }
    }
    
    /**
     * Gets the "EmailSendDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.EmailSendDefinition getEmailSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailSendDefinition)get_store().find_element_user(EMAILSENDDEFINITION$74, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EmailSendDefinition" element
     */
    public boolean isSetEmailSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILSENDDEFINITION$74) != 0;
        }
    }
    
    /**
     * Sets the "EmailSendDefinition" element
     */
    public void setEmailSendDefinition(com.exacttarget.wsdl.partnerapi.EmailSendDefinition emailSendDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailSendDefinition)get_store().find_element_user(EMAILSENDDEFINITION$74, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.EmailSendDefinition)get_store().add_element_user(EMAILSENDDEFINITION$74);
            }
            target.set(emailSendDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "EmailSendDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.EmailSendDefinition addNewEmailSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailSendDefinition)get_store().add_element_user(EMAILSENDDEFINITION$74);
            return target;
        }
    }
    
    /**
     * Unsets the "EmailSendDefinition" element
     */
    public void unsetEmailSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILSENDDEFINITION$74, 0);
        }
    }
    
    /**
     * Gets the "SuppressionLists" element
     */
    public com.exacttarget.wsdl.partnerapi.Send.SuppressionLists getSuppressionLists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send.SuppressionLists target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send.SuppressionLists)get_store().find_element_user(SUPPRESSIONLISTS$76, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SuppressionLists" element
     */
    public boolean isSetSuppressionLists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPRESSIONLISTS$76) != 0;
        }
    }
    
    /**
     * Sets the "SuppressionLists" element
     */
    public void setSuppressionLists(com.exacttarget.wsdl.partnerapi.Send.SuppressionLists suppressionLists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send.SuppressionLists target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send.SuppressionLists)get_store().find_element_user(SUPPRESSIONLISTS$76, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Send.SuppressionLists)get_store().add_element_user(SUPPRESSIONLISTS$76);
            }
            target.set(suppressionLists);
        }
    }
    
    /**
     * Appends and returns a new empty "SuppressionLists" element
     */
    public com.exacttarget.wsdl.partnerapi.Send.SuppressionLists addNewSuppressionLists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send.SuppressionLists target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send.SuppressionLists)get_store().add_element_user(SUPPRESSIONLISTS$76);
            return target;
        }
    }
    
    /**
     * Unsets the "SuppressionLists" element
     */
    public void unsetSuppressionLists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPRESSIONLISTS$76, 0);
        }
    }
    /**
     * An XML Sources(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class SourcesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.Send.Sources
    {
        
        public SourcesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Source");
        
        
        /**
         * Gets array of all "Source" elements
         */
        public com.exacttarget.wsdl.partnerapi.APIObject[] getSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SOURCE$0, targetList);
                com.exacttarget.wsdl.partnerapi.APIObject[] result = new com.exacttarget.wsdl.partnerapi.APIObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Source" element
         */
        public com.exacttarget.wsdl.partnerapi.APIObject getSourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIObject target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(SOURCE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Source" element
         */
        public int sizeOfSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCE$0);
            }
        }
        
        /**
         * Sets array of all "Source" element
         */
        public void setSourceArray(com.exacttarget.wsdl.partnerapi.APIObject[] sourceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourceArray, SOURCE$0);
            }
        }
        
        /**
         * Sets ith "Source" element
         */
        public void setSourceArray(int i, com.exacttarget.wsdl.partnerapi.APIObject source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIObject target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(SOURCE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(source);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Source" element
         */
        public com.exacttarget.wsdl.partnerapi.APIObject insertNewSource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIObject target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().insert_element_user(SOURCE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Source" element
         */
        public com.exacttarget.wsdl.partnerapi.APIObject addNewSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIObject target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(SOURCE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Source" element
         */
        public void removeSource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCE$0, i);
            }
        }
    }
    /**
     * An XML SuppressionLists(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class SuppressionListsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.Send.SuppressionLists
    {
        
        public SuppressionListsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUPPRESSIONLIST$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SuppressionList");
        
        
        /**
         * Gets array of all "SuppressionList" elements
         */
        public com.exacttarget.wsdl.partnerapi.AudienceItem[] getSuppressionListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUPPRESSIONLIST$0, targetList);
                com.exacttarget.wsdl.partnerapi.AudienceItem[] result = new com.exacttarget.wsdl.partnerapi.AudienceItem[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SuppressionList" element
         */
        public com.exacttarget.wsdl.partnerapi.AudienceItem getSuppressionListArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.AudienceItem target = null;
                target = (com.exacttarget.wsdl.partnerapi.AudienceItem)get_store().find_element_user(SUPPRESSIONLIST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SuppressionList" element
         */
        public int sizeOfSuppressionListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUPPRESSIONLIST$0);
            }
        }
        
        /**
         * Sets array of all "SuppressionList" element
         */
        public void setSuppressionListArray(com.exacttarget.wsdl.partnerapi.AudienceItem[] suppressionListArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(suppressionListArray, SUPPRESSIONLIST$0);
            }
        }
        
        /**
         * Sets ith "SuppressionList" element
         */
        public void setSuppressionListArray(int i, com.exacttarget.wsdl.partnerapi.AudienceItem suppressionList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.AudienceItem target = null;
                target = (com.exacttarget.wsdl.partnerapi.AudienceItem)get_store().find_element_user(SUPPRESSIONLIST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(suppressionList);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SuppressionList" element
         */
        public com.exacttarget.wsdl.partnerapi.AudienceItem insertNewSuppressionList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.AudienceItem target = null;
                target = (com.exacttarget.wsdl.partnerapi.AudienceItem)get_store().insert_element_user(SUPPRESSIONLIST$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SuppressionList" element
         */
        public com.exacttarget.wsdl.partnerapi.AudienceItem addNewSuppressionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.AudienceItem target = null;
                target = (com.exacttarget.wsdl.partnerapi.AudienceItem)get_store().add_element_user(SUPPRESSIONLIST$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "SuppressionList" element
         */
        public void removeSuppressionList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUPPRESSIONLIST$0, i);
            }
        }
    }
}

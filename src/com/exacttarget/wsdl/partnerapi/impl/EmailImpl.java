/*
 * XML Type:  Email
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Email
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Email(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class EmailImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.Email
{
    
    public EmailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName FOLDER$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Folder");
    private static final javax.xml.namespace.QName CATEGORYID$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CategoryID");
    private static final javax.xml.namespace.QName HTMLBODY$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "HTMLBody");
    private static final javax.xml.namespace.QName TEXTBODY$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TextBody");
    private static final javax.xml.namespace.QName CONTENTAREAS$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ContentAreas");
    private static final javax.xml.namespace.QName SUBJECT$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subject");
    private static final javax.xml.namespace.QName ISACTIVE$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsActive");
    private static final javax.xml.namespace.QName ISHTMLPASTE$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsHTMLPaste");
    private static final javax.xml.namespace.QName CLONEDFROMID$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ClonedFromID");
    private static final javax.xml.namespace.QName STATUS$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Status");
    private static final javax.xml.namespace.QName EMAILTYPE$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EmailType");
    private static final javax.xml.namespace.QName CHARACTERSET$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CharacterSet");
    private static final javax.xml.namespace.QName HASDYNAMICSUBJECTLINE$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "HasDynamicSubjectLine");
    private static final javax.xml.namespace.QName CONTENTCHECKSTATUS$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ContentCheckStatus");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "Folder" element
     */
    public java.lang.String getFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLDER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Folder" element
     */
    public org.apache.xmlbeans.XmlString xgetFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FOLDER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Folder" element
     */
    public boolean isSetFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOLDER$2) != 0;
        }
    }
    
    /**
     * Sets the "Folder" element
     */
    public void setFolder(java.lang.String folder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLDER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOLDER$2);
            }
            target.setStringValue(folder);
        }
    }
    
    /**
     * Sets (as xml) the "Folder" element
     */
    public void xsetFolder(org.apache.xmlbeans.XmlString folder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FOLDER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FOLDER$2);
            }
            target.set(folder);
        }
    }
    
    /**
     * Unsets the "Folder" element
     */
    public void unsetFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOLDER$2, 0);
        }
    }
    
    /**
     * Gets the "CategoryID" element
     */
    public int getCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYID$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CategoryID" element
     */
    public org.apache.xmlbeans.XmlInt xgetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATEGORYID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CategoryID" element
     */
    public boolean isSetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYID$4) != 0;
        }
    }
    
    /**
     * Sets the "CategoryID" element
     */
    public void setCategoryID(int categoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYID$4);
            }
            target.setIntValue(categoryID);
        }
    }
    
    /**
     * Sets (as xml) the "CategoryID" element
     */
    public void xsetCategoryID(org.apache.xmlbeans.XmlInt categoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATEGORYID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CATEGORYID$4);
            }
            target.set(categoryID);
        }
    }
    
    /**
     * Unsets the "CategoryID" element
     */
    public void unsetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYID$4, 0);
        }
    }
    
    /**
     * Gets the "HTMLBody" element
     */
    public java.lang.String getHTMLBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HTMLBODY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HTMLBody" element
     */
    public org.apache.xmlbeans.XmlString xgetHTMLBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HTMLBODY$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "HTMLBody" element
     */
    public boolean isSetHTMLBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HTMLBODY$6) != 0;
        }
    }
    
    /**
     * Sets the "HTMLBody" element
     */
    public void setHTMLBody(java.lang.String htmlBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HTMLBODY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HTMLBODY$6);
            }
            target.setStringValue(htmlBody);
        }
    }
    
    /**
     * Sets (as xml) the "HTMLBody" element
     */
    public void xsetHTMLBody(org.apache.xmlbeans.XmlString htmlBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HTMLBODY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HTMLBODY$6);
            }
            target.set(htmlBody);
        }
    }
    
    /**
     * Unsets the "HTMLBody" element
     */
    public void unsetHTMLBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HTMLBODY$6, 0);
        }
    }
    
    /**
     * Gets the "TextBody" element
     */
    public java.lang.String getTextBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXTBODY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TextBody" element
     */
    public org.apache.xmlbeans.XmlString xgetTextBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXTBODY$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "TextBody" element
     */
    public boolean isSetTextBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTBODY$8) != 0;
        }
    }
    
    /**
     * Sets the "TextBody" element
     */
    public void setTextBody(java.lang.String textBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXTBODY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXTBODY$8);
            }
            target.setStringValue(textBody);
        }
    }
    
    /**
     * Sets (as xml) the "TextBody" element
     */
    public void xsetTextBody(org.apache.xmlbeans.XmlString textBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXTBODY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXTBODY$8);
            }
            target.set(textBody);
        }
    }
    
    /**
     * Unsets the "TextBody" element
     */
    public void unsetTextBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTBODY$8, 0);
        }
    }
    
    /**
     * Gets array of all "ContentAreas" elements
     */
    public com.exacttarget.wsdl.partnerapi.ContentArea[] getContentAreasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTENTAREAS$10, targetList);
            com.exacttarget.wsdl.partnerapi.ContentArea[] result = new com.exacttarget.wsdl.partnerapi.ContentArea[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ContentAreas" element
     */
    public com.exacttarget.wsdl.partnerapi.ContentArea getContentAreasArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentArea target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().find_element_user(CONTENTAREAS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ContentAreas" element
     */
    public int sizeOfContentAreasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTAREAS$10);
        }
    }
    
    /**
     * Sets array of all "ContentAreas" element
     */
    public void setContentAreasArray(com.exacttarget.wsdl.partnerapi.ContentArea[] contentAreasArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contentAreasArray, CONTENTAREAS$10);
        }
    }
    
    /**
     * Sets ith "ContentAreas" element
     */
    public void setContentAreasArray(int i, com.exacttarget.wsdl.partnerapi.ContentArea contentAreas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentArea target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().find_element_user(CONTENTAREAS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contentAreas);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContentAreas" element
     */
    public com.exacttarget.wsdl.partnerapi.ContentArea insertNewContentAreas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentArea target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().insert_element_user(CONTENTAREAS$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ContentAreas" element
     */
    public com.exacttarget.wsdl.partnerapi.ContentArea addNewContentAreas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentArea target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().add_element_user(CONTENTAREAS$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "ContentAreas" element
     */
    public void removeContentAreas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTAREAS$10, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$12, 0);
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
            return get_store().count_elements(SUBJECT$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECT$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBJECT$12);
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
            get_store().remove_element(SUBJECT$12, 0);
        }
    }
    
    /**
     * Gets the "IsActive" element
     */
    public boolean getIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVE$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsActive" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsActive" element
     */
    public boolean isSetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISACTIVE$14) != 0;
        }
    }
    
    /**
     * Sets the "IsActive" element
     */
    public void setIsActive(boolean isActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISACTIVE$14);
            }
            target.setBooleanValue(isActive);
        }
    }
    
    /**
     * Sets (as xml) the "IsActive" element
     */
    public void xsetIsActive(org.apache.xmlbeans.XmlBoolean isActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISACTIVE$14);
            }
            target.set(isActive);
        }
    }
    
    /**
     * Unsets the "IsActive" element
     */
    public void unsetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISACTIVE$14, 0);
        }
    }
    
    /**
     * Gets the "IsHTMLPaste" element
     */
    public boolean getIsHTMLPaste()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISHTMLPASTE$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsHTMLPaste" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsHTMLPaste()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISHTMLPASTE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsHTMLPaste" element
     */
    public boolean isSetIsHTMLPaste()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISHTMLPASTE$16) != 0;
        }
    }
    
    /**
     * Sets the "IsHTMLPaste" element
     */
    public void setIsHTMLPaste(boolean isHTMLPaste)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISHTMLPASTE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISHTMLPASTE$16);
            }
            target.setBooleanValue(isHTMLPaste);
        }
    }
    
    /**
     * Sets (as xml) the "IsHTMLPaste" element
     */
    public void xsetIsHTMLPaste(org.apache.xmlbeans.XmlBoolean isHTMLPaste)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISHTMLPASTE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISHTMLPASTE$16);
            }
            target.set(isHTMLPaste);
        }
    }
    
    /**
     * Unsets the "IsHTMLPaste" element
     */
    public void unsetIsHTMLPaste()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISHTMLPASTE$16, 0);
        }
    }
    
    /**
     * Gets the "ClonedFromID" element
     */
    public int getClonedFromID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLONEDFROMID$18, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClonedFromID" element
     */
    public org.apache.xmlbeans.XmlInt xgetClonedFromID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CLONEDFROMID$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "ClonedFromID" element
     */
    public boolean isSetClonedFromID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLONEDFROMID$18) != 0;
        }
    }
    
    /**
     * Sets the "ClonedFromID" element
     */
    public void setClonedFromID(int clonedFromID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLONEDFROMID$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLONEDFROMID$18);
            }
            target.setIntValue(clonedFromID);
        }
    }
    
    /**
     * Sets (as xml) the "ClonedFromID" element
     */
    public void xsetClonedFromID(org.apache.xmlbeans.XmlInt clonedFromID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CLONEDFROMID$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CLONEDFROMID$18);
            }
            target.set(clonedFromID);
        }
    }
    
    /**
     * Unsets the "ClonedFromID" element
     */
    public void unsetClonedFromID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLONEDFROMID$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$20, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$20, 0);
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
            return get_store().count_elements(STATUS$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$20);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$20);
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
            get_store().remove_element(STATUS$20, 0);
        }
    }
    
    /**
     * Gets the "EmailType" element
     */
    public java.lang.String getEmailType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILTYPE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmailType" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILTYPE$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "EmailType" element
     */
    public boolean isSetEmailType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILTYPE$22) != 0;
        }
    }
    
    /**
     * Sets the "EmailType" element
     */
    public void setEmailType(java.lang.String emailType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILTYPE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILTYPE$22);
            }
            target.setStringValue(emailType);
        }
    }
    
    /**
     * Sets (as xml) the "EmailType" element
     */
    public void xsetEmailType(org.apache.xmlbeans.XmlString emailType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILTYPE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILTYPE$22);
            }
            target.set(emailType);
        }
    }
    
    /**
     * Unsets the "EmailType" element
     */
    public void unsetEmailType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILTYPE$22, 0);
        }
    }
    
    /**
     * Gets the "CharacterSet" element
     */
    public java.lang.String getCharacterSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARACTERSET$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CharacterSet" element
     */
    public org.apache.xmlbeans.XmlString xgetCharacterSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHARACTERSET$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "CharacterSet" element
     */
    public boolean isSetCharacterSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARACTERSET$24) != 0;
        }
    }
    
    /**
     * Sets the "CharacterSet" element
     */
    public void setCharacterSet(java.lang.String characterSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARACTERSET$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARACTERSET$24);
            }
            target.setStringValue(characterSet);
        }
    }
    
    /**
     * Sets (as xml) the "CharacterSet" element
     */
    public void xsetCharacterSet(org.apache.xmlbeans.XmlString characterSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHARACTERSET$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHARACTERSET$24);
            }
            target.set(characterSet);
        }
    }
    
    /**
     * Unsets the "CharacterSet" element
     */
    public void unsetCharacterSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARACTERSET$24, 0);
        }
    }
    
    /**
     * Gets the "HasDynamicSubjectLine" element
     */
    public boolean getHasDynamicSubjectLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASDYNAMICSUBJECTLINE$26, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "HasDynamicSubjectLine" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasDynamicSubjectLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASDYNAMICSUBJECTLINE$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "HasDynamicSubjectLine" element
     */
    public boolean isSetHasDynamicSubjectLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASDYNAMICSUBJECTLINE$26) != 0;
        }
    }
    
    /**
     * Sets the "HasDynamicSubjectLine" element
     */
    public void setHasDynamicSubjectLine(boolean hasDynamicSubjectLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASDYNAMICSUBJECTLINE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASDYNAMICSUBJECTLINE$26);
            }
            target.setBooleanValue(hasDynamicSubjectLine);
        }
    }
    
    /**
     * Sets (as xml) the "HasDynamicSubjectLine" element
     */
    public void xsetHasDynamicSubjectLine(org.apache.xmlbeans.XmlBoolean hasDynamicSubjectLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASDYNAMICSUBJECTLINE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASDYNAMICSUBJECTLINE$26);
            }
            target.set(hasDynamicSubjectLine);
        }
    }
    
    /**
     * Unsets the "HasDynamicSubjectLine" element
     */
    public void unsetHasDynamicSubjectLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASDYNAMICSUBJECTLINE$26, 0);
        }
    }
    
    /**
     * Gets the "ContentCheckStatus" element
     */
    public java.lang.String getContentCheckStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTCHECKSTATUS$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContentCheckStatus" element
     */
    public org.apache.xmlbeans.XmlString xgetContentCheckStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTCHECKSTATUS$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContentCheckStatus" element
     */
    public boolean isSetContentCheckStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTCHECKSTATUS$28) != 0;
        }
    }
    
    /**
     * Sets the "ContentCheckStatus" element
     */
    public void setContentCheckStatus(java.lang.String contentCheckStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTCHECKSTATUS$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENTCHECKSTATUS$28);
            }
            target.setStringValue(contentCheckStatus);
        }
    }
    
    /**
     * Sets (as xml) the "ContentCheckStatus" element
     */
    public void xsetContentCheckStatus(org.apache.xmlbeans.XmlString contentCheckStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTCHECKSTATUS$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTENTCHECKSTATUS$28);
            }
            target.set(contentCheckStatus);
        }
    }
    
    /**
     * Unsets the "ContentCheckStatus" element
     */
    public void unsetContentCheckStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTCHECKSTATUS$28, 0);
        }
    }
}

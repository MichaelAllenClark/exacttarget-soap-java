/*
 * XML Type:  Email
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Email
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML Email(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface Email extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Email.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("emaile26ctype");
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "Folder" element
     */
    java.lang.String getFolder();
    
    /**
     * Gets (as xml) the "Folder" element
     */
    org.apache.xmlbeans.XmlString xgetFolder();
    
    /**
     * True if has "Folder" element
     */
    boolean isSetFolder();
    
    /**
     * Sets the "Folder" element
     */
    void setFolder(java.lang.String folder);
    
    /**
     * Sets (as xml) the "Folder" element
     */
    void xsetFolder(org.apache.xmlbeans.XmlString folder);
    
    /**
     * Unsets the "Folder" element
     */
    void unsetFolder();
    
    /**
     * Gets the "CategoryID" element
     */
    int getCategoryID();
    
    /**
     * Gets (as xml) the "CategoryID" element
     */
    org.apache.xmlbeans.XmlInt xgetCategoryID();
    
    /**
     * True if has "CategoryID" element
     */
    boolean isSetCategoryID();
    
    /**
     * Sets the "CategoryID" element
     */
    void setCategoryID(int categoryID);
    
    /**
     * Sets (as xml) the "CategoryID" element
     */
    void xsetCategoryID(org.apache.xmlbeans.XmlInt categoryID);
    
    /**
     * Unsets the "CategoryID" element
     */
    void unsetCategoryID();
    
    /**
     * Gets the "HTMLBody" element
     */
    java.lang.String getHTMLBody();
    
    /**
     * Gets (as xml) the "HTMLBody" element
     */
    org.apache.xmlbeans.XmlString xgetHTMLBody();
    
    /**
     * True if has "HTMLBody" element
     */
    boolean isSetHTMLBody();
    
    /**
     * Sets the "HTMLBody" element
     */
    void setHTMLBody(java.lang.String htmlBody);
    
    /**
     * Sets (as xml) the "HTMLBody" element
     */
    void xsetHTMLBody(org.apache.xmlbeans.XmlString htmlBody);
    
    /**
     * Unsets the "HTMLBody" element
     */
    void unsetHTMLBody();
    
    /**
     * Gets the "TextBody" element
     */
    java.lang.String getTextBody();
    
    /**
     * Gets (as xml) the "TextBody" element
     */
    org.apache.xmlbeans.XmlString xgetTextBody();
    
    /**
     * True if has "TextBody" element
     */
    boolean isSetTextBody();
    
    /**
     * Sets the "TextBody" element
     */
    void setTextBody(java.lang.String textBody);
    
    /**
     * Sets (as xml) the "TextBody" element
     */
    void xsetTextBody(org.apache.xmlbeans.XmlString textBody);
    
    /**
     * Unsets the "TextBody" element
     */
    void unsetTextBody();
    
    /**
     * Gets array of all "ContentAreas" elements
     */
    com.exacttarget.wsdl.partnerapi.ContentArea[] getContentAreasArray();
    
    /**
     * Gets ith "ContentAreas" element
     */
    com.exacttarget.wsdl.partnerapi.ContentArea getContentAreasArray(int i);
    
    /**
     * Returns number of "ContentAreas" element
     */
    int sizeOfContentAreasArray();
    
    /**
     * Sets array of all "ContentAreas" element
     */
    void setContentAreasArray(com.exacttarget.wsdl.partnerapi.ContentArea[] contentAreasArray);
    
    /**
     * Sets ith "ContentAreas" element
     */
    void setContentAreasArray(int i, com.exacttarget.wsdl.partnerapi.ContentArea contentAreas);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContentAreas" element
     */
    com.exacttarget.wsdl.partnerapi.ContentArea insertNewContentAreas(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ContentAreas" element
     */
    com.exacttarget.wsdl.partnerapi.ContentArea addNewContentAreas();
    
    /**
     * Removes the ith "ContentAreas" element
     */
    void removeContentAreas(int i);
    
    /**
     * Gets the "Subject" element
     */
    java.lang.String getSubject();
    
    /**
     * Gets (as xml) the "Subject" element
     */
    org.apache.xmlbeans.XmlString xgetSubject();
    
    /**
     * True if has "Subject" element
     */
    boolean isSetSubject();
    
    /**
     * Sets the "Subject" element
     */
    void setSubject(java.lang.String subject);
    
    /**
     * Sets (as xml) the "Subject" element
     */
    void xsetSubject(org.apache.xmlbeans.XmlString subject);
    
    /**
     * Unsets the "Subject" element
     */
    void unsetSubject();
    
    /**
     * Gets the "IsActive" element
     */
    boolean getIsActive();
    
    /**
     * Gets (as xml) the "IsActive" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsActive();
    
    /**
     * True if has "IsActive" element
     */
    boolean isSetIsActive();
    
    /**
     * Sets the "IsActive" element
     */
    void setIsActive(boolean isActive);
    
    /**
     * Sets (as xml) the "IsActive" element
     */
    void xsetIsActive(org.apache.xmlbeans.XmlBoolean isActive);
    
    /**
     * Unsets the "IsActive" element
     */
    void unsetIsActive();
    
    /**
     * Gets the "IsHTMLPaste" element
     */
    boolean getIsHTMLPaste();
    
    /**
     * Gets (as xml) the "IsHTMLPaste" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsHTMLPaste();
    
    /**
     * True if has "IsHTMLPaste" element
     */
    boolean isSetIsHTMLPaste();
    
    /**
     * Sets the "IsHTMLPaste" element
     */
    void setIsHTMLPaste(boolean isHTMLPaste);
    
    /**
     * Sets (as xml) the "IsHTMLPaste" element
     */
    void xsetIsHTMLPaste(org.apache.xmlbeans.XmlBoolean isHTMLPaste);
    
    /**
     * Unsets the "IsHTMLPaste" element
     */
    void unsetIsHTMLPaste();
    
    /**
     * Gets the "ClonedFromID" element
     */
    int getClonedFromID();
    
    /**
     * Gets (as xml) the "ClonedFromID" element
     */
    org.apache.xmlbeans.XmlInt xgetClonedFromID();
    
    /**
     * True if has "ClonedFromID" element
     */
    boolean isSetClonedFromID();
    
    /**
     * Sets the "ClonedFromID" element
     */
    void setClonedFromID(int clonedFromID);
    
    /**
     * Sets (as xml) the "ClonedFromID" element
     */
    void xsetClonedFromID(org.apache.xmlbeans.XmlInt clonedFromID);
    
    /**
     * Unsets the "ClonedFromID" element
     */
    void unsetClonedFromID();
    
    /**
     * Gets the "Status" element
     */
    java.lang.String getStatus();
    
    /**
     * Gets (as xml) the "Status" element
     */
    org.apache.xmlbeans.XmlString xgetStatus();
    
    /**
     * True if has "Status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" element
     */
    void setStatus(java.lang.String status);
    
    /**
     * Sets (as xml) the "Status" element
     */
    void xsetStatus(org.apache.xmlbeans.XmlString status);
    
    /**
     * Unsets the "Status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "EmailType" element
     */
    java.lang.String getEmailType();
    
    /**
     * Gets (as xml) the "EmailType" element
     */
    org.apache.xmlbeans.XmlString xgetEmailType();
    
    /**
     * True if has "EmailType" element
     */
    boolean isSetEmailType();
    
    /**
     * Sets the "EmailType" element
     */
    void setEmailType(java.lang.String emailType);
    
    /**
     * Sets (as xml) the "EmailType" element
     */
    void xsetEmailType(org.apache.xmlbeans.XmlString emailType);
    
    /**
     * Unsets the "EmailType" element
     */
    void unsetEmailType();
    
    /**
     * Gets the "CharacterSet" element
     */
    java.lang.String getCharacterSet();
    
    /**
     * Gets (as xml) the "CharacterSet" element
     */
    org.apache.xmlbeans.XmlString xgetCharacterSet();
    
    /**
     * True if has "CharacterSet" element
     */
    boolean isSetCharacterSet();
    
    /**
     * Sets the "CharacterSet" element
     */
    void setCharacterSet(java.lang.String characterSet);
    
    /**
     * Sets (as xml) the "CharacterSet" element
     */
    void xsetCharacterSet(org.apache.xmlbeans.XmlString characterSet);
    
    /**
     * Unsets the "CharacterSet" element
     */
    void unsetCharacterSet();
    
    /**
     * Gets the "HasDynamicSubjectLine" element
     */
    boolean getHasDynamicSubjectLine();
    
    /**
     * Gets (as xml) the "HasDynamicSubjectLine" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasDynamicSubjectLine();
    
    /**
     * True if has "HasDynamicSubjectLine" element
     */
    boolean isSetHasDynamicSubjectLine();
    
    /**
     * Sets the "HasDynamicSubjectLine" element
     */
    void setHasDynamicSubjectLine(boolean hasDynamicSubjectLine);
    
    /**
     * Sets (as xml) the "HasDynamicSubjectLine" element
     */
    void xsetHasDynamicSubjectLine(org.apache.xmlbeans.XmlBoolean hasDynamicSubjectLine);
    
    /**
     * Unsets the "HasDynamicSubjectLine" element
     */
    void unsetHasDynamicSubjectLine();
    
    /**
     * Gets the "ContentCheckStatus" element
     */
    java.lang.String getContentCheckStatus();
    
    /**
     * Gets (as xml) the "ContentCheckStatus" element
     */
    org.apache.xmlbeans.XmlString xgetContentCheckStatus();
    
    /**
     * True if has "ContentCheckStatus" element
     */
    boolean isSetContentCheckStatus();
    
    /**
     * Sets the "ContentCheckStatus" element
     */
    void setContentCheckStatus(java.lang.String contentCheckStatus);
    
    /**
     * Sets (as xml) the "ContentCheckStatus" element
     */
    void xsetContentCheckStatus(org.apache.xmlbeans.XmlString contentCheckStatus);
    
    /**
     * Unsets the "ContentCheckStatus" element
     */
    void unsetContentCheckStatus();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.Email newInstance() {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Email newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.Email parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Email parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.Email parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Email parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Email parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Email parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Email parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Email parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Email parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Email parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Email parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Email parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Email parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Email parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.Email parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.Email parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

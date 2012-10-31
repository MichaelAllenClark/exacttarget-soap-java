/*
 * XML Type:  List
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.List
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML List(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface List extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(List.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("list2ff8type");
    
    /**
     * Gets the "ListName" element
     */
    java.lang.String getListName();
    
    /**
     * Gets (as xml) the "ListName" element
     */
    org.apache.xmlbeans.XmlString xgetListName();
    
    /**
     * True if has "ListName" element
     */
    boolean isSetListName();
    
    /**
     * Sets the "ListName" element
     */
    void setListName(java.lang.String listName);
    
    /**
     * Sets (as xml) the "ListName" element
     */
    void xsetListName(org.apache.xmlbeans.XmlString listName);
    
    /**
     * Unsets the "ListName" element
     */
    void unsetListName();
    
    /**
     * Gets the "Category" element
     */
    int getCategory();
    
    /**
     * Gets (as xml) the "Category" element
     */
    org.apache.xmlbeans.XmlInt xgetCategory();
    
    /**
     * True if has "Category" element
     */
    boolean isSetCategory();
    
    /**
     * Sets the "Category" element
     */
    void setCategory(int category);
    
    /**
     * Sets (as xml) the "Category" element
     */
    void xsetCategory(org.apache.xmlbeans.XmlInt category);
    
    /**
     * Unsets the "Category" element
     */
    void unsetCategory();
    
    /**
     * Gets the "Type" element
     */
    com.exacttarget.wsdl.partnerapi.ListTypeEnum.Enum getType();
    
    /**
     * Gets (as xml) the "Type" element
     */
    com.exacttarget.wsdl.partnerapi.ListTypeEnum xgetType();
    
    /**
     * True if has "Type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "Type" element
     */
    void setType(com.exacttarget.wsdl.partnerapi.ListTypeEnum.Enum type);
    
    /**
     * Sets (as xml) the "Type" element
     */
    void xsetType(com.exacttarget.wsdl.partnerapi.ListTypeEnum type);
    
    /**
     * Unsets the "Type" element
     */
    void unsetType();
    
    /**
     * Gets the "Description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "Description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "Description" element
     */
    void unsetDescription();
    
    /**
     * Gets array of all "Subscribers" elements
     */
    com.exacttarget.wsdl.partnerapi.Subscriber[] getSubscribersArray();
    
    /**
     * Gets ith "Subscribers" element
     */
    com.exacttarget.wsdl.partnerapi.Subscriber getSubscribersArray(int i);
    
    /**
     * Returns number of "Subscribers" element
     */
    int sizeOfSubscribersArray();
    
    /**
     * Sets array of all "Subscribers" element
     */
    void setSubscribersArray(com.exacttarget.wsdl.partnerapi.Subscriber[] subscribersArray);
    
    /**
     * Sets ith "Subscribers" element
     */
    void setSubscribersArray(int i, com.exacttarget.wsdl.partnerapi.Subscriber subscribers);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Subscribers" element
     */
    com.exacttarget.wsdl.partnerapi.Subscriber insertNewSubscribers(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Subscribers" element
     */
    com.exacttarget.wsdl.partnerapi.Subscriber addNewSubscribers();
    
    /**
     * Removes the ith "Subscribers" element
     */
    void removeSubscribers(int i);
    
    /**
     * Gets the "ListClassification" element
     */
    com.exacttarget.wsdl.partnerapi.ListClassificationEnum.Enum getListClassification();
    
    /**
     * Gets (as xml) the "ListClassification" element
     */
    com.exacttarget.wsdl.partnerapi.ListClassificationEnum xgetListClassification();
    
    /**
     * True if has "ListClassification" element
     */
    boolean isSetListClassification();
    
    /**
     * Sets the "ListClassification" element
     */
    void setListClassification(com.exacttarget.wsdl.partnerapi.ListClassificationEnum.Enum listClassification);
    
    /**
     * Sets (as xml) the "ListClassification" element
     */
    void xsetListClassification(com.exacttarget.wsdl.partnerapi.ListClassificationEnum listClassification);
    
    /**
     * Unsets the "ListClassification" element
     */
    void unsetListClassification();
    
    /**
     * Gets the "AutomatedEmail" element
     */
    com.exacttarget.wsdl.partnerapi.Email getAutomatedEmail();
    
    /**
     * True if has "AutomatedEmail" element
     */
    boolean isSetAutomatedEmail();
    
    /**
     * Sets the "AutomatedEmail" element
     */
    void setAutomatedEmail(com.exacttarget.wsdl.partnerapi.Email automatedEmail);
    
    /**
     * Appends and returns a new empty "AutomatedEmail" element
     */
    com.exacttarget.wsdl.partnerapi.Email addNewAutomatedEmail();
    
    /**
     * Unsets the "AutomatedEmail" element
     */
    void unsetAutomatedEmail();
    
    /**
     * Gets the "SendClassification" element
     */
    com.exacttarget.wsdl.partnerapi.SendClassification getSendClassification();
    
    /**
     * True if has "SendClassification" element
     */
    boolean isSetSendClassification();
    
    /**
     * Sets the "SendClassification" element
     */
    void setSendClassification(com.exacttarget.wsdl.partnerapi.SendClassification sendClassification);
    
    /**
     * Appends and returns a new empty "SendClassification" element
     */
    com.exacttarget.wsdl.partnerapi.SendClassification addNewSendClassification();
    
    /**
     * Unsets the "SendClassification" element
     */
    void unsetSendClassification();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.List newInstance() {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.List newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.List parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.List parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.List parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.List parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.List parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.List parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.List parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.List parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.List parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.List parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.List parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.List parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.List parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.List parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.List parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.List parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

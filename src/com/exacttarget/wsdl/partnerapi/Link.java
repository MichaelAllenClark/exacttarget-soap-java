/*
 * XML Type:  Link
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Link
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML Link(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface Link extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Link.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("linke11ctype");
    
    /**
     * Gets the "LastClicked" element
     */
    java.util.Calendar getLastClicked();
    
    /**
     * Gets (as xml) the "LastClicked" element
     */
    org.apache.xmlbeans.XmlDateTime xgetLastClicked();
    
    /**
     * True if has "LastClicked" element
     */
    boolean isSetLastClicked();
    
    /**
     * Sets the "LastClicked" element
     */
    void setLastClicked(java.util.Calendar lastClicked);
    
    /**
     * Sets (as xml) the "LastClicked" element
     */
    void xsetLastClicked(org.apache.xmlbeans.XmlDateTime lastClicked);
    
    /**
     * Unsets the "LastClicked" element
     */
    void unsetLastClicked();
    
    /**
     * Gets the "Alias" element
     */
    java.lang.String getAlias();
    
    /**
     * Gets (as xml) the "Alias" element
     */
    org.apache.xmlbeans.XmlString xgetAlias();
    
    /**
     * True if has "Alias" element
     */
    boolean isSetAlias();
    
    /**
     * Sets the "Alias" element
     */
    void setAlias(java.lang.String alias);
    
    /**
     * Sets (as xml) the "Alias" element
     */
    void xsetAlias(org.apache.xmlbeans.XmlString alias);
    
    /**
     * Unsets the "Alias" element
     */
    void unsetAlias();
    
    /**
     * Gets the "TotalClicks" element
     */
    int getTotalClicks();
    
    /**
     * Gets (as xml) the "TotalClicks" element
     */
    org.apache.xmlbeans.XmlInt xgetTotalClicks();
    
    /**
     * True if has "TotalClicks" element
     */
    boolean isSetTotalClicks();
    
    /**
     * Sets the "TotalClicks" element
     */
    void setTotalClicks(int totalClicks);
    
    /**
     * Sets (as xml) the "TotalClicks" element
     */
    void xsetTotalClicks(org.apache.xmlbeans.XmlInt totalClicks);
    
    /**
     * Unsets the "TotalClicks" element
     */
    void unsetTotalClicks();
    
    /**
     * Gets the "UniqueClicks" element
     */
    int getUniqueClicks();
    
    /**
     * Gets (as xml) the "UniqueClicks" element
     */
    org.apache.xmlbeans.XmlInt xgetUniqueClicks();
    
    /**
     * True if has "UniqueClicks" element
     */
    boolean isSetUniqueClicks();
    
    /**
     * Sets the "UniqueClicks" element
     */
    void setUniqueClicks(int uniqueClicks);
    
    /**
     * Sets (as xml) the "UniqueClicks" element
     */
    void xsetUniqueClicks(org.apache.xmlbeans.XmlInt uniqueClicks);
    
    /**
     * Unsets the "UniqueClicks" element
     */
    void unsetUniqueClicks();
    
    /**
     * Gets the "URL" element
     */
    java.lang.String getURL();
    
    /**
     * Gets (as xml) the "URL" element
     */
    org.apache.xmlbeans.XmlString xgetURL();
    
    /**
     * True if has "URL" element
     */
    boolean isSetURL();
    
    /**
     * Sets the "URL" element
     */
    void setURL(java.lang.String url);
    
    /**
     * Sets (as xml) the "URL" element
     */
    void xsetURL(org.apache.xmlbeans.XmlString url);
    
    /**
     * Unsets the "URL" element
     */
    void unsetURL();
    
    /**
     * Gets array of all "Subscribers" elements
     */
    com.exacttarget.wsdl.partnerapi.TrackingEvent[] getSubscribersArray();
    
    /**
     * Gets ith "Subscribers" element
     */
    com.exacttarget.wsdl.partnerapi.TrackingEvent getSubscribersArray(int i);
    
    /**
     * Returns number of "Subscribers" element
     */
    int sizeOfSubscribersArray();
    
    /**
     * Sets array of all "Subscribers" element
     */
    void setSubscribersArray(com.exacttarget.wsdl.partnerapi.TrackingEvent[] subscribersArray);
    
    /**
     * Sets ith "Subscribers" element
     */
    void setSubscribersArray(int i, com.exacttarget.wsdl.partnerapi.TrackingEvent subscribers);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Subscribers" element
     */
    com.exacttarget.wsdl.partnerapi.TrackingEvent insertNewSubscribers(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Subscribers" element
     */
    com.exacttarget.wsdl.partnerapi.TrackingEvent addNewSubscribers();
    
    /**
     * Removes the ith "Subscribers" element
     */
    void removeSubscribers(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.Link newInstance() {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Link newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.Link parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Link parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.Link parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Link parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Link parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Link parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Link parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Link parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Link parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Link parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Link parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Link parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Link parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Link parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.Link parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.Link parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

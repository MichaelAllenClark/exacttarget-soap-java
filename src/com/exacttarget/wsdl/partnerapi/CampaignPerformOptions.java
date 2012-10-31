/*
 * XML Type:  CampaignPerformOptions
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.CampaignPerformOptions
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML CampaignPerformOptions(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface CampaignPerformOptions extends com.exacttarget.wsdl.partnerapi.PerformOptions
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CampaignPerformOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("campaignperformoptions3cc9type");
    
    /**
     * Gets array of all "OccurrenceIDs" elements
     */
    java.lang.String[] getOccurrenceIDsArray();
    
    /**
     * Gets ith "OccurrenceIDs" element
     */
    java.lang.String getOccurrenceIDsArray(int i);
    
    /**
     * Gets (as xml) array of all "OccurrenceIDs" elements
     */
    org.apache.xmlbeans.XmlString[] xgetOccurrenceIDsArray();
    
    /**
     * Gets (as xml) ith "OccurrenceIDs" element
     */
    org.apache.xmlbeans.XmlString xgetOccurrenceIDsArray(int i);
    
    /**
     * Returns number of "OccurrenceIDs" element
     */
    int sizeOfOccurrenceIDsArray();
    
    /**
     * Sets array of all "OccurrenceIDs" element
     */
    void setOccurrenceIDsArray(java.lang.String[] occurrenceIDsArray);
    
    /**
     * Sets ith "OccurrenceIDs" element
     */
    void setOccurrenceIDsArray(int i, java.lang.String occurrenceIDs);
    
    /**
     * Sets (as xml) array of all "OccurrenceIDs" element
     */
    void xsetOccurrenceIDsArray(org.apache.xmlbeans.XmlString[] occurrenceIDsArray);
    
    /**
     * Sets (as xml) ith "OccurrenceIDs" element
     */
    void xsetOccurrenceIDsArray(int i, org.apache.xmlbeans.XmlString occurrenceIDs);
    
    /**
     * Inserts the value as the ith "OccurrenceIDs" element
     */
    void insertOccurrenceIDs(int i, java.lang.String occurrenceIDs);
    
    /**
     * Appends the value as the last "OccurrenceIDs" element
     */
    void addOccurrenceIDs(java.lang.String occurrenceIDs);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OccurrenceIDs" element
     */
    org.apache.xmlbeans.XmlString insertNewOccurrenceIDs(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OccurrenceIDs" element
     */
    org.apache.xmlbeans.XmlString addNewOccurrenceIDs();
    
    /**
     * Removes the ith "OccurrenceIDs" element
     */
    void removeOccurrenceIDs(int i);
    
    /**
     * Gets the "OccurrenceIDsIndex" element
     */
    int getOccurrenceIDsIndex();
    
    /**
     * Gets (as xml) the "OccurrenceIDsIndex" element
     */
    org.apache.xmlbeans.XmlInt xgetOccurrenceIDsIndex();
    
    /**
     * True if has "OccurrenceIDsIndex" element
     */
    boolean isSetOccurrenceIDsIndex();
    
    /**
     * Sets the "OccurrenceIDsIndex" element
     */
    void setOccurrenceIDsIndex(int occurrenceIDsIndex);
    
    /**
     * Sets (as xml) the "OccurrenceIDsIndex" element
     */
    void xsetOccurrenceIDsIndex(org.apache.xmlbeans.XmlInt occurrenceIDsIndex);
    
    /**
     * Unsets the "OccurrenceIDsIndex" element
     */
    void unsetOccurrenceIDsIndex();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions newInstance() {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.CampaignPerformOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.CampaignPerformOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

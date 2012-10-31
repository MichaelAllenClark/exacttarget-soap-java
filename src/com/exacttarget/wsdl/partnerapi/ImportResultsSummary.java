/*
 * XML Type:  ImportResultsSummary
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ImportResultsSummary
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML ImportResultsSummary(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface ImportResultsSummary extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImportResultsSummary.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("importresultssummary34e1type");
    
    /**
     * Gets the "ImportDefinitionCustomerKey" element
     */
    java.lang.String getImportDefinitionCustomerKey();
    
    /**
     * Gets (as xml) the "ImportDefinitionCustomerKey" element
     */
    org.apache.xmlbeans.XmlString xgetImportDefinitionCustomerKey();
    
    /**
     * True if has "ImportDefinitionCustomerKey" element
     */
    boolean isSetImportDefinitionCustomerKey();
    
    /**
     * Sets the "ImportDefinitionCustomerKey" element
     */
    void setImportDefinitionCustomerKey(java.lang.String importDefinitionCustomerKey);
    
    /**
     * Sets (as xml) the "ImportDefinitionCustomerKey" element
     */
    void xsetImportDefinitionCustomerKey(org.apache.xmlbeans.XmlString importDefinitionCustomerKey);
    
    /**
     * Unsets the "ImportDefinitionCustomerKey" element
     */
    void unsetImportDefinitionCustomerKey();
    
    /**
     * Gets the "StartDate" element
     */
    java.lang.String getStartDate();
    
    /**
     * Gets (as xml) the "StartDate" element
     */
    org.apache.xmlbeans.XmlString xgetStartDate();
    
    /**
     * True if has "StartDate" element
     */
    boolean isSetStartDate();
    
    /**
     * Sets the "StartDate" element
     */
    void setStartDate(java.lang.String startDate);
    
    /**
     * Sets (as xml) the "StartDate" element
     */
    void xsetStartDate(org.apache.xmlbeans.XmlString startDate);
    
    /**
     * Unsets the "StartDate" element
     */
    void unsetStartDate();
    
    /**
     * Gets the "EndDate" element
     */
    java.lang.String getEndDate();
    
    /**
     * Gets (as xml) the "EndDate" element
     */
    org.apache.xmlbeans.XmlString xgetEndDate();
    
    /**
     * True if has "EndDate" element
     */
    boolean isSetEndDate();
    
    /**
     * Sets the "EndDate" element
     */
    void setEndDate(java.lang.String endDate);
    
    /**
     * Sets (as xml) the "EndDate" element
     */
    void xsetEndDate(org.apache.xmlbeans.XmlString endDate);
    
    /**
     * Unsets the "EndDate" element
     */
    void unsetEndDate();
    
    /**
     * Gets the "DestinationID" element
     */
    java.lang.String getDestinationID();
    
    /**
     * Gets (as xml) the "DestinationID" element
     */
    org.apache.xmlbeans.XmlString xgetDestinationID();
    
    /**
     * True if has "DestinationID" element
     */
    boolean isSetDestinationID();
    
    /**
     * Sets the "DestinationID" element
     */
    void setDestinationID(java.lang.String destinationID);
    
    /**
     * Sets (as xml) the "DestinationID" element
     */
    void xsetDestinationID(org.apache.xmlbeans.XmlString destinationID);
    
    /**
     * Unsets the "DestinationID" element
     */
    void unsetDestinationID();
    
    /**
     * Gets the "NumberSuccessful" element
     */
    int getNumberSuccessful();
    
    /**
     * Gets (as xml) the "NumberSuccessful" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberSuccessful();
    
    /**
     * True if has "NumberSuccessful" element
     */
    boolean isSetNumberSuccessful();
    
    /**
     * Sets the "NumberSuccessful" element
     */
    void setNumberSuccessful(int numberSuccessful);
    
    /**
     * Sets (as xml) the "NumberSuccessful" element
     */
    void xsetNumberSuccessful(org.apache.xmlbeans.XmlInt numberSuccessful);
    
    /**
     * Unsets the "NumberSuccessful" element
     */
    void unsetNumberSuccessful();
    
    /**
     * Gets the "NumberDuplicated" element
     */
    int getNumberDuplicated();
    
    /**
     * Gets (as xml) the "NumberDuplicated" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberDuplicated();
    
    /**
     * True if has "NumberDuplicated" element
     */
    boolean isSetNumberDuplicated();
    
    /**
     * Sets the "NumberDuplicated" element
     */
    void setNumberDuplicated(int numberDuplicated);
    
    /**
     * Sets (as xml) the "NumberDuplicated" element
     */
    void xsetNumberDuplicated(org.apache.xmlbeans.XmlInt numberDuplicated);
    
    /**
     * Unsets the "NumberDuplicated" element
     */
    void unsetNumberDuplicated();
    
    /**
     * Gets the "NumberErrors" element
     */
    int getNumberErrors();
    
    /**
     * Gets (as xml) the "NumberErrors" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberErrors();
    
    /**
     * True if has "NumberErrors" element
     */
    boolean isSetNumberErrors();
    
    /**
     * Sets the "NumberErrors" element
     */
    void setNumberErrors(int numberErrors);
    
    /**
     * Sets (as xml) the "NumberErrors" element
     */
    void xsetNumberErrors(org.apache.xmlbeans.XmlInt numberErrors);
    
    /**
     * Unsets the "NumberErrors" element
     */
    void unsetNumberErrors();
    
    /**
     * Gets the "TotalRows" element
     */
    int getTotalRows();
    
    /**
     * Gets (as xml) the "TotalRows" element
     */
    org.apache.xmlbeans.XmlInt xgetTotalRows();
    
    /**
     * True if has "TotalRows" element
     */
    boolean isSetTotalRows();
    
    /**
     * Sets the "TotalRows" element
     */
    void setTotalRows(int totalRows);
    
    /**
     * Sets (as xml) the "TotalRows" element
     */
    void xsetTotalRows(org.apache.xmlbeans.XmlInt totalRows);
    
    /**
     * Unsets the "TotalRows" element
     */
    void unsetTotalRows();
    
    /**
     * Gets the "ImportType" element
     */
    java.lang.String getImportType();
    
    /**
     * Gets (as xml) the "ImportType" element
     */
    org.apache.xmlbeans.XmlString xgetImportType();
    
    /**
     * True if has "ImportType" element
     */
    boolean isSetImportType();
    
    /**
     * Sets the "ImportType" element
     */
    void setImportType(java.lang.String importType);
    
    /**
     * Sets (as xml) the "ImportType" element
     */
    void xsetImportType(org.apache.xmlbeans.XmlString importType);
    
    /**
     * Unsets the "ImportType" element
     */
    void unsetImportType();
    
    /**
     * Gets the "ImportStatus" element
     */
    java.lang.String getImportStatus();
    
    /**
     * Gets (as xml) the "ImportStatus" element
     */
    org.apache.xmlbeans.XmlString xgetImportStatus();
    
    /**
     * True if has "ImportStatus" element
     */
    boolean isSetImportStatus();
    
    /**
     * Sets the "ImportStatus" element
     */
    void setImportStatus(java.lang.String importStatus);
    
    /**
     * Sets (as xml) the "ImportStatus" element
     */
    void xsetImportStatus(org.apache.xmlbeans.XmlString importStatus);
    
    /**
     * Unsets the "ImportStatus" element
     */
    void unsetImportStatus();
    
    /**
     * Gets the "TaskResultID" element
     */
    int getTaskResultID();
    
    /**
     * Gets (as xml) the "TaskResultID" element
     */
    org.apache.xmlbeans.XmlInt xgetTaskResultID();
    
    /**
     * True if has "TaskResultID" element
     */
    boolean isSetTaskResultID();
    
    /**
     * Sets the "TaskResultID" element
     */
    void setTaskResultID(int taskResultID);
    
    /**
     * Sets (as xml) the "TaskResultID" element
     */
    void xsetTaskResultID(org.apache.xmlbeans.XmlInt taskResultID);
    
    /**
     * Unsets the "TaskResultID" element
     */
    void unsetTaskResultID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary newInstance() {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ImportResultsSummary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ImportResultsSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

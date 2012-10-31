/*
 * XML Type:  CreateResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.CreateResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML CreateResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface CreateResult extends com.exacttarget.wsdl.partnerapi.Result
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("createresult68fdtype");
    
    /**
     * Gets the "NewID" element
     */
    int getNewID();
    
    /**
     * Gets (as xml) the "NewID" element
     */
    org.apache.xmlbeans.XmlInt xgetNewID();
    
    /**
     * Sets the "NewID" element
     */
    void setNewID(int newID);
    
    /**
     * Sets (as xml) the "NewID" element
     */
    void xsetNewID(org.apache.xmlbeans.XmlInt newID);
    
    /**
     * Gets the "NewObjectID" element
     */
    java.lang.String getNewObjectID();
    
    /**
     * Gets (as xml) the "NewObjectID" element
     */
    org.apache.xmlbeans.XmlString xgetNewObjectID();
    
    /**
     * True if has "NewObjectID" element
     */
    boolean isSetNewObjectID();
    
    /**
     * Sets the "NewObjectID" element
     */
    void setNewObjectID(java.lang.String newObjectID);
    
    /**
     * Sets (as xml) the "NewObjectID" element
     */
    void xsetNewObjectID(org.apache.xmlbeans.XmlString newObjectID);
    
    /**
     * Unsets the "NewObjectID" element
     */
    void unsetNewObjectID();
    
    /**
     * Gets the "PartnerKey" element
     */
    java.lang.String getPartnerKey();
    
    /**
     * Gets (as xml) the "PartnerKey" element
     */
    org.apache.xmlbeans.XmlString xgetPartnerKey();
    
    /**
     * True if has "PartnerKey" element
     */
    boolean isSetPartnerKey();
    
    /**
     * Sets the "PartnerKey" element
     */
    void setPartnerKey(java.lang.String partnerKey);
    
    /**
     * Sets (as xml) the "PartnerKey" element
     */
    void xsetPartnerKey(org.apache.xmlbeans.XmlString partnerKey);
    
    /**
     * Unsets the "PartnerKey" element
     */
    void unsetPartnerKey();
    
    /**
     * Gets the "Object" element
     */
    com.exacttarget.wsdl.partnerapi.APIObject getObject();
    
    /**
     * True if has "Object" element
     */
    boolean isSetObject();
    
    /**
     * Sets the "Object" element
     */
    void setObject(com.exacttarget.wsdl.partnerapi.APIObject object);
    
    /**
     * Appends and returns a new empty "Object" element
     */
    com.exacttarget.wsdl.partnerapi.APIObject addNewObject();
    
    /**
     * Unsets the "Object" element
     */
    void unsetObject();
    
    /**
     * Gets array of all "CreateResults" elements
     */
    com.exacttarget.wsdl.partnerapi.CreateResult[] getCreateResultsArray();
    
    /**
     * Gets ith "CreateResults" element
     */
    com.exacttarget.wsdl.partnerapi.CreateResult getCreateResultsArray(int i);
    
    /**
     * Returns number of "CreateResults" element
     */
    int sizeOfCreateResultsArray();
    
    /**
     * Sets array of all "CreateResults" element
     */
    void setCreateResultsArray(com.exacttarget.wsdl.partnerapi.CreateResult[] createResultsArray);
    
    /**
     * Sets ith "CreateResults" element
     */
    void setCreateResultsArray(int i, com.exacttarget.wsdl.partnerapi.CreateResult createResults);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CreateResults" element
     */
    com.exacttarget.wsdl.partnerapi.CreateResult insertNewCreateResults(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CreateResults" element
     */
    com.exacttarget.wsdl.partnerapi.CreateResult addNewCreateResults();
    
    /**
     * Removes the ith "CreateResults" element
     */
    void removeCreateResults(int i);
    
    /**
     * Gets the "ParentPropertyName" element
     */
    java.lang.String getParentPropertyName();
    
    /**
     * Gets (as xml) the "ParentPropertyName" element
     */
    org.apache.xmlbeans.XmlString xgetParentPropertyName();
    
    /**
     * True if has "ParentPropertyName" element
     */
    boolean isSetParentPropertyName();
    
    /**
     * Sets the "ParentPropertyName" element
     */
    void setParentPropertyName(java.lang.String parentPropertyName);
    
    /**
     * Sets (as xml) the "ParentPropertyName" element
     */
    void xsetParentPropertyName(org.apache.xmlbeans.XmlString parentPropertyName);
    
    /**
     * Unsets the "ParentPropertyName" element
     */
    void unsetParentPropertyName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.CreateResult newInstance() {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CreateResult newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.CreateResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.CreateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

/*
 * XML Type:  AudienceItem
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.AudienceItem
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML AudienceItem(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface AudienceItem extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AudienceItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("audienceitem183ftype");
    
    /**
     * Gets the "List" element
     */
    com.exacttarget.wsdl.partnerapi.List getList();
    
    /**
     * True if has "List" element
     */
    boolean isSetList();
    
    /**
     * Sets the "List" element
     */
    void setList(com.exacttarget.wsdl.partnerapi.List list);
    
    /**
     * Appends and returns a new empty "List" element
     */
    com.exacttarget.wsdl.partnerapi.List addNewList();
    
    /**
     * Unsets the "List" element
     */
    void unsetList();
    
    /**
     * Gets the "SendDefinitionListType" element
     */
    com.exacttarget.wsdl.partnerapi.SendDefinitionListTypeEnum.Enum getSendDefinitionListType();
    
    /**
     * Gets (as xml) the "SendDefinitionListType" element
     */
    com.exacttarget.wsdl.partnerapi.SendDefinitionListTypeEnum xgetSendDefinitionListType();
    
    /**
     * True if has "SendDefinitionListType" element
     */
    boolean isSetSendDefinitionListType();
    
    /**
     * Sets the "SendDefinitionListType" element
     */
    void setSendDefinitionListType(com.exacttarget.wsdl.partnerapi.SendDefinitionListTypeEnum.Enum sendDefinitionListType);
    
    /**
     * Sets (as xml) the "SendDefinitionListType" element
     */
    void xsetSendDefinitionListType(com.exacttarget.wsdl.partnerapi.SendDefinitionListTypeEnum sendDefinitionListType);
    
    /**
     * Unsets the "SendDefinitionListType" element
     */
    void unsetSendDefinitionListType();
    
    /**
     * Gets the "CustomObjectID" element
     */
    java.lang.String getCustomObjectID();
    
    /**
     * Gets (as xml) the "CustomObjectID" element
     */
    org.apache.xmlbeans.XmlString xgetCustomObjectID();
    
    /**
     * True if has "CustomObjectID" element
     */
    boolean isSetCustomObjectID();
    
    /**
     * Sets the "CustomObjectID" element
     */
    void setCustomObjectID(java.lang.String customObjectID);
    
    /**
     * Sets (as xml) the "CustomObjectID" element
     */
    void xsetCustomObjectID(org.apache.xmlbeans.XmlString customObjectID);
    
    /**
     * Unsets the "CustomObjectID" element
     */
    void unsetCustomObjectID();
    
    /**
     * Gets the "DataSourceTypeID" element
     */
    com.exacttarget.wsdl.partnerapi.DataSourceTypeEnum.Enum getDataSourceTypeID();
    
    /**
     * Gets (as xml) the "DataSourceTypeID" element
     */
    com.exacttarget.wsdl.partnerapi.DataSourceTypeEnum xgetDataSourceTypeID();
    
    /**
     * True if has "DataSourceTypeID" element
     */
    boolean isSetDataSourceTypeID();
    
    /**
     * Sets the "DataSourceTypeID" element
     */
    void setDataSourceTypeID(com.exacttarget.wsdl.partnerapi.DataSourceTypeEnum.Enum dataSourceTypeID);
    
    /**
     * Sets (as xml) the "DataSourceTypeID" element
     */
    void xsetDataSourceTypeID(com.exacttarget.wsdl.partnerapi.DataSourceTypeEnum dataSourceTypeID);
    
    /**
     * Unsets the "DataSourceTypeID" element
     */
    void unsetDataSourceTypeID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.AudienceItem newInstance() {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AudienceItem newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.AudienceItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.AudienceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

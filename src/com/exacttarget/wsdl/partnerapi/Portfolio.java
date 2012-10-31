/*
 * XML Type:  Portfolio
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Portfolio
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML Portfolio(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface Portfolio extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Portfolio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("portfolio32c0type");
    
    /**
     * Gets the "Source" element
     */
    com.exacttarget.wsdl.partnerapi.ResourceSpecification getSource();
    
    /**
     * True if has "Source" element
     */
    boolean isSetSource();
    
    /**
     * Sets the "Source" element
     */
    void setSource(com.exacttarget.wsdl.partnerapi.ResourceSpecification source);
    
    /**
     * Appends and returns a new empty "Source" element
     */
    com.exacttarget.wsdl.partnerapi.ResourceSpecification addNewSource();
    
    /**
     * Unsets the "Source" element
     */
    void unsetSource();
    
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
     * Gets the "FileName" element
     */
    java.lang.String getFileName();
    
    /**
     * Gets (as xml) the "FileName" element
     */
    org.apache.xmlbeans.XmlString xgetFileName();
    
    /**
     * True if has "FileName" element
     */
    boolean isSetFileName();
    
    /**
     * Sets the "FileName" element
     */
    void setFileName(java.lang.String fileName);
    
    /**
     * Sets (as xml) the "FileName" element
     */
    void xsetFileName(org.apache.xmlbeans.XmlString fileName);
    
    /**
     * Unsets the "FileName" element
     */
    void unsetFileName();
    
    /**
     * Gets the "DisplayName" element
     */
    java.lang.String getDisplayName();
    
    /**
     * Gets (as xml) the "DisplayName" element
     */
    org.apache.xmlbeans.XmlString xgetDisplayName();
    
    /**
     * True if has "DisplayName" element
     */
    boolean isSetDisplayName();
    
    /**
     * Sets the "DisplayName" element
     */
    void setDisplayName(java.lang.String displayName);
    
    /**
     * Sets (as xml) the "DisplayName" element
     */
    void xsetDisplayName(org.apache.xmlbeans.XmlString displayName);
    
    /**
     * Unsets the "DisplayName" element
     */
    void unsetDisplayName();
    
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
     * Gets the "TypeDescription" element
     */
    java.lang.String getTypeDescription();
    
    /**
     * Gets (as xml) the "TypeDescription" element
     */
    org.apache.xmlbeans.XmlString xgetTypeDescription();
    
    /**
     * True if has "TypeDescription" element
     */
    boolean isSetTypeDescription();
    
    /**
     * Sets the "TypeDescription" element
     */
    void setTypeDescription(java.lang.String typeDescription);
    
    /**
     * Sets (as xml) the "TypeDescription" element
     */
    void xsetTypeDescription(org.apache.xmlbeans.XmlString typeDescription);
    
    /**
     * Unsets the "TypeDescription" element
     */
    void unsetTypeDescription();
    
    /**
     * Gets the "IsUploaded" element
     */
    boolean getIsUploaded();
    
    /**
     * Gets (as xml) the "IsUploaded" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsUploaded();
    
    /**
     * True if has "IsUploaded" element
     */
    boolean isSetIsUploaded();
    
    /**
     * Sets the "IsUploaded" element
     */
    void setIsUploaded(boolean isUploaded);
    
    /**
     * Sets (as xml) the "IsUploaded" element
     */
    void xsetIsUploaded(org.apache.xmlbeans.XmlBoolean isUploaded);
    
    /**
     * Unsets the "IsUploaded" element
     */
    void unsetIsUploaded();
    
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
     * Gets the "FileSizeKB" element
     */
    int getFileSizeKB();
    
    /**
     * Gets (as xml) the "FileSizeKB" element
     */
    org.apache.xmlbeans.XmlInt xgetFileSizeKB();
    
    /**
     * True if has "FileSizeKB" element
     */
    boolean isSetFileSizeKB();
    
    /**
     * Sets the "FileSizeKB" element
     */
    void setFileSizeKB(int fileSizeKB);
    
    /**
     * Sets (as xml) the "FileSizeKB" element
     */
    void xsetFileSizeKB(org.apache.xmlbeans.XmlInt fileSizeKB);
    
    /**
     * Unsets the "FileSizeKB" element
     */
    void unsetFileSizeKB();
    
    /**
     * Gets the "ThumbSizeKB" element
     */
    int getThumbSizeKB();
    
    /**
     * Gets (as xml) the "ThumbSizeKB" element
     */
    org.apache.xmlbeans.XmlInt xgetThumbSizeKB();
    
    /**
     * True if has "ThumbSizeKB" element
     */
    boolean isSetThumbSizeKB();
    
    /**
     * Sets the "ThumbSizeKB" element
     */
    void setThumbSizeKB(int thumbSizeKB);
    
    /**
     * Sets (as xml) the "ThumbSizeKB" element
     */
    void xsetThumbSizeKB(org.apache.xmlbeans.XmlInt thumbSizeKB);
    
    /**
     * Unsets the "ThumbSizeKB" element
     */
    void unsetThumbSizeKB();
    
    /**
     * Gets the "FileWidthPX" element
     */
    int getFileWidthPX();
    
    /**
     * Gets (as xml) the "FileWidthPX" element
     */
    org.apache.xmlbeans.XmlInt xgetFileWidthPX();
    
    /**
     * True if has "FileWidthPX" element
     */
    boolean isSetFileWidthPX();
    
    /**
     * Sets the "FileWidthPX" element
     */
    void setFileWidthPX(int fileWidthPX);
    
    /**
     * Sets (as xml) the "FileWidthPX" element
     */
    void xsetFileWidthPX(org.apache.xmlbeans.XmlInt fileWidthPX);
    
    /**
     * Unsets the "FileWidthPX" element
     */
    void unsetFileWidthPX();
    
    /**
     * Gets the "FileHeightPX" element
     */
    int getFileHeightPX();
    
    /**
     * Gets (as xml) the "FileHeightPX" element
     */
    org.apache.xmlbeans.XmlInt xgetFileHeightPX();
    
    /**
     * True if has "FileHeightPX" element
     */
    boolean isSetFileHeightPX();
    
    /**
     * Sets the "FileHeightPX" element
     */
    void setFileHeightPX(int fileHeightPX);
    
    /**
     * Sets (as xml) the "FileHeightPX" element
     */
    void xsetFileHeightPX(org.apache.xmlbeans.XmlInt fileHeightPX);
    
    /**
     * Unsets the "FileHeightPX" element
     */
    void unsetFileHeightPX();
    
    /**
     * Gets the "FileURL" element
     */
    java.lang.String getFileURL();
    
    /**
     * Gets (as xml) the "FileURL" element
     */
    org.apache.xmlbeans.XmlString xgetFileURL();
    
    /**
     * True if has "FileURL" element
     */
    boolean isSetFileURL();
    
    /**
     * Sets the "FileURL" element
     */
    void setFileURL(java.lang.String fileURL);
    
    /**
     * Sets (as xml) the "FileURL" element
     */
    void xsetFileURL(org.apache.xmlbeans.XmlString fileURL);
    
    /**
     * Unsets the "FileURL" element
     */
    void unsetFileURL();
    
    /**
     * Gets the "ThumbURL" element
     */
    java.lang.String getThumbURL();
    
    /**
     * Gets (as xml) the "ThumbURL" element
     */
    org.apache.xmlbeans.XmlString xgetThumbURL();
    
    /**
     * True if has "ThumbURL" element
     */
    boolean isSetThumbURL();
    
    /**
     * Sets the "ThumbURL" element
     */
    void setThumbURL(java.lang.String thumbURL);
    
    /**
     * Sets (as xml) the "ThumbURL" element
     */
    void xsetThumbURL(org.apache.xmlbeans.XmlString thumbURL);
    
    /**
     * Unsets the "ThumbURL" element
     */
    void unsetThumbURL();
    
    /**
     * Gets the "CacheClearTime" element
     */
    java.util.Calendar getCacheClearTime();
    
    /**
     * Gets (as xml) the "CacheClearTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCacheClearTime();
    
    /**
     * True if has "CacheClearTime" element
     */
    boolean isSetCacheClearTime();
    
    /**
     * Sets the "CacheClearTime" element
     */
    void setCacheClearTime(java.util.Calendar cacheClearTime);
    
    /**
     * Sets (as xml) the "CacheClearTime" element
     */
    void xsetCacheClearTime(org.apache.xmlbeans.XmlDateTime cacheClearTime);
    
    /**
     * Unsets the "CacheClearTime" element
     */
    void unsetCacheClearTime();
    
    /**
     * Gets the "CategoryType" element
     */
    java.lang.String getCategoryType();
    
    /**
     * Gets (as xml) the "CategoryType" element
     */
    org.apache.xmlbeans.XmlString xgetCategoryType();
    
    /**
     * True if has "CategoryType" element
     */
    boolean isSetCategoryType();
    
    /**
     * Sets the "CategoryType" element
     */
    void setCategoryType(java.lang.String categoryType);
    
    /**
     * Sets (as xml) the "CategoryType" element
     */
    void xsetCategoryType(org.apache.xmlbeans.XmlString categoryType);
    
    /**
     * Unsets the "CategoryType" element
     */
    void unsetCategoryType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.Portfolio newInstance() {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Portfolio newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.Portfolio parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.Portfolio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

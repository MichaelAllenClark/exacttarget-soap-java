/*
 * XML Type:  PropertyDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PropertyDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML PropertyDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface PropertyDefinition extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PropertyDefinition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("propertydefinitionb00etype");
    
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
     * Gets the "DataType" element
     */
    java.lang.String getDataType();
    
    /**
     * Gets (as xml) the "DataType" element
     */
    org.apache.xmlbeans.XmlString xgetDataType();
    
    /**
     * True if has "DataType" element
     */
    boolean isSetDataType();
    
    /**
     * Sets the "DataType" element
     */
    void setDataType(java.lang.String dataType);
    
    /**
     * Sets (as xml) the "DataType" element
     */
    void xsetDataType(org.apache.xmlbeans.XmlString dataType);
    
    /**
     * Unsets the "DataType" element
     */
    void unsetDataType();
    
    /**
     * Gets the "ValueType" element
     */
    com.exacttarget.wsdl.partnerapi.SoapType.Enum getValueType();
    
    /**
     * Gets (as xml) the "ValueType" element
     */
    com.exacttarget.wsdl.partnerapi.SoapType xgetValueType();
    
    /**
     * True if has "ValueType" element
     */
    boolean isSetValueType();
    
    /**
     * Sets the "ValueType" element
     */
    void setValueType(com.exacttarget.wsdl.partnerapi.SoapType.Enum valueType);
    
    /**
     * Sets (as xml) the "ValueType" element
     */
    void xsetValueType(com.exacttarget.wsdl.partnerapi.SoapType valueType);
    
    /**
     * Unsets the "ValueType" element
     */
    void unsetValueType();
    
    /**
     * Gets the "PropertyType" element
     */
    com.exacttarget.wsdl.partnerapi.PropertyType.Enum getPropertyType();
    
    /**
     * Gets (as xml) the "PropertyType" element
     */
    com.exacttarget.wsdl.partnerapi.PropertyType xgetPropertyType();
    
    /**
     * True if has "PropertyType" element
     */
    boolean isSetPropertyType();
    
    /**
     * Sets the "PropertyType" element
     */
    void setPropertyType(com.exacttarget.wsdl.partnerapi.PropertyType.Enum propertyType);
    
    /**
     * Sets (as xml) the "PropertyType" element
     */
    void xsetPropertyType(com.exacttarget.wsdl.partnerapi.PropertyType propertyType);
    
    /**
     * Unsets the "PropertyType" element
     */
    void unsetPropertyType();
    
    /**
     * Gets the "IsCreatable" element
     */
    boolean getIsCreatable();
    
    /**
     * Gets (as xml) the "IsCreatable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsCreatable();
    
    /**
     * True if has "IsCreatable" element
     */
    boolean isSetIsCreatable();
    
    /**
     * Sets the "IsCreatable" element
     */
    void setIsCreatable(boolean isCreatable);
    
    /**
     * Sets (as xml) the "IsCreatable" element
     */
    void xsetIsCreatable(org.apache.xmlbeans.XmlBoolean isCreatable);
    
    /**
     * Unsets the "IsCreatable" element
     */
    void unsetIsCreatable();
    
    /**
     * Gets the "IsUpdatable" element
     */
    boolean getIsUpdatable();
    
    /**
     * Gets (as xml) the "IsUpdatable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsUpdatable();
    
    /**
     * True if has "IsUpdatable" element
     */
    boolean isSetIsUpdatable();
    
    /**
     * Sets the "IsUpdatable" element
     */
    void setIsUpdatable(boolean isUpdatable);
    
    /**
     * Sets (as xml) the "IsUpdatable" element
     */
    void xsetIsUpdatable(org.apache.xmlbeans.XmlBoolean isUpdatable);
    
    /**
     * Unsets the "IsUpdatable" element
     */
    void unsetIsUpdatable();
    
    /**
     * Gets the "IsRetrievable" element
     */
    boolean getIsRetrievable();
    
    /**
     * Gets (as xml) the "IsRetrievable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsRetrievable();
    
    /**
     * True if has "IsRetrievable" element
     */
    boolean isSetIsRetrievable();
    
    /**
     * Sets the "IsRetrievable" element
     */
    void setIsRetrievable(boolean isRetrievable);
    
    /**
     * Sets (as xml) the "IsRetrievable" element
     */
    void xsetIsRetrievable(org.apache.xmlbeans.XmlBoolean isRetrievable);
    
    /**
     * Unsets the "IsRetrievable" element
     */
    void unsetIsRetrievable();
    
    /**
     * Gets the "IsQueryable" element
     */
    boolean getIsQueryable();
    
    /**
     * Gets (as xml) the "IsQueryable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsQueryable();
    
    /**
     * True if has "IsQueryable" element
     */
    boolean isSetIsQueryable();
    
    /**
     * Sets the "IsQueryable" element
     */
    void setIsQueryable(boolean isQueryable);
    
    /**
     * Sets (as xml) the "IsQueryable" element
     */
    void xsetIsQueryable(org.apache.xmlbeans.XmlBoolean isQueryable);
    
    /**
     * Unsets the "IsQueryable" element
     */
    void unsetIsQueryable();
    
    /**
     * Gets the "IsFilterable" element
     */
    boolean getIsFilterable();
    
    /**
     * Gets (as xml) the "IsFilterable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsFilterable();
    
    /**
     * True if has "IsFilterable" element
     */
    boolean isSetIsFilterable();
    
    /**
     * Sets the "IsFilterable" element
     */
    void setIsFilterable(boolean isFilterable);
    
    /**
     * Sets (as xml) the "IsFilterable" element
     */
    void xsetIsFilterable(org.apache.xmlbeans.XmlBoolean isFilterable);
    
    /**
     * Unsets the "IsFilterable" element
     */
    void unsetIsFilterable();
    
    /**
     * Gets the "IsPartnerProperty" element
     */
    boolean getIsPartnerProperty();
    
    /**
     * Gets (as xml) the "IsPartnerProperty" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsPartnerProperty();
    
    /**
     * True if has "IsPartnerProperty" element
     */
    boolean isSetIsPartnerProperty();
    
    /**
     * Sets the "IsPartnerProperty" element
     */
    void setIsPartnerProperty(boolean isPartnerProperty);
    
    /**
     * Sets (as xml) the "IsPartnerProperty" element
     */
    void xsetIsPartnerProperty(org.apache.xmlbeans.XmlBoolean isPartnerProperty);
    
    /**
     * Unsets the "IsPartnerProperty" element
     */
    void unsetIsPartnerProperty();
    
    /**
     * Gets the "IsAccountProperty" element
     */
    boolean getIsAccountProperty();
    
    /**
     * Gets (as xml) the "IsAccountProperty" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsAccountProperty();
    
    /**
     * True if has "IsAccountProperty" element
     */
    boolean isSetIsAccountProperty();
    
    /**
     * Sets the "IsAccountProperty" element
     */
    void setIsAccountProperty(boolean isAccountProperty);
    
    /**
     * Sets (as xml) the "IsAccountProperty" element
     */
    void xsetIsAccountProperty(org.apache.xmlbeans.XmlBoolean isAccountProperty);
    
    /**
     * Unsets the "IsAccountProperty" element
     */
    void unsetIsAccountProperty();
    
    /**
     * Gets the "PartnerMap" element
     */
    java.lang.String getPartnerMap();
    
    /**
     * Gets (as xml) the "PartnerMap" element
     */
    org.apache.xmlbeans.XmlString xgetPartnerMap();
    
    /**
     * True if has "PartnerMap" element
     */
    boolean isSetPartnerMap();
    
    /**
     * Sets the "PartnerMap" element
     */
    void setPartnerMap(java.lang.String partnerMap);
    
    /**
     * Sets (as xml) the "PartnerMap" element
     */
    void xsetPartnerMap(org.apache.xmlbeans.XmlString partnerMap);
    
    /**
     * Unsets the "PartnerMap" element
     */
    void unsetPartnerMap();
    
    /**
     * Gets array of all "AttributeMaps" elements
     */
    com.exacttarget.wsdl.partnerapi.AttributeMap[] getAttributeMapsArray();
    
    /**
     * Gets ith "AttributeMaps" element
     */
    com.exacttarget.wsdl.partnerapi.AttributeMap getAttributeMapsArray(int i);
    
    /**
     * Returns number of "AttributeMaps" element
     */
    int sizeOfAttributeMapsArray();
    
    /**
     * Sets array of all "AttributeMaps" element
     */
    void setAttributeMapsArray(com.exacttarget.wsdl.partnerapi.AttributeMap[] attributeMapsArray);
    
    /**
     * Sets ith "AttributeMaps" element
     */
    void setAttributeMapsArray(int i, com.exacttarget.wsdl.partnerapi.AttributeMap attributeMaps);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeMaps" element
     */
    com.exacttarget.wsdl.partnerapi.AttributeMap insertNewAttributeMaps(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeMaps" element
     */
    com.exacttarget.wsdl.partnerapi.AttributeMap addNewAttributeMaps();
    
    /**
     * Removes the ith "AttributeMaps" element
     */
    void removeAttributeMaps(int i);
    
    /**
     * Gets array of all "Markups" elements
     */
    com.exacttarget.wsdl.partnerapi.APIProperty[] getMarkupsArray();
    
    /**
     * Gets ith "Markups" element
     */
    com.exacttarget.wsdl.partnerapi.APIProperty getMarkupsArray(int i);
    
    /**
     * Returns number of "Markups" element
     */
    int sizeOfMarkupsArray();
    
    /**
     * Sets array of all "Markups" element
     */
    void setMarkupsArray(com.exacttarget.wsdl.partnerapi.APIProperty[] markupsArray);
    
    /**
     * Sets ith "Markups" element
     */
    void setMarkupsArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty markups);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Markups" element
     */
    com.exacttarget.wsdl.partnerapi.APIProperty insertNewMarkups(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Markups" element
     */
    com.exacttarget.wsdl.partnerapi.APIProperty addNewMarkups();
    
    /**
     * Removes the ith "Markups" element
     */
    void removeMarkups(int i);
    
    /**
     * Gets the "Precision" element
     */
    int getPrecision();
    
    /**
     * Gets (as xml) the "Precision" element
     */
    org.apache.xmlbeans.XmlInt xgetPrecision();
    
    /**
     * True if has "Precision" element
     */
    boolean isSetPrecision();
    
    /**
     * Sets the "Precision" element
     */
    void setPrecision(int precision);
    
    /**
     * Sets (as xml) the "Precision" element
     */
    void xsetPrecision(org.apache.xmlbeans.XmlInt precision);
    
    /**
     * Unsets the "Precision" element
     */
    void unsetPrecision();
    
    /**
     * Gets the "Scale" element
     */
    int getScale();
    
    /**
     * Gets (as xml) the "Scale" element
     */
    org.apache.xmlbeans.XmlInt xgetScale();
    
    /**
     * True if has "Scale" element
     */
    boolean isSetScale();
    
    /**
     * Sets the "Scale" element
     */
    void setScale(int scale);
    
    /**
     * Sets (as xml) the "Scale" element
     */
    void xsetScale(org.apache.xmlbeans.XmlInt scale);
    
    /**
     * Unsets the "Scale" element
     */
    void unsetScale();
    
    /**
     * Gets the "Label" element
     */
    java.lang.String getLabel();
    
    /**
     * Gets (as xml) the "Label" element
     */
    org.apache.xmlbeans.XmlString xgetLabel();
    
    /**
     * True if has "Label" element
     */
    boolean isSetLabel();
    
    /**
     * Sets the "Label" element
     */
    void setLabel(java.lang.String label);
    
    /**
     * Sets (as xml) the "Label" element
     */
    void xsetLabel(org.apache.xmlbeans.XmlString label);
    
    /**
     * Unsets the "Label" element
     */
    void unsetLabel();
    
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
     * Gets the "DefaultValue" element
     */
    java.lang.String getDefaultValue();
    
    /**
     * Gets (as xml) the "DefaultValue" element
     */
    org.apache.xmlbeans.XmlString xgetDefaultValue();
    
    /**
     * True if has "DefaultValue" element
     */
    boolean isSetDefaultValue();
    
    /**
     * Sets the "DefaultValue" element
     */
    void setDefaultValue(java.lang.String defaultValue);
    
    /**
     * Sets (as xml) the "DefaultValue" element
     */
    void xsetDefaultValue(org.apache.xmlbeans.XmlString defaultValue);
    
    /**
     * Unsets the "DefaultValue" element
     */
    void unsetDefaultValue();
    
    /**
     * Gets the "MinLength" element
     */
    int getMinLength();
    
    /**
     * Gets (as xml) the "MinLength" element
     */
    org.apache.xmlbeans.XmlInt xgetMinLength();
    
    /**
     * True if has "MinLength" element
     */
    boolean isSetMinLength();
    
    /**
     * Sets the "MinLength" element
     */
    void setMinLength(int minLength);
    
    /**
     * Sets (as xml) the "MinLength" element
     */
    void xsetMinLength(org.apache.xmlbeans.XmlInt minLength);
    
    /**
     * Unsets the "MinLength" element
     */
    void unsetMinLength();
    
    /**
     * Gets the "MaxLength" element
     */
    int getMaxLength();
    
    /**
     * Gets (as xml) the "MaxLength" element
     */
    org.apache.xmlbeans.XmlInt xgetMaxLength();
    
    /**
     * True if has "MaxLength" element
     */
    boolean isSetMaxLength();
    
    /**
     * Sets the "MaxLength" element
     */
    void setMaxLength(int maxLength);
    
    /**
     * Sets (as xml) the "MaxLength" element
     */
    void xsetMaxLength(org.apache.xmlbeans.XmlInt maxLength);
    
    /**
     * Unsets the "MaxLength" element
     */
    void unsetMaxLength();
    
    /**
     * Gets the "MinValue" element
     */
    java.lang.String getMinValue();
    
    /**
     * Gets (as xml) the "MinValue" element
     */
    org.apache.xmlbeans.XmlString xgetMinValue();
    
    /**
     * True if has "MinValue" element
     */
    boolean isSetMinValue();
    
    /**
     * Sets the "MinValue" element
     */
    void setMinValue(java.lang.String minValue);
    
    /**
     * Sets (as xml) the "MinValue" element
     */
    void xsetMinValue(org.apache.xmlbeans.XmlString minValue);
    
    /**
     * Unsets the "MinValue" element
     */
    void unsetMinValue();
    
    /**
     * Gets the "MaxValue" element
     */
    java.lang.String getMaxValue();
    
    /**
     * Gets (as xml) the "MaxValue" element
     */
    org.apache.xmlbeans.XmlString xgetMaxValue();
    
    /**
     * True if has "MaxValue" element
     */
    boolean isSetMaxValue();
    
    /**
     * Sets the "MaxValue" element
     */
    void setMaxValue(java.lang.String maxValue);
    
    /**
     * Sets (as xml) the "MaxValue" element
     */
    void xsetMaxValue(org.apache.xmlbeans.XmlString maxValue);
    
    /**
     * Unsets the "MaxValue" element
     */
    void unsetMaxValue();
    
    /**
     * Gets the "IsRequired" element
     */
    boolean getIsRequired();
    
    /**
     * Gets (as xml) the "IsRequired" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsRequired();
    
    /**
     * True if has "IsRequired" element
     */
    boolean isSetIsRequired();
    
    /**
     * Sets the "IsRequired" element
     */
    void setIsRequired(boolean isRequired);
    
    /**
     * Sets (as xml) the "IsRequired" element
     */
    void xsetIsRequired(org.apache.xmlbeans.XmlBoolean isRequired);
    
    /**
     * Unsets the "IsRequired" element
     */
    void unsetIsRequired();
    
    /**
     * Gets the "IsViewable" element
     */
    boolean getIsViewable();
    
    /**
     * Gets (as xml) the "IsViewable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsViewable();
    
    /**
     * True if has "IsViewable" element
     */
    boolean isSetIsViewable();
    
    /**
     * Sets the "IsViewable" element
     */
    void setIsViewable(boolean isViewable);
    
    /**
     * Sets (as xml) the "IsViewable" element
     */
    void xsetIsViewable(org.apache.xmlbeans.XmlBoolean isViewable);
    
    /**
     * Unsets the "IsViewable" element
     */
    void unsetIsViewable();
    
    /**
     * Gets the "IsEditable" element
     */
    boolean getIsEditable();
    
    /**
     * Gets (as xml) the "IsEditable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsEditable();
    
    /**
     * True if has "IsEditable" element
     */
    boolean isSetIsEditable();
    
    /**
     * Sets the "IsEditable" element
     */
    void setIsEditable(boolean isEditable);
    
    /**
     * Sets (as xml) the "IsEditable" element
     */
    void xsetIsEditable(org.apache.xmlbeans.XmlBoolean isEditable);
    
    /**
     * Unsets the "IsEditable" element
     */
    void unsetIsEditable();
    
    /**
     * Gets the "IsNillable" element
     */
    boolean getIsNillable();
    
    /**
     * Gets (as xml) the "IsNillable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsNillable();
    
    /**
     * True if has "IsNillable" element
     */
    boolean isSetIsNillable();
    
    /**
     * Sets the "IsNillable" element
     */
    void setIsNillable(boolean isNillable);
    
    /**
     * Sets (as xml) the "IsNillable" element
     */
    void xsetIsNillable(org.apache.xmlbeans.XmlBoolean isNillable);
    
    /**
     * Unsets the "IsNillable" element
     */
    void unsetIsNillable();
    
    /**
     * Gets the "IsRestrictedPicklist" element
     */
    boolean getIsRestrictedPicklist();
    
    /**
     * Gets (as xml) the "IsRestrictedPicklist" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsRestrictedPicklist();
    
    /**
     * True if has "IsRestrictedPicklist" element
     */
    boolean isSetIsRestrictedPicklist();
    
    /**
     * Sets the "IsRestrictedPicklist" element
     */
    void setIsRestrictedPicklist(boolean isRestrictedPicklist);
    
    /**
     * Sets (as xml) the "IsRestrictedPicklist" element
     */
    void xsetIsRestrictedPicklist(org.apache.xmlbeans.XmlBoolean isRestrictedPicklist);
    
    /**
     * Unsets the "IsRestrictedPicklist" element
     */
    void unsetIsRestrictedPicklist();
    
    /**
     * Gets the "PicklistItems" element
     */
    com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems getPicklistItems();
    
    /**
     * True if has "PicklistItems" element
     */
    boolean isSetPicklistItems();
    
    /**
     * Sets the "PicklistItems" element
     */
    void setPicklistItems(com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems picklistItems);
    
    /**
     * Appends and returns a new empty "PicklistItems" element
     */
    com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems addNewPicklistItems();
    
    /**
     * Unsets the "PicklistItems" element
     */
    void unsetPicklistItems();
    
    /**
     * Gets the "IsSendTime" element
     */
    boolean getIsSendTime();
    
    /**
     * Gets (as xml) the "IsSendTime" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsSendTime();
    
    /**
     * True if has "IsSendTime" element
     */
    boolean isSetIsSendTime();
    
    /**
     * Sets the "IsSendTime" element
     */
    void setIsSendTime(boolean isSendTime);
    
    /**
     * Sets (as xml) the "IsSendTime" element
     */
    void xsetIsSendTime(org.apache.xmlbeans.XmlBoolean isSendTime);
    
    /**
     * Unsets the "IsSendTime" element
     */
    void unsetIsSendTime();
    
    /**
     * Gets the "DisplayOrder" element
     */
    int getDisplayOrder();
    
    /**
     * Gets (as xml) the "DisplayOrder" element
     */
    org.apache.xmlbeans.XmlInt xgetDisplayOrder();
    
    /**
     * True if has "DisplayOrder" element
     */
    boolean isSetDisplayOrder();
    
    /**
     * Sets the "DisplayOrder" element
     */
    void setDisplayOrder(int displayOrder);
    
    /**
     * Sets (as xml) the "DisplayOrder" element
     */
    void xsetDisplayOrder(org.apache.xmlbeans.XmlInt displayOrder);
    
    /**
     * Unsets the "DisplayOrder" element
     */
    void unsetDisplayOrder();
    
    /**
     * Gets the "References" element
     */
    com.exacttarget.wsdl.partnerapi.PropertyDefinition.References getReferences();
    
    /**
     * True if has "References" element
     */
    boolean isSetReferences();
    
    /**
     * Sets the "References" element
     */
    void setReferences(com.exacttarget.wsdl.partnerapi.PropertyDefinition.References references);
    
    /**
     * Appends and returns a new empty "References" element
     */
    com.exacttarget.wsdl.partnerapi.PropertyDefinition.References addNewReferences();
    
    /**
     * Unsets the "References" element
     */
    void unsetReferences();
    
    /**
     * Gets the "RelationshipName" element
     */
    java.lang.String getRelationshipName();
    
    /**
     * Gets (as xml) the "RelationshipName" element
     */
    org.apache.xmlbeans.XmlString xgetRelationshipName();
    
    /**
     * True if has "RelationshipName" element
     */
    boolean isSetRelationshipName();
    
    /**
     * Sets the "RelationshipName" element
     */
    void setRelationshipName(java.lang.String relationshipName);
    
    /**
     * Sets (as xml) the "RelationshipName" element
     */
    void xsetRelationshipName(org.apache.xmlbeans.XmlString relationshipName);
    
    /**
     * Unsets the "RelationshipName" element
     */
    void unsetRelationshipName();
    
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
     * Gets the "IsContextSpecific" element
     */
    boolean getIsContextSpecific();
    
    /**
     * Gets (as xml) the "IsContextSpecific" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsContextSpecific();
    
    /**
     * True if has "IsContextSpecific" element
     */
    boolean isSetIsContextSpecific();
    
    /**
     * Sets the "IsContextSpecific" element
     */
    void setIsContextSpecific(boolean isContextSpecific);
    
    /**
     * Sets (as xml) the "IsContextSpecific" element
     */
    void xsetIsContextSpecific(org.apache.xmlbeans.XmlBoolean isContextSpecific);
    
    /**
     * Unsets the "IsContextSpecific" element
     */
    void unsetIsContextSpecific();
    
    /**
     * An XML PicklistItems(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface PicklistItems extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PicklistItems.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("picklistitems439belemtype");
        
        /**
         * Gets array of all "PicklistItem" elements
         */
        com.exacttarget.wsdl.partnerapi.PicklistItem[] getPicklistItemArray();
        
        /**
         * Gets ith "PicklistItem" element
         */
        com.exacttarget.wsdl.partnerapi.PicklistItem getPicklistItemArray(int i);
        
        /**
         * Returns number of "PicklistItem" element
         */
        int sizeOfPicklistItemArray();
        
        /**
         * Sets array of all "PicklistItem" element
         */
        void setPicklistItemArray(com.exacttarget.wsdl.partnerapi.PicklistItem[] picklistItemArray);
        
        /**
         * Sets ith "PicklistItem" element
         */
        void setPicklistItemArray(int i, com.exacttarget.wsdl.partnerapi.PicklistItem picklistItem);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PicklistItem" element
         */
        com.exacttarget.wsdl.partnerapi.PicklistItem insertNewPicklistItem(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PicklistItem" element
         */
        com.exacttarget.wsdl.partnerapi.PicklistItem addNewPicklistItem();
        
        /**
         * Removes the ith "PicklistItem" element
         */
        void removePicklistItem(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems newInstance() {
              return (com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML References(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface References extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(References.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("references8352elemtype");
        
        /**
         * Gets array of all "Reference" elements
         */
        com.exacttarget.wsdl.partnerapi.APIObject[] getReferenceArray();
        
        /**
         * Gets ith "Reference" element
         */
        com.exacttarget.wsdl.partnerapi.APIObject getReferenceArray(int i);
        
        /**
         * Returns number of "Reference" element
         */
        int sizeOfReferenceArray();
        
        /**
         * Sets array of all "Reference" element
         */
        void setReferenceArray(com.exacttarget.wsdl.partnerapi.APIObject[] referenceArray);
        
        /**
         * Sets ith "Reference" element
         */
        void setReferenceArray(int i, com.exacttarget.wsdl.partnerapi.APIObject reference);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Reference" element
         */
        com.exacttarget.wsdl.partnerapi.APIObject insertNewReference(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Reference" element
         */
        com.exacttarget.wsdl.partnerapi.APIObject addNewReference();
        
        /**
         * Removes the ith "Reference" element
         */
        void removeReference(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.PropertyDefinition.References newInstance() {
              return (com.exacttarget.wsdl.partnerapi.PropertyDefinition.References) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.PropertyDefinition.References newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.PropertyDefinition.References) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition newInstance() {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.PropertyDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.PropertyDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

/*
 *  Copyright (C) 2008-2011 VMware, Inc. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-10/02/2007 10:39 AM(ffu)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.12.20 at 10:31:30 AM PST 
//

package com.wavemaker.tools.webapp.schema;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 * 
 * Declares the handler for a port-component. Handlers can access the init-param name/value pairs using the HandlerInfo
 * interface. If port-name is not specified, the handler is assumed to be associated with all ports of the service.
 * 
 * Used in: service-ref
 * 
 * 
 * 
 * <p>
 * Java class for service-ref_handlerType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="service-ref_handlerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://java.sun.com/xml/ns/j2ee}descriptionGroup"/>
 *         &lt;element name="handler-name" type="{http://java.sun.com/xml/ns/j2ee}string"/>
 *         &lt;element name="handler-class" type="{http://java.sun.com/xml/ns/j2ee}fully-qualified-classType"/>
 *         &lt;element name="init-param" type="{http://java.sun.com/xml/ns/j2ee}param-valueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="soap-header" type="{http://java.sun.com/xml/ns/j2ee}xsdQNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="soap-role" type="{http://java.sun.com/xml/ns/j2ee}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="port-name" type="{http://java.sun.com/xml/ns/j2ee}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service-ref_handlerType", propOrder = { "description", "displayName", "icon", "handlerName", "handlerClass", "initParam",
    "soapHeader", "soapRole", "portName" })
public class ServiceRefHandlerType {

    protected List<DescriptionType> description;

    @XmlElement(name = "display-name")
    protected List<DisplayNameType> displayName;

    protected List<IconType> icon;

    @XmlElement(name = "handler-name", required = true)
    protected com.wavemaker.tools.webapp.schema.String handlerName;

    @XmlElement(name = "handler-class", required = true)
    protected FullyQualifiedClassType handlerClass;

    @XmlElement(name = "init-param")
    protected List<ParamValueType> initParam;

    @XmlElement(name = "soap-header")
    protected List<XsdQNameType> soapHeader;

    @XmlElement(name = "soap-role")
    protected List<com.wavemaker.tools.webapp.schema.String> soapRole;

    @XmlElement(name = "port-name")
    protected List<com.wavemaker.tools.webapp.schema.String> portName;

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (this.description == null) {
            this.description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the displayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link DisplayNameType }
     * 
     * 
     */
    public List<DisplayNameType> getDisplayName() {
        if (this.displayName == null) {
            this.displayName = new ArrayList<DisplayNameType>();
        }
        return this.displayName;
    }

    /**
     * Gets the value of the icon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the icon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getIcon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link IconType }
     * 
     * 
     */
    public List<IconType> getIcon() {
        if (this.icon == null) {
            this.icon = new ArrayList<IconType>();
        }
        return this.icon;
    }

    /**
     * Gets the value of the handlerName property.
     * 
     * @return possible object is {@link com.wavemaker.tools.webapp.schema.String }
     * 
     */
    public com.wavemaker.tools.webapp.schema.String getHandlerName() {
        return this.handlerName;
    }

    /**
     * Sets the value of the handlerName property.
     * 
     * @param value allowed object is {@link com.wavemaker.tools.webapp.schema.String }
     * 
     */
    public void setHandlerName(com.wavemaker.tools.webapp.schema.String value) {
        this.handlerName = value;
    }

    /**
     * Gets the value of the handlerClass property.
     * 
     * @return possible object is {@link FullyQualifiedClassType }
     * 
     */
    public FullyQualifiedClassType getHandlerClass() {
        return this.handlerClass;
    }

    /**
     * Sets the value of the handlerClass property.
     * 
     * @param value allowed object is {@link FullyQualifiedClassType }
     * 
     */
    public void setHandlerClass(FullyQualifiedClassType value) {
        this.handlerClass = value;
    }

    /**
     * Gets the value of the initParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the initParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getInitParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ParamValueType }
     * 
     * 
     */
    public List<ParamValueType> getInitParam() {
        if (this.initParam == null) {
            this.initParam = new ArrayList<ParamValueType>();
        }
        return this.initParam;
    }

    /**
     * Gets the value of the soapHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the soapHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSoapHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link XsdQNameType }
     * 
     * 
     */
    public List<XsdQNameType> getSoapHeader() {
        if (this.soapHeader == null) {
            this.soapHeader = new ArrayList<XsdQNameType>();
        }
        return this.soapHeader;
    }

    /**
     * Gets the value of the soapRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the soapRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSoapRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link com.wavemaker.tools.webapp.schema.String }
     * 
     * 
     */
    public List<com.wavemaker.tools.webapp.schema.String> getSoapRole() {
        if (this.soapRole == null) {
            this.soapRole = new ArrayList<com.wavemaker.tools.webapp.schema.String>();
        }
        return this.soapRole;
    }

    /**
     * Gets the value of the portName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the portName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPortName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link com.wavemaker.tools.webapp.schema.String }
     * 
     * 
     */
    public List<com.wavemaker.tools.webapp.schema.String> getPortName() {
        if (this.portName == null) {
            this.portName = new ArrayList<com.wavemaker.tools.webapp.schema.String>();
        }
        return this.portName;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link java.lang.String }
     * 
     */
    public java.lang.String getId() {
        return this.id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value allowed object is {@link java.lang.String }
     * 
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}

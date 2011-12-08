/*
 *  Copyright (C) 2010-2011 VMware, Inc. All rights reserved.
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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.12 at 04:02:00 PM PST 
//

package com.wavemaker.tools.cloudmgr.opsource.listimages.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ServerImages element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="ServerImages">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="ServerImage">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="resourcePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="sourceResourcePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="cpuCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="memory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="osStorage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="additionalLocalStorage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="operatingSystem" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "serverImage" })
@XmlRootElement(name = "ServerImages")
public class ServerImages {

    @XmlElement(name = "ServerImage", namespace = "http://oec.api.opsource.net/schemas/server", required = true)
    protected List<ServerImage> serverImage;

    /**
     * Gets the value of the serverImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the serverImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getServerImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ServerImage }
     * 
     * 
     */
    public List<ServerImage> getServerImage() {
        if (this.serverImage == null) {
            this.serverImage = new ArrayList<ServerImage>();
        }
        return this.serverImage;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="resourcePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sourceResourcePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpuCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="memory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="osStorage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="additionalLocalStorage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="operatingSystem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "id", "resourcePath", "name", "description", "location", "sourceResourcePath", "cpuCount", "memory",
        "osStorage", "additionalLocalStorage", "created", "operatingSystem" })
    public static class ServerImage {

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
        protected String id;

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
        protected String resourcePath;

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
        protected String name;

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
        protected String description;

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
        protected String location;

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
        protected String sourceResourcePath;

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
        protected String cpuCount;

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
        protected String memory;

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
        protected String osStorage;

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
        protected String additionalLocalStorage;

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
        protected String created;

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server", required = true)
        protected List<OperatingSystem> operatingSystem;

        /**
         * Gets the value of the id property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getId() {
            return this.id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the resourcePath property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getResourcePath() {
            return this.resourcePath;
        }

        /**
         * Sets the value of the resourcePath property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setResourcePath(String value) {
            this.resourcePath = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getName() {
            return this.name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setLocation(String value) {
            this.location = value;
        }

        /**
         * Gets the value of the sourceResourcePath property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getSourceResourcePath() {
            return this.sourceResourcePath;
        }

        /**
         * Sets the value of the sourceResourcePath property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setSourceResourcePath(String value) {
            this.sourceResourcePath = value;
        }

        /**
         * Gets the value of the cpuCount property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getCpuCount() {
            return this.cpuCount;
        }

        /**
         * Sets the value of the cpuCount property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setCpuCount(String value) {
            this.cpuCount = value;
        }

        /**
         * Gets the value of the memory property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * Sets the value of the memory property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setMemory(String value) {
            this.memory = value;
        }

        /**
         * Gets the value of the osStorage property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getOsStorage() {
            return this.osStorage;
        }

        /**
         * Sets the value of the osStorage property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setOsStorage(String value) {
            this.osStorage = value;
        }

        /**
         * Gets the value of the additionalLocalStorage property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getAdditionalLocalStorage() {
            return this.additionalLocalStorage;
        }

        /**
         * Sets the value of the additionalLocalStorage property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setAdditionalLocalStorage(String value) {
            this.additionalLocalStorage = value;
        }

        /**
         * Gets the value of the created property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * Sets the value of the created property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setCreated(String value) {
            this.created = value;
        }

        /**
         * Gets the value of the operatingSystem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
         * make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE>
         * method for the operatingSystem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getOperatingSystem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list {@link OperatingSystem }
         * 
         * 
         */
        public List<OperatingSystem> getOperatingSystem() {
            if (this.operatingSystem == null) {
                this.operatingSystem = new ArrayList<OperatingSystem>();
            }
            return this.operatingSystem;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "type", "displayName" })
        public static class OperatingSystem {

            @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
            protected String type;

            @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
            protected String displayName;

            /**
             * Gets the value of the type property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getType() {
                return this.type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the displayName property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getDisplayName() {
                return this.displayName;
            }

            /**
             * Sets the value of the displayName property.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setDisplayName(String value) {
                this.displayName = value;
            }

        }

    }

}

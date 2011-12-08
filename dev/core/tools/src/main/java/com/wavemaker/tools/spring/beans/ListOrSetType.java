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
// Generated on: 2008.02.26 at 04:39:33 PM PST 
//

package com.wavemaker.tools.spring.beans;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for listOrSetType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOrSetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.springframework.org/schema/beans}typedCollectionType">
 *       &lt;group ref="{http://www.springframework.org/schema/beans}collectionElements"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOrSetType", propOrder = { "refElement" })
@XmlSeeAlso({ com.wavemaker.tools.spring.beans.List.class, Set.class })
public class ListOrSetType extends TypedCollectionType {

    @XmlElementRefs({ @XmlElementRef(name = "value", namespace = "http://www.springframework.org/schema/beans", type = Value.class),
        @XmlElementRef(name = "idref", namespace = "http://www.springframework.org/schema/beans", type = Idref.class),
        @XmlElementRef(name = "bean", namespace = "http://www.springframework.org/schema/beans", type = Bean.class),
        @XmlElementRef(name = "ref", namespace = "http://www.springframework.org/schema/beans", type = Ref.class),
        @XmlElementRef(name = "null", namespace = "http://www.springframework.org/schema/beans", type = Null.class),
        @XmlElementRef(name = "list", namespace = "http://www.springframework.org/schema/beans", type = com.wavemaker.tools.spring.beans.List.class),
        @XmlElementRef(name = "map", namespace = "http://www.springframework.org/schema/beans", type = Map.class),
        @XmlElementRef(name = "set", namespace = "http://www.springframework.org/schema/beans", type = Set.class),
        @XmlElementRef(name = "props", namespace = "http://www.springframework.org/schema/beans", type = Props.class) })
    @XmlAnyElement(lax = true)
    protected java.util.List<Object> refElement;

    /**
     * Gets the value of the refElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the refElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getRefElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Value } {@link Idref } {@link Null } {@link Ref }
     * {@link Bean } {@link Map } {@link com.wavemaker.tools.spring.beans.List } {@link Set } {@link Props } {@link Object }
     * 
     * 
     */
    public java.util.List<Object> getRefElement() {
        if (this.refElement == null) {
            this.refElement = new ArrayList<Object>();
        }
        return this.refElement;
    }

    /**
     * Sets the value of the refElement property.
     * 
     * @param refElement allowed object is {@link Value } {@link Idref } {@link Null } {@link Ref } {@link Bean } {@link Map }
     *        {@link com.wavemaker.tools.spring.beans.List } {@link Set } {@link Props } {@link Object }
     * 
     */
    public void setRefElement(java.util.List<Object> refElement) {
        this.refElement = refElement;
    }

}

/*
 * The MIT License
 *
 * Copyright 2014 Pós-Graduação em Ciência da Computação UFJF.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.ufjf.myexperiment.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author vitorfs
 * @author lesimoes
 */

@XmlRootElement(name = "SearchResult")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResult")

public abstract class SearchResult {
    
    @XmlElement(name = "id", required = true)
    private Integer id;
    @XmlAttribute(name = "resource")
    private String resource;
    @XmlAttribute(name = "uri")
    private String uri;
    @XmlElement(name = "title", required = true)
    private String description;
    @XmlElement(name = "created-at", required = true)
    private String createdAt;
    @XmlElement(name = "updated-at", required = true)
    private String updatedAt;
    @XmlElement(name = "statistics", required = true)
    private Statistics total;
    
 
    
    public Integer getId() {
        return id;
    }
  

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    
    public String getResource() {
        return resource;
    }

 
    public void setResource(String resource) {
        this.resource = resource;
    }


    public String getUri() {
        return uri;
    }



    public void setUri(String uri) {
        this.uri = uri;
    }
    

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }    
    
    public void setCreatedAt(String createdAt){
        this.createdAt = createdAt;
    }
    
    public String getCreatedAt(){
        return createdAt;
    }
  
    public void setUpdatedAt(String updatedAt){
        this.updatedAt = updatedAt;
    }
    
    public String getUpdatedAt(){
        return updatedAt;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total.getTotal();
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total.setTotal(total); 
    }


    
  
    
}

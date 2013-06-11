/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.openrtb.common.api;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Producer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Producer\",\"namespace\":\"org.openrtb.common.api\",\"fields\":[{\"name\":\"id\",\"type\":[\"string\",\"null\"]},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"cat\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"]},{\"name\":\"domain\",\"type\":[\"string\",\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   public java.lang.CharSequence id;
   public java.lang.CharSequence name;
   public java.util.List<java.lang.CharSequence> cat;
   public java.lang.CharSequence domain;
   public java.lang.CharSequence ext;

  /**
   * Default constructor.
   */
  public Producer() {}

  /**
   * All-args constructor.
   */
  public Producer(java.lang.CharSequence id, java.lang.CharSequence name, java.util.List<java.lang.CharSequence> cat, java.lang.CharSequence domain, java.lang.CharSequence ext) {
    this.id = id;
    this.name = name;
    this.cat = cat;
    this.domain = domain;
    this.ext = ext;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return cat;
    case 3: return domain;
    case 4: return ext;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: cat = (java.util.List<java.lang.CharSequence>)value$; break;
    case 3: domain = (java.lang.CharSequence)value$; break;
    case 4: ext = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'cat' field.
   */
  public java.util.List<java.lang.CharSequence> getCat() {
    return cat;
  }

  /**
   * Sets the value of the 'cat' field.
   * @param value the value to set.
   */
  public void setCat(java.util.List<java.lang.CharSequence> value) {
    this.cat = value;
  }

  /**
   * Gets the value of the 'domain' field.
   */
  public java.lang.CharSequence getDomain() {
    return domain;
  }

  /**
   * Sets the value of the 'domain' field.
   * @param value the value to set.
   */
  public void setDomain(java.lang.CharSequence value) {
    this.domain = value;
  }

  /**
   * Gets the value of the 'ext' field.
   */
  public java.lang.CharSequence getExt() {
    return ext;
  }

  /**
   * Sets the value of the 'ext' field.
   * @param value the value to set.
   */
  public void setExt(java.lang.CharSequence value) {
    this.ext = value;
  }

  /** Creates a new Producer RecordBuilder */
  public static org.openrtb.common.api.Producer.Builder newBuilder() {
    return new org.openrtb.common.api.Producer.Builder();
  }
  
  /** Creates a new Producer RecordBuilder by copying an existing Builder */
  public static org.openrtb.common.api.Producer.Builder newBuilder(org.openrtb.common.api.Producer.Builder other) {
    return new org.openrtb.common.api.Producer.Builder(other);
  }
  
  /** Creates a new Producer RecordBuilder by copying an existing Producer instance */
  public static org.openrtb.common.api.Producer.Builder newBuilder(org.openrtb.common.api.Producer other) {
    return new org.openrtb.common.api.Producer.Builder(other);
  }
  
  /**
   * RecordBuilder for Producer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Producer>
    implements org.apache.avro.data.RecordBuilder<Producer> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.util.List<java.lang.CharSequence> cat;
    private java.lang.CharSequence domain;
    private java.lang.CharSequence ext;

    /** Creates a new Builder */
    private Builder() {
      super(org.openrtb.common.api.Producer.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.openrtb.common.api.Producer.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Producer instance */
    private Builder(org.openrtb.common.api.Producer other) {
            super(org.openrtb.common.api.Producer.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.cat)) {
        this.cat = data().deepCopy(fields()[2].schema(), other.cat);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.domain)) {
        this.domain = data().deepCopy(fields()[3].schema(), other.domain);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.ext)) {
        this.ext = data().deepCopy(fields()[4].schema(), other.ext);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.openrtb.common.api.Producer.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public org.openrtb.common.api.Producer.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.openrtb.common.api.Producer.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public org.openrtb.common.api.Producer.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'cat' field */
    public java.util.List<java.lang.CharSequence> getCat() {
      return cat;
    }
    
    /** Sets the value of the 'cat' field */
    public org.openrtb.common.api.Producer.Builder setCat(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.cat = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'cat' field has been set */
    public boolean hasCat() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'cat' field */
    public org.openrtb.common.api.Producer.Builder clearCat() {
      cat = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'domain' field */
    public java.lang.CharSequence getDomain() {
      return domain;
    }
    
    /** Sets the value of the 'domain' field */
    public org.openrtb.common.api.Producer.Builder setDomain(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.domain = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'domain' field has been set */
    public boolean hasDomain() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'domain' field */
    public org.openrtb.common.api.Producer.Builder clearDomain() {
      domain = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'ext' field */
    public java.lang.CharSequence getExt() {
      return ext;
    }
    
    /** Sets the value of the 'ext' field */
    public org.openrtb.common.api.Producer.Builder setExt(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.ext = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'ext' field has been set */
    public boolean hasExt() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'ext' field */
    public org.openrtb.common.api.Producer.Builder clearExt() {
      ext = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Producer build() {
      try {
        Producer record = new Producer();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.cat = fieldSetFlags()[2] ? this.cat : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[2]);
        record.domain = fieldSetFlags()[3] ? this.domain : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.ext = fieldSetFlags()[4] ? this.ext : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}

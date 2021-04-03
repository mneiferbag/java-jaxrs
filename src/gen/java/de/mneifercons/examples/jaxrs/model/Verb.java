package de.mneifercons.examples.jaxrs.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

public class Verb   {
  
  @Schema(description = "")
  private String name = null;
  
  @Schema(description = "")
  private String first = null;
  
  @Schema(description = "")
  private String second = null;
  
  @Schema(description = "")
  private String third = null;
  
  @Schema(description = "")
  private String firsts = null;
  
  @Schema(description = "")
  private String seconds = null;
  
  @Schema(description = "")
  private String thirds = null;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Verb name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get first
   * @return first
  **/
  @JsonProperty("first")
  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public Verb first(String first) {
    this.first = first;
    return this;
  }

 /**
   * Get second
   * @return second
  **/
  @JsonProperty("second")
  public String getSecond() {
    return second;
  }

  public void setSecond(String second) {
    this.second = second;
  }

  public Verb second(String second) {
    this.second = second;
    return this;
  }

 /**
   * Get third
   * @return third
  **/
  @JsonProperty("third")
  public String getThird() {
    return third;
  }

  public void setThird(String third) {
    this.third = third;
  }

  public Verb third(String third) {
    this.third = third;
    return this;
  }

 /**
   * Get firsts
   * @return firsts
  **/
  @JsonProperty("firsts")
  public String getFirsts() {
    return firsts;
  }

  public void setFirsts(String firsts) {
    this.firsts = firsts;
  }

  public Verb firsts(String firsts) {
    this.firsts = firsts;
    return this;
  }

 /**
   * Get seconds
   * @return seconds
  **/
  @JsonProperty("seconds")
  public String getSeconds() {
    return seconds;
  }

  public void setSeconds(String seconds) {
    this.seconds = seconds;
  }

  public Verb seconds(String seconds) {
    this.seconds = seconds;
    return this;
  }

 /**
   * Get thirds
   * @return thirds
  **/
  @JsonProperty("thirds")
  public String getThirds() {
    return thirds;
  }

  public void setThirds(String thirds) {
    this.thirds = thirds;
  }

  public Verb thirds(String thirds) {
    this.thirds = thirds;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Verb {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
    sb.append("    third: ").append(toIndentedString(third)).append("\n");
    sb.append("    firsts: ").append(toIndentedString(firsts)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    thirds: ").append(toIndentedString(thirds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

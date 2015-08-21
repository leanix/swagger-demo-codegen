package net.leanix.swaggerdemo.api.models;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Animal  {
  
  private String name = null;
  private String race = null;
  public enum GenderEnum {
     FEMALE,  MALE,  UNCERTAIN, 
  };
  private GenderEnum gender = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("race")
  public String getRace() {
    return race;
  }
  public void setRace(String race) {
    this.race = race;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("gender")
  public GenderEnum getGender() {
    return gender;
  }
  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Animal {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  race: ").append(race).append("\n");
    sb.append("  gender: ").append(gender).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

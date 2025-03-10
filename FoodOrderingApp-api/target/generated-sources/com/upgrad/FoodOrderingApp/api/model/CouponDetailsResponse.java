package com.upgrad.FoodOrderingApp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CouponDetailsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-10T14:36:45.816+05:30")

public class CouponDetailsResponse   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("coupon_name")
  private String couponName = null;

  @JsonProperty("percent")
  private Integer percent = null;

  public CouponDetailsResponse id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the coupon in a standard UUID format
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the coupon in a standard UUID format")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CouponDetailsResponse couponName(String couponName) {
    this.couponName = couponName;
    return this;
  }

  /**
   * Name of the coupon
   * @return couponName
  **/
  @ApiModelProperty(value = "Name of the coupon")


  public String getCouponName() {
    return couponName;
  }

  public void setCouponName(String couponName) {
    this.couponName = couponName;
  }

  public CouponDetailsResponse percent(Integer percent) {
    this.percent = percent;
    return this;
  }

  /**
   * Discount percentage for the coupon
   * @return percent
  **/
  @ApiModelProperty(value = "Discount percentage for the coupon")


  public Integer getPercent() {
    return percent;
  }

  public void setPercent(Integer percent) {
    this.percent = percent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponDetailsResponse couponDetailsResponse = (CouponDetailsResponse) o;
    return Objects.equals(this.id, couponDetailsResponse.id) &&
        Objects.equals(this.couponName, couponDetailsResponse.couponName) &&
        Objects.equals(this.percent, couponDetailsResponse.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, couponName, percent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponDetailsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    couponName: ").append(toIndentedString(couponName)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


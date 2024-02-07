package com.onbroker.payload;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerPlanDto {


   private long PlanId;


   private String PlanName;

   private double price;

   private int planValidity;

   private boolean relationshipManager;

   private boolean RentalAgreement;

   private boolean PropertyPromotion;

   private boolean GuaranteedTenants;

   private boolean showingProperty;

   private boolean FacebookMarketingOfProperty;

   public long getPlanId() {
      return PlanId;
   }

   public void setPlanId(long planId) {
      PlanId = planId;
   }

   public String getPlanName() {
      return PlanName;
   }

   public void setPlanName(String planName) {
      PlanName = planName;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public int getPlanValidity() {
      return planValidity;
   }

   public void setPlanValidity(int planValidity) {
      this.planValidity = planValidity;
   }

   public boolean isRelationshipManager() {
      return relationshipManager;
   }

   public void setRelationshipManager(boolean relationshipManager) {
      this.relationshipManager = relationshipManager;
   }

   public boolean isRentalAgreement() {
      return RentalAgreement;
   }

   public void setRentalAgreement(boolean rentalAgreement) {
      RentalAgreement = rentalAgreement;
   }

   public boolean isPropertyPromotion() {
      return PropertyPromotion;
   }

   public void setPropertyPromotion(boolean propertyPromotion) {
      PropertyPromotion = propertyPromotion;
   }

   public boolean isGuaranteedTenants() {
      return GuaranteedTenants;
   }

   public void setGuaranteedTenants(boolean guaranteedTenants) {
      GuaranteedTenants = guaranteedTenants;
   }

   public boolean isShowingProperty() {
      return showingProperty;
   }

   public void setShowingProperty(boolean showingProperty) {
      this.showingProperty = showingProperty;
   }

   public boolean isFacebookMarketingOfProperty() {
      return FacebookMarketingOfProperty;
   }

   public void setFacebookMarketingOfProperty(boolean facebookMarketingOfProperty) {
      FacebookMarketingOfProperty = facebookMarketingOfProperty;
   }
}

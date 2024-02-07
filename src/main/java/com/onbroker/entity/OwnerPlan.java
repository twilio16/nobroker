package com.onbroker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "owner_plans")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerPlan {


   @Id
   private long PlanId;

   @Column(name = "plan_name", unique = true)
   private String PlanName;
   @Column(name = "price")
   private double price;
   @Column(name = "plan_validity")
   private int planValidity;
   @Column(name = "relationship_Manager")
   private boolean relationshipManager;
   @Column(name = "Rental_Agreement")
   private boolean RentalAgreement;
   @Column(name = "Property_Promotion")
   private boolean PropertyPromotion;
   @Column(name = "Guaranteed_Tenants")
   private boolean GuaranteedTenants;
   @Column(name = "showing_Property")
   private boolean showingProperty;
   @Column(name = "Facebook_Marketing_of_property")
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

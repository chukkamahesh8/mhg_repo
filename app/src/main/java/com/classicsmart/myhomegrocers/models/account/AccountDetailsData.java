package com.classicsmart.myhomegrocers.models.account;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AccountDetailsData implements Serializable
{

    @SerializedName("customer_id")
    @Expose
    private String customerId;
    @SerializedName("customer_group_id")
    @Expose
    private String customerGroupId;
    @SerializedName("store_id")
    @Expose
    private String storeId;
    @SerializedName("language_id")
    @Expose
    private String languageId;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("telephone")
    @Expose
    private String telephone;
    @SerializedName("fax")
    @Expose
    private String fax;
    @SerializedName("cart")
    @Expose
    private String cart;
    @SerializedName("wishlist")
    @Expose
    private String wishlist;
    @SerializedName("newsletter")
    @Expose
    private String newsletter;
    @SerializedName("address_id")
    @Expose
    private String addressId;
    @SerializedName("ip")
    @Expose
    private String ip;
    @SerializedName("profile_image")
    @Expose
    private String profileImage;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("safe")
    @Expose
    private String safe;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("date_added")
    @Expose
    private String dateAdded;
    @SerializedName("approved")
    @Expose
    private String approved;
    @SerializedName("verified")
    @Expose
    private String verified;
    @SerializedName("refer_code")
    @Expose
    private Object referCode;
    @SerializedName("referral_code")
    @Expose
    private Object referralCode;
    @SerializedName("social_id")
    @Expose
    private String socialId;
    @SerializedName("social_provider")
    @Expose
    private String socialProvider;
    @SerializedName("telephone_iso2_code")
    @Expose
    private String telephoneIso2Code;
    @SerializedName("telephone_dial_code")
    @Expose
    private String telephoneDialCode;
    @SerializedName("telephone_verified")
    @Expose
    private String telephoneVerified;
    @SerializedName("account_custom_field")
    @Expose
    private Object accountCustomField;
    @SerializedName("reward_total")
    @Expose
    private String rewardTotal;
    @SerializedName("user_balance")
    @Expose
    private String userBalance;
    private final static long serialVersionUID = -8596630269215843057L;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(String customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCart() {
        return cart;
    }

    public void setCart(String cart) {
        this.cart = cart;
    }

    public String getWishlist() {
        return wishlist;
    }

    public void setWishlist(String wishlist) {
        this.wishlist = wishlist;
    }

    public String getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(String newsletter) {
        this.newsletter = newsletter;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSafe() {
        return safe;
    }

    public void setSafe(String safe) {
        this.safe = safe;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }

    public Object getReferCode() {
        return referCode;
    }

    public void setReferCode(Object referCode) {
        this.referCode = referCode;
    }

    public Object getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(Object referralCode) {
        this.referralCode = referralCode;
    }

    public String getSocialId() {
        return socialId;
    }

    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }

    public String getSocialProvider() {
        return socialProvider;
    }

    public void setSocialProvider(String socialProvider) {
        this.socialProvider = socialProvider;
    }

    public String getTelephoneIso2Code() {
        return telephoneIso2Code;
    }

    public void setTelephoneIso2Code(String telephoneIso2Code) {
        this.telephoneIso2Code = telephoneIso2Code;
    }

    public String getTelephoneDialCode() {
        return telephoneDialCode;
    }

    public void setTelephoneDialCode(String telephoneDialCode) {
        this.telephoneDialCode = telephoneDialCode;
    }

    public String getTelephoneVerified() {
        return telephoneVerified;
    }

    public void setTelephoneVerified(String telephoneVerified) {
        this.telephoneVerified = telephoneVerified;
    }

    public Object getAccountCustomField() {
        return accountCustomField;
    }

    public void setAccountCustomField(Object accountCustomField) {
        this.accountCustomField = accountCustomField;
    }

    public String getRewardTotal() {
        return rewardTotal;
    }

    public void setRewardTotal(String rewardTotal) {
        this.rewardTotal = rewardTotal;
    }

    public String getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(String userBalance) {
        this.userBalance = userBalance;
    }

}

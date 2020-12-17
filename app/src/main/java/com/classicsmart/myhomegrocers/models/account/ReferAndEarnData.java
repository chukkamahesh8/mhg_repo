package com.classicsmart.myhomegrocers.models.account;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ReferAndEarnData implements Serializable
{

    @SerializedName("total_claimed")
    @Expose
    private String totalClaimed;
    @SerializedName("referral_code")
    @Expose
    private Long referralCode;
    @SerializedName("referal_amount")
    @Expose
    private String referalAmount;
    @SerializedName("referal_order_total")
    @Expose
    private String referalOrderTotal;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("title_banner_image")
    @Expose
    private String titleBannerImage;
    @SerializedName("sub_title")
    @Expose
    private String subTitle;
    @SerializedName("terms_conditions")
    @Expose
    private List<String> termsConditions = null;
    @SerializedName("refer_steps")
    @Expose
    private List<ReferStep> referSteps = null;
    @SerializedName("reasons")
    @Expose
    private List<Reasons> reasons = null;
    @SerializedName("store_url")
    @Expose
    private String storeUrl;
    @SerializedName("referrals")
    @Expose
    private List<Referals> referrals = null;
    private final static long serialVersionUID = -4718985634432057820L;

    public String getTotalClaimed() {
    return totalClaimed;
}

    public void setTotalClaimed(String totalClaimed) {
    this.totalClaimed = totalClaimed;
}

    public Long getReferralCode() {
    return referralCode;
}

    public void setReferralCode(Long referralCode) {
    this.referralCode = referralCode;
}

    public String getReferalAmount() {
    return referalAmount;
}

    public void setReferalAmount(String referalAmount) {
    this.referalAmount = referalAmount;
}

    public String getReferalOrderTotal() {
    return referalOrderTotal;
}

    public void setReferalOrderTotal(String referalOrderTotal) {
    this.referalOrderTotal = referalOrderTotal;
}

    public String getTitle() {
    return title;
}

    public void setTitle(String title) {
    this.title = title;
}

    public String getTitleBannerImage() {
    return titleBannerImage;
}

    public void setTitleBannerImage(String titleBannerImage) {
    this.titleBannerImage = titleBannerImage;
}

    public String getSubTitle() {
    return subTitle;
}

    public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
}

    public List<String> getTermsConditions() {
    return termsConditions;
}

    public void setTermsConditions(List<String> termsConditions) {
    this.termsConditions = termsConditions;
}

    public List<ReferStep> getReferSteps() {
    return referSteps;
}

    public void setReferSteps(List<ReferStep> referSteps) {
    this.referSteps = referSteps;
}

    public List<Reasons> getReasons() {
    return reasons;
}

    public void setReasons(List<Reasons> reasons) {
    this.reasons = reasons;
}

    public String getStoreUrl() {
    return storeUrl;
}

    public void setStoreUrl(String storeUrl) {
    this.storeUrl = storeUrl;
}

    public List<Referals> getReferrals() {
    return referrals;
}

    public void setReferrals(List<Referals> referrals) {
    this.referrals = referrals;
}

}
package com.classicsmart.myhomegrocers;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.classicsmart.myhomegrocers.databinding.ActivityAddNewaddressBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ActivityCartBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ActivityCategoryWishlist2BindingImpl;
import com.classicsmart.myhomegrocers.databinding.ActivityDeliveryAddressBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ActivityForgotpasswordBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ActivityHomeBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ActivityLoginBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ActivityLoginFlowBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ActivityLoginotpBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ActivityLoginpasswordBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ActivityMainSignupBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ActivityMyOrdersBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ActivityNotificationsBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ActivitySignupBindingImpl;
import com.classicsmart.myhomegrocers.databinding.BottomBarBindingImpl;
import com.classicsmart.myhomegrocers.databinding.CartFragmentBindingImpl;
import com.classicsmart.myhomegrocers.databinding.FragmentHomeBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ItemAddcartBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ItemChangePasswordBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ItemEnterforgotpasswordBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ItemNewproductBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ItemOfferBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ItemProductBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ListUpdatesBindingImpl;
import com.classicsmart.myhomegrocers.databinding.MyOrdersFragmentBindingImpl;
import com.classicsmart.myhomegrocers.databinding.NotificationsFragmentBindingImpl;
import com.classicsmart.myhomegrocers.databinding.RightTopNavigationBindingImpl;
import com.classicsmart.myhomegrocers.databinding.SpecialOffersFragmentBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ViewOtpBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ViewOtpVerificationBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ViewPasswordBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ViewSidepanelBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ViewSliderBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ViewVerifyMobilenoBindingImpl;
import com.classicsmart.myhomegrocers.databinding.ViewVerifytestmailBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYADDNEWADDRESS = 1;

  private static final int LAYOUT_ACTIVITYCART = 2;

  private static final int LAYOUT_ACTIVITYCATEGORYWISHLIST2 = 3;

  private static final int LAYOUT_ACTIVITYDELIVERYADDRESS = 4;

  private static final int LAYOUT_ACTIVITYFORGOTPASSWORD = 5;

  private static final int LAYOUT_ACTIVITYHOME = 6;

  private static final int LAYOUT_ACTIVITYLOGIN = 7;

  private static final int LAYOUT_ACTIVITYLOGINFLOW = 8;

  private static final int LAYOUT_ACTIVITYLOGINOTP = 9;

  private static final int LAYOUT_ACTIVITYLOGINPASSWORD = 10;

  private static final int LAYOUT_ACTIVITYMAINSIGNUP = 11;

  private static final int LAYOUT_ACTIVITYMYORDERS = 12;

  private static final int LAYOUT_ACTIVITYNOTIFICATIONS = 13;

  private static final int LAYOUT_ACTIVITYSIGNUP = 14;

  private static final int LAYOUT_BOTTOMBAR = 15;

  private static final int LAYOUT_CARTFRAGMENT = 16;

  private static final int LAYOUT_FRAGMENTHOME = 17;

  private static final int LAYOUT_ITEMADDCART = 18;

  private static final int LAYOUT_ITEMCATEGORYROW = 19;

  private static final int LAYOUT_ITEMCHANGEPASSWORD = 20;

  private static final int LAYOUT_ITEMENTERFORGOTPASSWORD = 21;

  private static final int LAYOUT_ITEMNEWPRODUCT = 22;

  private static final int LAYOUT_ITEMOFFER = 23;

  private static final int LAYOUT_ITEMPRODUCT = 24;

  private static final int LAYOUT_LISTUPDATES = 25;

  private static final int LAYOUT_MYORDERSFRAGMENT = 26;

  private static final int LAYOUT_NOTIFICATIONSFRAGMENT = 27;

  private static final int LAYOUT_RIGHTTOPNAVIGATION = 28;

  private static final int LAYOUT_SPECIALOFFERSFRAGMENT = 29;

  private static final int LAYOUT_VIEWOTP = 30;

  private static final int LAYOUT_VIEWOTPVERIFICATION = 31;

  private static final int LAYOUT_VIEWPASSWORD = 32;

  private static final int LAYOUT_VIEWSIDEPANEL = 33;

  private static final int LAYOUT_VIEWSLIDER = 34;

  private static final int LAYOUT_VIEWVERIFYMOBILENO = 35;

  private static final int LAYOUT_VIEWVERIFYTESTMAIL = 36;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(36);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.activity_add_newaddress, LAYOUT_ACTIVITYADDNEWADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.activity_cart, LAYOUT_ACTIVITYCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.activity_category_wishlist2, LAYOUT_ACTIVITYCATEGORYWISHLIST2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.activity_delivery_address, LAYOUT_ACTIVITYDELIVERYADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.activity_forgotpassword, LAYOUT_ACTIVITYFORGOTPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.activity_login_flow, LAYOUT_ACTIVITYLOGINFLOW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.activity_loginotp, LAYOUT_ACTIVITYLOGINOTP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.activity_loginpassword, LAYOUT_ACTIVITYLOGINPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.activity_main_signup, LAYOUT_ACTIVITYMAINSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.activity_my_orders, LAYOUT_ACTIVITYMYORDERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.activity_notifications, LAYOUT_ACTIVITYNOTIFICATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.activity_signup, LAYOUT_ACTIVITYSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.bottom_bar, LAYOUT_BOTTOMBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.cart_fragment, LAYOUT_CARTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.item_addcart, LAYOUT_ITEMADDCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.item_category_row, LAYOUT_ITEMCATEGORYROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.item_change_password, LAYOUT_ITEMCHANGEPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.item_enterforgotpassword, LAYOUT_ITEMENTERFORGOTPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.item_newproduct, LAYOUT_ITEMNEWPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.item_offer, LAYOUT_ITEMOFFER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.item_product, LAYOUT_ITEMPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.list_updates, LAYOUT_LISTUPDATES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.my_orders_fragment, LAYOUT_MYORDERSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.notifications_fragment, LAYOUT_NOTIFICATIONSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.right_top_navigation, LAYOUT_RIGHTTOPNAVIGATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.special_offers_fragment, LAYOUT_SPECIALOFFERSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.view_otp, LAYOUT_VIEWOTP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.view_otp_verification, LAYOUT_VIEWOTPVERIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.view_password, LAYOUT_VIEWPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.view_sidepanel, LAYOUT_VIEWSIDEPANEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.view_slider, LAYOUT_VIEWSLIDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.view_verify_mobileno, LAYOUT_VIEWVERIFYMOBILENO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.classicsmart.myhomegrocers.R.layout.view_verifytestmail, LAYOUT_VIEWVERIFYTESTMAIL);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYADDNEWADDRESS: {
          if ("layout/activity_add_newaddress_0".equals(tag)) {
            return new ActivityAddNewaddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_add_newaddress is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCART: {
          if ("layout/activity_cart_0".equals(tag)) {
            return new ActivityCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCATEGORYWISHLIST2: {
          if ("layout/activity_category_wishlist2_0".equals(tag)) {
            return new ActivityCategoryWishlist2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_category_wishlist2 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDELIVERYADDRESS: {
          if ("layout/activity_delivery_address_0".equals(tag)) {
            return new ActivityDeliveryAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_delivery_address is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYFORGOTPASSWORD: {
          if ("layout/activity_forgotpassword_0".equals(tag)) {
            return new ActivityForgotpasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_forgotpassword is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGINFLOW: {
          if ("layout/activity_login_flow_0".equals(tag)) {
            return new ActivityLoginFlowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login_flow is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGINOTP: {
          if ("layout/activity_loginotp_0".equals(tag)) {
            return new ActivityLoginotpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_loginotp is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGINPASSWORD: {
          if ("layout/activity_loginpassword_0".equals(tag)) {
            return new ActivityLoginpasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_loginpassword is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAINSIGNUP: {
          if ("layout/activity_main_signup_0".equals(tag)) {
            return new ActivityMainSignupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main_signup is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMYORDERS: {
          if ("layout/activity_my_orders_0".equals(tag)) {
            return new ActivityMyOrdersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_my_orders is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYNOTIFICATIONS: {
          if ("layout/activity_notifications_0".equals(tag)) {
            return new ActivityNotificationsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_notifications is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSIGNUP: {
          if ("layout/activity_signup_0".equals(tag)) {
            return new ActivitySignupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_signup is invalid. Received: " + tag);
        }
        case  LAYOUT_BOTTOMBAR: {
          if ("layout/bottom_bar_0".equals(tag)) {
            return new BottomBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for bottom_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_CARTFRAGMENT: {
          if ("layout/cart_fragment_0".equals(tag)) {
            return new CartFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for cart_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMADDCART: {
          if ("layout/item_addcart_0".equals(tag)) {
            return new ItemAddcartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_addcart is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATEGORYROW: {
          if ("layout/item_category_row_0".equals(tag)) {
            return new ItemCategoryRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_category_row is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHANGEPASSWORD: {
          if ("layout/item_change_password_0".equals(tag)) {
            return new ItemChangePasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_change_password is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMENTERFORGOTPASSWORD: {
          if ("layout/item_enterforgotpassword_0".equals(tag)) {
            return new ItemEnterforgotpasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_enterforgotpassword is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNEWPRODUCT: {
          if ("layout/item_newproduct_0".equals(tag)) {
            return new ItemNewproductBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_newproduct is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMOFFER: {
          if ("layout/item_offer_0".equals(tag)) {
            return new ItemOfferBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_offer is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPRODUCT: {
          if ("layout/item_product_0".equals(tag)) {
            return new ItemProductBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_product is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTUPDATES: {
          if ("layout/list_updates_0".equals(tag)) {
            return new ListUpdatesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_updates is invalid. Received: " + tag);
        }
        case  LAYOUT_MYORDERSFRAGMENT: {
          if ("layout/my_orders_fragment_0".equals(tag)) {
            return new MyOrdersFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for my_orders_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_NOTIFICATIONSFRAGMENT: {
          if ("layout/notifications_fragment_0".equals(tag)) {
            return new NotificationsFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for notifications_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_RIGHTTOPNAVIGATION: {
          if ("layout/right_top_navigation_0".equals(tag)) {
            return new RightTopNavigationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for right_top_navigation is invalid. Received: " + tag);
        }
        case  LAYOUT_SPECIALOFFERSFRAGMENT: {
          if ("layout/special_offers_fragment_0".equals(tag)) {
            return new SpecialOffersFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for special_offers_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWOTP: {
          if ("layout/view_otp_0".equals(tag)) {
            return new ViewOtpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_otp is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWOTPVERIFICATION: {
          if ("layout/view_otp_verification_0".equals(tag)) {
            return new ViewOtpVerificationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_otp_verification is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWPASSWORD: {
          if ("layout/view_password_0".equals(tag)) {
            return new ViewPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_password is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWSIDEPANEL: {
          if ("layout/view_sidepanel_0".equals(tag)) {
            return new ViewSidepanelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_sidepanel is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWSLIDER: {
          if ("layout/view_slider_0".equals(tag)) {
            return new ViewSliderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_slider is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWVERIFYMOBILENO: {
          if ("layout/view_verify_mobileno_0".equals(tag)) {
            return new ViewVerifyMobilenoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_verify_mobileno is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWVERIFYTESTMAIL: {
          if ("layout/view_verifytestmail_0".equals(tag)) {
            return new ViewVerifytestmailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_verifytestmail is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(36);

    static {
      sKeys.put("layout/activity_add_newaddress_0", com.classicsmart.myhomegrocers.R.layout.activity_add_newaddress);
      sKeys.put("layout/activity_cart_0", com.classicsmart.myhomegrocers.R.layout.activity_cart);
      sKeys.put("layout/activity_category_wishlist2_0", com.classicsmart.myhomegrocers.R.layout.activity_category_wishlist2);
      sKeys.put("layout/activity_delivery_address_0", com.classicsmart.myhomegrocers.R.layout.activity_delivery_address);
      sKeys.put("layout/activity_forgotpassword_0", com.classicsmart.myhomegrocers.R.layout.activity_forgotpassword);
      sKeys.put("layout/activity_home_0", com.classicsmart.myhomegrocers.R.layout.activity_home);
      sKeys.put("layout/activity_login_0", com.classicsmart.myhomegrocers.R.layout.activity_login);
      sKeys.put("layout/activity_login_flow_0", com.classicsmart.myhomegrocers.R.layout.activity_login_flow);
      sKeys.put("layout/activity_loginotp_0", com.classicsmart.myhomegrocers.R.layout.activity_loginotp);
      sKeys.put("layout/activity_loginpassword_0", com.classicsmart.myhomegrocers.R.layout.activity_loginpassword);
      sKeys.put("layout/activity_main_signup_0", com.classicsmart.myhomegrocers.R.layout.activity_main_signup);
      sKeys.put("layout/activity_my_orders_0", com.classicsmart.myhomegrocers.R.layout.activity_my_orders);
      sKeys.put("layout/activity_notifications_0", com.classicsmart.myhomegrocers.R.layout.activity_notifications);
      sKeys.put("layout/activity_signup_0", com.classicsmart.myhomegrocers.R.layout.activity_signup);
      sKeys.put("layout/bottom_bar_0", com.classicsmart.myhomegrocers.R.layout.bottom_bar);
      sKeys.put("layout/cart_fragment_0", com.classicsmart.myhomegrocers.R.layout.cart_fragment);
      sKeys.put("layout/fragment_home_0", com.classicsmart.myhomegrocers.R.layout.fragment_home);
      sKeys.put("layout/item_addcart_0", com.classicsmart.myhomegrocers.R.layout.item_addcart);
      sKeys.put("layout/item_category_row_0", com.classicsmart.myhomegrocers.R.layout.item_category_row);
      sKeys.put("layout/item_change_password_0", com.classicsmart.myhomegrocers.R.layout.item_change_password);
      sKeys.put("layout/item_enterforgotpassword_0", com.classicsmart.myhomegrocers.R.layout.item_enterforgotpassword);
      sKeys.put("layout/item_newproduct_0", com.classicsmart.myhomegrocers.R.layout.item_newproduct);
      sKeys.put("layout/item_offer_0", com.classicsmart.myhomegrocers.R.layout.item_offer);
      sKeys.put("layout/item_product_0", com.classicsmart.myhomegrocers.R.layout.item_product);
      sKeys.put("layout/list_updates_0", com.classicsmart.myhomegrocers.R.layout.list_updates);
      sKeys.put("layout/my_orders_fragment_0", com.classicsmart.myhomegrocers.R.layout.my_orders_fragment);
      sKeys.put("layout/notifications_fragment_0", com.classicsmart.myhomegrocers.R.layout.notifications_fragment);
      sKeys.put("layout/right_top_navigation_0", com.classicsmart.myhomegrocers.R.layout.right_top_navigation);
      sKeys.put("layout/special_offers_fragment_0", com.classicsmart.myhomegrocers.R.layout.special_offers_fragment);
      sKeys.put("layout/view_otp_0", com.classicsmart.myhomegrocers.R.layout.view_otp);
      sKeys.put("layout/view_otp_verification_0", com.classicsmart.myhomegrocers.R.layout.view_otp_verification);
      sKeys.put("layout/view_password_0", com.classicsmart.myhomegrocers.R.layout.view_password);
      sKeys.put("layout/view_sidepanel_0", com.classicsmart.myhomegrocers.R.layout.view_sidepanel);
      sKeys.put("layout/view_slider_0", com.classicsmart.myhomegrocers.R.layout.view_slider);
      sKeys.put("layout/view_verify_mobileno_0", com.classicsmart.myhomegrocers.R.layout.view_verify_mobileno);
      sKeys.put("layout/view_verifytestmail_0", com.classicsmart.myhomegrocers.R.layout.view_verifytestmail);
    }
  }
}

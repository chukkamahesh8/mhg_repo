package com.classicsmart.myhomegrocers.databinding;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(23);
        sIncludes.setIncludes(1, 
            new String[] {"activity_login_flow"},
            new int[] {7},
            new int[] {com.classicsmart.myhomegrocers.R.layout.activity_login_flow});
        sIncludes.setIncludes(2, 
            new String[] {"view_password"},
            new int[] {8},
            new int[] {com.classicsmart.myhomegrocers.R.layout.view_password});
        sIncludes.setIncludes(3, 
            new String[] {"activity_loginotp"},
            new int[] {9},
            new int[] {com.classicsmart.myhomegrocers.R.layout.activity_loginotp});
        sIncludes.setIncludes(4, 
            new String[] {"activity_loginotp"},
            new int[] {10},
            new int[] {com.classicsmart.myhomegrocers.R.layout.activity_loginotp});
        sIncludes.setIncludes(5, 
            new String[] {"activity_signup"},
            new int[] {11},
            new int[] {com.classicsmart.myhomegrocers.R.layout.activity_signup});
        sIncludes.setIncludes(6, 
            new String[] {"item_change_password"},
            new int[] {12},
            new int[] {com.classicsmart.myhomegrocers.R.layout.item_change_password});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_top, 13);
        sViewsWithIds.put(R.id.tv_Login, 14);
        sViewsWithIds.put(R.id.underlineView, 15);
        sViewsWithIds.put(R.id.txtSignup, 16);
        sViewsWithIds.put(R.id.underlineViewSignup, 17);
        sViewsWithIds.put(R.id.loginscroll, 18);
        sViewsWithIds.put(R.id.ll_title, 19);
        sViewsWithIds.put(R.id.title, 20);
        sViewsWithIds.put(R.id.description, 21);
        sViewsWithIds.put(R.id.ll_card_view, 22);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.TextView) bindings[21]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[5]
            , (androidx.core.widget.NestedScrollView) bindings[18]
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[16]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[17]
            , (com.classicsmart.myhomegrocers.databinding.ItemChangePasswordBinding) bindings[12]
            , (com.classicsmart.myhomegrocers.databinding.ActivityLoginFlowBinding) bindings[7]
            , (com.classicsmart.myhomegrocers.databinding.ActivitySignupBinding) bindings[11]
            , (com.classicsmart.myhomegrocers.databinding.ActivityLoginotpBinding) bindings[10]
            , (com.classicsmart.myhomegrocers.databinding.ActivityLoginotpBinding) bindings[9]
            , (com.classicsmart.myhomegrocers.databinding.ViewPasswordBinding) bindings[8]
            );
        this.llChangePassword.setTag(null);
        this.llViewLogin.setTag(null);
        this.llViewSignupOtp.setTag(null);
        this.llViewloginotp.setTag(null);
        this.llViewpassword.setTag(null);
        this.llViewsignUp.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.viewChangePassword);
        setContainedBinding(this.viewLogin);
        setContainedBinding(this.viewSignup);
        setContainedBinding(this.viewSignupOtp);
        setContainedBinding(this.viewloginotp);
        setContainedBinding(this.viewpassword);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        viewLogin.invalidateAll();
        viewpassword.invalidateAll();
        viewloginotp.invalidateAll();
        viewSignupOtp.invalidateAll();
        viewSignup.invalidateAll();
        viewChangePassword.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (viewLogin.hasPendingBindings()) {
            return true;
        }
        if (viewpassword.hasPendingBindings()) {
            return true;
        }
        if (viewloginotp.hasPendingBindings()) {
            return true;
        }
        if (viewSignupOtp.hasPendingBindings()) {
            return true;
        }
        if (viewSignup.hasPendingBindings()) {
            return true;
        }
        if (viewChangePassword.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        viewLogin.setLifecycleOwner(lifecycleOwner);
        viewpassword.setLifecycleOwner(lifecycleOwner);
        viewloginotp.setLifecycleOwner(lifecycleOwner);
        viewSignupOtp.setLifecycleOwner(lifecycleOwner);
        viewSignup.setLifecycleOwner(lifecycleOwner);
        viewChangePassword.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewSignupOtp((com.classicsmart.myhomegrocers.databinding.ActivityLoginotpBinding) object, fieldId);
            case 1 :
                return onChangeViewLogin((com.classicsmart.myhomegrocers.databinding.ActivityLoginFlowBinding) object, fieldId);
            case 2 :
                return onChangeViewSignup((com.classicsmart.myhomegrocers.databinding.ActivitySignupBinding) object, fieldId);
            case 3 :
                return onChangeViewChangePassword((com.classicsmart.myhomegrocers.databinding.ItemChangePasswordBinding) object, fieldId);
            case 4 :
                return onChangeViewloginotp((com.classicsmart.myhomegrocers.databinding.ActivityLoginotpBinding) object, fieldId);
            case 5 :
                return onChangeViewpassword((com.classicsmart.myhomegrocers.databinding.ViewPasswordBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewSignupOtp(com.classicsmart.myhomegrocers.databinding.ActivityLoginotpBinding ViewSignupOtp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewLogin(com.classicsmart.myhomegrocers.databinding.ActivityLoginFlowBinding ViewLogin, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewSignup(com.classicsmart.myhomegrocers.databinding.ActivitySignupBinding ViewSignup, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewChangePassword(com.classicsmart.myhomegrocers.databinding.ItemChangePasswordBinding ViewChangePassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewloginotp(com.classicsmart.myhomegrocers.databinding.ActivityLoginotpBinding Viewloginotp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewpassword(com.classicsmart.myhomegrocers.databinding.ViewPasswordBinding Viewpassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        executeBindingsOn(viewLogin);
        executeBindingsOn(viewpassword);
        executeBindingsOn(viewloginotp);
        executeBindingsOn(viewSignupOtp);
        executeBindingsOn(viewSignup);
        executeBindingsOn(viewChangePassword);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewSignupOtp
        flag 1 (0x2L): viewLogin
        flag 2 (0x3L): viewSignup
        flag 3 (0x4L): viewChangePassword
        flag 4 (0x5L): viewloginotp
        flag 5 (0x6L): viewpassword
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}
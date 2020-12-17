package com.classicsmart.myhomegrocers.databinding;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainSignupBindingImpl extends ActivityMainSignupBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(20);
        sIncludes.setIncludes(1, 
            new String[] {"view_verify_mobileno"},
            new int[] {2},
            new int[] {com.classicsmart.myhomegrocers.R.layout.view_verify_mobileno});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_top, 3);
        sViewsWithIds.put(R.id.tv_Login, 4);
        sViewsWithIds.put(R.id.underlineView, 5);
        sViewsWithIds.put(R.id.txtSignup, 6);
        sViewsWithIds.put(R.id.underlineViewSignup, 7);
        sViewsWithIds.put(R.id.llSignupp, 8);
        sViewsWithIds.put(R.id.ll_title, 9);
        sViewsWithIds.put(R.id.title, 10);
        sViewsWithIds.put(R.id.view_shade, 11);
        sViewsWithIds.put(R.id.card_view2, 12);
        sViewsWithIds.put(R.id.ed_FirstName, 13);
        sViewsWithIds.put(R.id.ed_LastName, 14);
        sViewsWithIds.put(R.id.ed_MobileNumber, 15);
        sViewsWithIds.put(R.id.ed_EmailId, 16);
        sViewsWithIds.put(R.id.ed_password, 17);
        sViewsWithIds.put(R.id.cb_accept_terms, 18);
        sViewsWithIds.put(R.id.btn_Signup, 19);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainSignupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ActivityMainSignupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[19]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.CheckBox) bindings[18]
            , (android.widget.EditText) bindings[16]
            , (android.widget.EditText) bindings[13]
            , (android.widget.EditText) bindings[14]
            , (android.widget.EditText) bindings[15]
            , (android.widget.EditText) bindings[17]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.RelativeLayout) bindings[3]
            , (com.classicsmart.myhomegrocers.databinding.ViewVerifyMobilenoBinding) bindings[2]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[11]
            );
        this.llViewsignupotpVerfication.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.signupVerifymobileno);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        signupVerifymobileno.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (signupVerifymobileno.hasPendingBindings()) {
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
        signupVerifymobileno.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSignupVerifymobileno((com.classicsmart.myhomegrocers.databinding.ViewVerifyMobilenoBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSignupVerifymobileno(com.classicsmart.myhomegrocers.databinding.ViewVerifyMobilenoBinding SignupVerifymobileno, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        executeBindingsOn(signupVerifymobileno);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): signupVerifymobileno
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
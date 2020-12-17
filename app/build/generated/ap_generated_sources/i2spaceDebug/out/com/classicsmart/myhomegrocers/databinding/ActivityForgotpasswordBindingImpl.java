package com.classicsmart.myhomegrocers.databinding;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityForgotpasswordBindingImpl extends ActivityForgotpasswordBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(16);
        sIncludes.setIncludes(1, 
            new String[] {"view_otp_verification"},
            new int[] {2},
            new int[] {com.classicsmart.myhomegrocers.R.layout.view_otp_verification});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_forgotmobileno, 3);
        sViewsWithIds.put(R.id.rl_top, 4);
        sViewsWithIds.put(R.id.btn_back, 5);
        sViewsWithIds.put(R.id.ll_title, 6);
        sViewsWithIds.put(R.id.tv_forgotYourPassword, 7);
        sViewsWithIds.put(R.id.tv_pleaseupdatetocontinue, 8);
        sViewsWithIds.put(R.id.view_shade, 9);
        sViewsWithIds.put(R.id.card_view2, 10);
        sViewsWithIds.put(R.id.rl_forgotscreen, 11);
        sViewsWithIds.put(R.id.ed_txt_number, 12);
        sViewsWithIds.put(R.id.btn_submit, 13);
        sViewsWithIds.put(R.id.tv_Loginviaotp, 14);
        sViewsWithIds.put(R.id.btn_Login, 15);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityForgotpasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityForgotpasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[15]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.EditText) bindings[12]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[8]
            , (com.classicsmart.myhomegrocers.databinding.ViewOtpVerificationBinding) bindings[2]
            , (android.widget.LinearLayout) bindings[1]
            , (android.view.View) bindings[9]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.viewOtpId);
        this.viewRootOtp.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        viewOtpId.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (viewOtpId.hasPendingBindings()) {
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
        viewOtpId.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewOtpId((com.classicsmart.myhomegrocers.databinding.ViewOtpVerificationBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewOtpId(com.classicsmart.myhomegrocers.databinding.ViewOtpVerificationBinding ViewOtpId, int fieldId) {
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
        executeBindingsOn(viewOtpId);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewOtpId
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
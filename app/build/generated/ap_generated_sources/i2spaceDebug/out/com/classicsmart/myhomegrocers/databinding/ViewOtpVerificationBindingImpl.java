package com.classicsmart.myhomegrocers.databinding;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewOtpVerificationBindingImpl extends ViewOtpVerificationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(16);
        sIncludes.setIncludes(1, 
            new String[] {"view_otp"},
            new int[] {2},
            new int[] {com.classicsmart.myhomegrocers.R.layout.view_otp});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_title, 3);
        sViewsWithIds.put(R.id.tv_forgotYourPassword, 4);
        sViewsWithIds.put(R.id.tv_pleaseupdatetocontinue, 5);
        sViewsWithIds.put(R.id.view_shade, 6);
        sViewsWithIds.put(R.id.card_view2, 7);
        sViewsWithIds.put(R.id.otp_entry, 8);
        sViewsWithIds.put(R.id.rl_top, 9);
        sViewsWithIds.put(R.id.btnChangeNumber, 10);
        sViewsWithIds.put(R.id.txt_show_phone_number, 11);
        sViewsWithIds.put(R.id.viewChangePassword, 12);
        sViewsWithIds.put(R.id.edtxtNewPassword, 13);
        sViewsWithIds.put(R.id.edtxtConfirmPassword, 14);
        sViewsWithIds.put(R.id.btnUpdatePassword, 15);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewOtpVerificationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ViewOtpVerificationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[15]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.EditText) bindings[14]
            , (android.widget.EditText) bindings[13]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.widget.LinearLayout) bindings[12]
            , (com.classicsmart.myhomegrocers.databinding.ViewOtpBinding) bindings[2]
            , (android.view.View) bindings[6]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.viewOtpLayout);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        viewOtpLayout.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (viewOtpLayout.hasPendingBindings()) {
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
        viewOtpLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewOtpLayout((com.classicsmart.myhomegrocers.databinding.ViewOtpBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewOtpLayout(com.classicsmart.myhomegrocers.databinding.ViewOtpBinding ViewOtpLayout, int fieldId) {
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
        executeBindingsOn(viewOtpLayout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewOtpLayout
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
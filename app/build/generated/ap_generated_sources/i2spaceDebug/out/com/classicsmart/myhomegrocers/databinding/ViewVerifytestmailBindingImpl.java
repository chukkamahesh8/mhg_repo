package com.classicsmart.myhomegrocers.databinding;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewVerifytestmailBindingImpl extends ViewVerifytestmailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(17);
        sIncludes.setIncludes(1, 
            new String[] {"view_otp"},
            new int[] {3},
            new int[] {com.classicsmart.myhomegrocers.R.layout.view_otp});
        sIncludes.setIncludes(2, 
            new String[] {"activity_signup"},
            new int[] {4},
            new int[] {com.classicsmart.myhomegrocers.R.layout.activity_signup});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rll_top, 5);
        sViewsWithIds.put(R.id.tv_Login, 6);
        sViewsWithIds.put(R.id.underlineView, 7);
        sViewsWithIds.put(R.id.txtSignup, 8);
        sViewsWithIds.put(R.id.underlineViewSignup, 9);
        sViewsWithIds.put(R.id.ll_title, 10);
        sViewsWithIds.put(R.id.title, 11);
        sViewsWithIds.put(R.id.description, 12);
        sViewsWithIds.put(R.id.view_shade, 13);
        sViewsWithIds.put(R.id.card_view2, 14);
        sViewsWithIds.put(R.id.rl_top, 15);
        sViewsWithIds.put(R.id.btnChangeNumber, 16);
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

    public ViewVerifytestmailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ViewVerifytestmailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[16]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.TextView) bindings[12]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.RelativeLayout) bindings[15]
            , (android.widget.RelativeLayout) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[9]
            , (com.classicsmart.myhomegrocers.databinding.ViewOtpBinding) bindings[3]
            , (android.view.View) bindings[13]
            , (com.classicsmart.myhomegrocers.databinding.ActivitySignupBinding) bindings[4]
            );
        this.llViewsignUp.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.viewOtpLayout);
        setContainedBinding(this.viewSignup);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        viewOtpLayout.invalidateAll();
        viewSignup.invalidateAll();
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
        if (viewSignup.hasPendingBindings()) {
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
        viewSignup.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewOtpLayout((com.classicsmart.myhomegrocers.databinding.ViewOtpBinding) object, fieldId);
            case 1 :
                return onChangeViewSignup((com.classicsmart.myhomegrocers.databinding.ActivitySignupBinding) object, fieldId);
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
    private boolean onChangeViewSignup(com.classicsmart.myhomegrocers.databinding.ActivitySignupBinding ViewSignup, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        executeBindingsOn(viewSignup);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewOtpLayout
        flag 1 (0x2L): viewSignup
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
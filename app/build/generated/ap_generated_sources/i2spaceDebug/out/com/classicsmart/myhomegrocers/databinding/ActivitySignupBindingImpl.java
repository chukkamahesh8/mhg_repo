package com.classicsmart.myhomegrocers.databinding;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySignupBindingImpl extends ActivitySignupBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(15);
        sIncludes.setIncludes(1, 
            new String[] {"view_verify_mobileno"},
            new int[] {2},
            new int[] {com.classicsmart.myhomegrocers.R.layout.view_verify_mobileno});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_title, 3);
        sViewsWithIds.put(R.id.title, 4);
        sViewsWithIds.put(R.id.description, 5);
        sViewsWithIds.put(R.id.view_shade, 6);
        sViewsWithIds.put(R.id.card_view2, 7);
        sViewsWithIds.put(R.id.ed_FirstName, 8);
        sViewsWithIds.put(R.id.ed_LastName, 9);
        sViewsWithIds.put(R.id.ed_MobileNumber, 10);
        sViewsWithIds.put(R.id.ed_EmailId, 11);
        sViewsWithIds.put(R.id.ed_password, 12);
        sViewsWithIds.put(R.id.cb_accept_terms, 13);
        sViewsWithIds.put(R.id.btn_Signup, 14);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySignupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivitySignupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[14]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.CheckBox) bindings[13]
            , (android.widget.TextView) bindings[5]
            , (android.widget.EditText) bindings[11]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[9]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[12]
            , (android.widget.LinearLayout) bindings[3]
            , (com.classicsmart.myhomegrocers.databinding.ViewVerifyMobilenoBinding) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.view.View) bindings[6]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
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
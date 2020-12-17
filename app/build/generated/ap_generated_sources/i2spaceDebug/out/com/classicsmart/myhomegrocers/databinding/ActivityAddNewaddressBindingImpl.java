package com.classicsmart.myhomegrocers.databinding;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddNewaddressBindingImpl extends ActivityAddNewaddressBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ImgAddressBackArrow, 1);
        sViewsWithIds.put(R.id.tv_changepassword, 2);
        sViewsWithIds.put(R.id.btn_location, 3);
        sViewsWithIds.put(R.id.Imglocation, 4);
        sViewsWithIds.put(R.id.edtxtUsemycurrentlocation, 5);
        sViewsWithIds.put(R.id.edtxtaddressline1, 6);
        sViewsWithIds.put(R.id.edtxtApartment, 7);
        sViewsWithIds.put(R.id.ed_city, 8);
        sViewsWithIds.put(R.id.ed_state, 9);
        sViewsWithIds.put(R.id.edtxtZipcode, 10);
        sViewsWithIds.put(R.id.edtxtLandmark, 11);
        sViewsWithIds.put(R.id.edtxtAlternatePhoneNumber, 12);
        sViewsWithIds.put(R.id.btnHome, 13);
        sViewsWithIds.put(R.id.btnOffice, 14);
        sViewsWithIds.put(R.id.btnothers, 15);
        sViewsWithIds.put(R.id.btnSaveAddress, 16);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAddNewaddressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityAddNewaddressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.Button) bindings[13]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.Button) bindings[14]
            , (android.widget.Button) bindings[16]
            , (android.widget.Button) bindings[15]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[9]
            , (android.widget.EditText) bindings[12]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[6]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}
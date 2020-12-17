package com.classicsmart.myhomegrocers.databinding;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomeBindingImpl extends ActivityHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(30);
        sIncludes.setIncludes(0, 
            new String[] {"view_sidepanel"},
            new int[] {21},
            new int[] {com.classicsmart.myhomegrocers.R.layout.view_sidepanel});
        sIncludes.setIncludes(1, 
            new String[] {"view_slider"},
            new int[] {7},
            new int[] {com.classicsmart.myhomegrocers.R.layout.view_slider});
        sIncludes.setIncludes(2, 
            new String[] {"item_category_row", "item_category_row", "item_category_row"},
            new int[] {8, 9, 10},
            new int[] {com.classicsmart.myhomegrocers.R.layout.item_category_row,
                com.classicsmart.myhomegrocers.R.layout.item_category_row,
                com.classicsmart.myhomegrocers.R.layout.item_category_row});
        sIncludes.setIncludes(3, 
            new String[] {"item_category_row", "item_category_row", "item_category_row"},
            new int[] {11, 12, 13},
            new int[] {com.classicsmart.myhomegrocers.R.layout.item_category_row,
                com.classicsmart.myhomegrocers.R.layout.item_category_row,
                com.classicsmart.myhomegrocers.R.layout.item_category_row});
        sIncludes.setIncludes(4, 
            new String[] {"item_category_row", "item_category_row", "item_category_row"},
            new int[] {14, 15, 16},
            new int[] {com.classicsmart.myhomegrocers.R.layout.item_category_row,
                com.classicsmart.myhomegrocers.R.layout.item_category_row,
                com.classicsmart.myhomegrocers.R.layout.item_category_row});
        sIncludes.setIncludes(5, 
            new String[] {"item_product", "item_product"},
            new int[] {17, 18},
            new int[] {com.classicsmart.myhomegrocers.R.layout.item_product,
                com.classicsmart.myhomegrocers.R.layout.item_product});
        sIncludes.setIncludes(6, 
            new String[] {"item_product", "item_product"},
            new int[] {19, 20},
            new int[] {com.classicsmart.myhomegrocers.R.layout.item_product,
                com.classicsmart.myhomegrocers.R.layout.item_product});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 22);
        sViewsWithIds.put(R.id.ll_profile, 23);
        sViewsWithIds.put(R.id.tv_Location, 24);
        sViewsWithIds.put(R.id.menuButton, 25);
        sViewsWithIds.put(R.id.ed_searchpanel, 26);
        sViewsWithIds.put(R.id.image_slider, 27);
        sViewsWithIds.put(R.id.rv_categories, 28);
        sViewsWithIds.put(R.id.rv_products, 29);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final com.classicsmart.myhomegrocers.databinding.ViewSliderBinding mboundView11;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @Nullable
    private final com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding mboundView21;
    @Nullable
    private final com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding mboundView22;
    @Nullable
    private final com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding mboundView23;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    @Nullable
    private final com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding mboundView31;
    @Nullable
    private final com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding mboundView32;
    @Nullable
    private final com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding mboundView33;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @Nullable
    private final com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding mboundView41;
    @Nullable
    private final com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding mboundView42;
    @Nullable
    private final com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding mboundView43;
    @NonNull
    private final android.widget.LinearLayout mboundView5;
    @Nullable
    private final com.classicsmart.myhomegrocers.databinding.ItemProductBinding mboundView51;
    @Nullable
    private final com.classicsmart.myhomegrocers.databinding.ItemProductBinding mboundView52;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @Nullable
    private final com.classicsmart.myhomegrocers.databinding.ItemProductBinding mboundView61;
    @Nullable
    private final com.classicsmart.myhomegrocers.databinding.ItemProductBinding mboundView62;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private ActivityHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[26]
            , (com.denzcoskun.imageslider.ImageSlider) bindings[27]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.Button) bindings[25]
            , (androidx.recyclerview.widget.RecyclerView) bindings[28]
            , (androidx.recyclerview.widget.RecyclerView) bindings[29]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.TextView) bindings[24]
            , (com.classicsmart.myhomegrocers.databinding.ViewSidepanelBinding) bindings[21]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (com.classicsmart.myhomegrocers.databinding.ViewSliderBinding) bindings[7];
        setContainedBinding(this.mboundView11);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView21 = (com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding) bindings[8];
        setContainedBinding(this.mboundView21);
        this.mboundView22 = (com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding) bindings[9];
        setContainedBinding(this.mboundView22);
        this.mboundView23 = (com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding) bindings[10];
        setContainedBinding(this.mboundView23);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView31 = (com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding) bindings[11];
        setContainedBinding(this.mboundView31);
        this.mboundView32 = (com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding) bindings[12];
        setContainedBinding(this.mboundView32);
        this.mboundView33 = (com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding) bindings[13];
        setContainedBinding(this.mboundView33);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView41 = (com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding) bindings[14];
        setContainedBinding(this.mboundView41);
        this.mboundView42 = (com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding) bindings[15];
        setContainedBinding(this.mboundView42);
        this.mboundView43 = (com.classicsmart.myhomegrocers.databinding.ItemCategoryRowBinding) bindings[16];
        setContainedBinding(this.mboundView43);
        this.mboundView5 = (android.widget.LinearLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView51 = (com.classicsmart.myhomegrocers.databinding.ItemProductBinding) bindings[17];
        setContainedBinding(this.mboundView51);
        this.mboundView52 = (com.classicsmart.myhomegrocers.databinding.ItemProductBinding) bindings[18];
        setContainedBinding(this.mboundView52);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView61 = (com.classicsmart.myhomegrocers.databinding.ItemProductBinding) bindings[19];
        setContainedBinding(this.mboundView61);
        this.mboundView62 = (com.classicsmart.myhomegrocers.databinding.ItemProductBinding) bindings[20];
        setContainedBinding(this.mboundView62);
        setContainedBinding(this.viewProfile);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        mboundView11.invalidateAll();
        mboundView21.invalidateAll();
        mboundView22.invalidateAll();
        mboundView23.invalidateAll();
        mboundView31.invalidateAll();
        mboundView32.invalidateAll();
        mboundView33.invalidateAll();
        mboundView41.invalidateAll();
        mboundView42.invalidateAll();
        mboundView43.invalidateAll();
        mboundView51.invalidateAll();
        mboundView52.invalidateAll();
        mboundView61.invalidateAll();
        mboundView62.invalidateAll();
        viewProfile.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        if (mboundView21.hasPendingBindings()) {
            return true;
        }
        if (mboundView22.hasPendingBindings()) {
            return true;
        }
        if (mboundView23.hasPendingBindings()) {
            return true;
        }
        if (mboundView31.hasPendingBindings()) {
            return true;
        }
        if (mboundView32.hasPendingBindings()) {
            return true;
        }
        if (mboundView33.hasPendingBindings()) {
            return true;
        }
        if (mboundView41.hasPendingBindings()) {
            return true;
        }
        if (mboundView42.hasPendingBindings()) {
            return true;
        }
        if (mboundView43.hasPendingBindings()) {
            return true;
        }
        if (mboundView51.hasPendingBindings()) {
            return true;
        }
        if (mboundView52.hasPendingBindings()) {
            return true;
        }
        if (mboundView61.hasPendingBindings()) {
            return true;
        }
        if (mboundView62.hasPendingBindings()) {
            return true;
        }
        if (viewProfile.hasPendingBindings()) {
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
        mboundView11.setLifecycleOwner(lifecycleOwner);
        mboundView21.setLifecycleOwner(lifecycleOwner);
        mboundView22.setLifecycleOwner(lifecycleOwner);
        mboundView23.setLifecycleOwner(lifecycleOwner);
        mboundView31.setLifecycleOwner(lifecycleOwner);
        mboundView32.setLifecycleOwner(lifecycleOwner);
        mboundView33.setLifecycleOwner(lifecycleOwner);
        mboundView41.setLifecycleOwner(lifecycleOwner);
        mboundView42.setLifecycleOwner(lifecycleOwner);
        mboundView43.setLifecycleOwner(lifecycleOwner);
        mboundView51.setLifecycleOwner(lifecycleOwner);
        mboundView52.setLifecycleOwner(lifecycleOwner);
        mboundView61.setLifecycleOwner(lifecycleOwner);
        mboundView62.setLifecycleOwner(lifecycleOwner);
        viewProfile.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewProfile((com.classicsmart.myhomegrocers.databinding.ViewSidepanelBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewProfile(com.classicsmart.myhomegrocers.databinding.ViewSidepanelBinding ViewProfile, int fieldId) {
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
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView21);
        executeBindingsOn(mboundView22);
        executeBindingsOn(mboundView23);
        executeBindingsOn(mboundView31);
        executeBindingsOn(mboundView32);
        executeBindingsOn(mboundView33);
        executeBindingsOn(mboundView41);
        executeBindingsOn(mboundView42);
        executeBindingsOn(mboundView43);
        executeBindingsOn(mboundView51);
        executeBindingsOn(mboundView52);
        executeBindingsOn(mboundView61);
        executeBindingsOn(mboundView62);
        executeBindingsOn(viewProfile);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewProfile
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
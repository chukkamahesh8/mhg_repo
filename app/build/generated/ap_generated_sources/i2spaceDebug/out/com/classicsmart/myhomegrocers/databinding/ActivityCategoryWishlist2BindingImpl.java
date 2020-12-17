package com.classicsmart.myhomegrocers.databinding;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCategoryWishlist2BindingImpl extends ActivityCategoryWishlist2Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(20);
        sIncludes.setIncludes(1, 
            new String[] {"item_newproduct", "item_newproduct"},
            new int[] {5, 6},
            new int[] {com.classicsmart.myhomegrocers.R.layout.item_newproduct,
                com.classicsmart.myhomegrocers.R.layout.item_newproduct});
        sIncludes.setIncludes(2, 
            new String[] {"item_newproduct", "item_newproduct"},
            new int[] {7, 8},
            new int[] {com.classicsmart.myhomegrocers.R.layout.item_newproduct,
                com.classicsmart.myhomegrocers.R.layout.item_newproduct});
        sIncludes.setIncludes(3, 
            new String[] {"item_addcart", "item_addcart"},
            new int[] {9, 10},
            new int[] {com.classicsmart.myhomegrocers.R.layout.item_addcart,
                com.classicsmart.myhomegrocers.R.layout.item_addcart});
        sIncludes.setIncludes(4, 
            new String[] {"item_addcart", "item_addcart"},
            new int[] {11, 12},
            new int[] {com.classicsmart.myhomegrocers.R.layout.item_addcart,
                com.classicsmart.myhomegrocers.R.layout.item_addcart});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_profile, 13);
        sViewsWithIds.put(R.id.backImgview, 14);
        sViewsWithIds.put(R.id.Imgsearch, 15);
        sViewsWithIds.put(R.id.rv_addCart, 16);
        sViewsWithIds.put(R.id.view_newproduct, 17);
        sViewsWithIds.put(R.id.rv_Count, 18);
        sViewsWithIds.put(R.id.view_count, 19);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCategoryWishlist2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ActivityCategoryWishlist2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[14]
            , (com.classicsmart.myhomegrocers.databinding.ItemAddcartBinding) bindings[9]
            , (com.classicsmart.myhomegrocers.databinding.ItemAddcartBinding) bindings[10]
            , (com.classicsmart.myhomegrocers.databinding.ItemAddcartBinding) bindings[11]
            , (com.classicsmart.myhomegrocers.databinding.ItemAddcartBinding) bindings[12]
            , (com.classicsmart.myhomegrocers.databinding.ItemNewproductBinding) bindings[6]
            , (com.classicsmart.myhomegrocers.databinding.ItemNewproductBinding) bindings[5]
            , (com.classicsmart.myhomegrocers.databinding.ItemNewproductBinding) bindings[7]
            , (com.classicsmart.myhomegrocers.databinding.ItemNewproductBinding) bindings[8]
            , (android.widget.RelativeLayout) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[17]
            );
        setContainedBinding(this.itemAddCart);
        setContainedBinding(this.itemAddCart1);
        setContainedBinding(this.itemAddCart2);
        setContainedBinding(this.itemAddCart3);
        setContainedBinding(this.itemNewproduct);
        setContainedBinding(this.itemNewproduct1);
        setContainedBinding(this.itemNewproduct2);
        setContainedBinding(this.itemNewproduct3);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        itemNewproduct1.invalidateAll();
        itemNewproduct.invalidateAll();
        itemNewproduct2.invalidateAll();
        itemNewproduct3.invalidateAll();
        itemAddCart.invalidateAll();
        itemAddCart1.invalidateAll();
        itemAddCart2.invalidateAll();
        itemAddCart3.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (itemNewproduct1.hasPendingBindings()) {
            return true;
        }
        if (itemNewproduct.hasPendingBindings()) {
            return true;
        }
        if (itemNewproduct2.hasPendingBindings()) {
            return true;
        }
        if (itemNewproduct3.hasPendingBindings()) {
            return true;
        }
        if (itemAddCart.hasPendingBindings()) {
            return true;
        }
        if (itemAddCart1.hasPendingBindings()) {
            return true;
        }
        if (itemAddCart2.hasPendingBindings()) {
            return true;
        }
        if (itemAddCart3.hasPendingBindings()) {
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
        itemNewproduct1.setLifecycleOwner(lifecycleOwner);
        itemNewproduct.setLifecycleOwner(lifecycleOwner);
        itemNewproduct2.setLifecycleOwner(lifecycleOwner);
        itemNewproduct3.setLifecycleOwner(lifecycleOwner);
        itemAddCart.setLifecycleOwner(lifecycleOwner);
        itemAddCart1.setLifecycleOwner(lifecycleOwner);
        itemAddCart2.setLifecycleOwner(lifecycleOwner);
        itemAddCart3.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemAddCart3((com.classicsmart.myhomegrocers.databinding.ItemAddcartBinding) object, fieldId);
            case 1 :
                return onChangeItemAddCart2((com.classicsmart.myhomegrocers.databinding.ItemAddcartBinding) object, fieldId);
            case 2 :
                return onChangeItemNewproduct((com.classicsmart.myhomegrocers.databinding.ItemNewproductBinding) object, fieldId);
            case 3 :
                return onChangeItemAddCart((com.classicsmart.myhomegrocers.databinding.ItemAddcartBinding) object, fieldId);
            case 4 :
                return onChangeItemAddCart1((com.classicsmart.myhomegrocers.databinding.ItemAddcartBinding) object, fieldId);
            case 5 :
                return onChangeItemNewproduct1((com.classicsmart.myhomegrocers.databinding.ItemNewproductBinding) object, fieldId);
            case 6 :
                return onChangeItemNewproduct3((com.classicsmart.myhomegrocers.databinding.ItemNewproductBinding) object, fieldId);
            case 7 :
                return onChangeItemNewproduct2((com.classicsmart.myhomegrocers.databinding.ItemNewproductBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemAddCart3(com.classicsmart.myhomegrocers.databinding.ItemAddcartBinding ItemAddCart3, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemAddCart2(com.classicsmart.myhomegrocers.databinding.ItemAddcartBinding ItemAddCart2, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemNewproduct(com.classicsmart.myhomegrocers.databinding.ItemNewproductBinding ItemNewproduct, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemAddCart(com.classicsmart.myhomegrocers.databinding.ItemAddcartBinding ItemAddCart, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemAddCart1(com.classicsmart.myhomegrocers.databinding.ItemAddcartBinding ItemAddCart1, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemNewproduct1(com.classicsmart.myhomegrocers.databinding.ItemNewproductBinding ItemNewproduct1, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemNewproduct3(com.classicsmart.myhomegrocers.databinding.ItemNewproductBinding ItemNewproduct3, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemNewproduct2(com.classicsmart.myhomegrocers.databinding.ItemNewproductBinding ItemNewproduct2, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        executeBindingsOn(itemNewproduct1);
        executeBindingsOn(itemNewproduct);
        executeBindingsOn(itemNewproduct2);
        executeBindingsOn(itemNewproduct3);
        executeBindingsOn(itemAddCart);
        executeBindingsOn(itemAddCart1);
        executeBindingsOn(itemAddCart2);
        executeBindingsOn(itemAddCart3);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemAddCart3
        flag 1 (0x2L): itemAddCart2
        flag 2 (0x3L): itemNewproduct
        flag 3 (0x4L): itemAddCart
        flag 4 (0x5L): itemAddCart1
        flag 5 (0x6L): itemNewproduct1
        flag 6 (0x7L): itemNewproduct3
        flag 7 (0x8L): itemNewproduct2
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}
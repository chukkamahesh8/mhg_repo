package com.classicsmart.myhomegrocers.databinding;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(12);
        sIncludes.setIncludes(0, 
            new String[] {"view_sidepanel"},
            new int[] {1},
            new int[] {com.classicsmart.myhomegrocers.R.layout.view_sidepanel});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.ll_profile, 3);
        sViewsWithIds.put(R.id.tv_Location, 4);
        sViewsWithIds.put(R.id.menuButton, 5);
        sViewsWithIds.put(R.id.ed_searchpanel, 6);
        sViewsWithIds.put(R.id.view_pager, 7);
        sViewsWithIds.put(R.id.tabDots, 8);
        sViewsWithIds.put(R.id.rv_categories, 9);
        sViewsWithIds.put(R.id.ll_previously_orderd, 10);
        sViewsWithIds.put(R.id.rv_products, 11);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[6]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (com.google.android.material.tabs.TabLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (com.classicsmart.myhomegrocers.databinding.ViewSidepanelBinding) bindings[1]
            , (androidx.viewpager.widget.ViewPager) bindings[7]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.viewMore);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        viewMore.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (viewMore.hasPendingBindings()) {
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
        viewMore.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewMore((com.classicsmart.myhomegrocers.databinding.ViewSidepanelBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewMore(com.classicsmart.myhomegrocers.databinding.ViewSidepanelBinding ViewMore, int fieldId) {
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
        executeBindingsOn(viewMore);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewMore
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
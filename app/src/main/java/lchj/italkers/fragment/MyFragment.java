package lchj.italkers.fragment;


import butterknife.BindView;
import lchj.common.BaseFragment;
import lchj.common.gallrey.GalleryView;
import lchj.italkers.R;

/**
 *我的
 */
public class MyFragment extends BaseFragment {
    @BindView(R.id.mGalleryView)
    GalleryView mGalleryView;

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initData() {
        super.initData();
        mGalleryView.setup(getLoaderManager(), new GalleryView.SelectedChangeListener() {
            @Override
            public void onSelectedCountChanged(int count) {


            }
        });
    }
}

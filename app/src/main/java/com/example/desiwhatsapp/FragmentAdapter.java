package com.example.desiwhatsapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public FragmentAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new statusfrag();
            case 2:
                return new callfrag();
            case 0:
            default:
                return new chatfrag();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }



//    public CharSequence getPageTitle(int position){
//        String title = null;
//        if (position==0){
//            title = "chat";
//        }
//        if (position==1){
//            title = "status";
//        }
//        if (position==2){
//            title = "call";
//        }
//        return title;
//    }




    //    public FragmentAdapter(@NonNull FragmentManager fm) {
//        super(fm);
//    }
//
//    public FragmentAdapter(@NonNull FragmentManager fm, int behavior) {
//        super(fm, behavior);
//    }
//
//    @NonNull
//    @Override
//    public Fragment getItem(int position) {
//        switch (position) {
//            case 1:
//                return new statusfrag();
//            case 2:
//                return new callfrag();
//            case 0:
//            default:
//                return new chatfrag();
//        }
//    }
//
//    @Override
//    public int getCount() {
//        return 3;
//    }
//
//
//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        String title = null;
//        if (position==0){
//            title = "chat";
//        }
//        if (position==0){
//            title = "status";
//        }
//        if (position==0){
//            title = "call";
//        }
//        return title;
//    }
}

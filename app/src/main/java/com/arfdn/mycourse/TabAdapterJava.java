package com.arfdn.mycourse;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAdapterJava extends FragmentPagerAdapter {

    public TabAdapterJava(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragmentJava();
            case 1:
                return new MateriFragmentJava();
            case 2:
                return new QuizFragmentJava();
            default:
                throw new IllegalArgumentException("Invalid tab position");
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Home";
            case 1:
                return "Materi";
            case 2:
                return "Quiz";
            default:
                return null;
        }
    }
}
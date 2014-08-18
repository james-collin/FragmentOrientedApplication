package com.example.singleactivityapp.base;

public interface BaseActivityInterface {
	public void setSelectedFragment(BaseFragment fragment);
	public void popBackStack();
	public void popBackStackTillTag(String tag);
	public void addFragment(BaseFragment fragment, boolean withAnimation);
	public void addMultipleFragments(BaseFragment fragments[]);
	public void onClickLogin();
}
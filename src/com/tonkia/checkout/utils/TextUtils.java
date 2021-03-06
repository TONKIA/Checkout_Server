package com.tonkia.checkout.utils;

public class TextUtils {
	public static boolean isMobileNum(String mobileNums) {
		String telRegex = "^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))\\d{8}$";// "[1]"代表下一位为数字可以是几，"[0-9]"代表可以为0-9中的一个，"[5,7,9]"表示可以是5,7,9中的任意一位,[^4]表示除4以外的任何一个,\\d{9}"代表后面是可以是0～9的数字，有9位。
		if (mobileNums == null || mobileNums.length() != 11)
			return false;
		else
			return mobileNums.matches(telRegex);
	}
}

package com.andresrubianoch.androidcore.sdkVersion

import android.os.Build

class SdkVersionStrategyImpl : SdkVersionStrategy {

    override fun isAtLeastKitkat() = Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT

    override fun isAtLeastLollipop() = Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP

    override fun isAtLeastMashmallow() = Build.VERSION.SDK_INT > Build.VERSION_CODES.M

    override fun isAtLeastNougat() = Build.VERSION.SDK_INT > Build.VERSION_CODES.N

    override fun isAtLeastOreo() = Build.VERSION.SDK_INT > Build.VERSION_CODES.O

    override fun isAtLeastPie() = Build.VERSION.SDK_INT > Build.VERSION_CODES.P

    override fun isAtLeastAndroid10() = Build.VERSION.SDK_INT > Build.VERSION_CODES.Q

    override fun isAtLeastAndroid11() = Build.VERSION.SDK_INT > Build.VERSION_CODES.R

    override fun isAtLeastSnowCone() = Build.VERSION.SDK_INT > Build.VERSION_CODES.S

    override fun isAtLeastTiramisu() = Build.VERSION.SDK_INT > Build.VERSION_CODES.TIRAMISU
}
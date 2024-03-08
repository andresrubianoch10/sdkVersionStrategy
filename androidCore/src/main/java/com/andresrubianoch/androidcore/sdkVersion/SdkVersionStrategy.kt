package com.andresrubianoch.androidcore.sdkVersion

interface SdkVersionStrategy {
    fun isAtLeastKitkat(): Boolean
    fun isAtLeastLollipop(): Boolean
    fun isAtLeastMashmallow(): Boolean
    fun isAtLeastNougat(): Boolean
    fun isAtLeastOreo(): Boolean
    fun isAtLeastPie(): Boolean
    fun isAtLeastAndroid10(): Boolean
    fun isAtLeastAndroid11(): Boolean
    fun isAtLeastSnowCone(): Boolean
    fun isAtLeastTiramisu(): Boolean
}
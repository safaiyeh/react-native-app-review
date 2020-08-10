package com.reactnativeappreview

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.google.android.play.core.review.ReviewManagerFactory

class AppReviewModule(private val reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {


  override fun getName(): String {
        return "AppReview"
    }

    // Example method
    // See https://facebook.github.io/react-native/docs/native-modules-android
    @ReactMethod
    fun launch(promise: Promise) {
      val manager = ReviewManagerFactory.create(reactContext);
      val request = manager.requestReviewFlow();
      request.addOnCompleteListener { requestStatus ->
        if (requestStatus.isSuccessful) {
          val reviewInfo = requestStatus.result
          currentActivity?.let { manager.launchReviewFlow(it, reviewInfo) }
        }
      }
    }
}

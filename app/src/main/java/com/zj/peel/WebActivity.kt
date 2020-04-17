package com.zj.peel

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature
import kotlinx.android.synthetic.main.activity_web.*


class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        initView()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initView() {
        val webSettings = webView.settings
        if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
            WebSettingsCompat.setForceDark(
                webSettings,
                WebSettingsCompat.FORCE_DARK_ON
            );
        }
            //WebSettingsCompat.setForceDark(webSettings,WebSettingsCompat.FORCE_DARK_ON)
        webSettings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        webView.loadUrl("http://www.baidu.com")
    }
}

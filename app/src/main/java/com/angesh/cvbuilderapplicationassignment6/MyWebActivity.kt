package com.angesh.cvbuilderapplicationassignment6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.angesh.cvbuilderapplicationassignment6.R

class MyWebActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_web)

        val urlToBeLoaded = intent.getStringExtra("url")

        webView = findViewById(R.id.web_view)

        webView.webViewClient = WebViewClient()

        // this will load the url of the website
        webView.loadUrl(urlToBeLoaded!!)

        // this will enable the javascript settings, it can also allow xss vulnerabilities
        webView.settings.javaScriptEnabled = true

        // enable zoom feature
        webView.settings.setSupportZoom(true)
    }

    override fun onBackPressed() {
        // if your webview can go back it will go back
        if (webView.canGoBack())
            webView.goBack()
        // if your webview cannot go back
        // it will exit the application
        else
            super.onBackPressed()
    }
}
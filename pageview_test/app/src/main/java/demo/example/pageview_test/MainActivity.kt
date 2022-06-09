// Copyright 2020 The Flutter team. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package demo.example.pageview_test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import demo.example.pageview_test.R
import io.flutter.embedding.android.FlutterFragment
import io.flutter.embedding.android.RenderMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment =
            FlutterFragment.withCachedEngine(MyApplication.ENGINE_ID).renderMode(RenderMode.texture)
                .build<FlutterFragment>()
        supportFragmentManager.beginTransaction().add(R.id.frame, fragment).commit()

    }
}

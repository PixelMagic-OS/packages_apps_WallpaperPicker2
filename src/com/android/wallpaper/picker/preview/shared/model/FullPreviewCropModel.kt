/*
 * Copyright (C) 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.wallpaper.picker.preview.shared.model

import android.graphics.Point
import android.graphics.Rect

/** Data class for cropHints related info. */
data class FullPreviewCropModel(
    /** The user's crop of wallpaper on FullPreviewFragment wrt the full wallpaper size. */
    val cropHint: Rect = Rect(0, 0, 0, 0),
    /** The zoom of the wallpaper on its hosting view when user selects the cropHint. */
    val wallpaperZoom: Float = 0f,
    /** The size of the view hosting the wallpaper, e.g. SurfaceView. */
    val hostViewSize: Point = Point(0, 0),
    /** A larger version of hostViewSize that can safely contain parallax. */
    val cropSurfaceSize: Point = Point(0, 0),
)

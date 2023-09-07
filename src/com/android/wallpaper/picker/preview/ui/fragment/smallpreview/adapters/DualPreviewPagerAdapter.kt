/*
 * Copyright (C) 2023 The Android Open Source Project
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
package com.android.wallpaper.picker.preview.ui.fragment.smallpreview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.wallpaper.R
import com.android.wallpaper.picker.preview.ui.viewmodel.WallpaperPreviewViewModel
import com.android.wallpaper.util.PreviewUtils

/** This class provides the dual preview views for the small preview screen on foldable devices */
class DualPreviewPagerAdapter(
    val onBindViewHolder: (ViewHolder, Int) -> Unit,
) : RecyclerView.Adapter<DualPreviewPagerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.preview_foldable_card_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        onBindViewHolder.invoke(holder, position)
    }

    override fun getItemCount(): Int = DUAL_PREVIEW_PAGER_ITEM_COUNT

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    data class DualPreviewPagerViewModel(
        val viewModel: WallpaperPreviewViewModel,
        val previewUtils: PreviewUtils,
        val navigate: (() -> Unit)? = null
    )

    companion object {
        const val DUAL_PREVIEW_PAGER_ITEM_COUNT = 2
    }
}

/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.data.DataSource
import com.example.dogglers.model.Dog

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    // TODO: Initialize the data using the List found in data/DataSource
    val dataset = DataSource.dogs

    /**
     * Initialize view elements
     */
    class DogCardViewHolder(view: View, private val layout: Int): RecyclerView.ViewHolder(view) {

        var ivDog: ImageView? = null
        var tvDog: TextView? = null
        var tvAge: TextView? = null
        var tvHobby: TextView?= null

        init {
            when(layout){
                R.layout.grid_list_item ->{
                    ivDog = view.findViewById(R.id.iv_dog_g)
                    tvDog = view.findViewById(R.id.tv_dog_g)
                    tvAge = view.findViewById(R.id.tv_age_g)
                    tvHobby = view.findViewById(R.id.tv_hobby_g)
                }
                else->{
                    ivDog = view.findViewById(R.id.iv_dog)
                    tvDog = view.findViewById(R.id.tv_name)
                    tvAge = view.findViewById(R.id.tv_age)
                    tvHobby = view.findViewById(R.id.tv_hobby)
                }
            }
        }




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(layout,parent,false)
        return DogCardViewHolder(adapterLayout, layout)
    }

    override fun getItemCount(): Int = dataset.size  // TODO: return the size of the data set instead of 0

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val item = dataset[position]
        val resources = context?.resources
        holder.ivDog?.setImageResource(item.imageResourceId)
        holder.tvDog?.text = item.name
        holder.tvAge?.text = resources?.getString(R.string.dog_age, item.age)
        holder.tvHobby?.text = resources?.getString(R.string.dog_hobbies, item.hobbies)
    }
}

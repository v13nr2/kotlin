package com.tenclouds.nanang

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.tenclouds.fluidbottomnavigation.FluidBottomNavigationItem
import com.tenclouds.fluidbottomnavigationexample.R
import kotlinx.android.synthetic.main.activity_main.*





class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageSlider = findViewById<ImageSlider>(R.id.image_slider) // init imageSlider

        val imageList = ArrayList<SlideModel>() // Create image list
        //imageList.add(SlideModel("http://koperasi.doktorsiaga.co.id/images/index.jpg", "Foxes live wild in the city.", true))
        imageList.add(SlideModel("http://koperasi.doktorsiaga.co.id/images/index.jpg", true))
        imageList.add(SlideModel("http://koperasi.doktorsiaga.co.id/images/indexx.jpg",true))
        imageList.add(SlideModel("http://koperasi.doktorsiaga.co.id/images/index.png", true))

        imageSlider.setImageList(imageList)

        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun onItemSelected(position: Int) {
                // You can listen here.
            }
        })



        fluidBottomNavigation.accentColor = ContextCompat.getColor(this, R.color.colorPrimaryDark)
        fluidBottomNavigation.backColor = ContextCompat.getColor(this, R.color.colorPrimaryDark)
        fluidBottomNavigation.textColor = ContextCompat.getColor(this, R.color.colorPrimaryDark)
        fluidBottomNavigation.iconColor = ContextCompat.getColor(this, R.color.colorPrimary)
        fluidBottomNavigation.iconSelectedColor = ContextCompat.getColor(this, R.color.iconSelectedColor)

        fluidBottomNavigation.items =
                listOf(
                        FluidBottomNavigationItem(
                                getString(R.string.news),
                                ContextCompat.getDrawable(this, R.drawable.ic_news)),
                        FluidBottomNavigationItem(
                                getString(R.string.inbox),
                                ContextCompat.getDrawable(this, R.drawable.ic_inbox)),
                        FluidBottomNavigationItem(
                                getString(R.string.calendar),
                                ContextCompat.getDrawable(this, R.drawable.ic_calendar)),
                        FluidBottomNavigationItem(
                                getString(R.string.chat),
                                ContextCompat.getDrawable(this, R.drawable.ic_chat)),
                        FluidBottomNavigationItem(
                                getString(R.string.profile),
                                ContextCompat.getDrawable(this, R.drawable.ic_profile)))
    }
}
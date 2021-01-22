package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        val proList = ArrayList<product>()
        proList.add(product(1, "https://bostonglobe-prod.cdn.arcpublishing.com/resizer/g26HIT0NQ4PertGXDnZONhpWPo4=/1440x0/arc-anglerfish-arc2-prod-bostonglobe.s3.amazonaws.com/public/R45YIHQPWUI6VMYUQQ3I27GCRM.jpg"))
        proList.add(product(2, "https://cdn.vox-cdn.com/thumbor/68IJrrZ3gBV_NcLotCpBly_3Grw=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/19765330/1197871090.jpg.jpg"))
        proList.add(product(3, "https://bostonglobe-prod.cdn.arcpublishing.com/resizer/x4xx7u2KdE4wooaMATxeQZPs4MM=/1440x0/arc-anglerfish-arc2-prod-bostonglobe.s3.amazonaws.com/public/FUQ3YASUIQI6VL6VZU3UOU6U5E.jpg"))
        proList.add(product(4, "https://netswire.usatoday.com/wp-content/uploads/sites/9/2020/01/gettyimages-1196278249.jpg"))
        proList.add(product(5, "https://thumbor.forbes.com/thumbor/fit-in/1200x0/filters%3Aformat%28jpg%29/https%3A%2F%2Fspecials-images.forbesimg.com%2Fimageserve%2F5e4f116c7a0098000733dc19%2F0x0.jpg"))
        proList.add(product(6, "https://images2.minutemediacdn.com/image/fetch/w_2000,h_2000,c_fit/https%3A%2F%2Fsircharlesincharge.com%2Fwp-content%2Fuploads%2Fgetty-images%2F2019%2F12%2F1183010308.jpeg"))
        proList.add(product(7, "https://cavaliersnation.com/wp-content/uploads/2019/11/USATSI_13666692-scaled.jpg"))
        proList.add(product(8, "https://www.thenation.com/wp-content/uploads/2021/01/irving-img.jpg"))
        proList.add(product(9, "https://i.pinimg.com/474x/e3/ed/65/e3ed653975d61a54fc4705bca1e770e2.jpg"))
        proList.add(product(10, "https://image-cdn.essentiallysports.com/wp-content/uploads/20200627194247/nets-kyrie.jpg"))

        val productAdapter = productAdapter(proList)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = productAdapter
    }
}
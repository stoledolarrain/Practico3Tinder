package com.example.practico3tinder
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class MainActivity : AppCompatActivity() {

    private val cafeterias = listOf(
        mutableListOf<CarouselItem>(
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/448238662_18025629860146620_2932699843989707055_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xNDQweDE4MDAuc2RyLmYzMDgwOC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=100&_nc_ohc=27mmJIa-eMQQ7kNvgECMHzQ&_nc_gid=9b04892918004173be3e190b8dccc29b&edm=APoiHPcAAAAA&ccb=7-5&ig_cache_key=MzM4ODEyNjc0NzEzOTk0NjM3Mw%3D%3D.3-ccb7-5&oh=00_AYDr3O5hkO3qC55SMrQuTXFeUyf4_xGn8nzCnwg-y0-cog&oe=67120B1B&_nc_sid=22de04", "Cafetería Doble Chocolate"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/462448892_18328559467144392_1293155767057058347_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xNDQweDk2MC5zZHIuZjMwODA4LmRlZmF1bHRfaW1hZ2UifQ&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=100&_nc_ohc=w3rI9SFUULsQ7kNvgEMWzsC&_nc_gid=1865c04de2fe4c4f97dc8ae676b19666&edm=AP4sbd4AAAAA&ccb=7-5&ig_cache_key=MzQ3NDM2NzY2NjY4OTc4NDY5Nw%3D%3D.3-ccb7-5&oh=00_AYAxHGOgDZu19uacNdmZEafJokGu_SrddZ1VxXZE7bhR2Q&oe=671239FA&_nc_sid=7a9f4b", "Cafetería Doble Chocolate"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t51.29350-15/441500086_463570676200668_4596501605874796290_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xNDQweDk2MC5zZHIuZjI5MzUwLmRlZmF1bHRfaW1hZ2UifQ&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=100&_nc_ohc=yycAJ_y7RWoQ7kNvgG37G9k&_nc_gid=4ebc6f17b14d47f5bf4bf6c2b99eb7d9&edm=APoiHPcBAAAA&ccb=7-5&ig_cache_key=MzM2MDgyOTQ4NjM2MTY3MjE0NQ%3D%3D.3-ccb7-5&oh=00_AYDmwaKZLsRIuN5phnaFN7afj_t3jCRbZIQXYLRP6wcgyw&oe=67121F76&_nc_sid=22de04", "Cafetería Doble Chocolate"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/460715907_18035900189146620_6199569940703492345_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xNDQweDE4MDAuc2RyLmYzMDgwOC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=100&_nc_ohc=Mjhj0wmKN6YQ7kNvgH3AD4k&_nc_gid=8213783e982c4edebc83f1b867e81d86&edm=APoiHPcAAAAA&ccb=7-5&ig_cache_key=MzQ2MTU5MDk3ODA2NDU3Njk5NQ%3D%3D.3-ccb7-5&oh=00_AYCrZidUEmTjUv-mPfxbU-HCrR6PQIexc_eo3oZyeKPTPA&oe=67123F0B&_nc_sid=22de04", "Cafetería Doble Chocolate"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/418490975_18011009273146620_7750246769448959101_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xNDQweDE4MDAuc2RyLmYzMDgwOC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=100&_nc_ohc=vaw3oR0ti3gQ7kNvgGNxE9X&_nc_gid=f6bfc2fae9a945a5b74b16297babb8a5&edm=APoiHPcAAAAA&ccb=7-5&ig_cache_key=MzI4MDA2OTM3OTI1NjY0NzIwNA%3D%3D.3-ccb7-5&oh=00_AYBKjlgUuAUt8UG1e9dBQevHGfOHs77_1EUGXAiljYQFAw&oe=67125216&_nc_sid=22de04", "Cafetería Doble Chocolate")
        ),
        mutableListOf<CarouselItem>(
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t51.29350-15/457371579_1035906384320437_8481734861308803581_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xNDQweDE4MDAuc2RyLmYyOTM1MC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=101&_nc_ohc=_4tBkIwk0UEQ7kNvgHWa-5G&_nc_gid=c44a5a20a7eb4be596876af9852801a6&edm=APoiHPcBAAAA&ccb=7-5&ig_cache_key=MzQ0NDYyOTAyNzExNDM1MzYzNw%3D%3D.3-ccb7-5&oh=00_AYA1tbBXaMroC0DRl4ZjB1cC5dvlBo_u3r9pkDWf_YCaDg&oe=67125089&_nc_sid=22de04","Caffé Del Barrio"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t51.29350-15/432594476_294613243444335_8452971890442542842_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4yNjQ1eDI2NDUuc2RyLmYyOTM1MC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=103&_nc_ohc=PuoUESnnOUcQ7kNvgF5Qgzh&_nc_gid=aa6199a08ea84d4488d4f8e0d2e43b60&edm=APoiHPcBAAAA&ccb=7-5&ig_cache_key=MzMyMTcwMTgzOTAyMjk5OTkyMQ%3D%3D.3-ccb7-5&oh=00_AYAqEuSg7KKIy5JnYTAPQjsCOhhEVdvroaq4_801TzQNEg&oe=67125D1B&_nc_sid=22de04","Caffé Del Barrio"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t51.29350-15/446131699_827720742606421_8109995025371483095_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xNDQweDE0Mzkuc2RyLmYyOTM1MC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=101&_nc_ohc=liafZAqYJKEQ7kNvgHCisCS&_nc_gid=931ae4231a074d83a28bf49077173b33&edm=APoiHPcBAAAA&ccb=7-5&ig_cache_key=MzM3NzMyNzE3NzM4NDU2ODY0Ng%3D%3D.3-ccb7-5&oh=00_AYCWukbJmw2LrbCNIgDDKvM5_6tXMYZo2Zz9N91JeZV49g&oe=67124F58&_nc_sid=22de04","Caffé Del Barrio"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/461204174_17875273386167473_1539684852398821762_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xNDQweDE0NDAuc2RyLmYzMDgwOC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=101&_nc_ohc=Xi-CQdm29bwQ7kNvgGnExof&_nc_gid=e7521666239b45498574056b72703c7e&edm=AP4sbd4AAAAA&ccb=7-5&ig_cache_key=MzQ2MzQ1OTQzODc5MTUxMTExOA%3D%3D.3-ccb7-5&oh=00_AYCKa6cx4-_DgXUQQ8SyEVyhciei4toupnkh9Gl75bBSrA&oe=671264FA&_nc_sid=7a9f4b","Caffé Del Barrio"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t51.29350-15/462136600_1115431446681496_1655762286210620495_n.heic?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xNDQweDE1MzIuc2RyLmYyOTM1MC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=104&_nc_ohc=30VHRxNsM8MQ7kNvgH3ixym&_nc_gid=e7521666239b45498574056b72703c7e&edm=AP4sbd4BAAAA&ccb=7-5&ig_cache_key=MzQ3NTA3MjUxOTQ2ODQ4NjM0Mg%3D%3D.3-ccb7-5&oh=00_AYC5MtlcfZ5TTsaYlUZV94J7cCwOvpCKmrAbDLC7sJKMCw&oe=67126799&_nc_sid=7a9f4b","Caffé Del Barrio")
        ),
        mutableListOf <CarouselItem>(
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/459305282_18460872592034783_8752687300296766772_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xNDQweDE4MDAuc2RyLmYzMDgwOC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=111&_nc_ohc=STwpIpFwGYYQ7kNvgGVcFh0&_nc_gid=5295e02750d14fe4890822da8a02f47a&edm=AP4sbd4AAAAA&ccb=7-5&ig_cache_key=MzQ1NTg2MjcxMjg5NTE0MDY0NQ%3D%3D.3-ccb7-5&oh=00_AYDXhVT2dX6h8xn3jokKM-vv38JeAC6x-SuQ2e0TJO5rYw&oe=67125811&_nc_sid=7a9f4b","Cafetería Typica"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/431923214_799961648826173_6221008083929949309_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xMDgweDEwODAuc2RyLmYzMDgwOC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=105&_nc_ohc=oE9fXRKeuY8Q7kNvgFT-_sw&_nc_gid=125a4ac37234424c967815264f378162&edm=APoiHPcAAAAA&ccb=7-5&ig_cache_key=MzMyMjkzNjk0Mjc3NjM1Njg0MA%3D%3D.3-ccb7-5&oh=00_AYBtTDT4mdOIggpbLzO3QCr2JhvSf_Dmg5ctCtI-83kZjQ&oe=67125341&_nc_sid=22de04","Cafetería Typica"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/430824040_795877402567931_7677997944146976590_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xMDgweDEwODAuc2RyLmYzMDgwOC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=111&_nc_ohc=59k47xMseYMQ7kNvgG4PxR9&_nc_gid=9891fe04c98a4257b4c52d9b03d0f582&edm=APoiHPcAAAAA&ccb=7-5&ig_cache_key=MzMxNzg1MzQwNjEzMDI2MTU1OQ%3D%3D.3-ccb7-5&oh=00_AYDfJyDNbccgyb0FXqll0IAKCl1n_o62z-ARyztgUvcJ6g&oe=67125C4C&_nc_sid=22de04","Cafetería Typica"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/399830297_723132043175801_3684294381931139423_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4yMDQ4eDIwNDguc2RyLmYzMDgwOC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=105&_nc_ohc=V87TEgDl518Q7kNvgEuzU0g&_nc_gid=855221f0c88b4afdbf88090f308305ed&edm=APoiHPcAAAAA&ccb=7-5&ig_cache_key=MzIzMDgwNTQ1NTA3NTg5OTg2OA%3D%3D.3-ccb7-5&oh=00_AYDDhNlPs0wKkIG5ZjjPnDxZOQ5PGw_6BhkRIrZXQ0Bupg&oe=67125933&_nc_sid=22de04","Cafetería Typica"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/400438714_723615003127505_3925826036315613532_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4yMDQ4eDIwNDguc2RyLmYzMDgwOC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=105&_nc_ohc=ydAOkNLscL0Q7kNvgFknUYl&_nc_gid=855221f0c88b4afdbf88090f308305ed&edm=APoiHPcAAAAA&ccb=7-5&ig_cache_key=MzIzMTQ2OTc1MjU4MzM4MzAzMA%3D%3D.3-ccb7-5&oh=00_AYDcy3l01nzV6c_-w49ctnvbBtJwDR4GOIraaNfDQF6JSQ&oe=6712466E&_nc_sid=22de04","Cafetería Typica")
        ),
        mutableListOf <CarouselItem>(
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t51.29350-15/244531093_234328768667135_5970743134351237044_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xNDQweDE4MDAuc2RyLmYyOTM1MC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=111&_nc_ohc=gEuqAnOfSTwQ7kNvgH6JdDy&_nc_gid=412c592de637435491babb3d15183a77&edm=APoiHPcBAAAA&ccb=7-5&ig_cache_key=MjY3NzgyNTE3MDM1MzI1NDk1Ng%3D%3D.3-ccb7-5&oh=00_AYBEjOr4Vb_ED--F_Wy_9qSbx6cjuFjNlv5xpMKK9RitOg&oe=67124512&_nc_sid=22de04","Cafetería Alto Tostado"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/436264285_18091031815422961_7121395445808637670_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xMDgweDEwODAuc2RyLmYzMDgwOC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=101&_nc_ohc=x1an1LImA30Q7kNvgEMg4la&_nc_gid=b97e8d006e2c478b8e7637e9d22083e2&edm=APoiHPcAAAAA&ccb=7-5&ig_cache_key=MzM0MTg5ODEzODU0ODgzMTAzMA%3D%3D.3-ccb7-5&oh=00_AYDbtQWpRMO3gQvPm_e24f_BVlzYmLSA4pPvzAeDbGLzeg&oe=671253AA&_nc_sid=22de04","Cafetería Alto Tostado"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/435729379_18091408927422961_6564475170245470745_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xMDgweDEwODAuc2RyLmYzMDgwOC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=101&_nc_ohc=S3v_0CNy6RMQ7kNvgE2QVWH&_nc_gid=b97e8d006e2c478b8e7637e9d22083e2&edm=APoiHPcAAAAA&ccb=7-5&ig_cache_key=MzM0NDcwNzQ2NDcyODMwNzA0OQ%3D%3D.3-ccb7-5&oh=00_AYBw0TXim0ynNFLDxbhO44nj9B3S9h0HifhxMS7sBfB3OA&oe=67125EC7&_nc_sid=22de04","Cafetería Alto Tostado"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/444125523_18094953346422961_6586522912676433761_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xMDgweDEwODAuc2RyLmYzMDgwOC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=101&_nc_ohc=d2kXHrlN_yUQ7kNvgGSqeRa&_nc_gid=dacd7c647f6e46bb8ade40693feee798&edm=APoiHPcAAAAA&ccb=7-5&ig_cache_key=MzM3MDA1OTE5MTY4ODY5Mzg3NQ%3D%3D.3-ccb7-5&oh=00_AYD0HR_2zNtiUnwNBbYY3rCn-Hr_0pUNsMdZVedqAlMipQ&oe=671266C6&_nc_sid=22de04","Cafetería Alto Tostado"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/444489114_18096933088422961_2284093616443367293_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xMDgweDEwODAuc2RyLmYzMDgwOC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=101&_nc_ohc=gQABIN8hVN4Q7kNvgEp89Vx&_nc_gid=5e291bbb4b2c4c4387ecf9739acc892a&edm=APoiHPcAAAAA&ccb=7-5&ig_cache_key=MzM4NDUzNzEzMTIwNTkwMTE0NQ%3D%3D.3-ccb7-5&oh=00_AYAeBbLlx7sZD1Mb4B0h0Wj3mM8-H45rPyXeYoOd0wXnsA&oe=67123C8F&_nc_sid=22de04","Cafetería Alto Tostado")
        ),
        mutableListOf <CarouselItem>(
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t51.29350-15/408288642_310820475267090_3044962366790942349_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xNDQweDE4MDAuc2RyLmYyOTM1MC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=106&_nc_ohc=UGkyHFjUyMMQ7kNvgGt6Nmv&_nc_gid=473650ca55f845378663a0c229296a11&edm=APoiHPcBAAAA&ccb=7-5&ig_cache_key=MzI1MzQ3MDExMzc5NzQ2NDg0Nw%3D%3D.3-ccb7-5&oh=00_AYADWz_6_mBKXyXp8fKEqdFjRTABMRRHNsn0ABJ5Px67VA&oe=67124915&_nc_sid=22de04","Cafetería Cafeto"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/410220563_17853840429093239_6181532045412070828_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi44NTJ4MTA2NS5zZHIuZjMwODA4LmRlZmF1bHRfaW1hZ2UifQ&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=111&_nc_ohc=yBUyWGbghlkQ7kNvgGyit4D&_nc_gid=b5f8806e0124410588bf046bcdf95311&edm=APoiHPcAAAAA&ccb=7-5&ig_cache_key=MzI2MDE1MDQwMjIyOTQ0MjQwMg%3D%3D.3-ccb7-5&oh=00_AYBgxq88NdZeem6pOujbL3o-uxnwmHh1BdjWuVLiOjqq7A&oe=671240D0&_nc_sid=22de04","Cafetería Cafeto"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t51.29350-15/412053375_641721067940912_3860297256591042955_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xNDQweDE0NDAuc2RyLmYyOTM1MC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=108&_nc_ohc=zYH16mDfoFAQ7kNvgHUlE0K&_nc_gid=b5f8806e0124410588bf046bcdf95311&edm=APoiHPcBAAAA&ccb=7-5&ig_cache_key=MzI2Mjc4NjcyMzg3MTY3NzU2MQ%3D%3D.3-ccb7-5&oh=00_AYC1n3ZQEV99cwgX1qsbNG_s66pId-4LlsdC1Yh6zv6rMg&oe=671238B4&_nc_sid=22de04","Cafetería Cafeto"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/452218882_17881502601093239_359145337820636317_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xMjc5eDE1OTkuc2RyLmYzMDgwOC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=111&_nc_ohc=vDTcdT_lqFEQ7kNvgEFz9Hs&_nc_gid=c7d56a8152be46d1a40be7442f507708&edm=APoiHPcAAAAA&ccb=7-5&ig_cache_key=MzQxNTcwMjA2MzI4NDc0NTI4Mw%3D%3D.3-ccb7-5&oh=00_AYCOvkyIcFhfcR8qvngLka6dcQMdhQ3KASNGw3gm9LQFTQ&oe=671266B0&_nc_sid=22de04","Cafetería Cafeto"),
            CarouselItem("https://instagram.fsrz2-1.fna.fbcdn.net/v/t39.30808-6/413887114_17855081157093239_5118200025225600066_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xNDQweDE4MDAuc2RyLmYzMDgwOC5kZWZhdWx0X2ltYWdlIn0&_nc_ht=instagram.fsrz2-1.fna.fbcdn.net&_nc_cat=111&_nc_ohc=AoF-aI5DNBwQ7kNvgF-EkhX&_nc_gid=b5f8806e0124410588bf046bcdf95311&edm=APoiHPcAAAAA&ccb=7-5&ig_cache_key=MzI2NjM4ODc4NzM5ODkwNjUyNQ%3D%3D.3-ccb7-5&oh=00_AYDNECYoDk_y0_umjwtvklcg4B-IPDoebYwDy37_5Nfu_A&oe=67126CBA&_nc_sid=22de04","Cafetería Cafeto")
        )
    )

    private var contadorDeCafeterias = 0

    private lateinit var btnMeGusta: Button
    private lateinit var btnNoMeGusta: Button
    private lateinit var btnMisMegustas: Button
    private lateinit var carousel: ImageCarousel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        carousel = findViewById(R.id.carousel)
        btnMeGusta = findViewById(R.id.btnMeGusta)
        btnNoMeGusta = findViewById(R.id.btnNoMeGusta)
        btnMisMegustas = findViewById(R.id.btnMisMegustas)


        mostrarCafeteria(contadorDeCafeterias)

        btnNoMeGusta.setOnClickListener {
            contadorDeCafeterias++
            if (contadorDeCafeterias >= cafeterias.size){
                contadorDeCafeterias = 0
            }
            mostrarCafeteria(contadorDeCafeterias)
        }
        btnMeGusta.setOnClickListener {
            contadorDeCafeterias++
            if (contadorDeCafeterias >= cafeterias.size){
                contadorDeCafeterias = 0
            }
            mostrarCafeteria(contadorDeCafeterias)
            Toast.makeText(this, "Cafetería Guardada.", Toast.LENGTH_SHORT).show()
        }
    }
    private fun mostrarCafeteria(cafeteria: Int) {
        carousel.setData(cafeterias[cafeteria])
    }
}

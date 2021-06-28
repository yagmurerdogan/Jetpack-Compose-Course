package com.yagmurerdogan.profilecardlayout

data class UserProfile(
    val id: Int,
    val name: String,
    val status: Boolean,
    val drawableId: Int
)

val userProfileList = arrayListOf<UserProfile>(
    UserProfile(0,"Dracula",true,R.drawable.dracula),
    UserProfile(1,"Cat Woman",false,R.drawable.catwoman),
    UserProfile(2,"Serial Killer",true,R.drawable.serialkiller),
    UserProfile(3,"Angel",true,R.drawable.angel),
    UserProfile(4,"Alien",false,R.drawable.alien),
    UserProfile(5,"Clown",true,R.drawable.clown),
    UserProfile(6,"Devil",true,R.drawable.devil),
    UserProfile(7,"Elf",false,R.drawable.elf),
    UserProfile(8,"Frankenstein",false,R.drawable.frankenstein),
    UserProfile(9,"Mermaid",true,R.drawable.mermaid),
    UserProfile(10,"Mummy",true,R.drawable.mummy),
    UserProfile(11,"Robot",false,R.drawable.robot),
    UserProfile(12,"Yeti",true,R.drawable.yeti)
)
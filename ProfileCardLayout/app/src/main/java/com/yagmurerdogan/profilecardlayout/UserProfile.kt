package com.yagmurerdogan.profilecardlayout

data class UserProfile(
    val name: String,
    val status: Boolean,
    val drawableId: Int
)

val userProfileList = arrayListOf<UserProfile>(
    UserProfile("Dracula",true,R.drawable.dracula),
    UserProfile("Cat Woman",false,R.drawable.catwoman),
    UserProfile("Serial Killer",true,R.drawable.serialkiller),
    UserProfile("Angel",true,R.drawable.angel),
    UserProfile("Alien",false,R.drawable.alien),
    UserProfile("Clown",true,R.drawable.clown),
    UserProfile("Devil",true,R.drawable.devil),
    UserProfile("Elf",false,R.drawable.elf),
    UserProfile("Frankenstein",false,R.drawable.frankenstein),
    UserProfile("Mermaid",true,R.drawable.mermaid),
    UserProfile("Mummy",true,R.drawable.mummy),
    UserProfile("Robot",false,R.drawable.robot),
    UserProfile("Yeti",true,R.drawable.yeti)
)
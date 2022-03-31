package com.annul.app

import androidx.lifecycle.ViewModel

class UserViewModel:ViewModel() {

    var email:String = ""
    private var userArray = arrayListOf<User>(User( "a@a.com", "123"),
        User("b@b.com" ,"234"))

    fun isValidUser(User: User):Boolean {
        var isValid = false
        for(usr in userArray){
            if(usr.email == User.email && usr.password == User.password)
            {
                isValid = true
                break
            }
        }
        return isValid
    }

}
package car.example.com.chatsclient

class Message(var chatMsg:String, private val userName:String, private var Time:String) {

    //message structure
    override fun toString(): String {
        return "$chatMsg from $userName on $Time"
    }

}
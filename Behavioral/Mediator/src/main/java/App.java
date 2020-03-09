public class App {
    public static void main(String args[]){
        ChatRoomMediator c=new ChatRoom();
        User syam=new User("syam",c);
        User koti=new User("koti",c);
        syam.send("hii koti");
        koti.send("hi syam");
        syam.send(" koti how are you");
        koti.send("fine.");

    }
}

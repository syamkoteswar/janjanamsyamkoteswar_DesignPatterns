import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatRoom implements ChatRoomMediator {
    private static final Logger LOGGER = LogManager.getLogger(ChatRoom.class);
    @Override
    public void showMessage(User user, String message) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        LOGGER.info(formatter.format(date) + message);
    }
}

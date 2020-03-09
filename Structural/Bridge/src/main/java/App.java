import Theme.Theme;
import Theme.DarkTheme;
import Webpage.About;
import Webpage.Careers;
import Webpage.WebPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class);
     public static void main(String args[]){
         Theme t= new DarkTheme();
         WebPage a=new About(t);
         WebPage c=new Careers(t);
         LOGGER.info(a.getContent());
         LOGGER.info(c.getContent());

     }
}

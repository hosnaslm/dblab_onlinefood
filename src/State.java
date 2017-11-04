import org.telegram.telegrambots.api.objects.Message;

/**
 * Created by hosna on 29/10/2017.
 */
public interface State {

    void message();
    void ChangeState();
    void Validate(Message command);
}
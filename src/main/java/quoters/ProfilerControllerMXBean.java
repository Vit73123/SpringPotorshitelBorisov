package quoters;

//public interface ProfilerControllerMBean {
// MBean не работает в регистраторе
// X к M доабвляется, чтобы отменить требование конвенции именования бинов
public interface ProfilerControllerMXBean {
    void setEnabled(boolean enabled);
}

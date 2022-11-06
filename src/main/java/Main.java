import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.wm.impl.status.widget.StatusBarWidgetWrapper;
import com.intellij.openapi.wm.impl.status.widget.StatusBarWidgetWrapper.Icon;
import com.intellij.testFramework.propertyBased.PsiIndexConsistencyTester.Action;
import com.intellij.util.Icons;
import java.util.Map;
import org.ini4j.Options;
import org.jetbrains.annotations.NotNull;

public class Main extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Messages.showInputDialog("짜장면이 좋아요 짬뽕이 좋아요?", "당신의 선택은", Messages.getQuestionIcon());
        System.out.println(">>>");
    }
}

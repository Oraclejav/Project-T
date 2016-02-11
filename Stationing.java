import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import 

/**
 * タスクトレイ常駐アプリサンプル
 */
public class TaskTraySample {

    /** コンストラクタ */
    public TaskTraySample() throws IOException, AWTException {

          // アイコンイメージの読み込み
        Image image = ImageIO.read(Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream("trayicon.png"));
        // トレイアイコン生成
        TrayIcon icon = new TrayIcon(image);
        // イベント登録
        icon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        SystemTray.getSystemTray().add(icon);
        
        // 終了メニュー
        MenuItem exitItem = new MenuItem("終了");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // メニューにメニューアイテムを追加
        menu.add(exitItem);
        icon.setPopupMenu(menu);
        
        // タスクトレイに格納
        SystemTray.getSystemTray().add(icon);

        //progs
    }

    /** メインメソッド */ 
    public static void main(String[] args) throws Exception {
        new TaskTraySample();
    }
}

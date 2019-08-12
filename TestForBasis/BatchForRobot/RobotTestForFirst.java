package BatchForRobot;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * creates by yyf on 2019-08-12 09:26
 * 测试java中robot包的用法，操作windows中的鼠标和键盘
 */
public class RobotTestForFirst {
    public static void clickKeyBord(Robot robot){
        int [] aa={1000,1000,1000};
            /*for(int a:aa){
                System.out.println(a);
            }*/
                robot.delay(1000);
                //鼠标移到指定位置
                robot.mouseMove(18, 40);//可以通过QQ截图的功能来确定坐标
                //点击鼠标左键
//            robot.mousePrless(InputEvent.BUTTON1_MASK);//点击右键
//            robot.mouseRelease(InputEvent.BUTTON1_MASK);//松开右键
                /*robot.keyPress(KeyEvent.VK_CONTEXT_MENU);// 以下两行按下了ctrl+v，完成粘贴功能
                robot.keyPress(KeyEvent.VK_L);
                robot.keyRelease(KeyEvent.VK_CONTEXT_MENU);// 释放ctrl按键，像ctrl，退格键，删除键这样的功能性按键，在按下后一定要释放，不然会出问题。crtl如果按住没有释放，在按其他字母按键是，敲出来的回事ctrl的快捷键。
                robot.delay(700);// 延迟一秒再发送，不然会一次性全发布出去，因为电脑的处理速度很快，每次粘贴发送的速度几乎是一瞬间，所以给人的感觉就是一次性发送了全部。这个时间可以自己改，想几秒发送一条都可以*/
//            robot.keyPress(KeyEvent.VK_ENTER);// 回车

//            robot.mouseMove(26,593);
            robot.mousePress(InputEvent.BUTTON1_MASK);//点击右键
            robot.mouseRelease(InputEvent.BUTTON1_MASK );//松开右键
    }
    public static void main(String[] args) {
        try {
            Robot robot=new Robot();
            clickKeyBord(robot);

        } catch (AWTException e) {
            e.printStackTrace();
        }

    }
}
